/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2013 Oracle and/or its affiliates. All rights reserved.
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

package com.sun.xml.messaging.saaj.util;

import java.io.*;

import javax.xml.transform.stream.StreamSource;


/**
 *
 * @author Anil Vijendran
 */
public class JAXMStreamSource extends StreamSource {
    InputStream in;
    Reader reader;
    private static final boolean lazyContentLength;
    static {
        lazyContentLength = SAAJUtil.getSystemBoolean("saaj.lazy.contentlength");
    }
    public JAXMStreamSource(InputStream is) throws IOException {
        if (lazyContentLength) {
            in = is;
        } else if (is instanceof ByteInputStream) {
            this.in = (ByteInputStream) is;
        } else {
            ByteOutputStream bout = null;
            try {
                bout = new ByteOutputStream();
                bout.write(is);
                this.in = bout.newInputStream();
            } finally {
                if (bout != null)
                    bout.close();
            }
        }
    }

    public JAXMStreamSource(Reader rdr) throws IOException {

        if (lazyContentLength) {
            this.reader = rdr;
            return;
        }
        CharWriter cout = new CharWriter();
        char[] temp = new char[1024];
        int len;
                                                                                
        while (-1 != (len = rdr.read(temp)))
            cout.write(temp, 0, len);
                                                                                
        this.reader = new CharReader(cout.getChars(), cout.getCount());
    }

    public InputStream getInputStream() {
	return in;
    }
    
    public Reader getReader() {
	return reader;
    }

    public void reset() throws IOException {
	    if (in != null)
		in.reset();
	    if (reader != null)
		reader.reset();
    }
}
