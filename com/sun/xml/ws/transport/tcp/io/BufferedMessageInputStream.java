/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
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

package com.sun.xml.ws.transport.tcp.io;

import com.sun.xml.ws.util.ByteArrayBuffer;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Alexey Stashok
 */
public class BufferedMessageInputStream extends InputStream {
    private InputStream inputStream;
    
    private boolean isClosed;
    private boolean isBuffered;
    
    private int bufferedSize;
    
    public BufferedMessageInputStream(final InputStream inputStream) {
        this.inputStream = inputStream;
        isBuffered = false;
    }
    
    
    public int read() throws IOException {
        return inputStream.read();
    }
    
    public int read(final byte[] b, final int offset, final int length) throws IOException {
        return inputStream.read(b, offset, length);
    }
    
    public void bufferMessage() throws IOException {
        if (!isBuffered) {
            final ByteArrayBuffer baBuffer = new ByteArrayBuffer();
            try {
                baBuffer.write(inputStream);
                inputStream = baBuffer.newInputStream();
                bufferedSize = baBuffer.size();
                isBuffered = true;
            } finally {
                baBuffer.close();
            }
        }
    }
    
    public InputStream getSourceInputStream() {
        return inputStream;
    }
    
    public int getBufferedSize() {
        if (isBuffered) {
            return bufferedSize;
        }
        
        return 0;
    }
    
    public boolean isClosed() {
        return isClosed;
    }
    
    public boolean isBuffered() {
        return isBuffered;
    }
    
    public void close() throws IOException {
        isClosed = true;
        inputStream.close();
    }
    
    
}
