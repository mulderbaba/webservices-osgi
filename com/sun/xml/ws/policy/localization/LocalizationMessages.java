
package com.sun.xml.ws.policy.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.policy.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSP_5018_LOADED_WSIT_CFG_FILE(Object arg0) {
        return messageFactory.getMessage("WSP_5018_LOADED_WSIT_CFG_FILE", arg0);
    }

    /**
     * WSP5018: Loaded WSIT configuration from file: {0}.
     * 
     */
    public static String WSP_5018_LOADED_WSIT_CFG_FILE(Object arg0) {
        return localizer.localize(localizableWSP_5018_LOADED_WSIT_CFG_FILE(arg0));
    }

    public static Localizable localizableWSP_5001_WSIT_CFG_FILE_PROCESSING_FAILED(Object arg0) {
        return messageFactory.getMessage("WSP_5001_WSIT_CFG_FILE_PROCESSING_FAILED", arg0);
    }

    /**
     * WSP5001: Failed to process WSIT config file located at URI "{0}" due to an exception.
     * 
     */
    public static String WSP_5001_WSIT_CFG_FILE_PROCESSING_FAILED(Object arg0) {
        return localizer.localize(localizableWSP_5001_WSIT_CFG_FILE_PROCESSING_FAILED(arg0));
    }

    public static Localizable localizableWSP_5020_RESOURCE_FROM_LOADER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5020_RESOURCE_FROM_LOADER", arg0, arg1);
    }

    /**
     * WSP5020: Trying to load resource "{0}" from ResourceLoader [{1}].
     * 
     */
    public static String WSP_5020_RESOURCE_FROM_LOADER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5020_RESOURCE_FROM_LOADER(arg0, arg1));
    }

    public static Localizable localizableWSP_5022_RESOURCE_FROM_CONTEXT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5022_RESOURCE_FROM_CONTEXT", arg0, arg1);
    }

    /**
     * WSP5022: Trying to load resource "{0}" from Context [{1}].
     * 
     */
    public static String WSP_5022_RESOURCE_FROM_CONTEXT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5022_RESOURCE_FROM_CONTEXT(arg0, arg1));
    }

    public static Localizable localizableWSP_5008_CREATE_POLICY_MAP_FOR_CONFIG(Object arg0) {
        return messageFactory.getMessage("WSP_5008_CREATE_POLICY_MAP_FOR_CONFIG", arg0);
    }

    /**
     * WSP5008: WSIT configuration file not found for config ID "{0}". Creating new empty policy map.
     * 
     */
    public static String WSP_5008_CREATE_POLICY_MAP_FOR_CONFIG(Object arg0) {
        return localizer.localize(localizableWSP_5008_CREATE_POLICY_MAP_FOR_CONFIG(arg0));
    }

    public static Localizable localizableWSP_5009_COULD_NOT_LOCATE_WSIT_CFG_FILE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5009_COULD_NOT_LOCATE_WSIT_CFG_FILE", arg0, arg1);
    }

    /**
     * WSP5009: Failed to find any WSIT configuration file for ID "{0}" in the system. Examined path was: "{1}".
     * 
     */
    public static String WSP_5009_COULD_NOT_LOCATE_WSIT_CFG_FILE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5009_COULD_NOT_LOCATE_WSIT_CFG_FILE(arg0, arg1));
    }

    public static Localizable localizableWSP_5005_INVOCATION_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5005_INVOCATION_ERROR", arg0, arg1);
    }

    /**
     * WSP5005: Unable to invoke given method "{0}" with arguments [{1}] on underlying XMLStreamBuffer instance.
     * 
     */
    public static String WSP_5005_INVOCATION_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5005_INVOCATION_ERROR(arg0, arg1));
    }

    public static Localizable localizableWSP_5017_SERVER_SIDE_ASSERTION_VALIDATION_FAILED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5017_SERVER_SIDE_ASSERTION_VALIDATION_FAILED", arg0, arg1);
    }

    /**
     * WSP5017: Server side assertion validation failed for "{0}" assertion. Assertion was evaluated as "{1}".
     * 
     */
    public static String WSP_5017_SERVER_SIDE_ASSERTION_VALIDATION_FAILED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5017_SERVER_SIDE_ASSERTION_VALIDATION_FAILED(arg0, arg1));
    }

    public static Localizable localizableWSP_5014_CLIENT_CONFIG_PROCESSING_SKIPPED() {
        return messageFactory.getMessage("WSP_5014_CLIENT_CONFIG_PROCESSING_SKIPPED");
    }

    /**
     * WSP5014: No client configuration found - processing skipped.
     * 
     */
    public static String WSP_5014_CLIENT_CONFIG_PROCESSING_SKIPPED() {
        return localizer.localize(localizableWSP_5014_CLIENT_CONFIG_PROCESSING_SKIPPED());
    }

    public static Localizable localizableWSP_5004_ERROR_WHILE_PROCESSING_CLIENT_CONFIG() {
        return messageFactory.getMessage("WSP_5004_ERROR_WHILE_PROCESSING_CLIENT_CONFIG");
    }

    /**
     * WSP5004: Unexpected error occured while processing client configuration file.
     * 
     */
    public static String WSP_5004_ERROR_WHILE_PROCESSING_CLIENT_CONFIG() {
        return localizer.localize(localizableWSP_5004_ERROR_WHILE_PROCESSING_CLIENT_CONFIG());
    }

    public static Localizable localizableWSP_5006_FAILED_TO_READ_WSIT_CONFIG_FOR_ID(Object arg0) {
        return messageFactory.getMessage("WSP_5006_FAILED_TO_READ_WSIT_CONFIG_FOR_ID", arg0);
    }

    /**
     * WSP5006: Failed to read WSIT configuration file for Id [{0}].
     * 
     */
    public static String WSP_5006_FAILED_TO_READ_WSIT_CONFIG_FOR_ID(Object arg0) {
        return localizer.localize(localizableWSP_5006_FAILED_TO_READ_WSIT_CONFIG_FOR_ID(arg0));
    }

    public static Localizable localizableWSP_5024_WSIT_CONFIG_AND_WSDL(Object arg0) {
        return messageFactory.getMessage("WSP_5024_WSIT_CONFIG_AND_WSDL", arg0);
    }

    /**
     * WSP5024: A WSDL document is bundled with the service. All policies will be read directly from the WSDL document and the WSIT configuration file at <{0}> will be ignored.
     * 
     */
    public static String WSP_5024_WSIT_CONFIG_AND_WSDL(Object arg0) {
        return localizer.localize(localizableWSP_5024_WSIT_CONFIG_AND_WSDL(arg0));
    }

    public static Localizable localizableWSP_5016_CAN_NOT_FIND_CLASS(Object arg0) {
        return messageFactory.getMessage("WSP_5016_CAN_NOT_FIND_CLASS", arg0);
    }

    /**
     * WSP5016: Class {0} can not be found.
     * 
     */
    public static String WSP_5016_CAN_NOT_FIND_CLASS(Object arg0) {
        return localizer.localize(localizableWSP_5016_CAN_NOT_FIND_CLASS(arg0));
    }

    public static Localizable localizableWSP_5010_CONTEXT_IS(Object arg0) {
        return messageFactory.getMessage("WSP_5010_CONTEXT_IS", arg0);
    }

    /**
     * WSP5010: context = {0}.
     * 
     */
    public static String WSP_5010_CONTEXT_IS(Object arg0) {
        return localizer.localize(localizableWSP_5010_CONTEXT_IS(arg0));
    }

    public static Localizable localizableWSP_5021_FAILED_RESOURCE_FROM_LOADER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSP_5021_FAILED_RESOURCE_FROM_LOADER", arg0, arg1);
    }

    /**
     * WSP5021: Failed to load resource "{0}" from ResourceLoader [{1}].
     * 
     */
    public static String WSP_5021_FAILED_RESOURCE_FROM_LOADER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSP_5021_FAILED_RESOURCE_FROM_LOADER(arg0, arg1));
    }

    public static Localizable localizableWSP_5007_FAILED_TO_READ_NULL_WSIT_CFG() {
        return messageFactory.getMessage("WSP_5007_FAILED_TO_READ_NULL_WSIT_CFG");
    }

    /**
     * WSP5007: Failed to load WSIT config file. Provided WSIT config file URL is 'null'.
     * 
     */
    public static String WSP_5007_FAILED_TO_READ_NULL_WSIT_CFG() {
        return localizer.localize(localizableWSP_5007_FAILED_TO_READ_NULL_WSIT_CFG());
    }

    public static Localizable localizableWSP_5015_CLIENT_CFG_POLICIES_TRANSFERED_INTO_FINAL_POLICY_MAP(Object arg0) {
        return messageFactory.getMessage("WSP_5015_CLIENT_CFG_POLICIES_TRANSFERED_INTO_FINAL_POLICY_MAP", arg0);
    }

    /**
     * WSP5015: Client configuration policies transfered into final policy map: {0}.
     * 
     */
    public static String WSP_5015_CLIENT_CFG_POLICIES_TRANSFERED_INTO_FINAL_POLICY_MAP(Object arg0) {
        return localizer.localize(localizableWSP_5015_CLIENT_CFG_POLICIES_TRANSFERED_INTO_FINAL_POLICY_MAP(arg0));
    }

    public static Localizable localizableWSP_5011_CONFIG_FILE_IS(Object arg0) {
        return messageFactory.getMessage("WSP_5011_CONFIG_FILE_IS", arg0);
    }

    /**
     * WSP5011: cfg file = {0}.
     * 
     */
    public static String WSP_5011_CONFIG_FILE_IS(Object arg0) {
        return localizer.localize(localizableWSP_5011_CONFIG_FILE_IS(arg0));
    }

    public static Localizable localizableWSP_5023_FIND_WSIT_CONFIG_FAILED() {
        return messageFactory.getMessage("WSP_5023_FIND_WSIT_CONFIG_FAILED");
    }

    /**
     * WSP5023: Exception occurred while trying to locate a WSIT configuration file.
     * 
     */
    public static String WSP_5023_FIND_WSIT_CONFIG_FAILED() {
        return localizer.localize(localizableWSP_5023_FIND_WSIT_CONFIG_FAILED());
    }

}
