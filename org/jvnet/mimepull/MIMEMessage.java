/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2015 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * http://glassfish.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package org.jvnet.mimepull;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents MIME message. MIME message parsing is done lazily using a
 * pull parser.
 *
 * @author Jitendra Kotamraju
 */
public class MIMEMessage implements Closeable {

    private static final Logger LOGGER = Logger.getLogger(MIMEMessage.class.getName());

    MIMEConfig config;

    private final InputStream in;
    private final Iterator<MIMEEvent> it;
    private boolean parsed;     // true when entire message is parsed
    private MIMEPart currentPart;
    private int currentIndex;

    private final List<MIMEPart> partsList = new ArrayList<MIMEPart>();
    private final Map<String, MIMEPart> partsMap = new HashMap<String, MIMEPart>();

    /**
     * @see MIMEMessage(InputStream, String, MIMEConfig)
     */
    public MIMEMessage(InputStream in, String boundary) {
        this(in, boundary, new MIMEConfig());
    }

    /**
     * Creates a MIME message from the content's stream. The content stream
     * is closed when EOF is reached.
     *
     * @param in       MIME message stream
     * @param boundary the separator for parts(pass it without --)
     * @param config   various configuration parameters
     */
    public MIMEMessage(InputStream in, String boundary, MIMEConfig config) {
        this.in = in;
        this.config = config;
        MIMEParser parser = new MIMEParser(in, boundary, config);
        it = parser.iterator();

        if (config.isParseEagerly()) {
            parseAll();
        }
    }

    /**
     * Gets all the attachments by parsing the entire MIME message. Avoid
     * this if possible since it is an expensive operation.
     *
     * @return list of attachments.
     */
    public List<MIMEPart> getAttachments() {
        if (!parsed) {
            parseAll();
        }
        return partsList;
    }

    /**
     * Creates nth attachment lazily. It doesn't validate
     * if the message has so many attachments. To
     * do the validation, the message needs to be parsed.
     * The parsing of the message is done lazily and is done
     * while reading the bytes of the part.
     *
     * @param index sequential order of the part. starts with zero.
     * @return attachemnt part
     */
    public MIMEPart getPart(int index) {
        LOGGER.log(Level.FINE, "index={0}", index);
        MIMEPart part = (index < partsList.size()) ? partsList.get(index) : null;
        if (parsed && part == null) {
            throw new MIMEParsingException("There is no " + index + " attachment part ");
        }
        if (part == null) {
            // Parsing will done lazily and will be driven by reading the part
            part = new MIMEPart(this);
            partsList.add(index, part);
        }
        LOGGER.log(Level.FINE, "Got attachment at index={0} attachment={1}", new Object[] {index, part});
        return part;
    }

    /**
     * Creates a lazy attachment for a given Content-ID. It doesn't validate
     * if the message contains an attachment with the given Content-ID. To
     * do the validation, the message needs to be parsed. The parsing of the
     * message is done lazily and is done while reading the bytes of the part.
     *
     * @param contentId Content-ID of the part, expects Content-ID without <, >
     * @return attachemnt part
     */
    public MIMEPart getPart(String contentId) {
        LOGGER.log(Level.FINE, "Content-ID={0}", contentId);
        MIMEPart part = getDecodedCidPart(contentId);
        if (parsed && part == null) {
            throw new MIMEParsingException("There is no attachment part with Content-ID = " + contentId);
        }
        if (part == null) {
            // Parsing is done lazily and is driven by reading the part
            part = new MIMEPart(this, contentId);
            partsMap.put(contentId, part);
        }
        LOGGER.log(Level.FINE, "Got attachment for Content-ID={0} attachment={1}", new Object[] {contentId, part});
        return part;
    }

    // this is required for Indigo interop, it writes content-id without escaping
    private MIMEPart getDecodedCidPart(String cid) {
        MIMEPart part = partsMap.get(cid);
        if (part == null) {
            if (cid.indexOf('%') != -1) {
                try {
                    String tempCid = URLDecoder.decode(cid, "utf-8");
                    part = partsMap.get(tempCid);
                } catch (UnsupportedEncodingException ue) {
                    // Ignore it
                }
            }
        }
        return part;
    }

    /**
     * Parses the whole MIME message eagerly
     */
    public final void parseAll() {
        while (makeProgress()) {
            // Nothing to do
        }
    }

    /**
     * Closes all parsed {@link org.jvnet.mimepull.MIMEPart parts}.
     * This method is safe to call even if parsing of message failed.
     * <p/>
     * Does not throw {@link org.jvnet.mimepull.MIMEParsingException} if an
     * error occurred during closing a MIME part. The exception (if any) is
     * still logged.
     */
    @Override
    public void close() {
        close(partsList);
        close(partsMap.values());
    }

    private void close(final Collection<MIMEPart> parts) {
        for (final MIMEPart part : parts) {
            try {
                part.close();
            } catch (final MIMEParsingException closeError) {
                LOGGER.log(Level.FINE, "Exception during closing MIME part", closeError);
            }
        }
    }

    /**
     * Parses the MIME message in a pull fashion.
     *
     * @return false if the parsing is completed.
     */
    public synchronized boolean makeProgress() {
        if (!it.hasNext()) {
            return false;
        }

        MIMEEvent event = it.next();

        switch (event.getEventType()) {
            case START_MESSAGE:
                LOGGER.log(Level.FINE, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.START_MESSAGE);
                break;

            case START_PART:
                LOGGER.log(Level.FINE, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.START_PART);
                break;

            case HEADERS:
                LOGGER.log(Level.FINE, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.HEADERS);
                MIMEEvent.Headers headers = (MIMEEvent.Headers) event;
                InternetHeaders ih = headers.getHeaders();
                List<String> cids = ih.getHeader("content-id");
                String cid = (cids != null) ? cids.get(0) : currentIndex + "";
                if (cid.length() > 2 && cid.charAt(0) == '<') {
                    cid = cid.substring(1, cid.length() - 1);
                }
                MIMEPart listPart = (currentIndex < partsList.size()) ? partsList.get(currentIndex) : null;
                MIMEPart mapPart = getDecodedCidPart(cid);
                if (listPart == null && mapPart == null) {
                    currentPart = getPart(cid);
                    partsList.add(currentIndex, currentPart);
                } else if (listPart == null) {
                    currentPart = mapPart;
                    partsList.add(currentIndex, mapPart);
                } else if (mapPart == null) {
                    currentPart = listPart;
                    currentPart.setContentId(cid);
                    partsMap.put(cid, currentPart);
                } else if (listPart != mapPart) {
                    throw new MIMEParsingException("Created two different attachments using Content-ID and index");
                }
                currentPart.setHeaders(ih);
                break;

            case CONTENT:
                LOGGER.log(Level.FINER, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.CONTENT);
                MIMEEvent.Content content = (MIMEEvent.Content) event;
                ByteBuffer buf = content.getData();
                currentPart.addBody(buf);
                break;

            case END_PART:
                LOGGER.log(Level.FINE, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.END_PART);
                currentPart.doneParsing();
                ++currentIndex;
                break;

            case END_MESSAGE:
                LOGGER.log(Level.FINE, "MIMEEvent={0}", MIMEEvent.EVENT_TYPE.END_MESSAGE);
                parsed = true;
                try {
                    in.close();
                } catch (IOException ioe) {
                    throw new MIMEParsingException(ioe);
                }
                break;

            default:
                throw new MIMEParsingException("Unknown Parser state = " + event.getEventType());
        }
        return true;
    }
}
