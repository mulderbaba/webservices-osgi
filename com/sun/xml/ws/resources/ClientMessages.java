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
public final class ClientMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.client");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableFAILED_TO_PARSE(Object arg0, Object arg1) {
        return messageFactory.getMessage("failed.to.parse", arg0, arg1);
    }

    /**
     * Failed to access the WSDL at: {0}. It failed with: 
     * 	{1}.
     * 
     */
    public static String FAILED_TO_PARSE(Object arg0, Object arg1) {
        return localizer.localize(localizableFAILED_TO_PARSE(arg0, arg1));
    }

    public static Localizable localizableINVALID_BINDING_ID(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.binding.id", arg0, arg1);
    }

    /**
     * Invalid binding id: {0}. Must be: {1}
     * 
     */
    public static String INVALID_BINDING_ID(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_BINDING_ID(arg0, arg1));
    }

    public static Localizable localizableEPR_WITHOUT_ADDRESSING_ON() {
        return messageFactory.getMessage("epr.without.addressing.on");
    }

    /**
     * EPR is specified without enabling WS-Addressing support.
     * 
     */
    public static String EPR_WITHOUT_ADDRESSING_ON() {
        return localizer.localize(localizableEPR_WITHOUT_ADDRESSING_ON());
    }

    public static Localizable localizableINVALID_SERVICE_NO_WSDL(Object arg0) {
        return messageFactory.getMessage("invalid.service.no.wsdl", arg0);
    }

    /**
     * No wsdl metadata for service: {0}, can't create proxy! Try creating Service by providing a WSDL URL
     * 
     */
    public static String INVALID_SERVICE_NO_WSDL(Object arg0) {
        return localizer.localize(localizableINVALID_SERVICE_NO_WSDL(arg0));
    }

    public static Localizable localizableINVALID_SOAP_ROLE_NONE() {
        return messageFactory.getMessage("invalid.soap.role.none");
    }

    /**
     * Cannot set SOAP 1.2 role "none"
     * 
     */
    public static String INVALID_SOAP_ROLE_NONE() {
        return localizer.localize(localizableINVALID_SOAP_ROLE_NONE());
    }

    public static Localizable localizableUNDEFINED_BINDING(Object arg0) {
        return messageFactory.getMessage("undefined.binding", arg0);
    }

    /**
     * Undefined binding: {0}
     * 
     */
    public static String UNDEFINED_BINDING(Object arg0) {
        return localizer.localize(localizableUNDEFINED_BINDING(arg0));
    }

    public static Localizable localizableHTTP_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("http.not.found", arg0);
    }

    /**
     * HTTP Status-Code 404: Not Found - {0}
     * 
     */
    public static String HTTP_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableHTTP_NOT_FOUND(arg0));
    }

    public static Localizable localizableINVALID_EPR_PORT_NAME(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.epr.port.name", arg0, arg1);
    }

    /**
     * EndpointName specified in EPR {0}  is not a WSDL port QName, valid Ports are {1}
     * 
     */
    public static String INVALID_EPR_PORT_NAME(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_EPR_PORT_NAME(arg0, arg1));
    }

    public static Localizable localizableFAILED_TO_PARSE_WITH_MEX(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("failed.to.parseWithMEX", arg0, arg1, arg2);
    }

    /**
     * Failed to access the WSDL at: {0}. It failed with: 
     * 	{1}.
     * Retrying with MEX gave: 
     * 	{2}
     * 
     */
    public static String FAILED_TO_PARSE_WITH_MEX(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableFAILED_TO_PARSE_WITH_MEX(arg0, arg1, arg2));
    }

    public static Localizable localizableHTTP_STATUS_CODE(Object arg0, Object arg1) {
        return messageFactory.getMessage("http.status.code", arg0, arg1);
    }

    /**
     * The server sent HTTP status code {0}: {1}
     * 
     */
    public static String HTTP_STATUS_CODE(Object arg0, Object arg1) {
        return localizer.localize(localizableHTTP_STATUS_CODE(arg0, arg1));
    }

    public static Localizable localizableINVALID_ADDRESS(Object arg0) {
        return messageFactory.getMessage("invalid.address", arg0);
    }

    /**
     * Invalid address: {0}
     * 
     */
    public static String INVALID_ADDRESS(Object arg0) {
        return localizer.localize(localizableINVALID_ADDRESS(arg0));
    }

    public static Localizable localizableUNDEFINED_PORT_TYPE(Object arg0) {
        return messageFactory.getMessage("undefined.portType", arg0);
    }

    /**
     * Undefined port type: {0}
     * 
     */
    public static String UNDEFINED_PORT_TYPE(Object arg0) {
        return localizer.localize(localizableUNDEFINED_PORT_TYPE(arg0));
    }

    public static Localizable localizableWSDL_CONTAINS_NO_SERVICE(Object arg0) {
        return messageFactory.getMessage("wsdl.contains.no.service", arg0);
    }

    /**
     * WSDL {0} contains no service definition.
     * 
     */
    public static String WSDL_CONTAINS_NO_SERVICE(Object arg0) {
        return localizer.localize(localizableWSDL_CONTAINS_NO_SERVICE(arg0));
    }

    public static Localizable localizableINVALID_SOAP_ACTION() {
        return messageFactory.getMessage("invalid.soap.action");
    }

    /**
     * A valid SOAPAction should be set in the RequestContext when Addressing is enabled, Use BindingProvider.SOAPACTION_URI_PROPERTY to set it.
     * 
     */
    public static String INVALID_SOAP_ACTION() {
        return localizer.localize(localizableINVALID_SOAP_ACTION());
    }

    public static Localizable localizableNON_LOGICAL_HANDLER_SET(Object arg0) {
        return messageFactory.getMessage("non.logical.handler.set", arg0);
    }

    /**
     * Cannot set {0} on binding. Handler must be a LogicalHandler.
     * 
     */
    public static String NON_LOGICAL_HANDLER_SET(Object arg0) {
        return localizer.localize(localizableNON_LOGICAL_HANDLER_SET(arg0));
    }

    public static Localizable localizableLOCAL_CLIENT_FAILED(Object arg0) {
        return messageFactory.getMessage("local.client.failed", arg0);
    }

    /**
     * local transport error: {0}
     * 
     */
    public static String LOCAL_CLIENT_FAILED(Object arg0) {
        return localizer.localize(localizableLOCAL_CLIENT_FAILED(arg0));
    }

    public static Localizable localizableRUNTIME_WSDLPARSER_INVALID_WSDL(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("runtime.wsdlparser.invalidWSDL", arg0, arg1, arg2, arg3);
    }

    /**
     * Invalid WSDL {0}, expected {1} found {2} at (line{3})
     * 
     */
    public static String RUNTIME_WSDLPARSER_INVALID_WSDL(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableRUNTIME_WSDLPARSER_INVALID_WSDL(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSDL_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("wsdl.not.found", arg0);
    }

    /**
     * WSDL url {0} is not accessible.
     * 
     */
    public static String WSDL_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableWSDL_NOT_FOUND(arg0));
    }

    public static Localizable localizableHTTP_CLIENT_FAILED(Object arg0) {
        return messageFactory.getMessage("http.client.failed", arg0);
    }

    /**
     * HTTP transport error: {0}
     * 
     */
    public static String HTTP_CLIENT_FAILED(Object arg0) {
        return localizer.localize(localizableHTTP_CLIENT_FAILED(arg0));
    }

    public static Localizable localizableINVALID_SERVICE_NAME_NULL(Object arg0) {
        return messageFactory.getMessage("invalid.service.name.null", arg0);
    }

    /**
     * {0} is not a valid service
     * 
     */
    public static String INVALID_SERVICE_NAME_NULL(Object arg0) {
        return localizer.localize(localizableINVALID_SERVICE_NAME_NULL(arg0));
    }

    public static Localizable localizableINVALID_WSDL_URL(Object arg0) {
        return messageFactory.getMessage("invalid.wsdl.url", arg0);
    }

    /**
     * Invalid WSDL URL: {0}
     * 
     */
    public static String INVALID_WSDL_URL(Object arg0) {
        return localizer.localize(localizableINVALID_WSDL_URL(arg0));
    }

    public static Localizable localizableINVALID_PORT_NAME(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.port.name", arg0, arg1);
    }

    /**
     * {0} is not a valid port. Valid ports are: {1}
     * 
     */
    public static String INVALID_PORT_NAME(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_PORT_NAME(arg0, arg1));
    }

    public static Localizable localizableINVALID_SERVICE_NAME(Object arg0, Object arg1) {
        return messageFactory.getMessage("invalid.service.name", arg0, arg1);
    }

    /**
     * {0} is not a valid service. Valid services are: {1}
     * 
     */
    public static String INVALID_SERVICE_NAME(Object arg0, Object arg1) {
        return localizer.localize(localizableINVALID_SERVICE_NAME(arg0, arg1));
    }

    public static Localizable localizableUNSUPPORTED_OPERATION(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("unsupported.operation", arg0, arg1, arg2);
    }

    /**
     * {0} not supported with {1}. Must be: {2}
     * 
     */
    public static String UNSUPPORTED_OPERATION(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableUNSUPPORTED_OPERATION(arg0, arg1, arg2));
    }

    public static Localizable localizableFAILED_TO_PARSE_EPR(Object arg0) {
        return messageFactory.getMessage("failed.to.parse.epr", arg0);
    }

    /**
     * Failed to parse EPR: {0}
     * 
     */
    public static String FAILED_TO_PARSE_EPR(Object arg0) {
        return localizer.localize(localizableFAILED_TO_PARSE_EPR(arg0));
    }

}
