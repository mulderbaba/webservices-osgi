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
public final class DispatchMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.dispatch");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableINVALID_NULLARG_XMLHTTP_REQUEST_METHOD(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.nullarg.xmlhttp.request.method", arg0, arg1);
    }

    /**
     * A XML/HTTP request using MessageContext.HTTP_REQUEST_METHOD equals {0} with a Null invocation Argument is not allowed. Must be: {1}
     * 
     */
    public static String INVALID_NULLARG_XMLHTTP_REQUEST_METHOD(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_NULLARG_XMLHTTP_REQUEST_METHOD(arg0, arg1));
    }

    public static Localizable localizableINVALID_NULLARG_URI() {
        return messageFactory.getMessage("invalid.nullarg.uri");
    }

    /**
     * Endpoint address URI is not allowed with a null argument
     * 
     */
    public static String INVALID_NULLARG_URI() {
        return localizer.localize(localizableINVALID_NULLARG_URI());
    }

    public static Localizable localizableINVALID_SOAPMESSAGE_DISPATCH_MSGMODE(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.soapmessage.dispatch.msgmode", arg0, arg1);
    }

    /**
     * Can not create Dispatch<SOAPMessage> of {0}. Must be {1}.
     * 
     */
    public static String INVALID_SOAPMESSAGE_DISPATCH_MSGMODE(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_SOAPMESSAGE_DISPATCH_MSGMODE(arg0, arg1));
    }

    public static Localizable localizableINVALID_RESPONSE_DESERIALIZATION() {
        return messageFactory.getMessage("invalid.response.deserialization");
    }

    /**
     * Failed to deserialize the response.
     * 
     */
    public static String INVALID_RESPONSE_DESERIALIZATION() {
        return localizer.localize(localizableINVALID_RESPONSE_DESERIALIZATION());
    }

    public static Localizable localizableINVALID_QUERY_LEADING_CHAR(Object arg0) {
        return messageFactory.getMessage("invalid.query.leading.char", arg0);
    }

    /**
     * Leading '?' of MessageContext.QUERY_STRING: {0} is not valid. Remove '?' and run again.
     * 
     */
    public static String INVALID_QUERY_LEADING_CHAR(Object arg0) {
        return localizer.localize(localizableINVALID_QUERY_LEADING_CHAR(arg0));
    }

    public static Localizable localizableINVALID_QUERY_STRING(Object arg0) {
        return messageFactory.getMessage("invalid.query.string", arg0);
    }

    /**
     * Unable to resolve endpoint address using the supplied query string: {0}.
     * 
     */
    public static String INVALID_QUERY_STRING(Object arg0) {
        return localizer.localize(localizableINVALID_QUERY_STRING(arg0));
    }

    public static Localizable localizableDUPLICATE_PORT(Object arg0) {
        return messageFactory.getMessage("duplicate.port", arg0);
    }

    /**
     * WSDLPort {0} already exists. Can not create a port of the same QName.
     * 
     */
    public static String DUPLICATE_PORT(Object arg0) {
        return localizer.localize(localizableDUPLICATE_PORT(arg0));
    }

    public static Localizable localizableINVALID_DATASOURCE_DISPATCH_BINDING(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.datasource.dispatch.binding", arg0, arg1);
    }

    /**
     * Can not create Dispatch<DataSource> with {0}. Must be: {1}
     * 
     */
    public static String INVALID_DATASOURCE_DISPATCH_BINDING(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_DATASOURCE_DISPATCH_BINDING(arg0, arg1));
    }

    public static Localizable localizableINVALID_DATASOURCE_DISPATCH_MSGMODE(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.datasource.dispatch.msgmode", arg0, arg1);
    }

    /**
     * Can not create Dispatch<DataSource> of Service.Mode.PAYLOAD{0}. Must be: {1}
     * 
     */
    public static String INVALID_DATASOURCE_DISPATCH_MSGMODE(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_DATASOURCE_DISPATCH_MSGMODE(arg0, arg1));
    }

    public static Localizable localizableINVALID_NULLARG_SOAP_MSGMODE(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.nullarg.soap.msgmode", arg0, arg1);
    }

    /**
     * SOAP/HTTP Binding in {0} is not allowed with a null invocation argument. Must be: {1}
     * 
     */
    public static String INVALID_NULLARG_SOAP_MSGMODE(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_NULLARG_SOAP_MSGMODE(arg0, arg1));
    }

    public static Localizable localizableINVALID_URI(Object arg0) {
        return messageFactory.getMessage("invalid.uri", arg0);
    }

    /**
     * Endpoint String: {0} is and invalid URI.
     * 
     */
    public static String INVALID_URI(Object arg0) {
        return localizer.localize(localizableINVALID_URI(arg0));
    }

    public static Localizable localizableINVALID_SOAPMESSAGE_DISPATCH_BINDING(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.soapmessage.dispatch.binding", arg0, arg1);
    }

    /**
     * Can not create Dispatch<SOAPMessage> with {0} Binding. Must be: {1} Binding.
     * 
     */
    public static String INVALID_SOAPMESSAGE_DISPATCH_BINDING(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_SOAPMESSAGE_DISPATCH_BINDING(arg0, arg1));
    }

    public static Localizable localizableINVALID_URI_PATH_QUERY(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.uri.path.query", arg0, arg1);
    }

    /**
     * Unable to construct a URI with this path info {0} and this query string {1}.
     * 
     */
    public static String INVALID_URI_PATH_QUERY(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_URI_PATH_QUERY(arg0, arg1));
    }

    public static Localizable localizableINVALID_RESPONSE() {
        return messageFactory.getMessage("invalid.response");
    }

    /**
     * No response returned.
     * 
     */
    public static String INVALID_RESPONSE() {
        return localizer.localize(localizableINVALID_RESPONSE());
    }

    public static Localizable localizableINVALID_URI_RESOLUTION(Object arg0) {
        return messageFactory.getMessage("invalid.uri.resolution", arg0);
    }

    /**
     * Unable to resolve endpoint address using the supplied path: {0}.
     * 
     */
    public static String INVALID_URI_RESOLUTION(Object arg0) {
        return localizer.localize(localizableINVALID_URI_RESOLUTION(arg0));
    }

    public static Localizable localizableINVALID_URI_DECODE() {
        return messageFactory.getMessage("invalid.uri.decode");
    }

    /**
     * Unable to decode the resolved endpoint using UTF-8 encoding.
     * 
     */
    public static String INVALID_URI_DECODE() {
        return localizer.localize(localizableINVALID_URI_DECODE());
    }

}
