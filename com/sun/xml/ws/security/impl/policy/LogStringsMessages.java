
package com.sun.xml.ws.security.impl.policy;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.security.impl.policy.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableSP_0107_UNKNOWN_TOKEN_TYPE(Object arg0) {
        return messageFactory.getMessage("SP0107.unknown.token.type", arg0);
    }

    /**
     * SP0107: Following token type {0} is not supported.
     * 
     */
    public static String SP_0107_UNKNOWN_TOKEN_TYPE(Object arg0) {
        return localizer.localize(localizableSP_0107_UNKNOWN_TOKEN_TYPE(arg0));
    }

    public static Localizable localizableSP_0112_ERROR_INSTANTIATING(Object arg0) {
        return messageFactory.getMessage("SP0112.error.instantiating", arg0);
    }

    /**
     * SP0112: Error occurred while instantiating SecurityPolicy assertion {0}.
     * 
     */
    public static String SP_0112_ERROR_INSTANTIATING(Object arg0) {
        return localizer.localize(localizableSP_0112_ERROR_INSTANTIATING(arg0));
    }

    public static Localizable localizableSP_0104_ERROR_SIGNATURE_CONFIRMATION_ELEMENT(Object arg0) {
        return messageFactory.getMessage("SP0104.error.signature-confirmation-element", arg0);
    }

    /**
     * SP0104: Following error {0} occurred while processing SignatureConfirmation element.
     * 
     */
    public static String SP_0104_ERROR_SIGNATURE_CONFIRMATION_ELEMENT(Object arg0) {
        return localizer.localize(localizableSP_0104_ERROR_SIGNATURE_CONFIRMATION_ELEMENT(arg0));
    }

    public static Localizable localizableSP_0113_UNABLE_TO_DIGEST_POLICY(Object arg0) {
        return messageFactory.getMessage("SP0113.unable.to.digest.policy", arg0);
    }

    /**
     * SP0113: Unable to digest the SecurityPolicy {0}.
     * 
     */
    public static String SP_0113_UNABLE_TO_DIGEST_POLICY(Object arg0) {
        return localizer.localize(localizableSP_0113_UNABLE_TO_DIGEST_POLICY(arg0));
    }

    public static Localizable localizableSP_0105_ERROR_BINDING_ASSR_NOT_PRESENT() {
        return messageFactory.getMessage("SP0105.error.binding-assr-not-present");
    }

    /**
     * SP0105: Either SymmetricBinding/AsymmetricBinding/TransportBinding assertion must be present in the wsdl.
     * 
     */
    public static String SP_0105_ERROR_BINDING_ASSR_NOT_PRESENT() {
        return localizer.localize(localizableSP_0105_ERROR_BINDING_ASSR_NOT_PRESENT());
    }

    public static Localizable localizableSP_0103_ERROR_REQUIRED_ELEMENTS(Object arg0) {
        return messageFactory.getMessage("SP0103.error.required-elements", arg0);
    }

    /**
     * SP0103: Following error {0} occurred while processing RequiredElements policy assertion.
     * 
     */
    public static String SP_0103_ERROR_REQUIRED_ELEMENTS(Object arg0) {
        return localizer.localize(localizableSP_0103_ERROR_REQUIRED_ELEMENTS(arg0));
    }

    public static Localizable localizableSP_0111_ERROR_OBTAINING_CONSTRUCTOR(Object arg0) {
        return messageFactory.getMessage("SP0111.error.obtaining.constructor", arg0);
    }

    /**
     * SP0111: Error occurred while obtaining the constructor for SecurityPolicy assertion {0}.
     * 
     */
    public static String SP_0111_ERROR_OBTAINING_CONSTRUCTOR(Object arg0) {
        return localizer.localize(localizableSP_0111_ERROR_OBTAINING_CONSTRUCTOR(arg0));
    }

    public static Localizable localizableSP_0102_INVALID_URI_VALUE(Object arg0) {
        return messageFactory.getMessage("SP0102.invalid.uri-value", arg0);
    }

    /**
     * SP0102: Invalid URI value {0} is set.
     * 
     */
    public static String SP_0102_INVALID_URI_VALUE(Object arg0) {
        return localizer.localize(localizableSP_0102_INVALID_URI_VALUE(arg0));
    }

    public static Localizable localizableSP_0110_ERROR_LOCATING_CLASS(Object arg0) {
        return messageFactory.getMessage("SP0110.error.locating.class", arg0);
    }

    /**
     * SP0110: Error occurred while locating SecurityPolicy assertion creator class {0}.
     * 
     */
    public static String SP_0110_ERROR_LOCATING_CLASS(Object arg0) {
        return localizer.localize(localizableSP_0110_ERROR_LOCATING_CLASS(arg0));
    }

    public static Localizable localizableSP_0108_SECURITY_POLICY_CREATOR_NF(Object arg0) {
        return messageFactory.getMessage("SP0108.security.policy.creator.nf", arg0);
    }

    /**
     * SP0108: Security Policy Creator class {0} was not found.
     * 
     */
    public static String SP_0108_SECURITY_POLICY_CREATOR_NF(Object arg0) {
        return localizer.localize(localizableSP_0108_SECURITY_POLICY_CREATOR_NF(arg0));
    }

    public static Localizable localizableSP_0101_INVALID_EPR_ADDRESS() {
        return messageFactory.getMessage("SP0101.invalid.epr-address");
    }

    /**
     * SP0101: Error occurred while reading Address element.
     * 
     */
    public static String SP_0101_INVALID_EPR_ADDRESS() {
        return localizer.localize(localizableSP_0101_INVALID_EPR_ADDRESS());
    }

    public static Localizable localizableSP_0100_INVALID_SECURITY_ASSERTION(Object arg0, Object arg1) {
        return messageFactory.getMessage("SP0100.invalid.security.assertion", arg0, arg1);
    }

    /**
     * SP0100: Policy assertion {0} is not supported under {1} assertion.
     * 
     */
    public static String SP_0100_INVALID_SECURITY_ASSERTION(Object arg0, Object arg1) {
        return localizer.localize(localizableSP_0100_INVALID_SECURITY_ASSERTION(arg0, arg1));
    }

    public static Localizable localizableSP_0106_UNKNOWN_MESSAGE_LAYOUT(Object arg0) {
        return messageFactory.getMessage("SP0106.unknown.message.layout", arg0);
    }

    /**
     * SP0106: Unknown MessageLayout value {0} has been specified in the policy.
     * 
     */
    public static String SP_0106_UNKNOWN_MESSAGE_LAYOUT(Object arg0) {
        return localizer.localize(localizableSP_0106_UNKNOWN_MESSAGE_LAYOUT(arg0));
    }

    public static Localizable localizableSP_0109_ERROR_DIGESTING_SP(Object arg0) {
        return messageFactory.getMessage("SP0109.error.digesting.sp", arg0);
    }

    /**
     * SP0109: Following error {0} occurred while digesting SecurityPolicy.
     * 
     */
    public static String SP_0109_ERROR_DIGESTING_SP(Object arg0) {
        return localizer.localize(localizableSP_0109_ERROR_DIGESTING_SP(arg0));
    }

}
