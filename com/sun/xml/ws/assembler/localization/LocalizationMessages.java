
package com.sun.xml.ws.assembler.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.assembler.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableMASM_0019_MSG_LOGGING_SYSTEM_PROPERTY_ILLEGAL_VALUE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MASM0019_MSG_LOGGING_SYSTEM_PROPERTY_ILLEGAL_VALUE", arg0, arg1);
    }

    /**
     * MASM0019: Illegal logging level value "{1}" stored in the {0} message logging system property. Using default logging level.
     * 
     */
    public static String MASM_0019_MSG_LOGGING_SYSTEM_PROPERTY_ILLEGAL_VALUE(Object arg0, Object arg1) {
        return localizer.localize(localizableMASM_0019_MSG_LOGGING_SYSTEM_PROPERTY_ILLEGAL_VALUE(arg0, arg1));
    }

    public static Localizable localizableMASM_0009_CANNOT_FORM_VALID_URL(Object arg0) {
        return messageFactory.getMessage("MASM0009_CANNOT_FORM_VALID_URL", arg0);
    }

    /**
     * MASM0009: Cannot form a valid URL from the resource name "{0}". For more details see the nested exception.
     * 
     */
    public static String MASM_0009_CANNOT_FORM_VALID_URL(Object arg0) {
        return localizer.localize(localizableMASM_0009_CANNOT_FORM_VALID_URL(arg0));
    }

    public static Localizable localizableMASM_0005_NO_DEFAULT_TUBELINE_IN_DEFAULT_CFG_FILE() {
        return messageFactory.getMessage("MASM0005_NO_DEFAULT_TUBELINE_IN_DEFAULT_CFG_FILE");
    }

    /**
     * MASM0005: No default tubeline is defined in the default metro-default.xml configuration file
     * 
     */
    public static String MASM_0005_NO_DEFAULT_TUBELINE_IN_DEFAULT_CFG_FILE() {
        return localizer.localize(localizableMASM_0005_NO_DEFAULT_TUBELINE_IN_DEFAULT_CFG_FILE());
    }

    public static Localizable localizableMASM_0003_DEFAULT_CFG_FILE_NOT_LOADED() {
        return messageFactory.getMessage("MASM0003_DEFAULT_CFG_FILE_NOT_LOADED");
    }

    /**
     * MASM0003: Default metro-default.xml configuration file was not loaded
     * 
     */
    public static String MASM_0003_DEFAULT_CFG_FILE_NOT_LOADED() {
        return localizer.localize(localizableMASM_0003_DEFAULT_CFG_FILE_NOT_LOADED());
    }

    public static Localizable localizableMASM_0018_MSG_LOGGING_SYSTEM_PROPERTY_SET_TO_VALUE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MASM0018_MSG_LOGGING_SYSTEM_PROPERTY_SET_TO_VALUE", arg0, arg1);
    }

    /**
     * MASM0018: Message logging {0} system property detected to be set to value {1}
     * 
     */
    public static String MASM_0018_MSG_LOGGING_SYSTEM_PROPERTY_SET_TO_VALUE(Object arg0, Object arg1) {
        return localizer.localize(localizableMASM_0018_MSG_LOGGING_SYSTEM_PROPERTY_SET_TO_VALUE(arg0, arg1));
    }

    public static Localizable localizableMASM_0001_DEFAULT_CFG_FILE_NOT_FOUND() {
        return messageFactory.getMessage("MASM0001_DEFAULT_CFG_FILE_NOT_FOUND");
    }

    /**
     * MASM0001: Default metro-default.xml configuration file was not found
     * 
     */
    public static String MASM_0001_DEFAULT_CFG_FILE_NOT_FOUND() {
        return localizer.localize(localizableMASM_0001_DEFAULT_CFG_FILE_NOT_FOUND());
    }

    public static Localizable localizableMASM_0020_ERROR_CREATING_URI_FROM_GENERATED_STRING(Object arg0) {
        return messageFactory.getMessage("MASM0020_ERROR_CREATING_URI_FROM_GENERATED_STRING", arg0);
    }

    /**
     * MASM0020: Unable to create a new URI instance for generated endpoint URI string [ {0} ]
     * 
     */
    public static String MASM_0020_ERROR_CREATING_URI_FROM_GENERATED_STRING(Object arg0) {
        return localizer.localize(localizableMASM_0020_ERROR_CREATING_URI_FROM_GENERATED_STRING(arg0));
    }

    public static Localizable localizableMASM_0016_UNABLE_TO_INSTANTIATE_TUBE_FACTORY(Object arg0) {
        return messageFactory.getMessage("MASM0016_UNABLE_TO_INSTANTIATE_TUBE_FACTORY", arg0);
    }

    /**
     * MASM0016: Unable to instantiate Tube factory class [ {0} ]
     * 
     */
    public static String MASM_0016_UNABLE_TO_INSTANTIATE_TUBE_FACTORY(Object arg0) {
        return localizer.localize(localizableMASM_0016_UNABLE_TO_INSTANTIATE_TUBE_FACTORY(arg0));
    }

    public static Localizable localizableMASM_0012_LOADING_VIA_SERVLET_CONTEXT(Object arg0, Object arg1) {
        return messageFactory.getMessage("MASM0012_LOADING_VIA_SERVLET_CONTEXT", arg0, arg1);
    }

    /**
     * MASM0012: Trying to load [ {0} ] via servlet context [ {1} ]
     * 
     */
    public static String MASM_0012_LOADING_VIA_SERVLET_CONTEXT(Object arg0, Object arg1) {
        return localizer.localize(localizableMASM_0012_LOADING_VIA_SERVLET_CONTEXT(arg0, arg1));
    }

    public static Localizable localizableMASM_0010_ERROR_READING_CFG_FILE_FROM_LOCATION(Object arg0) {
        return messageFactory.getMessage("MASM0010_ERROR_READING_CFG_FILE_FROM_LOCATION", arg0);
    }

    /**
     * MASM0010: Unable to unmarshall metro config file from location [ {0} ]
     * 
     */
    public static String MASM_0010_ERROR_READING_CFG_FILE_FROM_LOCATION(Object arg0) {
        return localizer.localize(localizableMASM_0010_ERROR_READING_CFG_FILE_FROM_LOCATION(arg0));
    }

    public static Localizable localizableMASM_0004_NO_TUBELINES_SECTION_IN_DEFAULT_CFG_FILE() {
        return messageFactory.getMessage("MASM0004_NO_TUBELINES_SECTION_IN_DEFAULT_CFG_FILE");
    }

    /**
     * MASM0004: No <tubelines> section found in the default metro-default.xml configuration file
     * 
     */
    public static String MASM_0004_NO_TUBELINES_SECTION_IN_DEFAULT_CFG_FILE() {
        return localizer.localize(localizableMASM_0004_NO_TUBELINES_SECTION_IN_DEFAULT_CFG_FILE());
    }

    public static Localizable localizableMASM_0013_ERROR_INVOKING_SERVLET_CONTEXT_METHOD(Object arg0) {
        return messageFactory.getMessage("MASM0013_ERROR_INVOKING_SERVLET_CONTEXT_METHOD", arg0);
    }

    /**
     * MASM0013: Unable to invoke {0} method on servlet context instance
     * 
     */
    public static String MASM_0013_ERROR_INVOKING_SERVLET_CONTEXT_METHOD(Object arg0) {
        return localizer.localize(localizableMASM_0013_ERROR_INVOKING_SERVLET_CONTEXT_METHOD(arg0));
    }

    public static Localizable localizableMASM_0007_APP_CFG_FILE_NOT_FOUND() {
        return messageFactory.getMessage("MASM0007_APP_CFG_FILE_NOT_FOUND");
    }

    /**
     * MASM0007: No application metro.xml configuration file found.
     * 
     */
    public static String MASM_0007_APP_CFG_FILE_NOT_FOUND() {
        return localizer.localize(localizableMASM_0007_APP_CFG_FILE_NOT_FOUND());
    }

    public static Localizable localizableMASM_0002_DEFAULT_CFG_FILE_LOCATED(Object arg0) {
        return messageFactory.getMessage("MASM0002_DEFAULT_CFG_FILE_LOCATED", arg0);
    }

    /**
     * MASM0002: Default metro-default.xml configuration file located at [ {0} ]
     * 
     */
    public static String MASM_0002_DEFAULT_CFG_FILE_LOCATED(Object arg0) {
        return localizer.localize(localizableMASM_0002_DEFAULT_CFG_FILE_LOCATED(arg0));
    }

    public static Localizable localizableMASM_0014_UNABLE_TO_LOAD_CLASS(Object arg0) {
        return messageFactory.getMessage("MASM0014_UNABLE_TO_LOAD_CLASS", arg0);
    }

    /**
     * MASM0014: Unable to load [ {0} ] class
     * 
     */
    public static String MASM_0014_UNABLE_TO_LOAD_CLASS(Object arg0) {
        return localizer.localize(localizableMASM_0014_UNABLE_TO_LOAD_CLASS(arg0));
    }

    public static Localizable localizableMASM_0006_APP_CFG_FILE_LOCATED(Object arg0) {
        return messageFactory.getMessage("MASM0006_APP_CFG_FILE_LOCATED", arg0);
    }

    /**
     * MASM0006: Application metro.xml configuration file located at [ {0} ]
     * 
     */
    public static String MASM_0006_APP_CFG_FILE_LOCATED(Object arg0) {
        return localizer.localize(localizableMASM_0006_APP_CFG_FILE_LOCATED(arg0));
    }

    public static Localizable localizableMASM_0017_UNABLE_TO_LOAD_TUBE_FACTORY_CLASS(Object arg0) {
        return messageFactory.getMessage("MASM0017_UNABLE_TO_LOAD_TUBE_FACTORY_CLASS", arg0);
    }

    /**
     * MASM0017: Unable to load Tube factory class [ {0} ]
     * 
     */
    public static String MASM_0017_UNABLE_TO_LOAD_TUBE_FACTORY_CLASS(Object arg0) {
        return localizer.localize(localizableMASM_0017_UNABLE_TO_LOAD_TUBE_FACTORY_CLASS(arg0));
    }

    public static Localizable localizableMASM_0008_INVALID_URI_REFERENCE(Object arg0) {
        return messageFactory.getMessage("MASM0008_INVALID_URI_REFERENCE", arg0);
    }

    /**
     * MASM0008: Invalid URI reference [ {0} ]
     * 
     */
    public static String MASM_0008_INVALID_URI_REFERENCE(Object arg0) {
        return localizer.localize(localizableMASM_0008_INVALID_URI_REFERENCE(arg0));
    }

    public static Localizable localizableMASM_0011_LOADING_RESOURCE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MASM0011_LOADING_RESOURCE", arg0, arg1);
    }

    /**
     * MASM0011: Trying to load [ {0} ] via parent resouce loader [ {1} ]
     * 
     */
    public static String MASM_0011_LOADING_RESOURCE(Object arg0, Object arg1) {
        return localizer.localize(localizableMASM_0011_LOADING_RESOURCE(arg0, arg1));
    }

    public static Localizable localizableMASM_0015_CLASS_DOES_NOT_IMPLEMENT_INTERFACE(Object arg0, Object arg1) {
        return messageFactory.getMessage("MASM0015_CLASS_DOES_NOT_IMPLEMENT_INTERFACE", arg0, arg1);
    }

    /**
     * MASM0015: Class [ {0} ] does not implement [ {1} ] interface
     * 
     */
    public static String MASM_0015_CLASS_DOES_NOT_IMPLEMENT_INTERFACE(Object arg0, Object arg1) {
        return localizer.localize(localizableMASM_0015_CLASS_DOES_NOT_IMPLEMENT_INTERFACE(arg0, arg1));
    }

}