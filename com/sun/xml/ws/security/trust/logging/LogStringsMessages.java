
package com.sun.xml.ws.security.trust.logging;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LogStringsMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.security.trust.logging.LogStrings");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWST_0032_ERROR_CREATING_SAML_ASSERTION() {
        return messageFactory.getMessage("WST0032.error.creating.SAML.assertion");
    }

    /**
     * WST0032:Error in creating SAML Assertion.
     * 
     */
    public static String WST_0032_ERROR_CREATING_SAML_ASSERTION() {
        return localizer.localize(localizableWST_0032_ERROR_CREATING_SAML_ASSERTION());
    }

    public static Localizable localizableWST_0010_FAILED_CREATION_FROM_JAXBELE(Object arg0) {
        return messageFactory.getMessage("WST0010.failed.creation.from.jaxbele", arg0);
    }

    /**
     * WST0010:There was a problem while creating {0} from JAXBElement.
     * 
     */
    public static String WST_0010_FAILED_CREATION_FROM_JAXBELE(Object arg0) {
        return localizer.localize(localizableWST_0010_FAILED_CREATION_FROM_JAXBELE(arg0));
    }

    public static Localizable localizableWST_0009_FAIL_RSTR_ELEM(Object arg0) {
        return messageFactory.getMessage("WST0009.fail.rstr.elem", arg0);
    }

    /**
     * WST0009:Failed to create RSTR from Element {0}.
     * 
     */
    public static String WST_0009_FAIL_RSTR_ELEM(Object arg0) {
        return localizer.localize(localizableWST_0009_FAIL_RSTR_ELEM(arg0));
    }

    public static Localizable localizableWST_0024_INVALID_REQUEST_TYPE(Object arg0) {
        return messageFactory.getMessage("WST0024.invalid.request.type", arg0);
    }

    /**
     * WST0024:Invalid Request Type: {0}. Must be one of Issue, Cancel, KeyExchange, Renew, or Validate.
     * 
     */
    public static String WST_0024_INVALID_REQUEST_TYPE(Object arg0) {
        return localizer.localize(localizableWST_0024_INVALID_REQUEST_TYPE(arg0));
    }

    public static Localizable localizableWST_1006_CREATED_RST_ISSUE(Object arg0) {
        return messageFactory.getMessage("WST1006.created.rst.issue", arg0);
    }

    /**
     * WST1006:Created RST for Issue:
     *  {0}.
     * 
     */
    public static String WST_1006_CREATED_RST_ISSUE(Object arg0) {
        return localizer.localize(localizableWST_1006_CREATED_RST_ISSUE(arg0));
    }

    public static Localizable localizableWST_0038_INIT_CONTRACT_FAIL() {
        return messageFactory.getMessage("WST0038.init.contract.fail");
    }

    /**
     * WST0038:Trust contract could not be established.
     * 
     */
    public static String WST_0038_INIT_CONTRACT_FAIL() {
        return localizer.localize(localizableWST_0038_INIT_CONTRACT_FAIL());
    }

    public static Localizable localizableWST_0022_INVALID_ENTROPY(Object arg0) {
        return messageFactory.getMessage("WST0022.invalid.entropy", arg0);
    }

    /**
     * WST0022:Invalid entropy type: {0}. Allowed types are - Binary, EncryptedType and Custom.
     * 
     */
    public static String WST_0022_INVALID_ENTROPY(Object arg0) {
        return localizer.localize(localizableWST_0022_INVALID_ENTROPY(arg0));
    }

    public static Localizable localizableWST_0035_UNABLE_CREATE_SIGN_SAML_ASSERTION() {
        return messageFactory.getMessage("WST0035.unable.create.sign.saml.assertion");
    }

    /**
     * WST0035:Unable to create sign SAML Assertion.
     * 
     */
    public static String WST_0035_UNABLE_CREATE_SIGN_SAML_ASSERTION() {
        return localizer.localize(localizableWST_0035_UNABLE_CREATE_SIGN_SAML_ASSERTION());
    }

    public static Localizable localizableWST_1012_SERVICE_PORTNAME_MEX(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST1012.service.portname.mex", arg0, arg1);
    }

    /**
     * WST1012:Getting STS service and port names through MEX. ServiceName: {0} and PortName: {1}. 
     * 
     */
    public static String WST_1012_SERVICE_PORTNAME_MEX(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_1012_SERVICE_PORTNAME_MEX(arg0, arg1));
    }

    public static Localizable localizableWST_0040_ERROR_ENCRYPT_PROOFKEY(Object arg0) {
        return messageFactory.getMessage("WST0040.error.encrypt.proofkey", arg0);
    }

    /**
     * WST0040:Error encrypting proof key for the service {0}.
     * 
     */
    public static String WST_0040_ERROR_ENCRYPT_PROOFKEY(Object arg0) {
        return localizer.localize(localizableWST_0040_ERROR_ENCRYPT_PROOFKEY(arg0));
    }

    public static Localizable localizableWST_0002_FAIL_MARSHAL_TOSOURCE(Object arg0) {
        return messageFactory.getMessage("WST0002.fail.marshal.tosource", arg0);
    }

    /**
     * WST0002: There was an error marshalling {0} to Source.
     * 
     */
    public static String WST_0002_FAIL_MARSHAL_TOSOURCE(Object arg0) {
        return localizer.localize(localizableWST_0002_FAIL_MARSHAL_TOSOURCE(arg0));
    }

    public static Localizable localizableWST_0046_TOKEN_EXPIRED(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WST0046.token.expired", arg0, arg1, arg2);
    }

    /**
     * WST0046: Token expired: created {0}, expires{1}; current {2}
     * 
     */
    public static String WST_0046_TOKEN_EXPIRED(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWST_0046_TOKEN_EXPIRED(arg0, arg1, arg2));
    }

    public static Localizable localizableWST_0026_INVALID_CK_ALGORITHM(Object arg0) {
        return messageFactory.getMessage("WST0026.invalid.ck.algorithm", arg0);
    }

    /**
     * WST0026:Invalid Computed Key Algorithm {0}. Must be one of HASH or PSHA1.
     * 
     */
    public static String WST_0026_INVALID_CK_ALGORITHM(Object arg0) {
        return localizer.localize(localizableWST_0026_INVALID_CK_ALGORITHM(arg0));
    }

    public static Localizable localizableWST_1011_PROBLEM_METADATA(Object arg0) {
        return messageFactory.getMessage("WST1011.problem.metadata", arg0);
    }

    /**
     * WST1011:Problem in extracting MetaData from Issued Token.STS URI is {0}.
     * 
     */
    public static String WST_1011_PROBLEM_METADATA(Object arg0) {
        return localizer.localize(localizableWST_1011_PROBLEM_METADATA(arg0));
    }

    public static Localizable localizableWST_0003_ERROR_CREATING_WSTRUSTFACT() {
        return messageFactory.getMessage("WST0003.error.creating.wstrustfact");
    }

    /**
     * WST0003: There was an error creating WSTrustElementFactory.
     * 
     */
    public static String WST_0003_ERROR_CREATING_WSTRUSTFACT() {
        return localizer.localize(localizableWST_0003_ERROR_CREATING_WSTRUSTFACT());
    }

    public static Localizable localizableWST_0026_INVALID_CK_ALGORITHM_E(Object arg0) {
        return messageFactory.getMessage("WST0026.invalid.ck.algorithm.E", arg0);
    }

    /**
     * WST0026:Invalid Computed Key Algorithm {0}.
     * 
     */
    public static String WST_0026_INVALID_CK_ALGORITHM_E(Object arg0) {
        return localizer.localize(localizableWST_0026_INVALID_CK_ALGORITHM_E(arg0));
    }

    public static Localizable localizableWST_0007_FAIL_RST_ELEM(Object arg0) {
        return messageFactory.getMessage("WST0007.fail.rst.elem", arg0);
    }

    /**
     * WST0007:Failed to create RST from Element {0}.
     * 
     */
    public static String WST_0007_FAIL_RST_ELEM(Object arg0) {
        return localizer.localize(localizableWST_0007_FAIL_RST_ELEM(arg0));
    }

    public static Localizable localizableWST_1013_STS_URI_CLIENT(Object arg0) {
        return messageFactory.getMessage("WST1013.sts.uri.client", arg0);
    }

    /**
     * WST1013:Getting STS location from client configuration. STS URI: {0}.
     * 
     */
    public static String WST_1013_STS_URI_CLIENT(Object arg0) {
        return localizer.localize(localizableWST_1013_STS_URI_CLIENT(arg0));
    }

    public static Localizable localizableWST_0014_URI_SYNTAX() {
        return messageFactory.getMessage("WST0014.uri.syntax");
    }

    /**
     * WST0014:Invalid URI obtained from RST's context.
     * 
     */
    public static String WST_0014_URI_SYNTAX() {
        return localizer.localize(localizableWST_0014_URI_SYNTAX());
    }

    public static Localizable localizableWST_1003_TOKENTYPE_APPLIESTO_NULL() {
        return messageFactory.getMessage("WST1003.tokentype.appliesto.null");
    }

    /**
     * WST1003:TokenType and AppliesTo cannot be both null.
     * 
     */
    public static String WST_1003_TOKENTYPE_APPLIESTO_NULL() {
        return localizer.localize(localizableWST_1003_TOKENTYPE_APPLIESTO_NULL());
    }

    public static Localizable localizableWST_0043_UNABLE_GET_STS_KEY() {
        return messageFactory.getMessage("WST0043.unable.get.sts.key");
    }

    /**
     * WST0043:Unable to get the key for the STS.
     * 
     */
    public static String WST_0043_UNABLE_GET_STS_KEY() {
        return localizer.localize(localizableWST_0043_UNABLE_GET_STS_KEY());
    }

    public static Localizable localizableWST_0016_PROBLEM_IT_CTX(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST0016.problem.itCtx", arg0, arg1);
    }

    /**
     * WST0016:There was a problem in invoking STS {0} or handling response from it when requesting token for the service {1}.
     * 
     */
    public static String WST_0016_PROBLEM_IT_CTX(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_0016_PROBLEM_IT_CTX(arg0, arg1));
    }

    public static Localizable localizableWST_1004_ERROR_MARSHAL_TO_STRING(Object arg0) {
        return messageFactory.getMessage("WST1004.error.marshal.toString", arg0);
    }

    /**
     * WST1004:Error in Marshalling {0} Element to string for logging.
     * 
     */
    public static String WST_1004_ERROR_MARSHAL_TO_STRING(Object arg0) {
        return localizer.localize(localizableWST_1004_ERROR_MARSHAL_TO_STRING(arg0));
    }

    public static Localizable localizableWST_0028_INVALID_CK(Object arg0) {
        return messageFactory.getMessage("WST0028.invalid.ck", arg0);
    }

    /**
     * WST0028:Invalid Computed Key URI {0}.
     * 
     */
    public static String WST_0028_INVALID_CK(Object arg0) {
        return localizer.localize(localizableWST_0028_INVALID_CK(arg0));
    }

    public static Localizable localizableWST_0011_PARSERCONFIG_EX_TO_ELEMENT() {
        return messageFactory.getMessage("WST0011.parserconfig.ex.toElement");
    }

    /**
     * WST0011:Parser configuration exception while creating element.
     * 
     */
    public static String WST_0011_PARSERCONFIG_EX_TO_ELEMENT() {
        return localizer.localize(localizableWST_0011_PARSERCONFIG_EX_TO_ELEMENT());
    }

    public static Localizable localizableWST_0045_ERROR_UNMARSHALL_CLAIMS(Object arg0) {
        return messageFactory.getMessage("WST0045.error.unmarshall.claims", arg0);
    }

    /**
     * WST0045: Error unmarshalling Claims for the service {0}.
     * 
     */
    public static String WST_0045_ERROR_UNMARSHALL_CLAIMS(Object arg0) {
        return localizer.localize(localizableWST_0045_ERROR_UNMARSHALL_CLAIMS(arg0));
    }

    public static Localizable localizableWST_1009_NULL_BINARY_SECRET() {
        return messageFactory.getMessage("WST1009.null.binary.secret");
    }

    /**
     * WST1009:Binary Secret is null. ClientEntropy in the RST does not contain a Binary Secret.
     * 
     */
    public static String WST_1009_NULL_BINARY_SECRET() {
        return localizer.localize(localizableWST_1009_NULL_BINARY_SECRET());
    }

    public static Localizable localizableWST_1010_KEY_SIZE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST1010.key.size", arg0, arg1);
    }

    /**
     * WST1010:Keysize value: {0}. Default is {1}.
     * 
     */
    public static String WST_1010_KEY_SIZE(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_1010_KEY_SIZE(arg0, arg1));
    }

    public static Localizable localizableWST_0036_UNABLE_CREATE_KEY_INFO() {
        return messageFactory.getMessage("WST0036.unable.create.keyInfo");
    }

    /**
     * WST0036:Unable to create Key Info.
     * 
     */
    public static String WST_0036_UNABLE_CREATE_KEY_INFO() {
        return localizer.localize(localizableWST_0036_UNABLE_CREATE_KEY_INFO());
    }

    public static Localizable localizableWST_0018_TOKENS_NULL(Object arg0) {
        return messageFactory.getMessage("WST0018.tokens.null", arg0);
    }

    /**
     * WST0018:Invalid Request Security Token Response applied to the service {0}. RSTR does not contain an issued token nor a proof token.
     * 
     */
    public static String WST_0018_TOKENS_NULL(Object arg0) {
        return localizer.localize(localizableWST_0018_TOKENS_NULL(arg0));
    }

    public static Localizable localizableWST_0044_ERROR_ENCRYPT_ISSUED_TOKEN(Object arg0) {
        return messageFactory.getMessage("WST0044.error.encrypt.issued.token", arg0);
    }

    /**
     * WST0044:Error encrypting issued token for the service {0}.
     * 
     */
    public static String WST_0044_ERROR_ENCRYPT_ISSUED_TOKEN(Object arg0) {
        return localizer.localize(localizableWST_0044_ERROR_ENCRYPT_ISSUED_TOKEN(arg0));
    }

    public static Localizable localizableWST_0034_UNABLE_GET_CLIENT_CERT() {
        return messageFactory.getMessage("WST0034.unable.get.client.cert");
    }

    /**
     * WST0034:Unable to get client certificate. Either the subject does not contain valid credentials or there was a problem adding the X509 certificate.
     * 
     */
    public static String WST_0034_UNABLE_GET_CLIENT_CERT() {
        return localizer.localize(localizableWST_0034_UNABLE_GET_CLIENT_CERT());
    }

    public static Localizable localizableWST_1001_TOKEN_TYPE(Object arg0) {
        return messageFactory.getMessage("WST1001.token.type", arg0);
    }

    /**
     * WST1001:Token type: {0}.
     * 
     */
    public static String WST_1001_TOKEN_TYPE(Object arg0) {
        return localizer.localize(localizableWST_1001_TOKEN_TYPE(arg0));
    }

    public static Localizable localizableWST_0037_ERROR_COMPUTING_KEY() {
        return messageFactory.getMessage("WST0037.error.computing.key");
    }

    /**
     * WST0037:Error while computing key.
     * 
     */
    public static String WST_0037_ERROR_COMPUTING_KEY() {
        return localizer.localize(localizableWST_0037_ERROR_COMPUTING_KEY());
    }

    public static Localizable localizableWST_0015_CLIENT_NOT_AUTHORIZED(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WST0015.client.not.authorized", arg0, arg1, arg2);
    }

    /**
     * WST0015:The client {0} is not authorized to be issued the token of type {1} applied to {2}.
     * 
     */
    public static String WST_0015_CLIENT_NOT_AUTHORIZED(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWST_0015_CLIENT_NOT_AUTHORIZED(arg0, arg1, arg2));
    }

    public static Localizable localizableWST_0025_INVALID_KEY_TYPE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST0025.invalid.key.type", arg0, arg1);
    }

    /**
     * WST0025:Invalid Key Type: {0} applies to the service {1}. Must be one of Publickey, Symmetric Key or No Proof Key.
     * 
     */
    public static String WST_0025_INVALID_KEY_TYPE(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_0025_INVALID_KEY_TYPE(arg0, arg1));
    }

    public static Localizable localizableWST_1014_RESPONSE_INVOKING_RST(Object arg0) {
        return messageFactory.getMessage("WST1014.response.invoking.rst", arg0);
    }

    /**
     * WST1014:RSTR Reponse on invoking RST:
     *  {0}.
     * 
     */
    public static String WST_1014_RESPONSE_INVOKING_RST(Object arg0) {
        return localizer.localize(localizableWST_1014_RESPONSE_INVOKING_RST(arg0));
    }

    public static Localizable localizableWST_0008_FAIL_RSTR_SOURCE(Object arg0) {
        return messageFactory.getMessage("WST0008.fail.rstr.source", arg0);
    }

    /**
     * WST0008:Failed to create RSTR from Source {0}.
     * 
     */
    public static String WST_0008_FAIL_RSTR_SOURCE(Object arg0) {
        return localizer.localize(localizableWST_0008_FAIL_RSTR_SOURCE(arg0));
    }

    public static Localizable localizableWST_0039_ERROR_CREATING_DOCFACTORY() {
        return messageFactory.getMessage("WST0039.error.creating.docfactory");
    }

    /**
     * WST0039:Error creating a document factory due to Parser exception.
     * 
     */
    public static String WST_0039_ERROR_CREATING_DOCFACTORY() {
        return localizer.localize(localizableWST_0039_ERROR_CREATING_DOCFACTORY());
    }

    public static Localizable localizableWST_0012_JAXB_EX_TO_ELEMENT() {
        return messageFactory.getMessage("WST0012.jaxb.ex.toElement");
    }

    /**
     * WST0012:JAXBException encountered while creating Element.
     * 
     */
    public static String WST_0012_JAXB_EX_TO_ELEMENT() {
        return localizer.localize(localizableWST_0012_JAXB_EX_TO_ELEMENT());
    }

    public static Localizable localizableWST_0017_SERVICE_PORTNAME_ERROR(Object arg0) {
        return messageFactory.getMessage("WST0017.service.portname.error", arg0);
    }

    /**
     * WST0017:Could not obtain STS metadata. MEX call to STS {0} failed.
     * 
     */
    public static String WST_0017_SERVICE_PORTNAME_ERROR(Object arg0) {
        return localizer.localize(localizableWST_0017_SERVICE_PORTNAME_ERROR(arg0));
    }

    public static Localizable localizableWST_1002_PROVIDER_TYPE(Object arg0) {
        return messageFactory.getMessage("WST1002.provider.type", arg0);
    }

    /**
     * WST1002:STS provider configuration type {0}.
     * 
     */
    public static String WST_1002_PROVIDER_TYPE(Object arg0) {
        return localizer.localize(localizableWST_1002_PROVIDER_TYPE(arg0));
    }

    public static Localizable localizableWST_0019_INVALID_PROOF_TOKEN_TYPE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST0019.invalid.proofToken.type", arg0, arg1);
    }

    /**
     * WST0019:Invalid Proof Token Type: {0} for the service {1}.
     * 
     */
    public static String WST_0019_INVALID_PROOF_TOKEN_TYPE(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_0019_INVALID_PROOF_TOKEN_TYPE(arg0, arg1));
    }

    public static Localizable localizableWST_1008_CREATED_RSTR_CANCEL(Object arg0) {
        return messageFactory.getMessage("WST1008.created.rstr.cancel", arg0);
    }

    /**
     * WST1008:Created RSTR for Cancel:
     *  {0}.
     * 
     */
    public static String WST_1008_CREATED_RSTR_CANCEL(Object arg0) {
        return localizer.localize(localizableWST_1008_CREATED_RSTR_CANCEL(arg0));
    }

    public static Localizable localizableWST_0001_UNSUPPORTED_PROOF_TOKEN_TYPE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST0001.unsupported.proofToken.type", arg0, arg1);
    }

    /**
     * WST0001:Unsupported Proof Token Type: {0} targeted for the service {1}. Accepted types are computed key and binary secret.
     * 
     */
    public static String WST_0001_UNSUPPORTED_PROOF_TOKEN_TYPE(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_0001_UNSUPPORTED_PROOF_TOKEN_TYPE(arg0, arg1));
    }

    public static Localizable localizableWST_0006_FAIL_RST_SOURCE(Object arg0) {
        return messageFactory.getMessage("WST0006.fail.rst.source", arg0);
    }

    /**
     * WST0006:Failed to create RST from Source {0}.
     * 
     */
    public static String WST_0006_FAIL_RST_SOURCE(Object arg0) {
        return localizer.localize(localizableWST_0006_FAIL_RST_SOURCE(arg0));
    }

    public static Localizable localizableWST_0031_UNSUPPORTED_TOKEN_TYPE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WST0031.unsupported.token.type", arg0, arg1);
    }

    /**
     * WST0031:Unsupported Token Type: {0} applies to {1}. SAML 1.0 or SAML 1.1 assertion token types expected.
     * 
     */
    public static String WST_0031_UNSUPPORTED_TOKEN_TYPE(Object arg0, Object arg1) {
        return localizer.localize(localizableWST_0031_UNSUPPORTED_TOKEN_TYPE(arg0, arg1));
    }

    public static Localizable localizableWST_0029_COULD_NOT_GET_STS_LOCATION(Object arg0) {
        return messageFactory.getMessage("WST0029.could.not.get.sts.location", arg0);
    }

    /**
     * WST0029:STS location could not be obtained from either IssuedToken or from client configuration for accessing the service {0}. 
     * 
     */
    public static String WST_0029_COULD_NOT_GET_STS_LOCATION(Object arg0) {
        return localizer.localize(localizableWST_0029_COULD_NOT_GET_STS_LOCATION(arg0));
    }

    public static Localizable localizableWST_0020_ERROR_DECODING(Object arg0) {
        return messageFactory.getMessage("WST0020.error.decoding", arg0);
    }

    /**
     * WST0020:Error while decoding {0}.
     * 
     */
    public static String WST_0020_ERROR_DECODING(Object arg0) {
        return localizer.localize(localizableWST_0020_ERROR_DECODING(arg0));
    }

    public static Localizable localizableWST_0023_INVALID_URI_SYNTAX(Object arg0) {
        return messageFactory.getMessage("WST0023.invalid.uri.syntax", arg0);
    }

    /**
     * WST0023:Invalid URI syntax: {0}.
     * 
     */
    public static String WST_0023_INVALID_URI_SYNTAX(Object arg0) {
        return localizer.localize(localizableWST_0023_INVALID_URI_SYNTAX(arg0));
    }

    public static Localizable localizableWST_0042_NO_MATCHING_SERVICE_MEX(Object arg0) {
        return messageFactory.getMessage("WST0042.no.matching.service.mex", arg0);
    }

    /**
     * WST0042:No matching service with endpoint {0} found in the Metadata.
     * 
     */
    public static String WST_0042_NO_MATCHING_SERVICE_MEX(Object arg0) {
        return localizer.localize(localizableWST_0042_NO_MATCHING_SERVICE_MEX(arg0));
    }

    public static Localizable localizableWST_0013_ERROR_SECRET_KEY(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WST0013.error.secret.key", arg0, arg1, arg2);
    }

    /**
     * WST0013:Error in computing secret key with algorithm {0} of size {1} apllies to the service {2}.
     * 
     */
    public static String WST_0013_ERROR_SECRET_KEY(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWST_0013_ERROR_SECRET_KEY(arg0, arg1, arg2));
    }

    public static Localizable localizableWST_0021_ERROR_UNMARSHAL_DOM_ELEMENT() {
        return messageFactory.getMessage("WST0021.error.unmarshal.domElement");
    }

    /**
     * WST0021:Error while unmarshalling into JAXBElement from a dom Element. 
     * 
     */
    public static String WST_0021_ERROR_UNMARSHAL_DOM_ELEMENT() {
        return localizer.localize(localizableWST_0021_ERROR_UNMARSHAL_DOM_ELEMENT());
    }

    public static Localizable localizableWST_0030_REQUESTOR_NULL() {
        return messageFactory.getMessage("WST0030.requestor.null");
    }

    /**
     * WST0030:Subject is null. Either the client is not authenticated, or subject not established while authentication.
     * 
     */
    public static String WST_0030_REQUESTOR_NULL() {
        return localizer.localize(localizableWST_0030_REQUESTOR_NULL());
    }

    public static Localizable localizableWST_0004_UNKNOWN_SERVICEPROVIDER(Object arg0) {
        return messageFactory.getMessage("WST0004.unknown.serviceprovider", arg0);
    }

    /**
     * WST0004:Unknown target service provider {0}. STS Configuration does not contain meta data for the service.
     * 
     */
    public static String WST_0004_UNKNOWN_SERVICEPROVIDER(Object arg0) {
        return localizer.localize(localizableWST_0004_UNKNOWN_SERVICEPROVIDER(arg0));
    }

    public static Localizable localizableWST_0005_CLASSNOTFOUND_NULL_CONTRACT(Object arg0) {
        return messageFactory.getMessage("WST0005.classnotfound.null.contract", arg0);
    }

    /**
     * WST0005:Trust contract could not be obtained because the class {0} was not found. 
     * 
     */
    public static String WST_0005_CLASSNOTFOUND_NULL_CONTRACT(Object arg0) {
        return localizer.localize(localizableWST_0005_CLASSNOTFOUND_NULL_CONTRACT(arg0));
    }

    public static Localizable localizableWST_0033_UNABLE_GET_SERVICE_CERT(Object arg0) {
        return messageFactory.getMessage("WST0033.unable.get.service.cert", arg0);
    }

    /**
     * WST0033:Unable to get service certificate for the service {0}.
     * 
     */
    public static String WST_0033_UNABLE_GET_SERVICE_CERT(Object arg0) {
        return localizer.localize(localizableWST_0033_UNABLE_GET_SERVICE_CERT(arg0));
    }

    public static Localizable localizableWST_1007_CREATED_RSTR_ISSUE(Object arg0) {
        return messageFactory.getMessage("WST1007.created.rstr.issue", arg0);
    }

    /**
     * WST1007:Created RSTR for Issue:
     *  {0}.
     * 
     */
    public static String WST_1007_CREATED_RSTR_ISSUE(Object arg0) {
        return localizer.localize(localizableWST_1007_CREATED_RSTR_ISSUE(arg0));
    }

    public static Localizable localizableWST_0041_SERVICE_NOT_CREATED(Object arg0) {
        return messageFactory.getMessage("WST0041.service.not.created", arg0);
    }

    /**
     * WST0041:Could not create service due to malformed URL {0}.
     * 
     */
    public static String WST_0041_SERVICE_NOT_CREATED(Object arg0) {
        return localizer.localize(localizableWST_0041_SERVICE_NOT_CREATED(arg0));
    }

}
