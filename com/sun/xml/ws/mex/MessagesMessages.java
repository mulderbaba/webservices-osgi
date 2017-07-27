
package com.sun.xml.ws.mex;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class MessagesMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.mex.Messages");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableMEX_0007_RETURNING_NULL_MDATA() {
        return messageFactory.getMessage("MEX0007.RETURNING_NULL_MDATA");
    }

    /**
     * MEX0007:No metadata retrieved. Returning null from retrieveMetadata
     * 
     */
    public static String MEX_0007_RETURNING_NULL_MDATA() {
        return localizer.localize(localizableMEX_0007_RETURNING_NULL_MDATA());
    }

    public static Localizable localizableMEX_0021_NEW_ADDRESS_NO_URL(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0021.NEW_ADDRESS_NO_URL", arg0, arg1);
    }

    /**
     * MEX0021:The replacement address {0} for port {1} is not a valid URL. Leaving unchanged.
     * 
     */
    public static String MEX_0021_NEW_ADDRESS_NO_URL(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0021_NEW_ADDRESS_NO_URL(arg0, arg1));
    }

    public static Localizable localizableMEX_0002_UNKNOWN_DIALECT_WITH_ID(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0002.UNKNOWN_DIALECT_WITH_ID", arg0, arg1);
    }

    /**
     * MEX0002:Ignoring unknown dialect "{0}" in MEX MetadataSection response with identifier "{1}"
     * 
     */
    public static String MEX_0002_UNKNOWN_DIALECT_WITH_ID(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0002_UNKNOWN_DIALECT_WITH_ID(arg0, arg1));
    }

    public static Localizable localizableMEX_0015_IOEXCEPTION_WHILE_WRITING_RESPONSE(Object arg0) {
        return messageFactory.getMessage("MEX0015.IOEXCEPTION_WHILE_WRITING_RESPONSE", arg0);
    }

    /**
     * MEX0015:IOException was received while writing out response XML for service at {0}
     * 
     */
    public static String MEX_0015_IOEXCEPTION_WHILE_WRITING_RESPONSE(Object arg0) {
        return localizer.localize(localizableMEX_0015_IOEXCEPTION_WHILE_WRITING_RESPONSE(arg0));
    }

    public static Localizable localizableMEX_0008_PARSING_MDATA_FAILURE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0008.PARSING_MDATA_FAILURE", arg0, arg1);
    }

    /**
     * MEX0008:Failed to parse metadata returned from server at {1} using protocol {0}. Continuing attempts.
     * 
     */
    public static String MEX_0008_PARSING_MDATA_FAILURE(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0008_PARSING_MDATA_FAILURE(arg0, arg1));
    }

    public static Localizable localizableMEX_0006_RETRIEVING_MDATA_FAILURE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0006.RETRIEVING_MDATA_FAILURE", arg0, arg1);
    }

    /**
     * MEX0006:Exception retrieving MEX data with protocol {0} and address {1}. Continuing attempts.
     * 
     */
    public static String MEX_0006_RETRIEVING_MDATA_FAILURE(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0006_RETRIEVING_MDATA_FAILURE(arg0, arg1));
    }

    public static Localizable localizableMEX_0017_GET_METADATA_NOT_IMPLEMENTED(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0017.GET_METADATA_NOT_IMPLEMENTED", arg0, arg1);
    }

    /**
     * MEX0017:This endpoint does not implement {0}. Use {1} instead.
     * 
     */
    public static String MEX_0017_GET_METADATA_NOT_IMPLEMENTED(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0017_GET_METADATA_NOT_IMPLEMENTED(arg0, arg1));
    }

    public static Localizable localizableMEX_0010_ERROR_FROM_SERVER() {
        return messageFactory.getMessage("MEX0010.ERROR_FROM_SERVER");
    }

    /**
     * MEX0010:Error returned from server during MEX request:
     * 
     */
    public static String MEX_0010_ERROR_FROM_SERVER() {
        return localizer.localize(localizableMEX_0010_ERROR_FROM_SERVER());
    }

    public static Localizable localizableMEX_0009_ADDRESS_NOT_FOUND_FOR_PORT(Object arg0) {
        return messageFactory.getMessage("MEX0009.ADDRESS_NOT_FOUND_FOR_PORT", arg0);
    }

    /**
     * MEX0009:No address node was found for the WSDL port {0} in MEX response
     * 
     */
    public static String MEX_0009_ADDRESS_NOT_FOUND_FOR_PORT(Object arg0) {
        return localizer.localize(localizableMEX_0009_ADDRESS_NOT_FOUND_FOR_PORT(arg0));
    }

    public static Localizable localizableMEX_0012_READING_ERROR_STREAM_FAILURE() {
        return messageFactory.getMessage("MEX0012.READING_ERROR_STREAM_FAILURE");
    }

    /**
     * MEX0012:Exception ignored while reading error stream during MEX request
     * 
     */
    public static String MEX_0012_READING_ERROR_STREAM_FAILURE() {
        return localizer.localize(localizableMEX_0012_READING_ERROR_STREAM_FAILURE());
    }

    public static Localizable localizableMEX_0016_NO_METADATA() {
        return messageFactory.getMessage("MEX0016.NO_METADATA");
    }

    /**
     * MEX0016:Failed to find any metadata for the endpoint
     * 
     */
    public static String MEX_0016_NO_METADATA() {
        return localizer.localize(localizableMEX_0016_NO_METADATA());
    }

    public static Localizable localizableMEX_0011_ERROR_FROM_SERVER_END() {
        return messageFactory.getMessage("MEX0011.ERROR_FROM_SERVER_END");
    }

    /**
     * MEX0011:End of error output
     * 
     */
    public static String MEX_0011_ERROR_FROM_SERVER_END() {
        return localizer.localize(localizableMEX_0011_ERROR_FROM_SERVER_END());
    }

    public static Localizable localizableMEX_0005_WSDL_NOT_FOUND_WITH_NAMESPACE(Object arg0) {
        return messageFactory.getMessage("MEX0005.WSDL_NOT_FOUND_WITH_NAMESPACE", arg0);
    }

    /**
     * MEX0005:No WSDL with target namespace "{0}" found in MEX response to match import statement
     * 
     */
    public static String MEX_0005_WSDL_NOT_FOUND_WITH_NAMESPACE(Object arg0) {
        return localizer.localize(localizableMEX_0005_WSDL_NOT_FOUND_WITH_NAMESPACE(arg0));
    }

    public static Localizable localizableMEX_0003_UNKNOWN_WSDL_NAMESPACE(Object arg0) {
        return messageFactory.getMessage("MEX0003.UNKNOWN_WSDL_NAMESPACE", arg0);
    }

    /**
     * MEX0003:No targetNamespace was found for element {0} in MEX metadata response
     * 
     */
    public static String MEX_0003_UNKNOWN_WSDL_NAMESPACE(Object arg0) {
        return localizer.localize(localizableMEX_0003_UNKNOWN_WSDL_NAMESPACE(arg0));
    }

    public static Localizable localizableMEX_0020_CURRENT_ADDRESS_NO_URL(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0020.CURRENT_ADDRESS_NO_URL", arg0, arg1);
    }

    /**
     * MEX0020:The address {0} for port {1} is not a valid URL. Leaving unchanged.
     * 
     */
    public static String MEX_0020_CURRENT_ADDRESS_NO_URL(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0020_CURRENT_ADDRESS_NO_URL(arg0, arg1));
    }

    public static Localizable localizableMEX_0018_REPLACE_ADDRESS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("MEX0018.REPLACE_ADDRESS", arg0, arg1, arg2);
    }

    /**
     * MEX0018:Replacing port address {0} for port {1} with {2}.
     * 
     */
    public static String MEX_0018_REPLACE_ADDRESS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableMEX_0018_REPLACE_ADDRESS(arg0, arg1, arg2));
    }

    public static Localizable localizableMEX_0004_TRANSFORMING_FAILURE(Object arg0) {
        return messageFactory.getMessage("MEX0004.TRANSFORMING_FAILURE", arg0);
    }

    /**
     * MEX0004:Exception while trying to convert and read targetNamespace in MEX response from location {0}
     * 
     */
    public static String MEX_0004_TRANSFORMING_FAILURE(Object arg0) {
        return localizer.localize(localizableMEX_0004_TRANSFORMING_FAILURE(arg0));
    }

    public static Localizable localizableMEX_0001_RESPONSE_WRITING_FAILURE(Object arg0) {
        return messageFactory.getMessage("MEX0001.RESPONSE_WRITING_FAILURE", arg0);
    }

    /**
     * MEX0001:Exception occurred while writing MEX response message from service {0}
     * 
     */
    public static String MEX_0001_RESPONSE_WRITING_FAILURE(Object arg0) {
        return localizer.localize(localizableMEX_0001_RESPONSE_WRITING_FAILURE(arg0));
    }

    public static Localizable localizableMEX_0013_CLOSING_ERROR_STREAM_FAILURE() {
        return messageFactory.getMessage("MEX0013.CLOSING_ERROR_STREAM_FAILURE");
    }

    /**
     * MEX0013:Exception ignored while closing error stream during MEX request
     * 
     */
    public static String MEX_0013_CLOSING_ERROR_STREAM_FAILURE() {
        return localizer.localize(localizableMEX_0013_CLOSING_ERROR_STREAM_FAILURE());
    }

    public static Localizable localizableMEX_0014_RETRIEVAL_FROM_ADDRESS_FAILURE(Object arg0) {
        return messageFactory.getMessage("MEX0014.RETRIEVAL_FROM_ADDRESS_FAILURE", arg0);
    }

    /**
     * MEX0014:Exception occurred while trying to retrieve metadata from address {0}
     * 
     */
    public static String MEX_0014_RETRIEVAL_FROM_ADDRESS_FAILURE(Object arg0) {
        return localizer.localize(localizableMEX_0014_RETRIEVAL_FROM_ADDRESS_FAILURE(arg0));
    }

    public static Localizable localizableMEX_0019_LEAVE_ADDRESS(Object arg0, Object arg1) {
        return messageFactory.getMessage("MEX0019.LEAVE_ADDRESS", arg0, arg1);
    }

    /**
     * MEX0019:Leaving port address {0} for port {1} unchanged.
     * 
     */
    public static String MEX_0019_LEAVE_ADDRESS(Object arg0, Object arg1) {
        return localizer.localize(localizableMEX_0019_LEAVE_ADDRESS(arg0, arg1));
    }

}
