
package com.sun.xml.wss.logging.saml;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.wss.logging.saml.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSS_001_SAML_ASSERTION_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("WSS001.SAML_ASSERTION_NOT_FOUND", arg0);
    }

    /**
     * WSS_SAML001: No SAML Assertion found with AssertionID: {0}
     * 
     */
    public static String WSS_001_SAML_ASSERTION_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableWSS_001_SAML_ASSERTION_NOT_FOUND(arg0));
    }

    public static Localizable localizableWSS_003_FAILEDTO_MARSHAL() {
        return messageFactory.getMessage("WSS003.failedto.marshal");
    }

    /**
     * WSS003: Exception occured while trying to Marshal
     * 
     */
    public static String WSS_003_FAILEDTO_MARSHAL() {
        return localizer.localize(localizableWSS_003_FAILEDTO_MARSHAL());
    }

    public static Localizable localizableWSS_004_SAML_VERSION_NOT_SET() {
        return messageFactory.getMessage("WSS004.SAML_VERSION_NOT_SET");
    }

    /**
     * WSS003: SAML Version is not set in the saml callback
     * 
     */
    public static String WSS_004_SAML_VERSION_NOT_SET() {
        return localizer.localize(localizableWSS_004_SAML_VERSION_NOT_SET());
    }

    public static Localizable localizableWSS_002_FAILED_CREATE_DOCUMENT() {
        return messageFactory.getMessage("WSS002.failed.create.document");
    }

    /**
     * WSS002: Unable to create Document
     * 
     */
    public static String WSS_002_FAILED_CREATE_DOCUMENT() {
        return localizer.localize(localizableWSS_002_FAILED_CREATE_DOCUMENT());
    }

}
