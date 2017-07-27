
package com.sun.xml.wss.provider.wsit.logging;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.wss.provider.wsit.logging.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSITPVD_0049_ERROR_CANCEL_SECURITY_CONTEXT_TOKEN() {
        return messageFactory.getMessage("WSITPVD0049.error.cancel.security.context.token");
    }

    /**
     * WSITPVD0049: Error while cancelling Security Context Token.
     * 
     */
    public static String WSITPVD_0049_ERROR_CANCEL_SECURITY_CONTEXT_TOKEN() {
        return localizer.localize(localizableWSITPVD_0049_ERROR_CANCEL_SECURITY_CONTEXT_TOKEN());
    }

    public static Localizable localizableWSITPVD_0046_ERROR_INVOKE_SC_CONTRACT() {
        return messageFactory.getMessage("WSITPVD0046.error.invoke.sc.contract");
    }

    /**
     * WSITPVD0046: Error while invoking Secure Conversation Contract.
     * 
     */
    public static String WSITPVD_0046_ERROR_INVOKE_SC_CONTRACT() {
        return localizer.localize(localizableWSITPVD_0046_ERROR_INVOKE_SC_CONTRACT());
    }

    public static Localizable localizableWSITPVD_0043_ERROR_CONFIGURE_SERVER_HANDLER() {
        return messageFactory.getMessage("WSITPVD0043.error.configure.server.handler");
    }

    /**
     * WSITPVD0043: Error in configuring Server Security Callback Handler.
     * 
     */
    public static String WSITPVD_0043_ERROR_CONFIGURE_SERVER_HANDLER() {
        return localizer.localize(localizableWSITPVD_0043_ERROR_CONFIGURE_SERVER_HANDLER());
    }

    public static Localizable localizableWSITPVD_0024_NULL_CLIENT_AUTH_CONTEXT() {
        return messageFactory.getMessage("WSITPVD0024.null.client.auth.context");
    }

    /**
     * WSITPVD0024: Error: Client Authentication Context was not Initialized.
     * 
     */
    public static String WSITPVD_0024_NULL_CLIENT_AUTH_CONTEXT() {
        return localizer.localize(localizableWSITPVD_0024_NULL_CLIENT_AUTH_CONTEXT());
    }

    public static Localizable localizableWSITPVD_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSITPVD0015.keystore.password.null.config.assertion");
    }

    /**
     * WSITPVD0015: KeyStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSITPVD_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSITPVD_0015_KEYSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSITPVD_0032_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return messageFactory.getMessage("WSITPVD0032.error.configure.client.handler");
    }

    /**
     * WSITPVD0032: Error in configuring Client Callback Handler.
     * 
     */
    public static String WSITPVD_0032_ERROR_CONFIGURE_CLIENT_HANDLER() {
        return localizer.localize(localizableWSITPVD_0032_ERROR_CONFIGURE_CLIENT_HANDLER());
    }

    public static Localizable localizableWSITPVD_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return messageFactory.getMessage("WSITPVD0013.sec.policy.not.configured", arg0);
    }

    /**
     * WSITPVD0013: SecurityPolicy is not configured for operation {0}, but SecurityHeader was found.
     * 
     */
    public static String WSITPVD_0013_SEC_POLICY_NOT_CONFIGURED(Object arg0) {
        return localizer.localize(localizableWSITPVD_0013_SEC_POLICY_NOT_CONFIGURED(arg0));
    }

    public static Localizable localizableWSITPVD_0057_ERROR_PROCESS_RESPONSE() {
        return messageFactory.getMessage("WSITPVD0057.error.process.response");
    }

    /**
     * WSITPVD0057: error while processing the response
     * 
     */
    public static String WSITPVD_0057_ERROR_PROCESS_RESPONSE() {
        return localizer.localize(localizableWSITPVD_0057_ERROR_PROCESS_RESPONSE());
    }

    public static Localizable localizableWSITPVD_0055_WS_ERROR_NEXT_PIPE() {
        return messageFactory.getMessage("WSITPVD0055.ws.error.next.pipe");
    }

    /**
     * WSSPVD0055: ws.error processing next pipe
     * 
     */
    public static String WSITPVD_0055_WS_ERROR_NEXT_PIPE() {
        return localizer.localize(localizableWSITPVD_0055_WS_ERROR_NEXT_PIPE());
    }

    public static Localizable localizableWSITPVD_0037_NULL_SUBJECT() {
        return messageFactory.getMessage("WSITPVD0037.null.subject");
    }

    /**
     * WSITPVD0037: Error disposing Subject: null value for Subject.
     * 
     */
    public static String WSITPVD_0037_NULL_SUBJECT() {
        return localizer.localize(localizableWSITPVD_0037_NULL_SUBJECT());
    }

    public static Localizable localizableWSITPVD_0003_PROBLEM_PRINTING_MSG() {
        return messageFactory.getMessage("WSITPVD0003.problem.printing.msg");
    }

    /**
     * WSITPVD003: An Error occurred while trying to print SOAP Message. Could be a problem in the well formedness of XML in the message.
     * 
     */
    public static String WSITPVD_0003_PROBLEM_PRINTING_MSG() {
        return localizer.localize(localizableWSITPVD_0003_PROBLEM_PRINTING_MSG());
    }

    public static Localizable localizableWSITPVD_0059_JMAC_FACTORY_CANNOT_WRITE_FILE() {
        return messageFactory.getMessage("WSITPVD0059.jmac.factory.cannot.write.file");
    }

    /**
     * WSITPVD0059: jmac factory cannot write file error
     * 
     */
    public static String WSITPVD_0059_JMAC_FACTORY_CANNOT_WRITE_FILE() {
        return localizer.localize(localizableWSITPVD_0059_JMAC_FACTORY_CANNOT_WRITE_FILE());
    }

    public static Localizable localizableWSITPVD_0064_ERROR_CLEAN_SUBJECT() {
        return messageFactory.getMessage("WSITPVD0064.error.clean.subject");
    }

    /**
     * WSITPVD0064: error during cleaning the Subject
     * 
     */
    public static String WSITPVD_0064_ERROR_CLEAN_SUBJECT() {
        return localizer.localize(localizableWSITPVD_0064_ERROR_CLEAN_SUBJECT());
    }

    public static Localizable localizableWSITPVD_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return messageFactory.getMessage("WSITPVD0022.null.or.empty.validator.classname", arg0);
    }

    /**
     * WSITPVD0022: Null or Empty Validator classname set for {0}
     * 
     */
    public static String WSITPVD_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(Object arg0) {
        return localizer.localize(localizableWSITPVD_0022_NULL_OR_EMPTY_VALIDATOR_CLASSNAME(arg0));
    }

    public static Localizable localizableWSITPVD_0028_ERROR_INIT_AUTH_MODULE() {
        return messageFactory.getMessage("WSITPVD0028.error.init.auth.module");
    }

    /**
     * WSITPVD0028: Error in initializing Auth Module.
     * 
     */
    public static String WSITPVD_0028_ERROR_INIT_AUTH_MODULE() {
        return localizer.localize(localizableWSITPVD_0028_ERROR_INIT_AUTH_MODULE());
    }

    public static Localizable localizableWSITPVD_0050_ERROR_SECURE_REQUEST() {
        return messageFactory.getMessage("WSITPVD0050.error.secure.request");
    }

    /**
     * WSITPVD0050: Error while Securing Request Message.
     * 
     */
    public static String WSITPVD_0050_ERROR_SECURE_REQUEST() {
        return localizer.localize(localizableWSITPVD_0050_ERROR_SECURE_REQUEST());
    }

    public static Localizable localizableWSITPVD_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSITPVD0017.truststore.password.null.config.assertion");
    }

    /**
     * WSITPVD0017: TrustStore Password was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSITPVD_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSITPVD_0017_TRUSTSTORE_PASSWORD_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSITPVD_0053_ERROR_VALIDATE_REQUEST() {
        return messageFactory.getMessage("WSITPVD0053.error.validate.request");
    }

    /**
     * WSITPVD0053: error while validating the request
     * 
     */
    public static String WSITPVD_0053_ERROR_VALIDATE_REQUEST() {
        return localizer.localize(localizableWSITPVD_0053_ERROR_VALIDATE_REQUEST());
    }

    public static Localizable localizableWSITPVD_0033_ERROR_VALIDATE_RESPONSE() {
        return messageFactory.getMessage("WSITPVD0033.error.validate.response");
    }

    /**
     * WSITPVD0033: SOAP Exception while validating Secure Response Message.
     * 
     */
    public static String WSITPVD_0033_ERROR_VALIDATE_RESPONSE() {
        return localizer.localize(localizableWSITPVD_0033_ERROR_VALIDATE_RESPONSE());
    }

    public static Localizable localizableWSITPVD_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return messageFactory.getMessage("WSITPVD0008.problem.building.protocol.policy");
    }

    /**
     * WSITPVD0008: Security Provider: An Error occurred while trying to build Effective Security Policy for Protocol Message.
     * 
     */
    public static String WSITPVD_0008_PROBLEM_BUILDING_PROTOCOL_POLICY() {
        return localizer.localize(localizableWSITPVD_0008_PROBLEM_BUILDING_PROTOCOL_POLICY());
    }

    public static Localizable localizableWSITPVD_0031_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return messageFactory.getMessage("WSITPVD0031.invalid.callback.handler.class", arg0);
    }

    /**
     * WSITPVD0031: The specified CallbackHandler class : {0} is not a valid javax.security.auth.callback.CallbackHandler
     * 
     */
    public static String WSITPVD_0031_INVALID_CALLBACK_HANDLER_CLASS(Object arg0) {
        return localizer.localize(localizableWSITPVD_0031_INVALID_CALLBACK_HANDLER_CLASS(arg0));
    }

    public static Localizable localizableWSITPVD_0062_ERROR_LOAD_DEFAULT_PROVIDERS() {
        return messageFactory.getMessage("WSITPVD0062.error.load.default.providers");
    }

    /**
     * WSITPVD0062: exception during loading default providers
     * 
     */
    public static String WSITPVD_0062_ERROR_LOAD_DEFAULT_PROVIDERS() {
        return localizer.localize(localizableWSITPVD_0062_ERROR_LOAD_DEFAULT_PROVIDERS());
    }

    public static Localizable localizableWSITPVD_0061_JMAC_AUTHCONFIG_LOADER_FAILURE() {
        return messageFactory.getMessage("WSITPVD0061.jmac.authconfig.loader.failure");
    }

    /**
     * WSITPVD0061: jmac auth config loader failure
     * 
     */
    public static String WSITPVD_0061_JMAC_AUTHCONFIG_LOADER_FAILURE() {
        return localizer.localize(localizableWSITPVD_0061_JMAC_AUTHCONFIG_LOADER_FAILURE());
    }

    public static Localizable localizableWSITPVD_0052_ERROR_ISSUEDTOKEN_CREATION() {
        return messageFactory.getMessage("WSITPVD0052.error.issuedtoken.creation");
    }

    /**
     * WSITPVD0052: Received Exception during IssuedToken Creation.
     * 
     */
    public static String WSITPVD_0052_ERROR_ISSUEDTOKEN_CREATION() {
        return localizer.localize(localizableWSITPVD_0052_ERROR_ISSUEDTOKEN_CREATION());
    }

    public static Localizable localizableWSITPVD_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSITPVD0019.null.or.empty.username.handler.classname");
    }

    /**
     * WSITPVD0019: Null or Empty Value specified for usernameHandler classname.
     * 
     */
    public static String WSITPVD_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSITPVD_0019_NULL_OR_EMPTY_USERNAME_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSITPVD_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSITPVD0018.null.or.empty.xwss.callback.handler.classname");
    }

    /**
     * WSITPVD0018: Null or Empty Value specified for xwssCallbackHandler classname.
     * 
     */
    public static String WSITPVD_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSITPVD_0018_NULL_OR_EMPTY_XWSS_CALLBACK_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSITPVD_0036_ERROR_PROC_REQ_PACKET() {
        return messageFactory.getMessage("WSITPVD0036.error.proc.req.packet");
    }

    /**
     * WSITPVD0036: Error processing request packet on starting secure conversation.
     * 
     */
    public static String WSITPVD_0036_ERROR_PROC_REQ_PACKET() {
        return localizer.localize(localizableWSITPVD_0036_ERROR_PROC_REQ_PACKET());
    }

    public static Localizable localizableWSITPVD_0025_NULL_PACKET() {
        return messageFactory.getMessage("WSITPVD0025.null.packet");
    }

    /**
     * WSITPVD0025: Internal Error: A Packet required for starting a secure session was not supplied to getAuthContext().
     * 
     */
    public static String WSITPVD_0025_NULL_PACKET() {
        return localizer.localize(localizableWSITPVD_0025_NULL_PACKET());
    }

    public static Localizable localizableWSITPVD_0038_ERROR_CREATING_NEW_INSTANCE_WSIT_CLIENT_SEC_PIPE() {
        return messageFactory.getMessage("WSITPVD0038.error.creating.new.instance.wsit.client.sec.pipe");
    }

    /**
     * WSITPVD0038: Error in creating new instance of WSIT Client Security Provider.
     * 
     */
    public static String WSITPVD_0038_ERROR_CREATING_NEW_INSTANCE_WSIT_CLIENT_SEC_PIPE() {
        return localizer.localize(localizableWSITPVD_0038_ERROR_CREATING_NEW_INSTANCE_WSIT_CLIENT_SEC_PIPE());
    }

    public static Localizable localizableWSITPVD_0002_INTERNAL_SERVER_ERROR() {
        return messageFactory.getMessage("WSITPVD0002.internal.server.error");
    }

    /**
     * WSITPVD0002: Security Provider: Internal Error while trying to create a SOAPFault.
     * 
     */
    public static String WSITPVD_0002_INTERNAL_SERVER_ERROR() {
        return localizer.localize(localizableWSITPVD_0002_INTERNAL_SERVER_ERROR());
    }

    public static Localizable localizableWSITPVD_0001_PROBLEM_MAR_UNMAR() {
        return messageFactory.getMessage("WSITPVD0001.problem.mar.unmar");
    }

    /**
     * WSITPVD001: Problem creating JAXB Marshaller/Unmarshaller from JAXBContext. Check if the JAXBcontext has been initialized properly.
     * 
     */
    public static String WSITPVD_0001_PROBLEM_MAR_UNMAR() {
        return localizer.localize(localizableWSITPVD_0001_PROBLEM_MAR_UNMAR());
    }

    public static Localizable localizableWSITPVD_0035_ERROR_VERIFY_INBOUND_MSG() {
        return messageFactory.getMessage("WSITPVD0035.error.verify.inbound.msg");
    }

    /**
     * WSITPVD0035: Error in Verifying Security in Inbound Message.
     * 
     */
    public static String WSITPVD_0035_ERROR_VERIFY_INBOUND_MSG() {
        return localizer.localize(localizableWSITPVD_0035_ERROR_VERIFY_INBOUND_MSG());
    }

    public static Localizable localizableWSITPVD_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return messageFactory.getMessage("WSITPVD0006.problem.init.out.proc.context");
    }

    /**
     * WSITPVD0006: Security Provider: An Internal Error occurred while initializing Outgoing Security Processing Context.
     * 
     */
    public static String WSITPVD_0006_PROBLEM_INIT_OUT_PROC_CONTEXT() {
        return localizer.localize(localizableWSITPVD_0006_PROBLEM_INIT_OUT_PROC_CONTEXT());
    }

    public static Localizable localizableWSITPVD_0027_ERROR_POPULATING_CLIENT_CONFIG_PROP() {
        return messageFactory.getMessage("WSITPVD0027.error.populating.client.config.prop");
    }

    /**
     * WSITPVD0027: Error populating Security configuration properties for an ACC client or a WebClient.
     * 
     */
    public static String WSITPVD_0027_ERROR_POPULATING_CLIENT_CONFIG_PROP() {
        return localizer.localize(localizableWSITPVD_0027_ERROR_POPULATING_CLIENT_CONFIG_PROP());
    }

    public static Localizable localizableWSITPVD_0045_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSITPVD0045.unsupported.operation.exception", arg0);
    }

    /**
     * WSITPVD0045: RequestType : {0} not supported for creating a Secure Session.
     * 
     */
    public static String WSITPVD_0045_UNSUPPORTED_OPERATION_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWSITPVD_0045_UNSUPPORTED_OPERATION_EXCEPTION(arg0));
    }

    public static Localizable localizableWSITPVD_0011_COULD_NOT_FIND_USER_CLASS() {
        return messageFactory.getMessage("WSITPVD0011.could.not.find.user.class");
    }

    /**
     * WSITPVD0011: Couldn't find User Class: {0}.
     * 
     */
    public static String WSITPVD_0011_COULD_NOT_FIND_USER_CLASS() {
        return localizer.localize(localizableWSITPVD_0011_COULD_NOT_FIND_USER_CLASS());
    }

    public static Localizable localizableWSITPVD_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return messageFactory.getMessage("WSITPVD0010.unknown.validator.type.config", arg0);
    }

    /**
     * WSITPVD0010: Unknown Validator type {0} in config Assertion.
     * 
     */
    public static String WSITPVD_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(Object arg0) {
        return localizer.localize(localizableWSITPVD_0010_UNKNOWN_VALIDATOR_TYPE_CONFIG(arg0));
    }

    public static Localizable localizableWSITPVD_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSITPVD0016.truststore.url.null.config.assertion");
    }

    /**
     * WSITPVD0016: TrustStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSITPVD_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSITPVD_0016_TRUSTSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSITPVD_0048_ERROR_POPULATING_SERVER_CONFIG_PROP() {
        return messageFactory.getMessage("WSITPVD0048.error.populating.server.config.prop");
    }

    /**
     * WSITPVD0048: Security Provider : Error populating Security configuration properties for the Web Service.
     * 
     */
    public static String WSITPVD_0048_ERROR_POPULATING_SERVER_CONFIG_PROP() {
        return localizer.localize(localizableWSITPVD_0048_ERROR_POPULATING_SERVER_CONFIG_PROP());
    }

    public static Localizable localizableWSITPVD_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return messageFactory.getMessage("WSITPVD0007.problem.getting.eff.boot.policy");
    }

    /**
     * WSITPVD0007: Security Provider: An Error occurred while trying to get Effective SecureConversation Bootstrap policy.
     * 
     */
    public static String WSITPVD_0007_PROBLEM_GETTING_EFF_BOOT_POLICY() {
        return localizer.localize(localizableWSITPVD_0007_PROBLEM_GETTING_EFF_BOOT_POLICY());
    }

    public static Localizable localizableWSITPVD_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return messageFactory.getMessage("WSITPVD0005.problem.proc.soap.message");
    }

    /**
     * WSITPVD0005: Security Provider: Error occurred while converting JAXWS message to SAAJ SOAP Message.
     * 
     */
    public static String WSITPVD_0005_PROBLEM_PROC_SOAP_MESSAGE() {
        return localizer.localize(localizableWSITPVD_0005_PROBLEM_PROC_SOAP_MESSAGE());
    }

    public static Localizable localizableWSITPVD_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return messageFactory.getMessage("WSITPVD0014.keystore.url.null.config.assertion");
    }

    /**
     * WSITPVD0014: KeyStore URL was obtained as NULL from ConfigAssertion.
     * 
     */
    public static String WSITPVD_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION() {
        return localizer.localize(localizableWSITPVD_0014_KEYSTORE_URL_NULL_CONFIG_ASSERTION());
    }

    public static Localizable localizableWSITPVD_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return messageFactory.getMessage("WSITPVD0004.opt.path.not.yet.supported");
    }

    /**
     * WSITPVD0004: Optimized path not yet supported.
     * 
     */
    public static String WSITPVD_0004_OPT_PATH_NOT_YET_SUPPORTED() {
        return localizer.localize(localizableWSITPVD_0004_OPT_PATH_NOT_YET_SUPPORTED());
    }

    public static Localizable localizableWSITPVD_0023_COULD_NOT_LOAD_CALLBACK_HANDLER_CLASS(Object arg0) {
        return messageFactory.getMessage("WSITPVD0023.could.not.load.callback.handler.class", arg0);
    }

    /**
     * WSITPVD0023: Internal Error: Could Not Load CallbackHandler Class: {0}.
     * 
     */
    public static String WSITPVD_0023_COULD_NOT_LOAD_CALLBACK_HANDLER_CLASS(Object arg0) {
        return localizer.localize(localizableWSITPVD_0023_COULD_NOT_LOAD_CALLBACK_HANDLER_CLASS(arg0));
    }

    public static Localizable localizableWSITPVD_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSITPVD0021.null.or.empty.saml.handler.classname");
    }

    /**
     * WSITPVD0021: Null or Empty Value specified for samlHandler classname
     * 
     */
    public static String WSITPVD_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSITPVD_0021_NULL_OR_EMPTY_SAML_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSITPVD_0056_NULL_RESPONSE() {
        return messageFactory.getMessage("WSITPVD0056.null.response");
    }

    /**
     * WSITPVD0056: Invocation of Service returned null response packet
     * 
     */
    public static String WSITPVD_0056_NULL_RESPONSE() {
        return localizer.localize(localizableWSITPVD_0056_NULL_RESPONSE());
    }

    public static Localizable localizableWSITPVD_0058_ERROR_SECURE_REQUEST() {
        return messageFactory.getMessage("WSITPVD0058.error.secure.request");
    }

    /**
     * WSITPVD0058: error while securing the request
     * 
     */
    public static String WSITPVD_0058_ERROR_SECURE_REQUEST() {
        return localizer.localize(localizableWSITPVD_0058_ERROR_SECURE_REQUEST());
    }

    public static Localizable localizableWSITPVD_0030_NO_POLICY_FOUND_FOR_SC() {
        return messageFactory.getMessage("WSITPVD0030.no.policy.found.for.sc");
    }

    /**
     * WSITPVD0030: Cannot start SecureConversation, no SecureConversation Assertion(s) found in Policy.
     * 
     */
    public static String WSITPVD_0030_NO_POLICY_FOUND_FOR_SC() {
        return localizer.localize(localizableWSITPVD_0030_NO_POLICY_FOUND_FOR_SC());
    }

    public static Localizable localizableWSITPVD_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return messageFactory.getMessage("WSITPVD0034.faulty.response.msg", arg0);
    }

    /**
     * WSITPVD0034: Faulty response message while validating : {0}.
     * 
     */
    public static String WSITPVD_0034_FAULTY_RESPONSE_MSG(Object arg0) {
        return localizer.localize(localizableWSITPVD_0034_FAULTY_RESPONSE_MSG(arg0));
    }

    public static Localizable localizableWSITPVD_0065_ERROR_RESOLVING_ALTERNATIVES() {
        return messageFactory.getMessage("WSITPVD0065.error.resolving.alternatives");
    }

    /**
     * WSSPVD0065: error during resolving fault policy of the alternative
     * 
     */
    public static String WSITPVD_0065_ERROR_RESOLVING_ALTERNATIVES() {
        return localizer.localize(localizableWSITPVD_0065_ERROR_RESOLVING_ALTERNATIVES());
    }

    public static Localizable localizableWSITPVD_0026_ERROR_STARTING_SC() {
        return messageFactory.getMessage("WSITPVD0026.error.starting.sc");
    }

    /**
     * WSITPVD0026: Error in starting SecureConversation.
     * 
     */
    public static String WSITPVD_0026_ERROR_STARTING_SC() {
        return localizer.localize(localizableWSITPVD_0026_ERROR_STARTING_SC());
    }

    public static Localizable localizableWSITPVD_0047_ERROR_CREATING_NEW_INSTANCE_WSIT_SERVER_SEC_PIPE() {
        return messageFactory.getMessage("WSITPVD0047.error.creating.new.instance.wsit.server.sec.pipe");
    }

    /**
     * WSITPVD0038: Error in creating new instance of WSIT Server Security Provider.
     * 
     */
    public static String WSITPVD_0047_ERROR_CREATING_NEW_INSTANCE_WSIT_SERVER_SEC_PIPE() {
        return localizer.localize(localizableWSITPVD_0047_ERROR_CREATING_NEW_INSTANCE_WSIT_SERVER_SEC_PIPE());
    }

    public static Localizable localizableWSITPVD_0040_ERROR_CLEAN_SUBJECT() {
        return messageFactory.getMessage("WSITPVD0040.error.clean.subject");
    }

    /**
     * WSITPVD0040: Error while disposing subject from client authentication context. Disposing null value for Subject.
     * 
     */
    public static String WSITPVD_0040_ERROR_CLEAN_SUBJECT() {
        return localizer.localize(localizableWSITPVD_0040_ERROR_CLEAN_SUBJECT());
    }

    public static Localizable localizableWSITPVD_0039_ERROR_PROCESSING_INCOMING_PACKET() {
        return messageFactory.getMessage("WSITPVD0039.error.processing.incoming.packet");
    }

    /**
     * WSITPVD0039: Error in processing incoming Packet in WSIT Client.
     * 
     */
    public static String WSITPVD_0039_ERROR_PROCESSING_INCOMING_PACKET() {
        return localizer.localize(localizableWSITPVD_0039_ERROR_PROCESSING_INCOMING_PACKET());
    }

    public static Localizable localizableWSITPVD_0051_NULL_OR_EMPTY_JMAC_CALLBACK_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSITPVD0051.null.or.empty.jmac.callback.handler.classname");
    }

    /**
     * WSITPVD0051: Null or Empty Value specified for jmacCallbackHandler classname.
     * 
     */
    public static String WSITPVD_0051_NULL_OR_EMPTY_JMAC_CALLBACK_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSITPVD_0051_NULL_OR_EMPTY_JMAC_CALLBACK_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSITPVD_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return messageFactory.getMessage("WSITPVD0020.null.or.empty.password.handler.classname");
    }

    /**
     * WSITPVD0020: Null or Empty Value specified for passwordHandler classname.
     * 
     */
    public static String WSITPVD_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME() {
        return localizer.localize(localizableWSITPVD_0020_NULL_OR_EMPTY_PASSWORD_HANDLER_CLASSNAME());
    }

    public static Localizable localizableWSITPVD_0054_ERROR_SECURE_RESPONSE() {
        return messageFactory.getMessage("WSITPVD0054.error.secure.response");
    }

    /**
     * WSITPVD0054: error while securing response
     * 
     */
    public static String WSITPVD_0054_ERROR_SECURE_RESPONSE() {
        return localizer.localize(localizableWSITPVD_0054_ERROR_SECURE_RESPONSE());
    }

    public static Localizable localizableWSITPVD_0044_ERROR_SESSION_CREATION() {
        return messageFactory.getMessage("WSITPVD0044.error.session.creation");
    }

    /**
     * WSITPVD0044: Fail to create a Secure Session with RST-SCT Issue Request.
     * 
     */
    public static String WSITPVD_0044_ERROR_SESSION_CREATION() {
        return localizer.localize(localizableWSITPVD_0044_ERROR_SESSION_CREATION());
    }

    public static Localizable localizableWSITPVD_0029_ERROR_SECURING_OUTBOUND_MSG() {
        return messageFactory.getMessage("WSITPVD0029.error.securing.outbound.msg");
    }

    /**
     * WSITPVD0029: Error in Securing Outbound Message.
     * 
     */
    public static String WSITPVD_0029_ERROR_SECURING_OUTBOUND_MSG() {
        return localizer.localize(localizableWSITPVD_0029_ERROR_SECURING_OUTBOUND_MSG());
    }

    public static Localizable localizableWSITPVD_0066_SERVLET_CONTEXT_NOTFOUND() {
        return messageFactory.getMessage("WSITPVD0066.servlet.context.notfound");
    }

    /**
     * WSSPVD0066: ServletContext was not found
     * 
     */
    public static String WSITPVD_0066_SERVLET_CONTEXT_NOTFOUND() {
        return localizer.localize(localizableWSITPVD_0066_SERVLET_CONTEXT_NOTFOUND());
    }

    public static Localizable localizableWSITPVD_0060_JMAC_JMAC_FACTORY_UNABLETO_LOAD_PROVIDER(Object arg0) {
        return messageFactory.getMessage("WSITPVD0060.jmac.jmac.factory.unableto.load.provider", arg0);
    }

    /**
     * WSITPVD0060: jmac factory unable to load provider {0}
     * 
     */
    public static String WSITPVD_0060_JMAC_JMAC_FACTORY_UNABLETO_LOAD_PROVIDER(Object arg0) {
        return localizer.localize(localizableWSITPVD_0060_JMAC_JMAC_FACTORY_UNABLETO_LOAD_PROVIDER(arg0));
    }

    public static Localizable localizableWSITPVD_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return messageFactory.getMessage("WSITPVD0012.problem.checking.reliable.message.enable");
    }

    /**
     * WSITPVD0012: Internal Error: Could not detect whether Reliable Messaging is enabled or not.
     * 
     */
    public static String WSITPVD_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE() {
        return localizer.localize(localizableWSITPVD_0012_PROBLEM_CHECKING_RELIABLE_MESSAGE_ENABLE());
    }

    public static Localizable localizableWSITPVD_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return messageFactory.getMessage("WSITPVD0009.unsupported.callback.type.encountered", arg0);
    }

    /**
     * WSITPVD0009: Unsupported callback type {0} encountered.
     * 
     */
    public static String WSITPVD_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(Object arg0) {
        return localizer.localize(localizableWSITPVD_0009_UNSUPPORTED_CALLBACK_TYPE_ENCOUNTERED(arg0));
    }

}
