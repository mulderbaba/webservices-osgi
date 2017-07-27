
package com.sun.xml.rpc.plugins;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class SecMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.rpc.plugins.sec");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableSEC_USAGE_OPTIONS() {
        return messageFactory.getMessage("sec.usage.options");
    }

    /**
     *   -security <file>          Security configuration file 
     * 
     */
    public static String SEC_USAGE_OPTIONS() {
        return localizer.localize(localizableSEC_USAGE_OPTIONS());
    }

    public static Localizable localizableSEC_MISSING_OPTION_ARGUMENT(Object arg0) {
        return messageFactory.getMessage("sec.missingOptionArgument", arg0);
    }

    /**
     * option "{0}" requires an argument
     * 
     */
    public static String SEC_MISSING_OPTION_ARGUMENT(Object arg0) {
        return localizer.localize(localizableSEC_MISSING_OPTION_ARGUMENT(arg0));
    }

    public static Localizable localizableSEC_DUPLICATE_OPTION(Object arg0) {
        return messageFactory.getMessage("sec.duplicateOption", arg0);
    }

    /**
     * duplicate option: {0}
     * 
     */
    public static String SEC_DUPLICATE_OPTION(Object arg0) {
        return localizer.localize(localizableSEC_DUPLICATE_OPTION(arg0));
    }

}
