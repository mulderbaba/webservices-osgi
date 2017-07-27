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
public final class WsdlmodelMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.wsdlmodel");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSDL_PORTADDRESS_EPRADDRESS_NOT_MATCH(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("wsdl.portaddress.epraddress.not.match", arg0, arg1, arg2);
    }

    /**
     * For Port: {0}, service location {1} does not match address {2} in the EndpointReference
     * 
     */
    public static String WSDL_PORTADDRESS_EPRADDRESS_NOT_MATCH(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSDL_PORTADDRESS_EPRADDRESS_NOT_MATCH(arg0, arg1, arg2));
    }

    public static Localizable localizableWSDL_IMPORT_SHOULD_BE_WSDL(Object arg0) {
        return messageFactory.getMessage("wsdl.import.should.be.wsdl", arg0);
    }

    /**
     * Import of {0} is violation of BP 1.1 R2001. Proceeding with a warning.
     * R2001 A DESCRIPTION must only use the WSDL "import" statement to import another WSDL description.
     * 
     */
    public static String WSDL_IMPORT_SHOULD_BE_WSDL(Object arg0) {
        return localizer.localize(localizableWSDL_IMPORT_SHOULD_BE_WSDL(arg0));
    }

    public static Localizable localizableMEX_METADATA_SYSTEMID_NULL() {
        return messageFactory.getMessage("Mex.metadata.systemid.null");
    }

    /**
     * MEX WSDL metadata can not be parsed, the systemId is of the MEX source is null.
     * 
     */
    public static String MEX_METADATA_SYSTEMID_NULL() {
        return localizer.localize(localizableMEX_METADATA_SYSTEMID_NULL());
    }

}
