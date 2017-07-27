/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2012 Oracle and/or its affiliates. All rights reserved.
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

/*
 * @(#)BASE64EncoderStream.java       1.6 02/03/27
 */



package com.sun.xml.messaging.saaj.packaging.mime.util;

import java.io.*;

/**
 * This class implements a BASE64 Encoder. It is implemented as
 * a FilterOutputStream, so one can just wrap this class around
 * any output stream and write bytes into this filter. The Encoding
 * is done as the bytes are written out.
 * 
 * @author John Mani
 * @author Bill Shannon
 */

public class BASE64EncoderStream extends FilterOutputStream {
    private byte[] buffer; 	// cache of bytes that are yet to be encoded
    private int bufsize = 0;	// size of the cache
    private int count = 0; 	// number of bytes that have been output
    private int bytesPerLine;	// number of bytes per line

    /**
     * Create a BASE64 encoder that encodes the specified input stream
     * @param out        the output stream
     * @param bytesPerLine  number of bytes per line. The encoder inserts
     * 			 a CRLF sequence after the specified number of bytes
     */
    public BASE64EncoderStream(OutputStream out, int bytesPerLine) {
	super(out);
	buffer = new byte[3];
	this.bytesPerLine = bytesPerLine;
    }

    /**
     * Create a BASE64 encoder that encodes the specified input stream.
     * Inserts the CRLF sequence after outputting 76 bytes.
     * @param out        the output stream
     */
    public BASE64EncoderStream(OutputStream out) {
	this(out, 76);	
    }

    /**
     * Encodes <code>len</code> bytes from the specified
     * <code>byte</code> array starting at offset <code>off</code> to
     * this output stream.
     *
     * @param      b     the data.
     * @param      off   the start offset in the data.
     * @param      len   the number of bytes to write.
     * @exception  IOException  if an I/O error occurs.
     */
    public void write(byte[] b, int off, int len) throws IOException {
	for (int i = 0; i < len; i++)
	    write(b[off + i]);
    }

    /**
     * Encodes <code>b.length</code> bytes to this output stream.
     * @param      b   the data to be written.
     * @exception  IOException  if an I/O error occurs.
     */
    public void write(byte[] b) throws IOException {
	write(b, 0, b.length);
    }

    /**
     * Encodes the specified <code>byte</code> to this output stream.
     * @param      c   the <code>byte</code>.
     * @exception  IOException  if an I/O error occurs.
     */
    public void write(int c) throws IOException {
	buffer[bufsize++] = (byte)c;
	if (bufsize == 3) { // Encoding unit = 3 bytes
	    encode();
	    bufsize = 0;
	}
    }

    /**
     * Flushes this output stream and forces any buffered output bytes
     * to be encoded out to the stream. 
     * @exception  IOException  if an I/O error occurs.
     */
    public void flush() throws IOException {
	if (bufsize > 0) { // If there's unencoded characters in the buffer ..
	    encode();      // .. encode them
	    bufsize = 0;
	}
	out.flush();
    }

    /**
     * Forces any buffered output bytes to be encoded out to the stream
     * and closes this output stream
     */
    public void close() throws IOException {
	flush();
	out.close();
    }

    /** This array maps the characters to their 6 bit values */
    private final static char pem_array[] = {
	'A','B','C','D','E','F','G','H', // 0
	'I','J','K','L','M','N','O','P', // 1
	'Q','R','S','T','U','V','W','X', // 2
	'Y','Z','a','b','c','d','e','f', // 3
	'g','h','i','j','k','l','m','n', // 4
	'o','p','q','r','s','t','u','v', // 5
	'w','x','y','z','0','1','2','3', // 6
	'4','5','6','7','8','9','+','/'  // 7
    };

    private void encode() throws IOException {
	// If writing out this encoded unit will cause overflow,
	// start a new line.
	if (count + 4 > bytesPerLine) {
	    out.write('\r');
	    out.write('\n');
	    count = 0;
	}

	byte a, b, c;
	if (bufsize == 1) {
	    a = buffer[0];
	    b = 0;
	    c = 0;
	    out.write(pem_array[(a >>> 2) & 0x3F]);
	    out.write(pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
	    out.write('='); // pad character
	    out.write('='); // pad character
	} else if (bufsize == 2) {
	    a = buffer[0];
	    b = buffer[1];
	    c = 0;
	    out.write(pem_array[(a >>> 2) & 0x3F]);
	    out.write(pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
	    out.write(pem_array[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)]);
	    out.write('='); // pad character
	} else {
	    a = buffer[0];
	    b = buffer[1];
	    c = buffer[2];
	    out.write(pem_array[(a >>> 2) & 0x3F]);
	    out.write(pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)]);
	    out.write(pem_array[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)]);
	    out.write(pem_array[c & 0x3F]);
        }

	// increment count
	count += 4;
    }

    /**
     * Base64 encode a byte array.  No line breaks are inserted.
     * This method is suitable for short strings, such as those
     * in the IMAP AUTHENTICATE protocol, but not to encode the
     * entire content of a MIME part.
     */
    public static byte[] encode(byte[] inbuf) {
	if (inbuf.length == 0)
	    return inbuf;
	byte[] outbuf = new byte[((inbuf.length + 2) / 3) * 4];
	int inpos = 0, outpos = 0;
	int size = inbuf.length;
	while (size > 0) {
	    byte a, b, c;
	    if (size == 1) {
		a = inbuf[inpos++];
		b = 0;
		c = 0;
		outbuf[outpos++] = (byte)pem_array[(a >>> 2) & 0x3F];
		outbuf[outpos++] =
			(byte)pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)];
		outbuf[outpos++] = (byte)'=';  // pad character
		outbuf[outpos++] = (byte)'=';  // pad character
	    } else if (size == 2) {
		a = inbuf[inpos++];
		b = inbuf[inpos++];
		c = 0;
		outbuf[outpos++] = (byte)pem_array[(a >>> 2) & 0x3F];
		outbuf[outpos++] =
			(byte)pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)];
		outbuf[outpos++] =
			(byte)pem_array[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)];
		outbuf[outpos++] = (byte)'=';  // pad character
	    } else {
		a = inbuf[inpos++];
		b = inbuf[inpos++];
		c = inbuf[inpos++];
		outbuf[outpos++] = (byte)pem_array[(a >>> 2) & 0x3F];
		outbuf[outpos++] =
			(byte)pem_array[((a << 4) & 0x30) + ((b >>> 4) & 0xf)];
		outbuf[outpos++] =
			(byte)pem_array[((b << 2) & 0x3c) + ((c >>> 6) & 0x3)];
		outbuf[outpos++] = (byte)pem_array[c & 0x3F];
	    }
	    size -= 3;
	}
	return outbuf;
    }

    /*** begin TEST program
    public static void main(String argv[]) throws Exception {
	FileInputStream infile = new FileInputStream(argv[0]);
	BASE64EncoderStream encoder = new BASE64EncoderStream(System.out);
	int c;

	while ((c = infile.read()) != -1)
	    encoder.write(c);
	encoder.close();
    }
    *** end TEST program **/
}
