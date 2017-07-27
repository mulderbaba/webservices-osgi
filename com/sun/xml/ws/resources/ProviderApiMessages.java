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
public final class ProviderApiMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.providerApi");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableNULL_ADDRESS_SERVICE_ENDPOINT() {
        return messageFactory.getMessage("null.address.service.endpoint");
    }

    /**
     * Address in an EPR cannot be null, when serviceName or portName is null
     * 
     */
    public static String NULL_ADDRESS_SERVICE_ENDPOINT() {
        return localizer.localize(localizableNULL_ADDRESS_SERVICE_ENDPOINT());
    }

    public static Localizable localizableNO_WSDL_NO_PORT(Object arg0) {
        return messageFactory.getMessage("no.wsdl.no.port", arg0);
    }

    /**
     * WSDL Metadata not available to create the proxy, either Service instance or ServiceEndpointInterface {0} should have WSDL information  
     * 
     */
    public static String NO_WSDL_NO_PORT(Object arg0) {
        return localizer.localize(localizableNO_WSDL_NO_PORT(arg0));
    }

    public static Localizable localizableNULL_SERVICE() {
        return messageFactory.getMessage("null.service");
    }

    /**
     * serviceName can't be null when portName is specified
     * 
     */
    public static String NULL_SERVICE() {
        return localizer.localize(localizableNULL_SERVICE());
    }

    public static Localizable localizableNULL_ADDRESS() {
        return messageFactory.getMessage("null.address");
    }

    /**
     * Address in an EPR cannot be null
     * 
     */
    public static String NULL_ADDRESS() {
        return localizer.localize(localizableNULL_ADDRESS());
    }

    public static Localizable localizableNULL_PORTNAME() {
        return messageFactory.getMessage("null.portname");
    }

    /**
     * EPR doesn't have EndpointName in the Metadata
     * 
     */
    public static String NULL_PORTNAME() {
        return localizer.localize(localizableNULL_PORTNAME());
    }

    public static Localizable localizableNOTFOUND_SERVICE_IN_WSDL(Object arg0, Object arg1) {
        return messageFactory.getMessage("notfound.service.in.wsdl", arg0, arg1);
    }

    /**
     * Service: {0} not found in WSDL: {1}
     * 
     */
    public static String NOTFOUND_SERVICE_IN_WSDL(Object arg0, Object arg1) {
        return localizer.localize(localizableNOTFOUND_SERVICE_IN_WSDL(arg0, arg1));
    }

    public static Localizable localizableNULL_EPR() {
        return messageFactory.getMessage("null.epr");
    }

    /**
     * EndpointReference is null
     * 
     */
    public static String NULL_EPR() {
        return localizer.localize(localizableNULL_EPR());
    }

    public static Localizable localizableNULL_WSDL() {
        return messageFactory.getMessage("null.wsdl");
    }

    /**
     * EPR doesn't have WSDL Metadata which is needed for the current operation
     * 
     */
    public static String NULL_WSDL() {
        return localizer.localize(localizableNULL_WSDL());
    }

    public static Localizable localizableNOTFOUND_PORT_IN_WSDL(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("notfound.port.in.wsdl", arg0, arg1, arg2);
    }

    /**
     * Port: {0} not a valid port in Service: {1} in WSDL: {2}
     * 
     */
    public static String NOTFOUND_PORT_IN_WSDL(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableNOTFOUND_PORT_IN_WSDL(arg0, arg1, arg2));
    }

    public static Localizable localizableERROR_WSDL(Object arg0) {
        return messageFactory.getMessage("error.wsdl", arg0);
    }

    /**
     * Error in parsing WSDL: {0}
     * 
     */
    public static String ERROR_WSDL(Object arg0) {
        return localizer.localize(localizableERROR_WSDL(arg0));
    }

}
