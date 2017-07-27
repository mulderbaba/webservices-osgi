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
public final class EncodingMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.encoding");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableFAILED_TO_READ_RESPONSE(Object arg0) {
        return messageFactory.getMessage("failed.to.read.response", arg0);
    }

    /**
     * Failed to read a response: {0}
     * 
     */
    public static String FAILED_TO_READ_RESPONSE(Object arg0) {
        return localizer.localize(localizableFAILED_TO_READ_RESPONSE(arg0));
    }

    public static Localizable localizableEXCEPTION_INCORRECT_TYPE(Object arg0) {
        return messageFactory.getMessage("exception.incorrectType", arg0);
    }

    /**
     * incorrect type. Expected java.lang.Exception, found {0}
     * 
     */
    public static String EXCEPTION_INCORRECT_TYPE(Object arg0) {
        return localizer.localize(localizableEXCEPTION_INCORRECT_TYPE(arg0));
    }

    public static Localizable localizableEXCEPTION_NOTFOUND(Object arg0) {
        return messageFactory.getMessage("exception.notfound", arg0);
    }

    /**
     * exception class: {0} not found in the model!
     * 
     */
    public static String EXCEPTION_NOTFOUND(Object arg0) {
        return localizer.localize(localizableEXCEPTION_NOTFOUND(arg0));
    }

    public static Localizable localizableXSD_UNEXPECTED_ELEMENT_NAME(Object arg0, Object arg1) {
        return messageFactory.getMessage("xsd.unexpectedElementName", arg0, arg1);
    }

    /**
     * unexpected element name: expected={0}, actual: {1}
     * 
     */
    public static String XSD_UNEXPECTED_ELEMENT_NAME(Object arg0, Object arg1) {
        return localizer.localize(localizableXSD_UNEXPECTED_ELEMENT_NAME(arg0, arg1));
    }

    public static Localizable localizableNESTED_DESERIALIZATION_ERROR(Object arg0) {
        return messageFactory.getMessage("nestedDeserializationError", arg0);
    }

    /**
     * deserialization error: {0}
     * 
     */
    public static String NESTED_DESERIALIZATION_ERROR(Object arg0) {
        return localizer.localize(localizableNESTED_DESERIALIZATION_ERROR(arg0));
    }

    public static Localizable localizableNESTED_ENCODING_ERROR(Object arg0) {
        return messageFactory.getMessage("nestedEncodingError", arg0);
    }

    /**
     * encoding error: {0}
     * 
     */
    public static String NESTED_ENCODING_ERROR(Object arg0) {
        return localizer.localize(localizableNESTED_ENCODING_ERROR(arg0));
    }

    public static Localizable localizableXSD_UNKNOWN_PREFIX(Object arg0) {
        return messageFactory.getMessage("xsd.unknownPrefix", arg0);
    }

    /**
     * unknown prefix "{0}"
     * 
     */
    public static String XSD_UNKNOWN_PREFIX(Object arg0) {
        return localizer.localize(localizableXSD_UNKNOWN_PREFIX(arg0));
    }

    public static Localizable localizableNESTED_SERIALIZATION_ERROR(Object arg0) {
        return messageFactory.getMessage("nestedSerializationError", arg0);
    }

    /**
     * serialization error: {0}
     * 
     */
    public static String NESTED_SERIALIZATION_ERROR(Object arg0) {
        return localizer.localize(localizableNESTED_SERIALIZATION_ERROR(arg0));
    }

    public static Localizable localizableNO_SUCH_CONTENT_ID(Object arg0) {
        return messageFactory.getMessage("noSuchContentId", arg0);
    }

    /**
     * There''s no attachment for the content ID "{0}"
     * 
     */
    public static String NO_SUCH_CONTENT_ID(Object arg0) {
        return localizer.localize(localizableNO_SUCH_CONTENT_ID(arg0));
    }

}
