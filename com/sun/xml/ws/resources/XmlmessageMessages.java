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

package com.sun.xml.ws.resources;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class XmlmessageMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.xmlmessage");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableXML_NULL_HEADERS() {
        return messageFactory.getMessage("xml.null.headers");
    }

    /**
     * Invalid argument. MimeHeaders=null
     * 
     */
    public static String XML_NULL_HEADERS() {
        return localizer.localize(localizableXML_NULL_HEADERS());
    }

    public static Localizable localizableXML_SET_PAYLOAD_ERR() {
        return messageFactory.getMessage("xml.set.payload.err");
    }

    /**
     * Couldn't set Payload in XMLMessage
     * 
     */
    public static String XML_SET_PAYLOAD_ERR() {
        return localizer.localize(localizableXML_SET_PAYLOAD_ERR());
    }

    public static Localizable localizableXML_CONTENT_TYPE_MUSTBE_MULTIPART() {
        return messageFactory.getMessage("xml.content-type.mustbe.multipart");
    }

    /**
     * Content-Type needs to be Multipart/Related and with type=text/xml
     * 
     */
    public static String XML_CONTENT_TYPE_MUSTBE_MULTIPART() {
        return localizer.localize(localizableXML_CONTENT_TYPE_MUSTBE_MULTIPART());
    }

    public static Localizable localizableXML_UNKNOWN_CONTENT_TYPE() {
        return messageFactory.getMessage("xml.unknown.Content-Type");
    }

    /**
     * Unrecognized Content-Type
     * 
     */
    public static String XML_UNKNOWN_CONTENT_TYPE() {
        return localizer.localize(localizableXML_UNKNOWN_CONTENT_TYPE());
    }

    public static Localizable localizableXML_GET_DS_ERR() {
        return messageFactory.getMessage("xml.get.ds.err");
    }

    /**
     * Couldn't get DataSource
     * 
     */
    public static String XML_GET_DS_ERR() {
        return localizer.localize(localizableXML_GET_DS_ERR());
    }

    public static Localizable localizableXML_CONTENT_TYPE_PARSE_ERR() {
        return messageFactory.getMessage("xml.Content-Type.parse.err");
    }

    /**
     * Error while parsing MimeHeaders for Content-Type
     * 
     */
    public static String XML_CONTENT_TYPE_PARSE_ERR() {
        return localizer.localize(localizableXML_CONTENT_TYPE_PARSE_ERR());
    }

    public static Localizable localizableXML_GET_SOURCE_ERR() {
        return messageFactory.getMessage("xml.get.source.err");
    }

    /**
     * Couldn't return Source
     * 
     */
    public static String XML_GET_SOURCE_ERR() {
        return localizer.localize(localizableXML_GET_SOURCE_ERR());
    }

    public static Localizable localizableXML_CANNOT_INTERNALIZE_MESSAGE() {
        return messageFactory.getMessage("xml.cannot.internalize.message");
    }

    /**
     * Cannot create XMLMessage
     * 
     */
    public static String XML_CANNOT_INTERNALIZE_MESSAGE() {
        return localizer.localize(localizableXML_CANNOT_INTERNALIZE_MESSAGE());
    }

    public static Localizable localizableXML_NO_CONTENT_TYPE() {
        return messageFactory.getMessage("xml.no.Content-Type");
    }

    /**
     * MimeHeaders doesn't contain Content-Type header
     * 
     */
    public static String XML_NO_CONTENT_TYPE() {
        return localizer.localize(localizableXML_NO_CONTENT_TYPE());
    }

    public static Localizable localizableXML_ROOT_PART_INVALID_CONTENT_TYPE(Object arg0) {
        return messageFactory.getMessage("xml.root.part.invalid.Content-Type", arg0);
    }

    /**
     * Bad Content-Type for Root Part : {0}
     * 
     */
    public static String XML_ROOT_PART_INVALID_CONTENT_TYPE(Object arg0) {
        return localizer.localize(localizableXML_ROOT_PART_INVALID_CONTENT_TYPE(arg0));
    }

    public static Localizable localizableXML_INVALID_CONTENT_TYPE(Object arg0) {
        return messageFactory.getMessage("xml.invalid.content-type", arg0);
    }

    /**
     * Invalid Content-Type: {0}
     * 
     */
    public static String XML_INVALID_CONTENT_TYPE(Object arg0) {
        return localizer.localize(localizableXML_INVALID_CONTENT_TYPE(arg0));
    }

}
