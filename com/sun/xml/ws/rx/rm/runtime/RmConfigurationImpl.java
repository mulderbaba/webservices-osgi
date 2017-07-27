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

package com.sun.xml.ws.rx.rm.runtime;

import com.sun.istack.Nullable;
import com.sun.xml.ws.api.SOAPVersion;
import com.sun.xml.ws.api.addressing.AddressingVersion;
import com.sun.xml.ws.api.ha.HighAvailabilityProvider;
import com.sun.xml.ws.rx.RxConfigurationBase;
import com.sun.xml.ws.rx.mc.api.MakeConnectionSupportedFeature;
import org.glassfish.gmbal.ManagedObjectManager;

/**
 *
 * @author Marek Potociar <marek.potociar at sun.com>
 */
class RmConfigurationImpl extends RxConfigurationBase implements RmConfiguration {
    private final com.sun.xml.ws.rx.rm.api.ReliableMessagingFeature rmFeature;
    private final com.oracle.webservices.oracle_internal_api.rm.ReliableMessagingFeature internalRmFeature;
    private final RmRuntimeVersion runtimeVersion;

    RmConfigurationImpl(
            final com.sun.xml.ws.rx.rm.api.ReliableMessagingFeature rmFeature,
            final com.oracle.webservices.oracle_internal_api.rm.ReliableMessagingFeature internalRmFeature,
            final MakeConnectionSupportedFeature mcSupportedFeature,
            final SOAPVersion soapVersion,
            final AddressingVersion addressingVersion,
            final boolean requestResponseDetected,
            final ManagedObjectManager managedObjectManager,
            final HighAvailabilityProvider haProvider) {
        super(
                rmFeature != null && rmFeature.isEnabled(),
                mcSupportedFeature != null && mcSupportedFeature.isEnabled(),
                soapVersion,
                addressingVersion,
                requestResponseDetected,
                managedObjectManager,
                haProvider);

        this.rmFeature = rmFeature;
        this.internalRmFeature = internalRmFeature;
        this.runtimeVersion = (rmFeature != null) ? RmRuntimeVersion.forProtocolVersion(rmFeature.getProtocolVersion()) : null;
    }

    public com.sun.xml.ws.rx.rm.api.ReliableMessagingFeature getRmFeature() {
        checkState();
        return rmFeature;
    }
    
    public @Nullable com.oracle.webservices.oracle_internal_api.rm.ReliableMessagingFeature getInternalRmFeature() {
        return internalRmFeature;
    }

    public RmRuntimeVersion getRuntimeVersion() {
        checkState();
        return runtimeVersion;
    }

    private void checkState() {
        if (rmFeature == null || !rmFeature.isEnabled()) {
            throw new IllegalStateException("Reliable messaging feature is not enabled");
        }
    }
    
    @Override
    public String toString() {
        return "RmConfigurationImpl" + 
                "{\nrmFeature=" + rmFeature + 
                "{\ninternalRmFeature=" + internalRmFeature + 
                ",\nruntimeVersion=" + runtimeVersion + 
                "\n}";
    }
    
    
}
