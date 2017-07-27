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
public final class UtilMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.util");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableUTIL_LOCATION(Object arg0, Object arg1) {
        return messageFactory.getMessage("util.location", arg0, arg1);
    }

    /**
     * at line {0} of {1}
     * 
     */
    public static String UTIL_LOCATION(Object arg0, Object arg1) {
        return localizer.localize(localizableUTIL_LOCATION(arg0, arg1));
    }

    public static Localizable localizableUTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return messageFactory.getMessage("util.failed.to.parse.handlerchain.file", arg0, arg1);
    }

    /**
     * Could not parse handler chain file {1} for class {0}
     * 
     */
    public static String UTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return localizer.localize(localizableUTIL_FAILED_TO_PARSE_HANDLERCHAIN_FILE(arg0, arg1));
    }

    public static Localizable localizableUTIL_PARSER_WRONG_ELEMENT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("util.parser.wrong.element", arg0, arg1, arg2);
    }

    /**
     * found element "{1}", expected "{2}" in handler chain configuration (line {0})
     * 
     */
    public static String UTIL_PARSER_WRONG_ELEMENT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableUTIL_PARSER_WRONG_ELEMENT(arg0, arg1, arg2));
    }

    public static Localizable localizableUTIL_HANDLER_CLASS_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("util.handler.class.not.found", arg0);
    }

    /**
     * "Class: {0} could not be found"
     * 
     */
    public static String UTIL_HANDLER_CLASS_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableUTIL_HANDLER_CLASS_NOT_FOUND(arg0));
    }

    public static Localizable localizableUTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(Object arg0) {
        return messageFactory.getMessage("util.handler.endpoint.interface.no.webservice", arg0);
    }

    /**
     * "The Endpoint Interface: {0} does not have WebService Annotation"
     * 
     */
    public static String UTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(Object arg0) {
        return localizer.localize(localizableUTIL_HANDLER_ENDPOINT_INTERFACE_NO_WEBSERVICE(arg0));
    }

    public static Localizable localizableUTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(Object arg0) {
        return messageFactory.getMessage("util.handler.no.webservice.annotation", arg0);
    }

    /**
     * "A WebService annotation is not present on class: {0}"
     * 
     */
    public static String UTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(Object arg0) {
        return localizer.localize(localizableUTIL_HANDLER_NO_WEBSERVICE_ANNOTATION(arg0));
    }

    public static Localizable localizableUTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return messageFactory.getMessage("util.failed.to.find.handlerchain.file", arg0, arg1);
    }

    /**
     * Could not find handler chain file {1} for class {0}
     * 
     */
    public static String UTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(Object arg0, Object arg1) {
        return localizer.localize(localizableUTIL_FAILED_TO_FIND_HANDLERCHAIN_FILE(arg0, arg1));
    }

    public static Localizable localizableUTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS() {
        return messageFactory.getMessage("util.handler.cannot.combine.soapmessagehandlers");
    }

    /**
     * You must use HanlderChain annotation, not SOAPMessageHandlers
     * 
     */
    public static String UTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS() {
        return localizer.localize(localizableUTIL_HANDLER_CANNOT_COMBINE_SOAPMESSAGEHANDLERS());
    }

}
