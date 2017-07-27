
package com.sun.xml.wss.jaxws.impl.logging;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.wss.jaxws.impl.logging.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSSTUBE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_TUBE() {
        return messageFactory.getMessage("WSSTUBE0028.error.creating.new.instance.sec.server.tube");
    }

    /**
     * WSSTUBE0028: Error in creating new instance of SecurityServerTube
     * 
     */
    public static String WSSTUBE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_TUBE() {
        return localizer.localize(localizableWSSTUBE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_TUBE());
    }

    public static Localizable localizableWSSTUBE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return messageFactory.getMessage("WSSTUBE0008.problem.building.protocol.policy");
    }

    /**
     * WSSTUBE0008: Security Tube: An Error occurred while trying to build Effective Security Policy for Protocol Message.
     * 
     */
    public static String WSSTUBE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return localizer.localize(localizableWSSTUBE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY());
    }

    public static Localizable localizableWSSTUBE_0030_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0030.unsupported.operation.exception", arg0);
    }

    /**
     * WSSTUBE0030: RequestType : {0} not supported for creating a Secure Session.
     * 
     */
    public static String WSSTUBE_0030_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0030_UNSUPPORTED_OPERATION_EXCEPTION(arg0));
    }

    public static Localizable localizableWSSPIPE_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0034.faulty.response.msg", arg0);
    }

    /**
     * WSSPIPE0034: Client Application received SOAP Fault : {0}.
     * 
     */
    public static String WSSPIPE_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0034_FAULTY_RESPONSE_MSG(arg0));
    }

    public static Localizable localizableWSSTUBE_0029_ERROR_SESSION_CREATION() {
        return messageFactory.getMessage("WSSTUBE0029.error.session.creation");
    }

    /**
     * WSSTUBE0029: Fail to create a Secure Session with RST-SCT  Issue Request.
     * 
     */
    public static String WSSTUBE_0029_ERROR_SESSION_CREATION() {
        return localizer.localize(localizableWSSTUBE_0029_ERROR_SESSION_CREATION());
    }

    public static Localizable localizableWSSTUBE_0036_ERROR_INSTATIATE_WEBSERVICE_CONTEXT_DELEGATE() {
        return messageFactory.getMessage("WSSTUBE0036.error.instatiate.webservice.context.delegate");
    }

    /**
     * WSSTUBE: Exception during instantiating webservice context delegate
     * 
     */
    public static String WSSTUBE_0036_ERROR_INSTATIATE_WEBSERVICE_CONTEXT_DELEGATE() {
        return localizer.localize(localizableWSSTUBE_0036_ERROR_INSTATIATE_WEBSERVICE_CONTEXT_DELEGATE());
    }

    public static Localizable localizableWSSTUBE_0003_PROBLEM_PRINTING_MSG() {
        return messageFactory.getMessage("WSSTUBE0003.problem.printing.msg");
    }

    /**
     * WSSTUBE003: An Error occurred while trying to print SOAP Message. Could be a problem in the well formedness of XML in the message.
     * 
     */
    public static String WSSTUBE_0003_PROBLEM_PRINTING_MSG() {
        return localizer.localize(localizableWSSTUBE_0003_PROBLEM_PRINTING_MSG());
    }

    public static Localizable localizableWSSPIPE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSPIPE0019.null.or.empty.username.handler.classname");
    }

    /**
     * WSSPIPE0019: Null or Empty Value specified for usernameHandler classname.
     * 
     */
    public static String WSSPIPE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSPIPE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return messageFactory.getMessage("WSSPIPE0006.problem.init.out.proc.context");
    }

    /**
     * WSSPIPE0006: Security Pipe: An Internal Error occurred while initializing Outgoing Security Processing Context.
     * 
     */
    public static String WSSPIPE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return localizer.localize(localizableWSSPIPE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT());
    }

    public static Localizable localizableWSSTUBE_0001_PROBLEM_MAR_UNMAR() {
        return messageFactory.getMessage("WSSTUBE0001.problem.mar.unmar");
    }

    /**
     * WSSTUBE001: Problem creating JAXB Marshaller/Unmarshaller from JAXBContext. Check if the JAXBcontext has been initialized properly.
     * 
     */
    public static String WSSTUBE_0001_PROBLEM_MAR_UNMAR() {
        return localizer.localize(localizableWSSTUBE_0001_PROBLEM_MAR_UNMAR());
    }

    public static Localizable localizableWSSTUBE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSTUBE0019.null.or.empty.username.handler.classname");
    }

    /**
     * WSSTUBE0019: Null or Empty Value specified for usernameHandler classname.
     * 
     */
    public static String WSSTUBE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSTUBE_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return messageFactory.getMessage("WSSPIPE0008.problem.building.protocol.policy");
    }

    /**
     * WSSPIPE0008: Security Pipe: An Error occurred while trying to build Effective Security Policy for Protocol Message.
     * 
     */
    public static String WSSPIPE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return localizer.localize(localizableWSSPIPE_0008_PROBLEM_BUILDING_PROTOCOL_POLICY());
    }

    public static Localizable localizableWSSPIPE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0010.unknown.validator.type.config", arg0);
    }

    /**
     * WSSPIPE0010: Unknown Validator type {0} in config Assertion.
     * 
     */
    public static String WSSPIPE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(arg0));
    }

    public static Localizable localizableWSSTUBE_0031_ERROR_INVOKE_SC_CONTRACT() {
        return messageFactory.getMessage("WSSTUBE0031.error.invoke.sc.contract");
    }

    /**
     * WSSTUBE0031: Error while invoking Secure Conversation Contract.
     * 
     */
    public static String WSSTUBE_0031_ERROR_INVOKE_SC_CONTRACT() {
        return localizer.localize(localizableWSSTUBE_0031_ERROR_INVOKE_SC_CONTRACT());
    }

    public static Localizable localizableWSSTUBE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0022.null.or.empty.validator.classname", arg0);
    }

    /**
     * WSSTUBE0022: Null or Empty Validator classname set for {0}
     * 
     */
    public static String WSSTUBE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(arg0));
    }

    public static Localizable localizableWSSTUBE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSTUBE0015.keystore.password.null.config.assertion");
    }

    /**
     * WSSTUBE0015: KeyStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSTUBE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSTUBE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSPIPE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSPIPE0018.null.or.empty.xwss.callback.handler.classname");
    }

    /**
     * WSSPIPE0018: Null or Empty Value specified for xwssCallbackHandler classname.
     * 
     */
    public static String WSSPIPE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSPIPE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_PIPE() {
        return messageFactory.getMessage("WSSPIPE0028.error.creating.new.instance.sec.server.pipe");
    }

    /**
     * WSSPIPE0028: Error in creating new instance of SecurityServerPipe
     * 
     */
    public static String WSSPIPE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_PIPE() {
        return localizer.localize(localizableWSSPIPE_0028_ERROR_CREATING_NEW_INSTANCE_SEC_SERVER_PIPE());
    }

    public static Localizable localizableWSSPIPE_0033_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0033.invalid.callback.handler.class", arg0);
    }

    /**
     * WSSPIPE0033: The specified CallbackHandler class : {0} is not a valid javax.security.auth.callback.CallbackHandler
     * 
     */
    public static String WSSPIPE_0033_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0033_INVALID_CALLBACK_HANDLER_CLASS(arg0));
    }

    public static Localizable localizableWSSPIPE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0009.unsupported.callback.type.encountered", arg0);
    }

    /**
     * WSSPIPE0009: Unsupported callback type {0} encountered.
     * 
     */
    public static String WSSPIPE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(arg0));
    }

    public static Localizable localizableWSSTUBE_0032_ERROR_CONFIGURE_SERVER_HANDLER() {
        return messageFactory.getMessage("WSSTUBE0032.error.configure.server.handler");
    }

    /**
     * WSSTUBE0027: Error in configuring Server Security Callback Handler.
     * 
     */
    public static String WSSTUBE_0032_ERROR_CONFIGURE_SERVER_HANDLER() {
        return localizer.localize(localizableWSSTUBE_0032_ERROR_CONFIGURE_SERVER_HANDLER());
    }

    public static Localizable localizableWSSPIPE_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return messageFactory.getMessage("WSSPIPE0004.opt.path.not.yet.supported");
    }

    /**
     * WSSPIPE0004: Fault Policy Verification not yet supported Optimized Path.
     * 
     */
    public static String WSSPIPE_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return localizer.localize(localizableWSSPIPE_0004_OPT_PATH_NOT_YET_SUPPORTED());
    }

    public static Localizable localizableWSSTUBE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSTUBE0018.null.or.empty.xwss.callback.handler.classname");
    }

    /**
     * WSSTUBE0018: Null or Empty Value specified for xwssCallbackHandler classname.
     * 
     */
    public static String WSSTUBE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSTUBE_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0026_NO_POLICY_FOUND_FOR_SC() {
        return messageFactory.getMessage("WSSPIPE0026.no.policy.found.for.sc");
    }

    /**
     * WSSPIPE0026: Cannot start SecureConversation, no SecureConversation Assertion(s) found in Policy.
     * 
     */
    public static String WSSPIPE_0026_NO_POLICY_FOUND_FOR_SC() {
        return localizer.localize(localizableWSSPIPE_0026_NO_POLICY_FOUND_FOR_SC());
    }

    public static Localizable localizableWSSTUBE_0025_ERROR_VERIFY_INBOUND_MSG() {
        return messageFactory.getMessage("WSSTUBE0025.error.verify.inbound.msg");
    }

    /**
     * WSSTUBE0025: Error in Verifying Security in the Inbound Message.
     * 
     */
    public static String WSSTUBE_0025_ERROR_VERIFY_INBOUND_MSG() {
        return localizer.localize(localizableWSSTUBE_0025_ERROR_VERIFY_INBOUND_MSG());
    }

    public static Localizable localizableWSSTUBE_0024_ERROR_SECURING_OUTBOUND_MSG() {
        return messageFactory.getMessage("WSSTUBE0024.error.securing.outbound.msg");
    }

    /**
     * WSSTUBE0024: Error in Securing Outbound Message.
     * 
     */
    public static String WSSTUBE_0024_ERROR_SECURING_OUTBOUND_MSG() {
        return localizer.localize(localizableWSSTUBE_0024_ERROR_SECURING_OUTBOUND_MSG());
    }

    public static Localizable localizableWSSPIPE_0027_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return messageFactory.getMessage("WSSPIPE0027.error.configure.client.handler");
    }

    /**
     * WSSPIPE0027: Error in configuring Client Security Callback Handler.
     * 
     */
    public static String WSSPIPE_0027_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return localizer.localize(localizableWSSPIPE_0027_ERROR_CONFIGURE_CLIENT_HANDLER());
    }

    public static Localizable localizableWSSTUBE_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0013.sec.policy.not.configured", arg0);
    }

    /**
     * WSSTUBE0013: SecurityPolicy is not configured for operation {0}, but SecurityHeader was found.
     * 
     */
    public static String WSSTUBE_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0013_SEC_POLICY_NOT_CONFIGURED(arg0));
    }

    public static Localizable localizableWSSPIPE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return messageFactory.getMessage("WSSPIPE0007.problem.getting.eff.boot.policy");
    }

    /**
     * WSSPIPE0007: Security Pipe: An Error occurred while trying to get Effective SecureConversation Bootstrap policy.
     * 
     */
    public static String WSSPIPE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return localizer.localize(localizableWSSPIPE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY());
    }

    public static Localizable localizableWSSTUBE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSTUBE0016.truststore.url.null.config.assertion");
    }

    /**
     * WSSTUBE0016: TrustStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSTUBE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSTUBE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSTUBE_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return messageFactory.getMessage("WSSTUBE0004.opt.path.not.yet.supported");
    }

    /**
     * WSSTUBE0004: Fault Policy Verification not yet supported Optimized Path.
     * 
     */
    public static String WSSTUBE_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return localizer.localize(localizableWSSTUBE_0004_OPT_PATH_NOT_YET_SUPPORTED());
    }

    public static Localizable localizableWSSPIPE_0035_ERROR_ISSUEDTOKEN_CREATION() {
        return messageFactory.getMessage("WSSPIPE0035.error.issuedtoken.creation");
    }

    /**
     * WSSPIPE0035: Received Exception during IssuedToken Creation.
     * 
     */
    public static String WSSPIPE_0035_ERROR_ISSUEDTOKEN_CREATION() {
        return localizer.localize(localizableWSSPIPE_0035_ERROR_ISSUEDTOKEN_CREATION());
    }

    public static Localizable localizableWSSTUBE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0009.unsupported.callback.type.encountered", arg0);
    }

    /**
     * WSSTUBE0009: Unsupported callback type {0} encountered.
     * 
     */
    public static String WSSTUBE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(arg0));
    }

    public static Localizable localizableWSSPIPE_0030_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0030.unsupported.operation.exception", arg0);
    }

    /**
     * WSSPIPE0030: RequestType : {0} not supported for creating a Secure Session.
     * 
     */
    public static String WSSPIPE_0030_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0030_UNSUPPORTED_OPERATION_EXCEPTION(arg0));
    }

    public static Localizable localizableWSSPIPE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0022.null.or.empty.validator.classname", arg0);
    }

    /**
     * WSSPIPE0022: Null or Empty Validator classname set for {0}
     * 
     */
    public static String WSSPIPE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(arg0));
    }

    public static Localizable localizableWSSPIPE_0011_COULD_NOT_FIND_USER_CLASS() {
        return messageFactory.getMessage("WSSPIPE0011.could.not.find.user.class");
    }

    /**
     * WSSPIPE0011: Couldn't find User Class: {0}.
     * 
     */
    public static String WSSPIPE_0011_COULD_NOT_FIND_USER_CLASS() {
        return localizer.localize(localizableWSSPIPE_0011_COULD_NOT_FIND_USER_CLASS());
    }

    public static Localizable localizableWSSTUBE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return messageFactory.getMessage("WSSTUBE0006.problem.init.out.proc.context");
    }

    /**
     * WSSTUBE0006: Security Tube: An Internal Error occurred while initializing Outgoing Security Processing Context.
     * 
     */
    public static String WSSTUBE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return localizer.localize(localizableWSSTUBE_0006_PROBLEM_INIT_OUT_PROC_CONTEXT());
    }

    public static Localizable localizableWSSPIPE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSPIPE0017.truststore.password.null.config.assertion");
    }

    /**
     * WSSPIPE0017: TrustStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSPIPE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSPIPE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSPIPE_0002_INTERNAL_SERVER_ERROR() {
        return messageFactory.getMessage("WSSPIPE0002.internal.server.error");
    }

    /**
     * WSSPIPE0002: Security Pipe: Internal Error while trying to create a SOAPFault.
     * 
     */
    public static String WSSPIPE_0002_INTERNAL_SERVER_ERROR() {
        return localizer.localize(localizableWSSPIPE_0002_INTERNAL_SERVER_ERROR());
    }

    public static Localizable localizableWSSTUBE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0010.unknown.validator.type.config", arg0);
    }

    /**
     * WSSTUBE0010: Unknown Validator type {0} in config Assertion.
     * 
     */
    public static String WSSTUBE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(arg0));
    }

    public static Localizable localizableWSSPIPE_0003_PROBLEM_PRINTING_MSG() {
        return messageFactory.getMessage("WSSPIPE0003.problem.printing.msg");
    }

    /**
     * WSSPIPE003: An Error occurred while trying to print SOAP Message. Could be a problem in the well formedness of XML in the message.
     * 
     */
    public static String WSSPIPE_0003_PROBLEM_PRINTING_MSG() {
        return localizer.localize(localizableWSSPIPE_0003_PROBLEM_PRINTING_MSG());
    }

    public static Localizable localizableWSSTUBE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSTUBE0021.null.or.empty.saml.handler.classname");
    }

    /**
     * WSSTUBE0021: Null or Empty Value specified for samlHandler classname
     * 
     */
    public static String WSSTUBE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSTUBE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return messageFactory.getMessage("WSSPIPE0005.problem.proc.soap.message");
    }

    /**
     * WSSPIPE0005: Security Pipe: Error occurred while converting JAXWS message to SAAJ SOAP Message.
     * 
     */
    public static String WSSPIPE_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return localizer.localize(localizableWSSPIPE_0005_PROBLEM_PROC_SOAP_MESSAGE());
    }

    public static Localizable localizableWSSPIPE_0024_ERROR_SECURING_OUTBOUND_MSG() {
        return messageFactory.getMessage("WSSPIPE0024.error.securing.outbound.msg");
    }

    /**
     * WSSPIPE0024: Error in Securing Outbound Message.
     * 
     */
    public static String WSSPIPE_0024_ERROR_SECURING_OUTBOUND_MSG() {
        return localizer.localize(localizableWSSPIPE_0024_ERROR_SECURING_OUTBOUND_MSG());
    }

    public static Localizable localizableWSSPIPE_0031_ERROR_INVOKE_SC_CONTRACT() {
        return messageFactory.getMessage("WSSPIPE0031.error.invoke.sc.contract");
    }

    /**
     * WSSPIPE0031: Error while invoking Secure Conversation Contract.
     * 
     */
    public static String WSSPIPE_0031_ERROR_INVOKE_SC_CONTRACT() {
        return localizer.localize(localizableWSSPIPE_0031_ERROR_INVOKE_SC_CONTRACT());
    }

    public static Localizable localizableWSSPIPE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSPIPE0020.null.or.empty.password.handler.classname");
    }

    /**
     * WSSPIPE0020: Null or Empty Value specified for passwordHandler classname.
     * 
     */
    public static String WSSPIPE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSPIPE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSTUBE_0035_ERROR_ISSUEDTOKEN_CREATION() {
        return messageFactory.getMessage("WSSTUBE0035.error.issuedtoken.creation");
    }

    /**
     * WSSTUBE0035: Received Exception during IssuedToken Creation.
     * 
     */
    public static String WSSTUBE_0035_ERROR_ISSUEDTOKEN_CREATION() {
        return localizer.localize(localizableWSSTUBE_0035_ERROR_ISSUEDTOKEN_CREATION());
    }

    public static Localizable localizableWSSTUBE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSTUBE0020.null.or.empty.password.handler.classname");
    }

    /**
     * WSSTUBE0020: Null or Empty Value specified for passwordHandler classname.
     * 
     */
    public static String WSSTUBE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSTUBE_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSPIPE_0032_ERROR_CONFIGURE_SERVER_HANDLER() {
        return messageFactory.getMessage("WSSPIPE0032.error.configure.server.handler");
    }

    /**
     * WSSPIPE0027: Error in configuring Server Security Callback Handler.
     * 
     */
    public static String WSSPIPE_0032_ERROR_CONFIGURE_SERVER_HANDLER() {
        return localizer.localize(localizableWSSPIPE_0032_ERROR_CONFIGURE_SERVER_HANDLER());
    }

    public static Localizable localizableWSSTUBE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_TUBE() {
        return messageFactory.getMessage("WSSTUBE0023.error.creating.new.instance.sec.client.tube");
    }

    /**
     * WSSTUBE0023: Error in creating new instance of SecurityClientTube
     * 
     */
    public static String WSSTUBE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_TUBE() {
        return localizer.localize(localizableWSSTUBE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_TUBE());
    }

    public static Localizable localizableWSSPIPE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return messageFactory.getMessage("WSSPIPE0012.problem.checking.reliable.message.enable");
    }

    /**
     * WSSPIPE0012: Internal Error: Could not detect whether Reliable Messaging is enabled or not.
     * 
     */
    public static String WSSPIPE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return localizer.localize(localizableWSSPIPE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE());
    }

    public static Localizable localizableWSSPIPE_0029_ERROR_SESSION_CREATION() {
        return messageFactory.getMessage("WSSPIPE0029.error.session.creation");
    }

    /**
     * WSSPIPE0029: Fail to create a Secure Session with RST-SCT  Issue Request.
     * 
     */
    public static String WSSPIPE_0029_ERROR_SESSION_CREATION() {
        return localizer.localize(localizableWSSPIPE_0029_ERROR_SESSION_CREATION());
    }

    public static Localizable localizableWSSTUBE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return messageFactory.getMessage("WSSTUBE0012.problem.checking.reliable.message.enable");
    }

    /**
     * WSSTUBE0012: Internal Error: Could not detect whether Reliable Messaging is enabled or not.
     * 
     */
    public static String WSSTUBE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return localizer.localize(localizableWSSTUBE_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE());
    }

    public static Localizable localizableWSSPIPE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSPIPE0014.keystore.url.null.config.assertion");
    }

    /**
     * WSSPIPE0014: KeyStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSPIPE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSPIPE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSTUBE_0026_NO_POLICY_FOUND_FOR_SC() {
        return messageFactory.getMessage("WSSTUBE0026.no.policy.found.for.sc");
    }

    /**
     * WSSTUBE0026: Cannot start SecureConversation, no SecureConversation Assertion(s) found in Policy.
     * 
     */
    public static String WSSTUBE_0026_NO_POLICY_FOUND_FOR_SC() {
        return localizer.localize(localizableWSSTUBE_0026_NO_POLICY_FOUND_FOR_SC());
    }

    public static Localizable localizableWSSTUBE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSTUBE0017.truststore.password.null.config.assertion");
    }

    /**
     * WSSTUBE0017: TrustStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSTUBE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSTUBE_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSTUBE_0002_INTERNAL_SERVER_ERROR() {
        return messageFactory.getMessage("WSSTUBE0002.internal.server.error");
    }

    /**
     * WSSTUBE0002: Security Tube: Internal Error while trying to create a SOAPFault.
     * 
     */
    public static String WSSTUBE_0002_INTERNAL_SERVER_ERROR() {
        return localizer.localize(localizableWSSTUBE_0002_INTERNAL_SERVER_ERROR());
    }

    public static Localizable localizableWSSTUBE_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0034.faulty.response.msg", arg0);
    }

    /**
     * WSSTUBE0034: Client Application received SOAP Fault : {0}.
     * 
     */
    public static String WSSTUBE_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0034_FAULTY_RESPONSE_MSG(arg0));
    }

    public static Localizable localizableWSSTUBE_0033_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return messageFactory.getMessage("WSSTUBE0033.invalid.callback.handler.class", arg0);
    }

    /**
     * WSSTUBE0033: The specified CallbackHandler class : {0} is not a valid javax.security.auth.callback.CallbackHandler
     * 
     */
    public static String WSSTUBE_0033_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return localizer.localize(localizableWSSTUBE_0033_INVALID_CALLBACK_HANDLER_CLASS(arg0));
    }

    public static Localizable localizableWSSPIPE_0025_ERROR_VERIFY_INBOUND_MSG() {
        return messageFactory.getMessage("WSSPIPE0025.error.verify.inbound.msg");
    }

    /**
     * WSSPIPE0025: Error in Verifying Security in the Inbound Message.
     * 
     */
    public static String WSSPIPE_0025_ERROR_VERIFY_INBOUND_MSG() {
        return localizer.localize(localizableWSSPIPE_0025_ERROR_VERIFY_INBOUND_MSG());
    }

    public static Localizable localizableWSSPIPE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSPIPE0016.truststore.url.null.config.assertion");
    }

    /**
     * WSSPIPE0016: TrustStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSPIPE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSPIPE_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSTUBE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSTUBE0014.keystore.url.null.config.assertion");
    }

    /**
     * WSSTUBE0014: KeyStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSTUBE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSTUBE_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSPIPE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_PIPE() {
        return messageFactory.getMessage("WSSPIPE0023.error.creating.new.instance.sec.client.pipe");
    }

    /**
     * WSSPIPE0023: Error in creating new instance of SecurityClientPipe
     * 
     */
    public static String WSSPIPE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_PIPE() {
        return localizer.localize(localizableWSSPIPE_0023_ERROR_CREATING_NEW_INSTANCE_SEC_CLIENT_PIPE());
    }

    public static Localizable localizableWSSTUBE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return messageFactory.getMessage("WSSTUBE0007.problem.getting.eff.boot.policy");
    }

    /**
     * WSSTUBE0007: Security Tube: An Error occurred while trying to get Effective SecureConversation Bootstrap policy.
     * 
     */
    public static String WSSTUBE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return localizer.localize(localizableWSSTUBE_0007_PROBLEM_GETTING_EFF_BOOT_POLICY());
    }

    public static Localizable localizableWSSTUBE_0027_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return messageFactory.getMessage("WSSTUBE0027.error.configure.client.handler");
    }

    /**
     * WSSTUBE0027: Error in configuring Client Security Callback Handler.
     * 
     */
    public static String WSSTUBE_0027_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return localizer.localize(localizableWSSTUBE_0027_ERROR_CONFIGURE_CLIENT_HANDLER());
    }

    public static Localizable localizableWSSPIPE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSSPIPE0015.keystore.password.null.config.assertion");
    }

    /**
     * WSSPIPE0015: KeyStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSSPIPE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSSPIPE_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSSTUBE_0011_COULD_NOT_FIND_USER_CLASS() {
        return messageFactory.getMessage("WSSTUBE0011.could.not.find.user.class");
    }

    /**
     * WSSTUBE0011: Couldn't find User Class: {0}.
     * 
     */
    public static String WSSTUBE_0011_COULD_NOT_FIND_USER_CLASS() {
        return localizer.localize(localizableWSSTUBE_0011_COULD_NOT_FIND_USER_CLASS());
    }

    public static Localizable localizableWSSPIPE_0001_PROBLEM_MAR_UNMAR() {
        return messageFactory.getMessage("WSSPIPE0001.problem.mar.unmar");
    }

    /**
     * WSSPIPE001: Problem creating JAXB Marshaller/Unmarshaller from JAXBContext. Check if the JAXBcontext has been initialized properly.
     * 
     */
    public static String WSSPIPE_0001_PROBLEM_MAR_UNMAR() {
        return localizer.localize(localizableWSSPIPE_0001_PROBLEM_MAR_UNMAR());
    }

    public static Localizable localizableWSSPIPE_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return messageFactory.getMessage("WSSPIPE0013.sec.policy.not.configured", arg0);
    }

    /**
     * WSSPIPE0013: SecurityPolicy is not configured for operation {0}, but SecurityHeader was found.
     * 
     */
    public static String WSSPIPE_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return localizer.localize(localizableWSSPIPE_0013_SEC_POLICY_NOT_CONFIGURED(arg0));
    }

    public static Localizable localizableWSSPIPE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSSPIPE0021.null.or.empty.saml.handler.classname");
    }

    /**
     * WSSPIPE0021: Null or Empty Value specified for samlHandler classname
     * 
     */
    public static String WSSPIPE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSSPIPE_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSSTUBE_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return messageFactory.getMessage("WSSTUBE0005.problem.proc.soap.message");
    }

    /**
     * WSSTUBE0005: Security Tube: Error occurred while converting JAXWS message to SAAJ SOAP Message.
     * 
     */
    public static String WSSTUBE_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return localizer.localize(localizableWSSTUBE_0005_PROBLEM_PROC_SOAP_MESSAGE());
    }

}
