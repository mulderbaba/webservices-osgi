
package com.sun.xml.ws.xmlfilter.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.xmlfilter.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableXMLF_5019_NO_ARGUMENTS_IN_INVOCATION(Object arg0) {
        return messageFactory.getMessage("XMLF_5019_NO_ARGUMENTS_IN_INVOCATION", arg0);
    }

    /**
     * XMLF5019: This invocation instance does not hold any arguments: [{0}].
     * 
     */
    public static String XMLF_5019_NO_ARGUMENTS_IN_INVOCATION(Object arg0) {
        return localizer.localize(localizableXMLF_5019_NO_ARGUMENTS_IN_INVOCATION(arg0));
    }

    public static Localizable localizableXMLF_5013_ILLEGAL_INVOCATION_METHOD_TYPE(Object arg0, Object arg1) {
        return messageFactory.getMessage("XMLF_5013_ILLEGAL_INVOCATION_METHOD_TYPE", arg0, arg1);
    }

    /**
     * XMLF5013: Illegal invocation method type "{0}" found. Invocation parameter passed to this method must represent "{1}" method invocation.
     * 
     */
    public static String XMLF_5013_ILLEGAL_INVOCATION_METHOD_TYPE(Object arg0, Object arg1) {
        return localizer.localize(localizableXMLF_5013_ILLEGAL_INVOCATION_METHOD_TYPE(arg0, arg1));
    }

    public static Localizable localizableXMLF_5005_INVOCATION_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("XMLF_5005_INVOCATION_ERROR", arg0, arg1);
    }

    /**
     * XMLF5005: Unable to invoke given method "{0}" with arguments [{1}] on underlying XMLStreamBuffer instance.
     * 
     */
    public static String XMLF_5005_INVOCATION_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableXMLF_5005_INVOCATION_ERROR(arg0, arg1));
    }

    public static Localizable localizableXMLF_5002_UNEXPECTED_OBJECT_METHOD(Object arg0) {
        return messageFactory.getMessage("XMLF_5002_UNEXPECTED_OBJECT_METHOD", arg0);
    }

    /**
     * XMLF5002: Unexpected Object method dispatched: "{0}".
     * 
     */
    public static String XMLF_5002_UNEXPECTED_OBJECT_METHOD(Object arg0) {
        return localizer.localize(localizableXMLF_5002_UNEXPECTED_OBJECT_METHOD(arg0));
    }

    public static Localizable localizableXMLF_5012_METHOD_PARAMETER_CANNOT_BE_NULL(Object arg0) {
        return messageFactory.getMessage("XMLF_5012_METHOD_PARAMETER_CANNOT_BE_NULL", arg0);
    }

    /**
     * XMLF5012: {0} method parameter cannot be 'null'.
     * 
     */
    public static String XMLF_5012_METHOD_PARAMETER_CANNOT_BE_NULL(Object arg0) {
        return localizer.localize(localizableXMLF_5012_METHOD_PARAMETER_CANNOT_BE_NULL(arg0));
    }

    public static Localizable localizableXMLF_5003_UNEXPECTED_ARGUMENTS_COUNT(Object arg0, Object arg1) {
        return messageFactory.getMessage("XMLF_5003_UNEXPECTED_ARGUMENTS_COUNT", arg0, arg1);
    }

    /**
     * XMLF5003: Unexpected argument count ({1}) when writing attribute ({0}).
     * 
     */
    public static String XMLF_5003_UNEXPECTED_ARGUMENTS_COUNT(Object arg0, Object arg1) {
        return localizer.localize(localizableXMLF_5003_UNEXPECTED_ARGUMENTS_COUNT(arg0, arg1));
    }

}
