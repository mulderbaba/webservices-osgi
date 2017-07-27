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
public final class HandlerMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.resources.handler");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableHANDLER_MESSAGE_CONTEXT_INVALID_CLASS(Object arg0, Object arg1) {
        return messageFactory.getMessage("handler.messageContext.invalid.class", arg0, arg1);
    }

    /**
     * "{0}" is not an allowed value for the property "{1}"
     * 
     */
    public static String HANDLER_MESSAGE_CONTEXT_INVALID_CLASS(Object arg0, Object arg1) {
        return localizer.localize(localizableHANDLER_MESSAGE_CONTEXT_INVALID_CLASS(arg0, arg1));
    }

    public static Localizable localizableCANNOT_EXTEND_HANDLER_DIRECTLY(Object arg0) {
        return messageFactory.getMessage("cannot.extend.handler.directly", arg0);
    }

    /**
     * Handler {0} must implement LogicalHandler or SOAPHandler.
     * 
     */
    public static String CANNOT_EXTEND_HANDLER_DIRECTLY(Object arg0) {
        return localizer.localize(localizableCANNOT_EXTEND_HANDLER_DIRECTLY(arg0));
    }

    public static Localizable localizableHANDLER_NOT_VALID_TYPE(Object arg0) {
        return messageFactory.getMessage("handler.not.valid.type", arg0);
    }

    /**
     * {0} does not implement one of the handler interfaces.
     * 
     */
    public static String HANDLER_NOT_VALID_TYPE(Object arg0) {
        return localizer.localize(localizableHANDLER_NOT_VALID_TYPE(arg0));
    }

    public static Localizable localizableCANNOT_INSTANTIATE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("cannot.instantiate.handler", arg0, arg1);
    }

    /**
     * Unable to instantiate handler: {0} because: {1}
     * 
     */
    public static String CANNOT_INSTANTIATE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableCANNOT_INSTANTIATE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableHANDLER_CHAIN_CONTAINS_HANDLER_ONLY(Object arg0) {
        return messageFactory.getMessage("handler.chain.contains.handler.only", arg0);
    }

    /**
     * A HandlerChain can only contain Handler instances: {0}
     * 
     */
    public static String HANDLER_CHAIN_CONTAINS_HANDLER_ONLY(Object arg0) {
        return localizer.localize(localizableHANDLER_CHAIN_CONTAINS_HANDLER_ONLY(arg0));
    }

    public static Localizable localizableHANDLER_NESTED_ERROR(Object arg0) {
        return messageFactory.getMessage("handler.nestedError", arg0);
    }

    /**
     * handler error: {0}
     * 
     */
    public static String HANDLER_NESTED_ERROR(Object arg0) {
        return localizer.localize(localizableHANDLER_NESTED_ERROR(arg0));
    }

    public static Localizable localizableHANDLER_PREDESTROY_IGNORE(Object arg0) {
        return messageFactory.getMessage("handler.predestroy.ignore", arg0);
    }

    /**
     * Exception ignored from invoking handler @PreDestroy method: {0}
     * 
     */
    public static String HANDLER_PREDESTROY_IGNORE(Object arg0) {
        return localizer.localize(localizableHANDLER_PREDESTROY_IGNORE(arg0));
    }

}
