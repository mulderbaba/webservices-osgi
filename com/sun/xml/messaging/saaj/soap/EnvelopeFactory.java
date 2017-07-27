/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2014 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.xml.messaging.saaj.soap;

import com.sun.xml.messaging.saaj.LazyEnvelopeSource;
import com.sun.xml.messaging.saaj.SOAPExceptionImpl;
import com.sun.xml.messaging.saaj.util.JAXMStreamSource;
import com.sun.xml.messaging.saaj.util.LogDomainConstants;
import com.sun.xml.messaging.saaj.util.ParserPool;
import com.sun.xml.messaging.saaj.util.RejectDoctypeSaxFilter;
import com.sun.xml.messaging.saaj.util.transform.EfficientStreamingTransformer;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamSource;
import java.util.logging.Logger;

/**
 * EnvelopeFactory creates SOAP Envelope objects using different
 * underlying implementations.
 */
public class EnvelopeFactory {
    
    protected static final Logger
        log = Logger.getLogger(LogDomainConstants.SOAP_DOMAIN,
        "com.sun.xml.messaging.saaj.soap.LocalStrings");
    
    private static ContextClassloaderLocal<ParserPool> parserPool =
            new ContextClassloaderLocal<ParserPool>() {
                @Override
                protected ParserPool initialValue() throws Exception {
                    return new ParserPool(5);
                }
            };

    public static Envelope createEnvelope(Source src, SOAPPartImpl soapPart)
        throws SOAPException 
    {
            if (src instanceof JAXMStreamSource) {
                try {
                    if (!SOAPPartImpl.lazyContentLength) {
                        ((JAXMStreamSource) src).reset();
                    }
                } catch (java.io.IOException ioe) {
                    log.severe("SAAJ0515.source.reset.exception");
                    throw new SOAPExceptionImpl(ioe);
                }
            }
        if (src instanceof LazyEnvelopeSource) {  
          return lazy((LazyEnvelopeSource)src, soapPart);
      }
        if (soapPart.message.isLazySoapBodyParsing()) {
            return parseEnvelopeStax(src, soapPart);
        } else {
            return parseEnvelopeSax(src, soapPart);
        }
    }
    
    private static Envelope lazy(LazyEnvelopeSource src, SOAPPartImpl soapPart) throws SOAPException {
            try {
        	StaxBridge staxBridge = new StaxLazySourceBridge(src, soapPart);
        	staxBridge.bridgeEnvelopeAndHeaders();            
            Envelope env = (Envelope) soapPart.getEnvelope();
            env.setStaxBridge(staxBridge);
            return env;
        } catch (XMLStreamException e) {
            throw new SOAPException(e);
        }
    }
    
    static private XMLInputFactory xmlInputFactory = null;
    
    private static Envelope parseEnvelopeStax(Source src, SOAPPartImpl soapPart)
            throws SOAPException {
        XMLStreamReader streamReader = null;
        if (src instanceof StAXSource) {
           streamReader = ((StAXSource) src).getXMLStreamReader(); 
        }
        try {
            if (streamReader == null) {
                if (xmlInputFactory == null) xmlInputFactory = XMLInputFactory.newInstance();
                streamReader = xmlInputFactory.createXMLStreamReader(src);
            }
//            SaajStaxWriter saajWriter = new SaajStaxWriter(soapPart.message, soapPart.document);
//            XMLStreamReaderToXMLStreamWriter readerWriterBridge = new XMLStreamReaderToXMLStreamWriter(
//                    streamReader, saajWriter, soapPart.getSOAPNamespace());
            
            StaxBridge readerWriterBridge = new StaxReaderBridge(streamReader, soapPart); 
            //bridge will stop reading at body element, and parse upon request, so save it
            //on the envelope
            readerWriterBridge.bridgeEnvelopeAndHeaders();
            
            Envelope env = (Envelope) soapPart.getEnvelope();
            env.setStaxBridge(readerWriterBridge);
            return env;
        } catch (Exception e) {
            throw new SOAPException(e);
        }
    }
    private static Envelope parseEnvelopeSax(Source src, SOAPPartImpl soapPart)
            throws SOAPException {
        // Insert SAX filter to disallow Document Type Declarations since
        // they are not legal in SOAP
        SAXParser saxParser = null;
        if (src instanceof StreamSource) {
            try {
                saxParser = parserPool.get().get();
            } catch (Exception e) {
                log.severe("SAAJ0601.util.newSAXParser.exception");
                throw new SOAPExceptionImpl(
                    "Couldn't get a SAX parser while constructing a envelope",
                    e);
            }
            InputSource is = SAXSource.sourceToInputSource(src);
            if (is.getEncoding()== null && soapPart.getSourceCharsetEncoding() != null) {
                is.setEncoding(soapPart.getSourceCharsetEncoding());
            }
            XMLReader rejectFilter;
            try {
                rejectFilter = new RejectDoctypeSaxFilter(saxParser);
            } catch (Exception ex) {
                log.severe("SAAJ0510.soap.cannot.create.envelope");
                throw new SOAPExceptionImpl(
                    "Unable to create envelope from given source: ",
                    ex);
            }
            src = new SAXSource(rejectFilter, is);
        }
        
        try {
            Transformer transformer =
                EfficientStreamingTransformer.newTransformer();
            DOMResult result = new DOMResult(soapPart);
            transformer.transform(src, result);
            
            Envelope env = (Envelope) soapPart.getEnvelope();
            return env;
        } catch (Exception ex) {
            if (ex instanceof SOAPVersionMismatchException) {
                throw (SOAPVersionMismatchException) ex;
            }
            log.severe("SAAJ0511.soap.cannot.create.envelope");
            throw new SOAPExceptionImpl(
                "Unable to create envelope from given source: ",
                ex);
        } finally {
            if (saxParser != null) {
                parserPool.get().returnParser(saxParser);
            }
        }
    }
}
