
package com.sun.xml.ws.security.message.stream;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.security.message.stream.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSSMSG_0002_ERROR_READING_BUFFER() {
        return messageFactory.getMessage("WSSMSG0002.error.reading.buffer");
    }

    /**
     * WSSMSG0002: Error occurred while reading incoming SOAP message from the buffer, debug is enabled.
     * 
     */
    public static String WSSMSG_0002_ERROR_READING_BUFFER() {
        return localizer.localize(localizableWSSMSG_0002_ERROR_READING_BUFFER());
    }

    public static Localizable localizableWSSMSG_0003_ERROR_PRINT() {
        return messageFactory.getMessage("WSSMSG0003.error.print");
    }

    /**
     * WSSMSG004: Error occurred while printing the incoming SOAP message.
     * 
     */
    public static String WSSMSG_0003_ERROR_PRINT() {
        return localizer.localize(localizableWSSMSG_0003_ERROR_PRINT());
    }

    public static Localizable localizableWSSMSG_0001_PROBLEM_CACHING() {
        return messageFactory.getMessage("WSSMSG0001.problem.caching");
    }

    /**
     * WSSMSG0001: Error occurred while buffering incoming SOAP message.
     * 
     */
    public static String WSSMSG_0001_PROBLEM_CACHING() {
        return localizer.localize(localizableWSSMSG_0001_PROBLEM_CACHING());
    }

}
