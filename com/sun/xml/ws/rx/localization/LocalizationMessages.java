
package com.sun.xml.ws.rx.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.rx.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSRX_1001_UNABLE_TO_SERIALIZE_MSG_TO_XML_STREAM() {
        return messageFactory.getMessage("WSRX1001_UNABLE_TO_SERIALIZE_MSG_TO_XML_STREAM");
    }

    /**
     * WSRX1001: Unable to serialize message to XML stream
     * 
     */
    public static String WSRX_1001_UNABLE_TO_SERIALIZE_MSG_TO_XML_STREAM() {
        return localizer.localize(localizableWSRX_1001_UNABLE_TO_SERIALIZE_MSG_TO_XML_STREAM());
    }

    public static Localizable localizableWSRX_1002_UNABLE_TO_DESERIALIZE_MSG_FROM_XML_STREAM() {
        return messageFactory.getMessage("WSRX1002_UNABLE_TO_DESERIALIZE_MSG_FROM_XML_STREAM");
    }

    /**
     * WSRX1002: Unable to deserialize message from XML stream
     * 
     */
    public static String WSRX_1002_UNABLE_TO_DESERIALIZE_MSG_FROM_XML_STREAM() {
        return localizer.localize(localizableWSRX_1002_UNABLE_TO_DESERIALIZE_MSG_FROM_XML_STREAM());
    }

}
