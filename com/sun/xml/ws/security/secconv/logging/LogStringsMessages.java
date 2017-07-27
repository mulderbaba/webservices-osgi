
package com.sun.xml.ws.security.secconv.logging;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.security.secconv.logging.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSSC_1005_SECCTX_TOKEN_WSUID_VALUE(Object arg0) {
        return messageFactory.getMessage("WSSC1005.secctx.token.wsuid.value", arg0);
    }

    /**
     * WSSC1005:Setting Security Context token wsuId to {0}.
     * 
     */
    public static String WSSC_1005_SECCTX_TOKEN_WSUID_VALUE(Object arg0) {
        return localizer.localize(localizableWSSC_1005_SECCTX_TOKEN_WSUID_VALUE(arg0));
    }

    public static Localizable localizableWSSC_1016_RECEIVED_SCT_RSTR_CANCEL(Object arg0) {
        return messageFactory.getMessage("WSSC1016.received.sct.rstr.cancel", arg0);
    }

    /**
     * WSSC1016:Received RSTR for Cancel:
     *  {0}.
     * 
     */
    public static String WSSC_1016_RECEIVED_SCT_RSTR_CANCEL(Object arg0) {
        return localizer.localize(localizableWSSC_1016_RECEIVED_SCT_RSTR_CANCEL(arg0));
    }

    public static Localizable localizableWSSC_1006_SYM_BIN_KEYSIZE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSSC1006.sym.bin.keysize", arg0, arg1);
    }

    /**
     * WSSC1006:Symmetric Binding KeySize: {0}. Default {1}.
     * 
     */
    public static String WSSC_1006_SYM_BIN_KEYSIZE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSSC_1006_SYM_BIN_KEYSIZE(arg0, arg1));
    }

    public static Localizable localizableWSSC_0013_CANNOT_CREATE_RSTR_RESPONSE() {
        return messageFactory.getMessage("WSSC0013.cannot.create.rstr.response");
    }

    /**
     * WSSC0013:Cannot create RSTR Response.
     * 
     */
    public static String WSSC_0013_CANNOT_CREATE_RSTR_RESPONSE() {
        return localizer.localize(localizableWSSC_0013_CANNOT_CREATE_RSTR_RESPONSE());
    }

    public static Localizable localizableWSSC_1015_CREATED_SCT_RST_CANCEL(Object arg0) {
        return messageFactory.getMessage("WSSC1015.created.sct.rst.cancel", arg0);
    }

    /**
     * WSSC1015:Created RST for Cancel:
     *  {0}.
     * 
     */
    public static String WSSC_1015_CREATED_SCT_RST_CANCEL(Object arg0) {
        return localizer.localize(localizableWSSC_1015_CREATED_SCT_RST_CANCEL(arg0));
    }

    public static Localizable localizableWSSC_1010_CREATING_SESSION(Object arg0) {
        return messageFactory.getMessage("WSSC1010.creating.session", arg0);
    }

    /**
     * WSSC1010:Creating session for : {0}.
     * 
     */
    public static String WSSC_1010_CREATING_SESSION(Object arg0) {
        return localizer.localize(localizableWSSC_1010_CREATING_SESSION(arg0));
    }

    public static Localizable localizableWSSC_1004_SECCTX_TOKEN_ID_VALUE(Object arg0) {
        return messageFactory.getMessage("WSSC1004.secctx.token.id.value", arg0);
    }

    /**
     * WSSC1004:Setting Security Context token id value to {0}.
     * 
     */
    public static String WSSC_1004_SECCTX_TOKEN_ID_VALUE(Object arg0) {
        return localizer.localize(localizableWSSC_1004_SECCTX_TOKEN_ID_VALUE(arg0));
    }

    public static Localizable localizableWSSC_0020_PROBLEM_CREATING_RSTR() {
        return messageFactory.getMessage("WSSC0020.problem.creating.rstr");
    }

    /**
     * WSSC0020:There was a problem creating RSTR. Could be while handling an RSTR returned by the Issuer and extracting Token information to set into the IssuedTokenContext.
     * 
     */
    public static String WSSC_0020_PROBLEM_CREATING_RSTR() {
        return localizer.localize(localizableWSSC_0020_PROBLEM_CREATING_RSTR());
    }

    public static Localizable localizableWSSC_0006_UNABLETOEXTRACT_KEY() {
        return messageFactory.getMessage("WSSC0006.unabletoextract.key");
    }

    /**
     * WSSC0006:Unable to extract P-SHA1 key.
     * 
     */
    public static String WSSC_0006_UNABLETOEXTRACT_KEY() {
        return localizer.localize(localizableWSSC_0006_UNABLETOEXTRACT_KEY());
    }

    public static Localizable localizableWSSC_0015_UNKNOWN_CONTEXT(Object arg0) {
        return messageFactory.getMessage("WSSC0015.unknown.context", arg0);
    }

    /**
     * WSSC0015:Unknown security context token to cancel: {0}.  Either the context is not found or it does not contain a valid token.
     * 
     */
    public static String WSSC_0015_UNKNOWN_CONTEXT(Object arg0) {
        return localizer.localize(localizableWSSC_0015_UNKNOWN_CONTEXT(arg0));
    }

    public static Localizable localizableWSSC_1013_CREATED_SCT_RST_RENEW(Object arg0) {
        return messageFactory.getMessage("WSSC1013.created.sct.rst.renew", arg0);
    }

    /**
     * WSSC1013:Created RST for Renew:
     *  {0}.
     * 
     */
    public static String WSSC_1013_CREATED_SCT_RST_RENEW(Object arg0) {
        return localizer.localize(localizableWSSC_1013_CREATED_SCT_RST_RENEW(arg0));
    }

    public static Localizable localizableWSSC_0026_UNSUPPORTED_COMPUTED_KEY(Object arg0) {
        return messageFactory.getMessage("WSSC0026.unsupported.computed.key", arg0);
    }

    /**
     * WSSC0026:Unsupported computed Key algorithm {0}. Should be P-SHA1.
     * 
     */
    public static String WSSC_0026_UNSUPPORTED_COMPUTED_KEY(Object arg0) {
        return localizer.localize(localizableWSSC_0026_UNSUPPORTED_COMPUTED_KEY(arg0));
    }

    public static Localizable localizableWSSC_1012_RECEIVED_SCT_RSTR_ISSUE(Object arg0) {
        return messageFactory.getMessage("WSSC1012.received.sct.rstr.issue", arg0);
    }

    /**
     * WSSC1012:Received RSTR for Issue:
     *  {0}.
     * 
     */
    public static String WSSC_1012_RECEIVED_SCT_RSTR_ISSUE(Object arg0) {
        return localizer.localize(localizableWSSC_1012_RECEIVED_SCT_RSTR_ISSUE(arg0));
    }

    public static Localizable localizableWSSC_0019_ERR_TOKEN_VALUE() {
        return messageFactory.getMessage("WSSC0019.err.token.value");
    }

    /**
     * WSSC0019:There was an error extracting TokenValue.
     * 
     */
    public static String WSSC_0019_ERR_TOKEN_VALUE() {
        return localizer.localize(localizableWSSC_0019_ERR_TOKEN_VALUE());
    }

    public static Localizable localizableWSSC_0004_PARSE_EXCEPTION() {
        return messageFactory.getMessage("WSSC0004.parse.exception");
    }

    /**
     * WSSC0004:Invalid created or expires dates encountered. Accepted date format is yyyy-MM-dd'T'HH:mm:ss'.'SSS'Z'
     * 
     */
    public static String WSSC_0004_PARSE_EXCEPTION() {
        return localizer.localize(localizableWSSC_0004_PARSE_EXCEPTION());
    }

    public static Localizable localizableWSSC_1002_NULL_SESSION_CTX_ID_ASKEY() {
        return messageFactory.getMessage("WSSC1002.null.sessionCtxId.askey");
    }

    /**
     * WSSC1002: Attempt to use null security context id as Map key.
     * 
     */
    public static String WSSC_1002_NULL_SESSION_CTX_ID_ASKEY() {
        return localizer.localize(localizableWSSC_1002_NULL_SESSION_CTX_ID_ASKEY());
    }

    public static Localizable localizableWSSC_1001_NULL_IT_CTX_FOR_SESSION(Object arg0) {
        return messageFactory.getMessage("WSSC1001.null.itCtx.for.session", arg0);
    }

    /**
     * WSSC1001: Null security context for session context id {0}.
     * 
     */
    public static String WSSC_1001_NULL_IT_CTX_FOR_SESSION(Object arg0) {
        return localizer.localize(localizableWSSC_1001_NULL_IT_CTX_FOR_SESSION(arg0));
    }

    public static Localizable localizableWSSC_0021_PROBLEM_CREATING_RST_TRUST() {
        return messageFactory.getMessage("WSSC0021.problem.creating.rst.Trust");
    }

    /**
     * WSSC0021:There was a problem in the trust layer creating RST. Could not create RST from JAXBElement with the given request type, token type and client entropy.
     * 
     */
    public static String WSSC_0021_PROBLEM_CREATING_RST_TRUST() {
        return localizer.localize(localizableWSSC_0021_PROBLEM_CREATING_RST_TRUST());
    }

    public static Localizable localizableWSSC_0018_ERR_JAXB_RSTR() {
        return messageFactory.getMessage("WSSC0018.err.jaxb.rstr");
    }

    /**
     * WSSC0018:Error reading RSTR Payload as JAXB element. Perhaps the RSTR element does not conform to RSTR schema as expected by JAXB.
     * 
     */
    public static String WSSC_0018_ERR_JAXB_RSTR() {
        return localizer.localize(localizableWSSC_0018_ERR_JAXB_RSTR());
    }

    public static Localizable localizableWSSC_0001_ERROR_MARSHAL_LOG() {
        return messageFactory.getMessage("WSSC0001.error.marshal.log");
    }

    /**
     * WSSC0001:Error in Marshalling RSTR to string for logging.  Could be a problem in the well formedness of XML in the message.
     * 
     */
    public static String WSSC_0001_ERROR_MARSHAL_LOG() {
        return localizer.localize(localizableWSSC_0001_ERROR_MARSHAL_LOG());
    }

    public static Localizable localizableWSSC_0009_CLIENT_ENTROPY_VALUE(Object arg0) {
        return messageFactory.getMessage("WSSC0009.clientEntropy.value", arg0);
    }

    /**
     * WSSC0009:Client entropy value is {0}.
     * 
     */
    public static String WSSC_0009_CLIENT_ENTROPY_VALUE(Object arg0) {
        return localizer.localize(localizableWSSC_0009_CLIENT_ENTROPY_VALUE(arg0));
    }

    public static Localizable localizableWSSC_1003_SETTING_TIMES(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSSC1003.setting.times", arg0, arg1);
    }

    /**
     * WSSC1003:Setting creation time : {0} and expiration time: {1}
     * 
     */
    public static String WSSC_1003_SETTING_TIMES(Object arg0, Object arg1) {
        return localizer.localize(localizableWSSC_1003_SETTING_TIMES(arg0, arg1));
    }

    public static Localizable localizableWSSC_0022_PROBLEM_CREATING_FAULT() {
        return messageFactory.getMessage("WSSC0022.problem.creating.fault");
    }

    /**
     * WSSC0022:There was a problem creating SOAP Fault. Check if SOAPBody contains a fault string.
     * 
     */
    public static String WSSC_0022_PROBLEM_CREATING_FAULT() {
        return localizer.localize(localizableWSSC_0022_PROBLEM_CREATING_FAULT());
    }

    public static Localizable localizableWSSC_0017_PROBLEM_ADD_ADDRESS_HEADERS() {
        return messageFactory.getMessage("WSSC0017.problem.add.address.headers");
    }

    /**
     * WSSC0017:Problem adding Addressing Headers.
     * 
     */
    public static String WSSC_0017_PROBLEM_ADD_ADDRESS_HEADERS() {
        return localizer.localize(localizableWSSC_0017_PROBLEM_ADD_ADDRESS_HEADERS());
    }

    public static Localizable localizableWSSC_0010_CLIENT_ENTROPY_CANNOT_NULL() {
        return messageFactory.getMessage("WSSC0010.clientEntropy.cannot.null");
    }

    /**
     * WSSC0010:Client entropy cannot be null when RequireClientEntropy is not enabled.
     * 
     */
    public static String WSSC_0010_CLIENT_ENTROPY_CANNOT_NULL() {
        return localizer.localize(localizableWSSC_0010_CLIENT_ENTROPY_CANNOT_NULL());
    }

    public static Localizable localizableWSSC_0024_ERROR_CREATING_RST(Object arg0) {
        return messageFactory.getMessage("WSSC0024.error.creating.rst", arg0);
    }

    /**
     * WSSC0024:There was a problem creating RST {0}. There could be a problem with creating the binary secret, or client entropy.
     * 
     */
    public static String WSSC_0024_ERROR_CREATING_RST(Object arg0) {
        return localizer.localize(localizableWSSC_0024_ERROR_CREATING_RST(arg0));
    }

    public static Localizable localizableWSSC_0011_KEY_SIZE_VALUE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSSC0011.keySize.value", arg0, arg1);
    }

    /**
     * WSSC0011:KeySize value is {0}. Default is {1}.
     * 
     */
    public static String WSSC_0011_KEY_SIZE_VALUE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSSC_0011_KEY_SIZE_VALUE(arg0, arg1));
    }

    public static Localizable localizableWSSC_0025_PROBLEM_PRINTING_MSG() {
        return messageFactory.getMessage("WSSC0025.problem.printing.msg");
    }

    /**
     * WSSC0025:Problem printing message. Could be a problem in the well formedness of XML in the message.
     * 
     */
    public static String WSSC_0025_PROBLEM_PRINTING_MSG() {
        return localizer.localize(localizableWSSC_0025_PROBLEM_PRINTING_MSG());
    }

    public static Localizable localizableWSSC_1008_SET_EP_ADDRESS(Object arg0) {
        return messageFactory.getMessage("WSSC1008.set.ep.address", arg0);
    }

    /**
     * WSSC1008:Setting endpoint address: {0}.
     * 
     */
    public static String WSSC_1008_SET_EP_ADDRESS(Object arg0) {
        return localizer.localize(localizableWSSC_1008_SET_EP_ADDRESS(arg0));
    }

    public static Localizable localizableWSSC_1014_RECEIVED_SCT_RSTR_RENEW(Object arg0) {
        return messageFactory.getMessage("WSSC1014.received.sct.rstr.renew", arg0);
    }

    /**
     * WSSC1014:Received RSTR for Renew:
     *  {0}.
     * 
     */
    public static String WSSC_1014_RECEIVED_SCT_RSTR_RENEW(Object arg0) {
        return localizer.localize(localizableWSSC_1014_RECEIVED_SCT_RSTR_RENEW(arg0));
    }

    public static Localizable localizableWSSC_0008_URISYNTAX_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSSC0008.urisyntax.exception", arg0);
    }

    /**
     * WSSC0008:Could not create URI for {0}.
     * 
     */
    public static String WSSC_0008_URISYNTAX_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWSSC_0008_URISYNTAX_EXCEPTION(arg0));
    }

    public static Localizable localizableWSSC_0007_CREATED_RSTR(Object arg0) {
        return messageFactory.getMessage("WSSC0007.created.rstr", arg0);
    }

    /**
     * WSSC0007:Created RSTR for client initiated issued token context: {0}.
     * 
     */
    public static String WSSC_0007_CREATED_RSTR(Object arg0) {
        return localizer.localize(localizableWSSC_0007_CREATED_RSTR(arg0));
    }

    public static Localizable localizableWSSC_0026_UNSUPPORTED_COMPUTED_KEY_E(Object arg0) {
        return messageFactory.getMessage("WSSC0026.unsupported.computed.key.E", arg0);
    }

    /**
     * WSSC0026:Unsupported computed Key algorithm {0}.
     * 
     */
    public static String WSSC_0026_UNSUPPORTED_COMPUTED_KEY_E(Object arg0) {
        return localizer.localize(localizableWSSC_0026_UNSUPPORTED_COMPUTED_KEY_E(arg0));
    }

    public static Localizable localizableWSSC_0016_PROBLEM_MAR_UNMAR() {
        return messageFactory.getMessage("WSSC0016.problem.mar.unmar");
    }

    /**
     * WSSC0016:Problem creating JAXB Marshaller/Unmarshaller from JAXBContext. Check if the JAXBcontext has been initialized properly.
     * 
     */
    public static String WSSC_0016_PROBLEM_MAR_UNMAR() {
        return localizer.localize(localizableWSSC_0016_PROBLEM_MAR_UNMAR());
    }

    public static Localizable localizableWSSC_0002_NULL_TOKEN() {
        return messageFactory.getMessage("WSSC0002.null.token");
    }

    /**
     * WSSC0002: Invalid (null) security token and proof token. RST does not contain a valid token.
     * 
     */
    public static String WSSC_0002_NULL_TOKEN() {
        return localizer.localize(localizableWSSC_0002_NULL_TOKEN());
    }

    public static Localizable localizableWSSC_0005_COMPUTED_KEYSIZE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSSC0005.computed.keysize", arg0, arg1);
    }

    /**
     * WSSC0005:Computed keySize: {0}. Default keySize value {1}.
     * 
     */
    public static String WSSC_0005_COMPUTED_KEYSIZE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSSC_0005_COMPUTED_KEYSIZE(arg0, arg1));
    }

    public static Localizable localizableWSSC_0012_COMPUTE_SECKEY() {
        return messageFactory.getMessage("WSSC0012.compute.seckey");
    }

    /**
     * WSSC0012:There was a problem in computing secret key.
     * 
     */
    public static String WSSC_0012_COMPUTE_SECKEY() {
        return localizer.localize(localizableWSSC_0012_COMPUTE_SECKEY());
    }

    public static Localizable localizableWSSC_1011_CREATED_SCT_RST_ISSUE(Object arg0) {
        return messageFactory.getMessage("WSSC1011.created.sct.rst.issue", arg0);
    }

    /**
     * WSSC1011:Created RST for Issue:
     *  {0}.
     * 
     */
    public static String WSSC_1011_CREATED_SCT_RST_ISSUE(Object arg0) {
        return localizer.localize(localizableWSSC_1011_CREATED_SCT_RST_ISSUE(arg0));
    }

    public static Localizable localizableWSSC_0014_RSTR_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSSC0014.rstr.response", arg0);
    }

    /**
     * WSSC0014:Generated RSTR Response: {0}.
     * 
     */
    public static String WSSC_0014_RSTR_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSSC_0014_RSTR_RESPONSE(arg0));
    }

    public static Localizable localizableWSSC_1009_SEND_REQ_MESSAGE(Object arg0) {
        return messageFactory.getMessage("WSSC1009.send.req.message", arg0);
    }

    /**
     * WSSC1009:Generating send request message: {0}.
     * 
     */
    public static String WSSC_1009_SEND_REQ_MESSAGE(Object arg0) {
        return localizer.localize(localizableWSSC_1009_SEND_REQ_MESSAGE(arg0));
    }

    public static Localizable localizableWSSC_0003_INVALID_PROOFTOKEN(Object arg0) {
        return messageFactory.getMessage("WSSC0003.invalid.prooftoken", arg0);
    }

    /**
     * WSSC0003:Invalid Proof Token Type: {0}. Accepted types are computed key type and Binary Secret type.
     * 
     */
    public static String WSSC_0003_INVALID_PROOFTOKEN(Object arg0) {
        return localizer.localize(localizableWSSC_0003_INVALID_PROOFTOKEN(arg0));
    }

}
