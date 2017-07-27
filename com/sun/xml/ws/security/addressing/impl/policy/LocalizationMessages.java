
package com.sun.xml.ws.security.addressing.impl.policy;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.security.addressing.impl.policy.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSA_0003_ERROR_INSTANTIATING(Object arg0) {
        return messageFactory.getMessage("WSA0003.error.instantiating", arg0);
    }

    /**
     * WSA0003: Error occurred while instantiating Addressing assertion {0}.
     * 
     */
    public static String WSA_0003_ERROR_INSTANTIATING(Object arg0) {
        return localizer.localize(localizableWSA_0003_ERROR_INSTANTIATING(arg0));
    }

    public static Localizable localizableWSA_0002_ERROR_OBTAINING_CONSTRUCTOR(Object arg0) {
        return messageFactory.getMessage("WSA0002.error.obtaining.constructor", arg0);
    }

    /**
     * WSA0002: Error occurred while obtaining the constructor for Addressing assertion {0}.
     * 
     */
    public static String WSA_0002_ERROR_OBTAINING_CONSTRUCTOR(Object arg0) {
        return localizer.localize(localizableWSA_0002_ERROR_OBTAINING_CONSTRUCTOR(arg0));
    }

    public static Localizable localizableWSA_0004_INVALID_EPR_ADDRESS() {
        return messageFactory.getMessage("WSA0004.invalid.epr-address");
    }

    /**
     * WSA0004: Error occurred while reading Address element.
     * 
     */
    public static String WSA_0004_INVALID_EPR_ADDRESS() {
        return localizer.localize(localizableWSA_0004_INVALID_EPR_ADDRESS());
    }

    public static Localizable localizableWSA_0001_UNKNOWN_ASSERTION(Object arg0) {
        return messageFactory.getMessage("WSA_0001_UNKNOWN_ASSERTION", arg0);
    }

    /**
     * WSA0001: Failed to identify assertion: ''{0}''
     * 
     */
    public static String WSA_0001_UNKNOWN_ASSERTION(Object arg0) {
        return localizer.localize(localizableWSA_0001_UNKNOWN_ASSERTION(arg0));
    }

}
