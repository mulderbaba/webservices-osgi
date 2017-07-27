
package com.sun.xml.ws.transport.tcp.resources;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class MessagesMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.transport.tcp.resources.Messages");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSTCP_1093_TCP_ADAPTER_ONE_WAY() {
        return messageFactory.getMessage("WSTCP1093.TCP_ADAPTER_ONE_WAY");
    }

    /**
     * WSTCP1093: One way message
     * 
     */
    public static String WSTCP_1093_TCP_ADAPTER_ONE_WAY() {
        return localizer.localize(localizableWSTCP_1093_TCP_ADAPTER_ONE_WAY());
    }

    public static Localizable localizableWSTCP_1033_CONNECTION_MANAGER_RETURN_CHANNEL_CONTEXT(Object arg0) {
        return messageFactory.getMessage("WSTCP1033.CONNECTION_MANAGER_RETURN_CHANNEL_CONTEXT", arg0);
    }

    /**
     * WSTCP1033:WSConnectionManager.openChannel Return channelContext Id: {0}
     * 
     */
    public static String WSTCP_1033_CONNECTION_MANAGER_RETURN_CHANNEL_CONTEXT(Object arg0) {
        return localizer.localize(localizableWSTCP_1033_CONNECTION_MANAGER_RETURN_CHANNEL_CONTEXT(arg0));
    }

    public static Localizable localizableWSTCP_0026_UNKNOWN_CHANNEL_ID(Object arg0) {
        return messageFactory.getMessage("WSTCP0026.UNKNOWN_CHANNEL_ID", arg0);
    }

    /**
     * WSTCP0026: Unknown channel identifier: {0}
     * 
     */
    public static String WSTCP_0026_UNKNOWN_CHANNEL_ID(Object arg0) {
        return localizer.localize(localizableWSTCP_0026_UNKNOWN_CHANNEL_ID(arg0));
    }

    public static Localizable localizableSTANDALONE_RUN() {
        return messageFactory.getMessage("STANDALONE_RUN");
    }

    /**
     * Run WSTCP <WS_CONTEXT_ROOT> [-enableProtocolCheck]
     * 
     */
    public static String STANDALONE_RUN() {
        return localizer.localize(localizableSTANDALONE_RUN());
    }

    public static Localizable localizableWSTCP_1130_CONNECTION_MNGMNT_SETTINGS_LOADED(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1130.CONNECTION_MNGMNT_SETTINGS_LOADED", arg0, arg1, arg2);
    }

    /**
     * WSTCP1130: Custom SOAP/TCP connection settings loaded. HighWaterMark: {0}, MaxParallelConnections: {1}, NumberToReclaim: {2}
     * 
     */
    public static String WSTCP_1130_CONNECTION_MNGMNT_SETTINGS_LOADED(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1130_CONNECTION_MNGMNT_SETTINGS_LOADED(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_0027_MALFORMED_FRAME(Object arg0) {
        return messageFactory.getMessage("WSTCP0027.MALFORMED_FRAME", arg0);
    }

    /**
     * WSTCP0027: Malformed frame. {0}
     * 
     */
    public static String WSTCP_0027_MALFORMED_FRAME(Object arg0) {
        return localizer.localize(localizableWSTCP_0027_MALFORMED_FRAME(arg0));
    }

    public static Localizable localizableWSTCP_1104_WSTCP_DELEGATE_ON_MESSAGE_COMPLETED() {
        return messageFactory.getMessage("WSTCP1104.WSTCP_DELEGATE_ON_MESSAGE_COMPLETED");
    }

    /**
     * WSTCP1104: OnMessage completed
     * 
     */
    public static String WSTCP_1104_WSTCP_DELEGATE_ON_MESSAGE_COMPLETED() {
        return localizer.localize(localizableWSTCP_1104_WSTCP_DELEGATE_ON_MESSAGE_COMPLETED());
    }

    public static Localizable localizableWSTCP_1010_TCP_TP_PROCESS_ENTER(Object arg0) {
        return messageFactory.getMessage("WSTCP1010.TCP_TP_PROCESS_ENTER", arg0);
    }

    /**
     * WSTCP1010:TCPTransportPipe.process() entering. Target URI: {0}
     * 
     */
    public static String WSTCP_1010_TCP_TP_PROCESS_ENTER(Object arg0) {
        return localizer.localize(localizableWSTCP_1010_TCP_TP_PROCESS_ENTER(arg0));
    }

    public static Localizable localizableWSTCP_1121_CHANNEL_CONTEXT_ENCODED_CT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1121.CHANNEL_CONTEXT_ENCODED_CT", arg0, arg1);
    }

    /**
     * WSTCP1121: Encoded mimeId: {0} params: {1}
     * 
     */
    public static String WSTCP_1121_CHANNEL_CONTEXT_ENCODED_CT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1121_CHANNEL_CONTEXT_ENCODED_CT(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1140_SOAPTCP_SESSION_OPEN(Object arg0) {
        return messageFactory.getMessage("WSTCP1140.SOAPTCP_SESSION_OPEN", arg0);
    }

    /**
     * WSTCP1140: Session: {0} opened
     * 
     */
    public static String WSTCP_1140_SOAPTCP_SESSION_OPEN(Object arg0) {
        return localizer.localize(localizableWSTCP_1140_SOAPTCP_SESSION_OPEN(arg0));
    }

    public static Localizable localizableWSTCP_0032_UNEXPECTED_TRANSPORT_SOAP_ACTION() {
        return messageFactory.getMessage("WSTCP0032.UNEXPECTED_TRANSPORT_SOAP_ACTION");
    }

    /**
     * WSTCP0032: Transport SOAPAction parameter is not expected to be set. Is not used with SOAP1.2
     * 
     */
    public static String WSTCP_0032_UNEXPECTED_TRANSPORT_SOAP_ACTION() {
        return localizer.localize(localizableWSTCP_0032_UNEXPECTED_TRANSPORT_SOAP_ACTION());
    }

    public static Localizable localizableWSTCP_1036_CONNECTION_MANAGER_DO_OPEN_CHANNEL_ENTER() {
        return messageFactory.getMessage("WSTCP1036.CONNECTION_MANAGER_DO_OPEN_CHANNEL_ENTER");
    }

    /**
     * WSTCP1036:WSConnectionManager.doOpenChannel enter
     * 
     */
    public static String WSTCP_1036_CONNECTION_MANAGER_DO_OPEN_CHANNEL_ENTER() {
        return localizer.localize(localizableWSTCP_1036_CONNECTION_MANAGER_DO_OPEN_CHANNEL_ENTER());
    }

    public static Localizable localizableWSTCP_1173_RESUME_SOAPTCP_LISTENER() {
        return messageFactory.getMessage("WSTCP1173.RESUME_SOAPTCP_LISTENER");
    }

    /**
     * Resuming SOAP/TCP
     * 
     */
    public static String WSTCP_1173_RESUME_SOAPTCP_LISTENER() {
        return localizer.localize(localizableWSTCP_1173_RESUME_SOAPTCP_LISTENER());
    }

    public static Localizable localizableWSTCP_1090_TCP_ADAPTER_REQ_CONTENT_TYPE(Object arg0) {
        return messageFactory.getMessage("WSTCP1090.TCP_ADAPTER_REQ_CONTENT_TYPE", arg0);
    }

    /**
     * WSTCP1090: Request contentType {0}
     * 
     */
    public static String WSTCP_1090_TCP_ADAPTER_REQ_CONTENT_TYPE(Object arg0) {
        return localizer.localize(localizableWSTCP_1090_TCP_ADAPTER_REQ_CONTENT_TYPE(arg0));
    }

    public static Localizable localizableWSTCP_0015_ERROR_PROTOCOL_VERSION_EXCHANGE() {
        return messageFactory.getMessage("WSTCP0015.ERROR_PROTOCOL_VERSION_EXCHANGE");
    }

    /**
     * WSTCP0015:Error when exchanging protocol version
     * 
     */
    public static String WSTCP_0015_ERROR_PROTOCOL_VERSION_EXCHANGE() {
        return localizer.localize(localizableWSTCP_0015_ERROR_PROTOCOL_VERSION_EXCHANGE());
    }

    public static Localizable localizableWSTCP_2000_STANDALONE_EXCEPTION() {
        return messageFactory.getMessage("WSTCP2000.STANDALONE_EXCEPTION");
    }

    /**
     * WSTCP2000: Exception during standalone run!
     * 
     */
    public static String WSTCP_2000_STANDALONE_EXCEPTION() {
        return localizer.localize(localizableWSTCP_2000_STANDALONE_EXCEPTION());
    }

    public static Localizable localizableWSTCP_1070_OUTPUT_WRITER_DUMP(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1070.OUTPUT_WRITER_DUMP", arg0, arg1);
    }

    /**
     * WSTCP1070:Output dump to host: {0} port: {1}:
     * 
     */
    public static String WSTCP_1070_OUTPUT_WRITER_DUMP(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1070_OUTPUT_WRITER_DUMP(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1092_TCP_ADAPTER_RPL_CONTENT_TYPE(Object arg0) {
        return messageFactory.getMessage("WSTCP1092.TCP_ADAPTER_RPL_CONTENT_TYPE", arg0);
    }

    /**
     * WSTCP1092: Reply contentType: {0}
     * 
     */
    public static String WSTCP_1092_TCP_ADAPTER_RPL_CONTENT_TYPE(Object arg0) {
        return localizer.localize(localizableWSTCP_1092_TCP_ADAPTER_RPL_CONTENT_TYPE(arg0));
    }

    public static Localizable localizableWSTCP_0019_PEER_DISCONNECTED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP0019.PEER_DISCONNECTED", arg0, arg1);
    }

    /**
     * WSTCP0019:Peer disconnected host: {0} port: {1}
     * 
     */
    public static String WSTCP_0019_PEER_DISCONNECTED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_0019_PEER_DISCONNECTED(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1103_WSTCP_DELEGATE_ON_MESSAGE(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSTCP1103.WSTCP_DELEGATE_ON_MESSAGE", arg0, arg1, arg2, arg3);
    }

    /**
     * WSTCP1103: OnMessage host: {0}, port: {1}, localHost: {2}, localPort: {3}
     * 
     */
    public static String WSTCP_1103_WSTCP_DELEGATE_ON_MESSAGE(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSTCP_1103_WSTCP_DELEGATE_ON_MESSAGE(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSTCP_0023_TARGET_EXEC_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP0023.TARGET_EXEC_ERROR", arg0, arg1);
    }

    /**
     * WSTCP0023: Error execution WS target. Client host: {0} port: {1}
     * 
     */
    public static String WSTCP_0023_TARGET_EXEC_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_0023_TARGET_EXEC_ERROR(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1013_TCP_TP_PROCESS_ENCODE(Object arg0) {
        return messageFactory.getMessage("WSTCP1013.TCP_TP_PROCESS_ENCODE", arg0);
    }

    /**
     * WSTCP1013:TCPTransportPipe.process() encode. ContentType: {0}
     * 
     */
    public static String WSTCP_1013_TCP_TP_PROCESS_ENCODE(Object arg0) {
        return localizer.localize(localizableWSTCP_1013_TCP_TP_PROCESS_ENCODE(arg0));
    }

    public static Localizable localizableWSTCP_2001_STANDALONE_ADAPTER_REGISTERED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP2001.STANDALONE_ADAPTER_REGISTERED", arg0, arg1);
    }

    /**
     * WSTCP2001: Adapter: "{0}" with url-pattern "{1}" is registered.
     * 
     */
    public static String WSTCP_2001_STANDALONE_ADAPTER_REGISTERED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_2001_STANDALONE_ADAPTER_REGISTERED(arg0, arg1));
    }

    public static Localizable localizableWSTCP_0013_TCP_PROCESSOR_NOT_REGISTERED() {
        return messageFactory.getMessage("WSTCP0013.TCP_PROCESSOR_NOT_REGISTERED");
    }

    /**
     * WSTCP0013:WS TCP Request came. But no processor registered!
     * 
     */
    public static String WSTCP_0013_TCP_PROCESSOR_NOT_REGISTERED() {
        return localizer.localize(localizableWSTCP_0013_TCP_PROCESSOR_NOT_REGISTERED());
    }

    public static Localizable localizableWSTCP_1004_TCP_SERVICE_TP_PROCESS_ENCODE(Object arg0) {
        return messageFactory.getMessage("WSTCP1004.TCP_SERVICE_TP_PROCESS_ENCODE", arg0);
    }

    /**
     * WSTCP1004:ServiceChannelTransportPipe.process() encode. ContentType: {0}
     * 
     */
    public static String WSTCP_1004_TCP_SERVICE_TP_PROCESS_ENCODE(Object arg0) {
        return localizer.localize(localizableWSTCP_1004_TCP_SERVICE_TP_PROCESS_ENCODE(arg0));
    }

    public static Localizable localizableWSTCP_1032_CONNECTION_MANAGER_OFFER_SESSION_FOR_REUSE() {
        return messageFactory.getMessage("WSTCP1032.CONNECTION_MANAGER_OFFER_SESSION_FOR_REUSE");
    }

    /**
     * WSTCP1032:WSConnectionManager.openChannel Offer session for reuse
     * 
     */
    public static String WSTCP_1032_CONNECTION_MANAGER_OFFER_SESSION_FOR_REUSE() {
        return localizer.localize(localizableWSTCP_1032_CONNECTION_MANAGER_OFFER_SESSION_FOR_REUSE());
    }

    public static Localizable localizableWSTCP_1091_TCP_ADAPTER_DECODED() {
        return messageFactory.getMessage("WSTCP1091.TCP_ADAPTER_DECODED");
    }

    /**
     * WSTCP1091: Decoded
     * 
     */
    public static String WSTCP_1091_TCP_ADAPTER_DECODED() {
        return localizer.localize(localizableWSTCP_1091_TCP_ADAPTER_DECODED());
    }

    public static Localizable localizableWSTCP_0011_UNKNOWN_CONTENT_TYPE(Object arg0) {
        return messageFactory.getMessage("WSTCP0011.UNKNOWN_CONTENT_TYPE", arg0);
    }

    /**
     * WSTCP0011:Unknown content-type {0}
     * 
     */
    public static String WSTCP_0011_UNKNOWN_CONTENT_TYPE(Object arg0) {
        return localizer.localize(localizableWSTCP_0011_UNKNOWN_CONTENT_TYPE(arg0));
    }

    public static Localizable localizableWSTCP_1022_CONNECTION_CACHE_LOCK() {
        return messageFactory.getMessage("WSTCP1022.CONNECTION_CACHE_LOCK");
    }

    /**
     * WSTCP1022:WSConnectionCache.lockConnection lock
     * 
     */
    public static String WSTCP_1022_CONNECTION_CACHE_LOCK() {
        return localizer.localize(localizableWSTCP_1022_CONNECTION_CACHE_LOCK());
    }

    public static Localizable localizableWSTCP_1037_CONNECTION_MANAGER_DO_OPEN_WS_CALL(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1037.CONNECTION_MANAGER_DO_OPEN_WS_CALL", arg0, arg1, arg2);
    }

    /**
     * WSTCP1037:WSConnectionManager.doOpenChannel call ServiceWS.openChannel targetURI: {0} 
     * negotiatingMimeTypes: {1} 
     * negotiatingParams: {2}
     * 
     */
    public static String WSTCP_1037_CONNECTION_MANAGER_DO_OPEN_WS_CALL(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1037_CONNECTION_MANAGER_DO_OPEN_WS_CALL(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_0029_INCORRECT_FRAME_SEQ(Object arg0) {
        return messageFactory.getMessage("WSTCP0029.INCORRECT_FRAME_SEQ", arg0);
    }

    /**
     * WSTCP0029: Incorrect message frame sequence. {0}
     * 
     */
    public static String WSTCP_0029_INCORRECT_FRAME_SEQ(Object arg0) {
        return localizer.localize(localizableWSTCP_0029_INCORRECT_FRAME_SEQ(arg0));
    }

    public static Localizable localizableWSTCP_1083_INCOME_MSG_VERSION_CHECK_RESULT(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        return messageFactory.getMessage("WSTCP1083.INCOME_MSG_VERSION_CHECK_RESULT", arg0, arg1, arg2, arg3, arg4);
    }

    /**
     * WSTCP1083: Version check clientFramingVersion: {0}, clientConnectionMngmntVersion: {1}, serverFramingVersion: {2}, serverConnectionMngmntVersion: {3}, successCode: {4}
     * 
     */
    public static String WSTCP_1083_INCOME_MSG_VERSION_CHECK_RESULT(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4) {
        return localizer.localize(localizableWSTCP_1083_INCOME_MSG_VERSION_CHECK_RESULT(arg0, arg1, arg2, arg3, arg4));
    }

    public static Localizable localizableWSTCP_0008_ERROR_TCP_ADAPTER_CREATE(Object arg0) {
        return messageFactory.getMessage("WSTCP0008.ERROR_TCP_ADAPTER_CREATE", arg0);
    }

    /**
     * WSTCP0008:Error creating TCP adapter for {0}
     * 
     */
    public static String WSTCP_0008_ERROR_TCP_ADAPTER_CREATE(Object arg0) {
        return localizer.localize(localizableWSTCP_0008_ERROR_TCP_ADAPTER_CREATE(arg0));
    }

    public static Localizable localizableWSTCP_0034_WS_ENDPOINT_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("WSTCP0034.WS_ENDPOINT_NOT_FOUND", arg0);
    }

    /**
     * WSTCP0034: Web service for endpoint {0} is not found!
     * 
     */
    public static String WSTCP_0034_WS_ENDPOINT_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableWSTCP_0034_WS_ENDPOINT_NOT_FOUND(arg0));
    }

    public static Localizable localizableWSTCP_1041_CONNECTION_MANAGER_DO_CHECK_VERSION_SENT() {
        return messageFactory.getMessage("WSTCP1041.CONNECTION_MANAGER_DO_CHECK_VERSION_SENT");
    }

    /**
     * WSTCP1041:WSConnectionManager.doCheckVersions version sent
     * 
     */
    public static String WSTCP_1041_CONNECTION_MANAGER_DO_CHECK_VERSION_SENT() {
        return localizer.localize(localizableWSTCP_1041_CONNECTION_MANAGER_DO_CHECK_VERSION_SENT());
    }

    public static Localizable localizableWSTCP_1111_APP_SERV_REG_DEREGISTER_ENDPOINT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1111.APP_SERV_REG_DEREGISTER_ENDPOINT", arg0, arg1, arg2);
    }

    /**
     * WSTCP1111: Deregister endpoint. ServiceName: {0} path: {1} isEJB: {2}
     * 
     */
    public static String WSTCP_1111_APP_SERV_REG_DEREGISTER_ENDPOINT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1111_APP_SERV_REG_DEREGISTER_ENDPOINT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_0003_TARGET_WS_NOT_FOUND(Object arg0) {
        return messageFactory.getMessage("WSTCP0003.TARGET_WS_NOT_FOUND", arg0);
    }

    /**
     * WSTCP0003:Target WS not found. TargetURI: {0}
     * 
     */
    public static String WSTCP_0003_TARGET_WS_NOT_FOUND(Object arg0) {
        return localizer.localize(localizableWSTCP_0003_TARGET_WS_NOT_FOUND(arg0));
    }

    public static Localizable localizableWSTCP_1011_TCP_TP_PROCESS_TRANSPORT_CREATE() {
        return messageFactory.getMessage("WSTCP1011.TCP_TP_PROCESS_TRANSPORT_CREATE");
    }

    /**
     * WSTCP1011:TCPTransportPipe.process() create new client transport
     * 
     */
    public static String WSTCP_1011_TCP_TP_PROCESS_TRANSPORT_CREATE() {
        return localizer.localize(localizableWSTCP_1011_TCP_TP_PROCESS_TRANSPORT_CREATE());
    }

    public static Localizable localizableWSTCP_1034_CONNECTION_MANAGER_CREATE_SESSION_ENTER(Object arg0) {
        return messageFactory.getMessage("WSTCP1034.CONNECTION_MANAGER_CREATE_SESSION_ENTER", arg0);
    }

    /**
     * WSTCP1034:WSConnectionManager.createConnectionSession entering URI: {0}
     * 
     */
    public static String WSTCP_1034_CONNECTION_MANAGER_CREATE_SESSION_ENTER(Object arg0) {
        return localizer.localize(localizableWSTCP_1034_CONNECTION_MANAGER_CREATE_SESSION_ENTER(arg0));
    }

    public static Localizable localizableWSTCP_0006_VERSION_MISMATCH() {
        return messageFactory.getMessage("WSTCP0006.VERSION_MISMATCH");
    }

    /**
     * WSTCP0006:Version mismatch!
     * 
     */
    public static String WSTCP_0006_VERSION_MISMATCH() {
        return localizer.localize(localizableWSTCP_0006_VERSION_MISMATCH());
    }

    public static Localizable localizableWSTCP_1141_SOAPTCP_CHANNEL_OPEN(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1141.SOAPTCP_CHANNEL_OPEN", arg0, arg1, arg2);
    }

    /**
     * WSTCP1141: Session: {0}. Channel #{1} was opened for WS: {2}
     * 
     */
    public static String WSTCP_1141_SOAPTCP_CHANNEL_OPEN(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1141_SOAPTCP_CHANNEL_OPEN(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_2002_STANDALONE_ADAPTER_NOT_REGISTERED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP2002.STANDALONE_ADAPTER_NOT_REGISTERED", arg0, arg1);
    }

    /**
     * WSTCP2002: Adapter: "{0}" with url-pattern "{1}" is not registered.
     * 
     */
    public static String WSTCP_2002_STANDALONE_ADAPTER_NOT_REGISTERED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_2002_STANDALONE_ADAPTER_NOT_REGISTERED(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1101_WSTCP_DELEGATE_REGISTER_ADAPTER(Object arg0) {
        return messageFactory.getMessage("WSTCP1101.WSTCP_DELEGATE_REGISTER_ADAPTER", arg0);
    }

    /**
     * WSTCP1101: Register adapter. URL: {0}
     * 
     */
    public static String WSTCP_1101_WSTCP_DELEGATE_REGISTER_ADAPTER(Object arg0) {
        return localizer.localize(localizableWSTCP_1101_WSTCP_DELEGATE_REGISTER_ADAPTER(arg0));
    }

    public static Localizable localizableWSTCP_0024_SERVICE_CHANNEL_EXCEPTION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP0024.SERVICE_CHANNEL_EXCEPTION", arg0, arg1);
    }

    /**
     * WSTCP0024: Exception occured during Connection Management web service operation executing. Id: {0} Description: {1}
     * 
     */
    public static String WSTCP_0024_SERVICE_CHANNEL_EXCEPTION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_0024_SERVICE_CHANNEL_EXCEPTION(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1102_WSTCP_DELEGATE_GOING_TO_CUSTOM_REG(Object arg0) {
        return messageFactory.getMessage("WSTCP1102.WSTCP_DELEGATE_GOING_TO_CUSTOM_REG", arg0);
    }

    /**
     * WSTCP1102: Going to custom registry URL: {0}
     * 
     */
    public static String WSTCP_1102_WSTCP_DELEGATE_GOING_TO_CUSTOM_REG(Object arg0) {
        return localizer.localize(localizableWSTCP_1102_WSTCP_DELEGATE_GOING_TO_CUSTOM_REG(arg0));
    }

    public static Localizable localizableWSTCP_1039_CONNECTION_MANAGER_DO_OPEN_REGISTER_CHANNEL(Object arg0) {
        return messageFactory.getMessage("WSTCP1039.CONNECTION_MANAGER_DO_OPEN_REGISTER_CHANNEL", arg0);
    }

    /**
     * WSTCP1039:WSConnectionManager.doOpenChannel register channel Id: {0}
     * 
     */
    public static String WSTCP_1039_CONNECTION_MANAGER_DO_OPEN_REGISTER_CHANNEL(Object arg0) {
        return localizer.localize(localizableWSTCP_1039_CONNECTION_MANAGER_DO_OPEN_REGISTER_CHANNEL(arg0));
    }

    public static Localizable localizableWSTCP_1061_FRAMED_MESSAGE_IS_READ_HEADER_DONE(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
        return messageFactory.getMessage("WSTCP1061.FRAMED_MESSAGE_IS_READ_HEADER_DONE", arg0, arg1, arg2, arg3, arg4, arg5);
    }

    /**
     * WSTCP1061:FramedMessageInputStream.readHeader done. channelId: {0}, messageId: {1}, content-id: {2}, content-params: {3}, currentFrameDataSize: {4}, isLastFrame: {5}
     * 
     */
    public static String WSTCP_1061_FRAMED_MESSAGE_IS_READ_HEADER_DONE(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5) {
        return localizer.localize(localizableWSTCP_1061_FRAMED_MESSAGE_IS_READ_HEADER_DONE(arg0, arg1, arg2, arg3, arg4, arg5));
    }

    public static Localizable localizableWSTCP_0020_WRONG_MAGIC(Object arg0) {
        return messageFactory.getMessage("WSTCP0020.WRONG_MAGIC", arg0);
    }

    /**
     * WSTCP0020: wrong magic: {0}
     * 
     */
    public static String WSTCP_0020_WRONG_MAGIC(Object arg0) {
        return localizer.localize(localizableWSTCP_0020_WRONG_MAGIC(arg0));
    }

    public static Localizable localizableWSTCP_1112_APP_SERV_REG_GET_ENDP_CR_NON_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1112.APP_SERV_REG_GET_ENDP_CR_NON_EJB", arg0);
    }

    /**
     * WSTCP1112: EndpointContextRoot nonEJB WS. ContextRoot: {0}
     * 
     */
    public static String WSTCP_1112_APP_SERV_REG_GET_ENDP_CR_NON_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1112_APP_SERV_REG_GET_ENDP_CR_NON_EJB(arg0));
    }

    public static Localizable localizableWSTCP_1151_CON_MNGMNT_SETTINGS_SYST_PROPS() {
        return messageFactory.getMessage("WSTCP1151.CON_MNGMNT_SETTINGS_SYST_PROPS");
    }

    /**
     * WSTCP1151: System properties based ConnectionManagementSettings holder is taken
     * 
     */
    public static String WSTCP_1151_CON_MNGMNT_SETTINGS_SYST_PROPS() {
        return localizer.localize(localizableWSTCP_1151_CON_MNGMNT_SETTINGS_SYST_PROPS());
    }

    public static Localizable localizableWSTCP_1035_CONNECTION_MANAGER_INITIATE_SESSION() {
        return messageFactory.getMessage("WSTCP1035.CONNECTION_MANAGER_INITIATE_SESSION");
    }

    /**
     * WSTCP1035:WSConnectionManager.createConnectionSession call ServiceWS.initiateSession
     * 
     */
    public static String WSTCP_1035_CONNECTION_MANAGER_INITIATE_SESSION() {
        return localizer.localize(localizableWSTCP_1035_CONNECTION_MANAGER_INITIATE_SESSION());
    }

    public static Localizable localizableWSTCP_0016_ERROR_WS_EXECUTION_ON_SERVER(Object arg0) {
        return messageFactory.getMessage("WSTCP0016.ERROR_WS_EXECUTION_ON_SERVER", arg0);
    }

    /**
     * WSTCP0016:Error executing webservice. Server error: {0}
     * 
     */
    public static String WSTCP_0016_ERROR_WS_EXECUTION_ON_SERVER(Object arg0) {
        return localizer.localize(localizableWSTCP_0016_ERROR_WS_EXECUTION_ON_SERVER(arg0));
    }

    public static Localizable localizableWSTCP_1012_TCP_TP_PROCESS_TRANSPORT_REUSE() {
        return messageFactory.getMessage("WSTCP1012.TCP_TP_PROCESS_TRANSPORT_REUSE");
    }

    /**
     * WSTCP1012:TCPTransportPipe.process() reuse client transport
     * 
     */
    public static String WSTCP_1012_TCP_TP_PROCESS_TRANSPORT_REUSE() {
        return localizer.localize(localizableWSTCP_1012_TCP_TP_PROCESS_TRANSPORT_REUSE());
    }

    public static Localizable localizableWSTCP_1038_CONNECTION_MANAGER_DO_OPEN_PROCESS_SERVER_SETTINGS(Object arg0) {
        return messageFactory.getMessage("WSTCP1038.CONNECTION_MANAGER_DO_OPEN_PROCESS_SERVER_SETTINGS", arg0);
    }

    /**
     * WSTCP1038:WSConnectionManager.doOpenChannel serverSettings: {0}
     * 
     */
    public static String WSTCP_1038_CONNECTION_MANAGER_DO_OPEN_PROCESS_SERVER_SETTINGS(Object arg0) {
        return localizer.localize(localizableWSTCP_1038_CONNECTION_MANAGER_DO_OPEN_PROCESS_SERVER_SETTINGS(arg0));
    }

    public static Localizable localizableWSTCP_1014_TCP_TP_PROCESS_SEND() {
        return messageFactory.getMessage("WSTCP1014.TCP_TP_PROCESS_SEND");
    }

    /**
     * WSTCP1014:TCPTransportPipe.process() send
     * 
     */
    public static String WSTCP_1014_TCP_TP_PROCESS_SEND() {
        return localizer.localize(localizableWSTCP_1014_TCP_TP_PROCESS_SEND());
    }

    public static Localizable localizableWSTCP_1161_ADD_PORT_ATTR_INIT_FAIL() {
        return messageFactory.getMessage("WSTCP1161.ADD_PORT_ATTR_INIT_FAIL");
    }

    /**
     * WSTCP1161: Unexpected exception happened when trying to initialize writeAttribute invocation
     * 
     */
    public static String WSTCP_1161_ADD_PORT_ATTR_INIT_FAIL() {
        return localizer.localize(localizableWSTCP_1161_ADD_PORT_ATTR_INIT_FAIL());
    }

    public static Localizable localizableWSTCP_1120_CHANNEL_CONTEXT_ENCODE_CT(Object arg0) {
        return messageFactory.getMessage("WSTCP1120.CHANNEL_CONTEXT_ENCODE_CT", arg0);
    }

    /**
     * WSTCP1120: Encode content type: {0}
     * 
     */
    public static String WSTCP_1120_CHANNEL_CONTEXT_ENCODE_CT(Object arg0) {
        return localizer.localize(localizableWSTCP_1120_CHANNEL_CONTEXT_ENCODE_CT(arg0));
    }

    public static Localizable localizableWSTCP_0014_NO_JAXWS_DESCRIPTOR() {
        return messageFactory.getMessage("WSTCP0014.NO_JAXWS_DESCRIPTOR");
    }

    /**
     * WSTCP0014:No JAX-WS descriptor file found
     * 
     */
    public static String WSTCP_0014_NO_JAXWS_DESCRIPTOR() {
        return localizer.localize(localizableWSTCP_0014_NO_JAXWS_DESCRIPTOR());
    }

    public static Localizable localizableWSTCP_1062_FRAMED_MESSAGE_IS_READ_UNEXPECTED_EOF(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSTCP1062.FRAMED_MESSAGE_IS_READ_UNEXPECTED_EOF", arg0, arg1, arg2, arg3);
    }

    /**
     * WSTCP1062:Unexpected EOF. isLastFrame: {0}, frameBytesRead: {1}, frameSize: {2}, currentFrameDataSize: {3}
     * 
     */
    public static String WSTCP_1062_FRAMED_MESSAGE_IS_READ_UNEXPECTED_EOF(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSTCP_1062_FRAMED_MESSAGE_IS_READ_UNEXPECTED_EOF(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSTCP_0001_MESSAGE_PROCESS_FAILED() {
        return messageFactory.getMessage("WSTCP0001.MESSAGE_PROCESS_FAILED");
    }

    /**
     * WSTCP0001:Processing message failed!
     * 
     */
    public static String WSTCP_0001_MESSAGE_PROCESS_FAILED() {
        return localizer.localize(localizableWSTCP_0001_MESSAGE_PROCESS_FAILED());
    }

    public static Localizable localizableWSTCP_0005_INVALID_EP_URL(Object arg0) {
        return messageFactory.getMessage("WSTCP0005.INVALID_EP_URL", arg0);
    }

    /**
     * WSTCP0005:Invalid endpoint URL: {0}
     * 
     */
    public static String WSTCP_0005_INVALID_EP_URL(Object arg0) {
        return localizer.localize(localizableWSTCP_0005_INVALID_EP_URL(arg0));
    }

    public static Localizable localizableWSTCP_1015_TCP_TP_PROCESS_OPEN_PREPARE_READING() {
        return messageFactory.getMessage("WSTCP1015.TCP_TP_PROCESS_OPEN_PREPARE_READING");
    }

    /**
     * WSTCP1015:TCPTransportPipe.process() prepare reading
     * 
     */
    public static String WSTCP_1015_TCP_TP_PROCESS_OPEN_PREPARE_READING() {
        return localizer.localize(localizableWSTCP_1015_TCP_TP_PROCESS_OPEN_PREPARE_READING());
    }

    public static Localizable localizableWSTCP_0018_ERROR_READING_FROM_SOCKET() {
        return messageFactory.getMessage("WSTCP0018.ERROR_READING_FROM_SOCKET");
    }

    /**
     * WSTCP0018:Error reading from socket
     * 
     */
    public static String WSTCP_0018_ERROR_READING_FROM_SOCKET() {
        return localizer.localize(localizableWSTCP_0018_ERROR_READING_FROM_SOCKET());
    }

    public static Localizable localizableWSTCP_1044_CONNECTION_MANAGER_CLIENT_SIDE_CONNECTION_CACHE(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1044.CONNECTION_MANAGER_CLIENT_SIDE_CONNECTION_CACHE", arg0, arg1, arg2);
    }

    /**
     * WSTCP1044: SOAP/TCP client side connection cache settings. HighWaterMark: {0}, MaxParallelConnections: {1}, NumberToReclaim: {2}
     * 
     */
    public static String WSTCP_1044_CONNECTION_MANAGER_CLIENT_SIDE_CONNECTION_CACHE(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1044_CONNECTION_MANAGER_CLIENT_SIDE_CONNECTION_CACHE(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_0012_SEND_RETRY(Object arg0) {
        return messageFactory.getMessage("WSTCP0012.SEND_RETRY", arg0);
    }

    /**
     * WSTCP0012:Sending failed. Retry #{0}
     * 
     */
    public static String WSTCP_0012_SEND_RETRY(Object arg0) {
        return localizer.localize(localizableWSTCP_0012_SEND_RETRY(arg0));
    }

    public static Localizable localizableWSTCP_0022_ERROR_WS_EXECUTION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP0022.ERROR_WS_EXECUTION", arg0, arg1);
    }

    /**
     * WSTCP0022: Error processing request message. Client host: {0} port: {1}
     * 
     */
    public static String WSTCP_0022_ERROR_WS_EXECUTION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_0022_ERROR_WS_EXECUTION(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1170_INIT_SOAPTCP(Object arg0) {
        return messageFactory.getMessage("WSTCP1170.INIT_SOAPTCP", arg0);
    }

    /**
     * Initializing SOAP/TCP on port {0}
     * 
     */
    public static String WSTCP_1170_INIT_SOAPTCP(Object arg0) {
        return localizer.localize(localizableWSTCP_1170_INIT_SOAPTCP(arg0));
    }

    public static Localizable localizableWSTCP_0010_UNKNOWN_PARAMETER(Object arg0) {
        return messageFactory.getMessage("WSTCP0010.UNKNOWN_PARAMETER", arg0);
    }

    /**
     * WSTCP0010:Unknown parameter {0}
     * 
     */
    public static String WSTCP_0010_UNKNOWN_PARAMETER(Object arg0) {
        return localizer.localize(localizableWSTCP_0010_UNKNOWN_PARAMETER(arg0));
    }

    public static Localizable localizableWSTCP_1095_TCP_ADAPTER_WRITE_INTERNAL_SERVER_ERROR() {
        return messageFactory.getMessage("WSTCP1095.TCP_ADAPTER_WRITE_INTERNAL_SERVER_ERROR");
    }

    /**
     * WSTCP1095: writeInternalServerError() called.
     * 
     */
    public static String WSTCP_1095_TCP_ADAPTER_WRITE_INTERNAL_SERVER_ERROR() {
        return localizer.localize(localizableWSTCP_1095_TCP_ADAPTER_WRITE_INTERNAL_SERVER_ERROR());
    }

    public static Localizable localizableWSTCP_1006_TCP_SERVICE_TP_PROCESS_OPEN_PREPARE_READING() {
        return messageFactory.getMessage("WSTCP1006.TCP_SERVICE_TP_PROCESS_OPEN_PREPARE_READING");
    }

    /**
     * WSTCP1006:ServiceChannelTransportPipe.process() prepare reading
     * 
     */
    public static String WSTCP_1006_TCP_SERVICE_TP_PROCESS_OPEN_PREPARE_READING() {
        return localizer.localize(localizableWSTCP_1006_TCP_SERVICE_TP_PROCESS_OPEN_PREPARE_READING());
    }

    public static Localizable localizableWSTCP_1082_INCOME_MSG_VERSION_CHECK_ENTER() {
        return messageFactory.getMessage("WSTCP1082.INCOME_MSG_VERSION_CHECK_ENTER");
    }

    /**
     * WSTCP1082: entering
     * 
     */
    public static String WSTCP_1082_INCOME_MSG_VERSION_CHECK_ENTER() {
        return localizer.localize(localizableWSTCP_1082_INCOME_MSG_VERSION_CHECK_ENTER());
    }

    public static Localizable localizableSTANDALONE_EXIT() {
        return messageFactory.getMessage("STANDALONE_EXIT");
    }

    /**
     * Press enter key to quit
     * 
     */
    public static String STANDALONE_EXIT() {
        return localizer.localize(localizableSTANDALONE_EXIT());
    }

    public static Localizable localizableWSTCP_1043_CONNECTION_MANAGER_NOTIFY_SESSION_CLOSE(Object arg0) {
        return messageFactory.getMessage("WSTCP1043.CONNECTION_MANAGER_NOTIFY_SESSION_CLOSE", arg0);
    }

    /**
     * WSTCP1043:Session URI: {0} was closed
     * 
     */
    public static String WSTCP_1043_CONNECTION_MANAGER_NOTIFY_SESSION_CLOSE(Object arg0) {
        return localizer.localize(localizableWSTCP_1043_CONNECTION_MANAGER_NOTIFY_SESSION_CLOSE(arg0));
    }

    public static Localizable localizableWSTCP_1110_APP_SERV_REG_REGISTER_ENDPOINT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSTCP1110.APP_SERV_REG_REGISTER_ENDPOINT", arg0, arg1, arg2);
    }

    /**
     * WSTCP1110: Register endpoint. ServiceName: {0} path: {1} isEJB: {2}
     * 
     */
    public static String WSTCP_1110_APP_SERV_REG_REGISTER_ENDPOINT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSTCP_1110_APP_SERV_REG_REGISTER_ENDPOINT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSTCP_0025_GENERAL_CHANNEL_ERROR(Object arg0) {
        return messageFactory.getMessage("WSTCP0025.GENERAL_CHANNEL_ERROR", arg0);
    }

    /**
     * WSTCP0025: General channel error. {0}
     * 
     */
    public static String WSTCP_0025_GENERAL_CHANNEL_ERROR(Object arg0) {
        return localizer.localize(localizableWSTCP_0025_GENERAL_CHANNEL_ERROR(arg0));
    }

    public static Localizable localizableWSTCP_0009_UNKNOWN_BINDING(Object arg0) {
        return messageFactory.getMessage("WSTCP0009.UNKNOWN_BINDING", arg0);
    }

    /**
     * WSTCP0009:Unknown WSBinding {0}
     * 
     */
    public static String WSTCP_0009_UNKNOWN_BINDING(Object arg0) {
        return localizer.localize(localizableWSTCP_0009_UNKNOWN_BINDING(arg0));
    }

    public static Localizable localizableWSTCP_1100_WSTCP_DELEGATE_DEREGISTER_ADAPTER(Object arg0) {
        return messageFactory.getMessage("WSTCP1100.WSTCP_DELEGATE_DEREGISTER_ADAPTER", arg0);
    }

    /**
     * WSTCP1100: Deregister adapter. URL: {0}
     * 
     */
    public static String WSTCP_1100_WSTCP_DELEGATE_DEREGISTER_ADAPTER(Object arg0) {
        return localizer.localize(localizableWSTCP_1100_WSTCP_DELEGATE_DEREGISTER_ADAPTER(arg0));
    }

    public static Localizable localizableWSTCP_1003_TCP_SERVICE_TP_PROCESS_TRANSPORT_CREATE() {
        return messageFactory.getMessage("WSTCP1003.TCP_SERVICE_TP_PROCESS_TRANSPORT_CREATE");
    }

    /**
     * WSTCP1003:ServiceChannelTransportPipe.process() create new client transport
     * 
     */
    public static String WSTCP_1003_TCP_SERVICE_TP_PROCESS_TRANSPORT_CREATE() {
        return localizer.localize(localizableWSTCP_1003_TCP_SERVICE_TP_PROCESS_TRANSPORT_CREATE());
    }

    public static Localizable localizableWSTCP_0004_CHECK_SERVER_LOG() {
        return messageFactory.getMessage("WSTCP0004.CHECK_SERVER_LOG");
    }

    /**
     * WSTCP0004:For details check server's log
     * 
     */
    public static String WSTCP_0004_CHECK_SERVER_LOG() {
        return localizer.localize(localizableWSTCP_0004_CHECK_SERVER_LOG());
    }

    public static Localizable localizableWSTCP_1040_CONNECTION_MANAGER_DO_CHECK_VERSION_ENTER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1040.CONNECTION_MANAGER_DO_CHECK_VERSION_ENTER", arg0, arg1);
    }

    /**
     * WSTCP1040:WSConnectionManager.doCheckVersions enter framingVersion: {0} connectionMngmntVersion: {1}
     * 
     */
    public static String WSTCP_1040_CONNECTION_MANAGER_DO_CHECK_VERSION_ENTER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1040_CONNECTION_MANAGER_DO_CHECK_VERSION_ENTER(arg0, arg1));
    }

    public static Localizable localizableWSTCP_0007_TRANSPORT_MODULE_NOT_INITIALIZED() {
        return messageFactory.getMessage("WSTCP0007.TRANSPORT_MODULE_NOT_INITIALIZED");
    }

    /**
     * WSTCP0007:Transport module was not initialized!
     * 
     */
    public static String WSTCP_0007_TRANSPORT_MODULE_NOT_INITIALIZED() {
        return localizer.localize(localizableWSTCP_0007_TRANSPORT_MODULE_NOT_INITIALIZED());
    }

    public static Localizable localizableWSTCP_0017_ERROR_WS_EXECUTION_ON_CLIENT() {
        return messageFactory.getMessage("WSTCP0017.ERROR_WS_EXECUTION_ON_CLIENT");
    }

    /**
     * WSTCP0017:Error executing webservice
     * 
     */
    public static String WSTCP_0017_ERROR_WS_EXECUTION_ON_CLIENT() {
        return localizer.localize(localizableWSTCP_0017_ERROR_WS_EXECUTION_ON_CLIENT());
    }

    public static Localizable localizableWSTCP_0033_CONTENT_NEGOTIATION_FAILED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP0033.CONTENT_NEGOTIATION_FAILED", arg0, arg1);
    }

    /**
     * WSTCP0033: Content negotiation failed for WS Endpoint: {0} .Server supported content: {1}
     * 
     */
    public static String WSTCP_0033_CONTENT_NEGOTIATION_FAILED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_0033_CONTENT_NEGOTIATION_FAILED(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1005_TCP_SERVICE_TP_PROCESS_SEND() {
        return messageFactory.getMessage("WSTCP1005.TCP_SERVICE_TP_PROCESS_SEND");
    }

    /**
     * WSTCP1005:ServiceChannelTransportPipe.process() send
     * 
     */
    public static String WSTCP_1005_TCP_SERVICE_TP_PROCESS_SEND() {
        return localizer.localize(localizableWSTCP_1005_TCP_SERVICE_TP_PROCESS_SEND());
    }

    public static Localizable localizableWSTCP_1142_SOAPTCP_CHANNEL_CLOSE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1142.SOAPTCP_CHANNEL_CLOSE", arg0, arg1);
    }

    /**
     * WSTCP1142: Session: {0}. Channel #{1} was closed
     * 
     */
    public static String WSTCP_1142_SOAPTCP_CHANNEL_CLOSE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1142_SOAPTCP_CHANNEL_CLOSE(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1123_CHANNEL_CONTEXT_DECODED_CT(Object arg0) {
        return messageFactory.getMessage("WSTCP1123.CHANNEL_CONTEXT_DECODED_CT", arg0);
    }

    /**
     * WSTCP1123: Decoded content type: {0}
     * 
     */
    public static String WSTCP_1123_CHANNEL_CONTEXT_DECODED_CT(Object arg0) {
        return localizer.localize(localizableWSTCP_1123_CHANNEL_CONTEXT_DECODED_CT(arg0));
    }

    public static Localizable localizableWSTCP_1060_FRAMED_MESSAGE_IS_READ_HEADER_ENTER() {
        return messageFactory.getMessage("WSTCP1060.FRAMED_MESSAGE_IS_READ_HEADER_ENTER");
    }

    /**
     * WSTCP1060:FramedMessageInputStream.readHeader
     * 
     */
    public static String WSTCP_1060_FRAMED_MESSAGE_IS_READ_HEADER_ENTER() {
        return localizer.localize(localizableWSTCP_1060_FRAMED_MESSAGE_IS_READ_HEADER_ENTER());
    }

    public static Localizable localizableWSTCP_1007_TCP_SERVICE_TP_PROCESS_OPEN_PROCESS_READING(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1007.TCP_SERVICE_TP_PROCESS_OPEN_PROCESS_READING", arg0, arg1);
    }

    /**
     * WSTCP1007:ServiceChannelTransportPipe.process() process reading. Status: {0}, ContentType: {1}
     * 
     */
    public static String WSTCP_1007_TCP_SERVICE_TP_PROCESS_OPEN_PROCESS_READING(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1007_TCP_SERVICE_TP_PROCESS_OPEN_PROCESS_READING(arg0, arg1));
    }

    public static Localizable localizableWSTCP_0002_SERVER_ERROR_MESSAGE_SENDING_FAILED() {
        return messageFactory.getMessage("WSTCP0002.SERVER_ERROR_MESSAGE_SENDING_FAILED");
    }

    /**
     * WSTCP0002:Failed to send error message to client!
     * 
     */
    public static String WSTCP_0002_SERVER_ERROR_MESSAGE_SENDING_FAILED() {
        return localizer.localize(localizableWSTCP_0002_SERVER_ERROR_MESSAGE_SENDING_FAILED());
    }

    public static Localizable localizableWSTCP_1116_APP_SERV_REG_GET_WS_ENDP_PATH_NON_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1116.APP_SERV_REG_GET_WS_ENDP_PATH_NON_EJB", arg0);
    }

    /**
     * WSTCP1116: WebServiceEndpointPath nonEJB WS. Path: {0}
     * 
     */
    public static String WSTCP_1116_APP_SERV_REG_GET_WS_ENDP_PATH_NON_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1116_APP_SERV_REG_GET_WS_ENDP_PATH_NON_EJB(arg0));
    }

    public static Localizable localizableWSTCP_0030_INTERLEAVED_FRAME_SEQ(Object arg0) {
        return messageFactory.getMessage("WSTCP0030.INTERLEAVED_FRAME_SEQ", arg0);
    }

    /**
     * WSTCP0030: Interleaved message frame sequence. {0}
     * 
     */
    public static String WSTCP_0030_INTERLEAVED_FRAME_SEQ(Object arg0) {
        return localizer.localize(localizableWSTCP_0030_INTERLEAVED_FRAME_SEQ(arg0));
    }

    public static Localizable localizableWSTCP_1031_CONNECTION_MANAGER_USE_OPENED_SESSION() {
        return messageFactory.getMessage("WSTCP1031.CONNECTION_MANAGER_USE_OPENED_SESSION");
    }

    /**
     * WSTCP1031:WSConnectionManager.openChannel Use opened session
     * 
     */
    public static String WSTCP_1031_CONNECTION_MANAGER_USE_OPENED_SESSION() {
        return localizer.localize(localizableWSTCP_1031_CONNECTION_MANAGER_USE_OPENED_SESSION());
    }

    public static Localizable localizableWSTCP_1001_TCP_SERVICE_TP_PROCESS_ENTER(Object arg0) {
        return messageFactory.getMessage("WSTCP1001.TCP_SERVICE_TP_PROCESS_ENTER", arg0);
    }

    /**
     * WSTCP1001:ServiceChannelTransportPipe.process() entering. Target URI: {0}
     * 
     */
    public static String WSTCP_1001_TCP_SERVICE_TP_PROCESS_ENTER(Object arg0) {
        return localizer.localize(localizableWSTCP_1001_TCP_SERVICE_TP_PROCESS_ENTER(arg0));
    }

    public static Localizable localizableWSTCP_0031_UNKNOWN_REQ_RESP_PATTERN(Object arg0) {
        return messageFactory.getMessage("WSTCP0031.UNKNOWN_REQ_RESP_PATTERN", arg0);
    }

    /**
     * WSTCP0031: Unknown request/response pattern. {0}
     * 
     */
    public static String WSTCP_0031_UNKNOWN_REQ_RESP_PATTERN(Object arg0) {
        return localizer.localize(localizableWSTCP_0031_UNKNOWN_REQ_RESP_PATTERN(arg0));
    }

    public static Localizable localizableWSTCP_1172_PAUSE_SOAPTCP_LISTENER() {
        return messageFactory.getMessage("WSTCP1172.PAUSE_SOAPTCP_LISTENER");
    }

    /**
     * Pausing SOAP/TCP
     * 
     */
    public static String WSTCP_1172_PAUSE_SOAPTCP_LISTENER() {
        return localizer.localize(localizableWSTCP_1172_PAUSE_SOAPTCP_LISTENER());
    }

    public static Localizable localizableWSTCP_1002_TCP_SERVICE_TP_PROCESS_TRANSPORT_REUSE() {
        return messageFactory.getMessage("WSTCP1002.TCP_SERVICE_TP_PROCESS_TRANSPORT_REUSE");
    }

    /**
     * WSTCP1002:ServiceChannelTransportPipe.process() reuse client transport
     * 
     */
    public static String WSTCP_1002_TCP_SERVICE_TP_PROCESS_TRANSPORT_REUSE() {
        return localizer.localize(localizableWSTCP_1002_TCP_SERVICE_TP_PROCESS_TRANSPORT_REUSE());
    }

    public static Localizable localizableWSTCP_1171_START_SOAPTCP_LISTENER() {
        return messageFactory.getMessage("WSTCP1171.START_SOAPTCP_LISTENER");
    }

    /**
     * Starting SOAP/TCP
     * 
     */
    public static String WSTCP_1171_START_SOAPTCP_LISTENER() {
        return localizer.localize(localizableWSTCP_1171_START_SOAPTCP_LISTENER());
    }

    public static Localizable localizableWSTCP_1084_INCOME_MSG_SERVER_SIDE_CONNECTION_CACHE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1084.INCOME_MSG_SERVER_SIDE_CONNECTION_CACHE", arg0, arg1);
    }

    /**
     * WSTCP1084: SOAP/TCP server side connection cache settings. HighWaterMark: {0}, NumberToReclaim: {1}
     * 
     */
    public static String WSTCP_1084_INCOME_MSG_SERVER_SIDE_CONNECTION_CACHE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1084_INCOME_MSG_SERVER_SIDE_CONNECTION_CACHE(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1016_TCP_TP_PROCESS_OPEN_PROCESS_READING(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1016.TCP_TP_PROCESS_OPEN_PROCESS_READING", arg0, arg1);
    }

    /**
     * WSTCP1016:TCPTransportPipe.process() process reading. Status: {0}, ContentType: {1}
     * 
     */
    public static String WSTCP_1016_TCP_TP_PROCESS_OPEN_PROCESS_READING(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1016_TCP_TP_PROCESS_OPEN_PROCESS_READING(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1094_TCP_ADAPTER_CLOSE() {
        return messageFactory.getMessage("WSTCP1094.TCP_ADAPTER_CLOSE");
    }

    /**
     * WSTCP1094: close() callback method is called. Message in oneway
     * 
     */
    public static String WSTCP_1094_TCP_ADAPTER_CLOSE() {
        return localizer.localize(localizableWSTCP_1094_TCP_ADAPTER_CLOSE());
    }

    public static Localizable localizableWSTCP_1115_APP_SERV_REG_GET_ENDP_URL_PATTERN_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1115.APP_SERV_REG_GET_ENDP_URL_PATTERN_EJB", arg0);
    }

    /**
     * WSTCP1115: EndpointUrlPattern EJB WS. URLPattern: {0}
     * 
     */
    public static String WSTCP_1115_APP_SERV_REG_GET_ENDP_URL_PATTERN_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1115_APP_SERV_REG_GET_ENDP_URL_PATTERN_EJB(arg0));
    }

    public static Localizable localizableWSTCP_1117_APP_SERV_REG_GET_WS_ENDP_PATH_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1117.APP_SERV_REG_GET_WS_ENDP_PATH_EJB", arg0);
    }

    /**
     * WSTCP1117: WebServiceEndpointPath EJB WS. Path: {0}
     * 
     */
    public static String WSTCP_1117_APP_SERV_REG_GET_WS_ENDP_PATH_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1117_APP_SERV_REG_GET_WS_ENDP_PATH_EJB(arg0));
    }

    public static Localizable localizableWSTCP_1030_CONNECTION_MANAGER_ENTER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSTCP1030.CONNECTION_MANAGER_ENTER", arg0, arg1, arg2, arg3);
    }

    /**
     * WSTCP1030:WSConnectionManager.openChannel entering URI: {0}, Service: {1}, Binding: {2}, Codec: {3}
     * 
     */
    public static String WSTCP_1030_CONNECTION_MANAGER_ENTER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSTCP_1030_CONNECTION_MANAGER_ENTER(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSTCP_1081_INCOME_MSG_CREATE_NEW_SESSION() {
        return messageFactory.getMessage("WSTCP1081.INCOME_MSG_CREATE_NEW_SESSION");
    }

    /**
     * WSTCP1081:Create new ConnectionSession
     * 
     */
    public static String WSTCP_1081_INCOME_MSG_CREATE_NEW_SESSION() {
        return localizer.localize(localizableWSTCP_1081_INCOME_MSG_CREATE_NEW_SESSION());
    }

    public static Localizable localizableWSTCP_1174_TOMCAT_SOAPTCP_LISTENER(Object arg0) {
        return messageFactory.getMessage("WSTCP1174.TOMCAT_SOAPTCP_LISTENER", arg0);
    }

    /**
     * Tomcat SOAP/TCP listener on port {0}
     * 
     */
    public static String WSTCP_1174_TOMCAT_SOAPTCP_LISTENER(Object arg0) {
        return localizer.localize(localizableWSTCP_1174_TOMCAT_SOAPTCP_LISTENER(arg0));
    }

    public static Localizable localizableWSTCP_1050_CONNECTION_BUFFERING_IS(Object arg0) {
        return messageFactory.getMessage("WSTCP1050.CONNECTION_BUFFERING_IS", arg0);
    }

    /**
     * WSTCP1050:Connection.prepareForReading Buffering Connection.InputStream. Size: {0}
     * 
     */
    public static String WSTCP_1050_CONNECTION_BUFFERING_IS(Object arg0) {
        return localizer.localize(localizableWSTCP_1050_CONNECTION_BUFFERING_IS(arg0));
    }

    public static Localizable localizableWSTCP_0035_UNKNOWN_CHANNEL_UD(Object arg0) {
        return messageFactory.getMessage("WSTCP0035.UNKNOWN_CHANNEL_UD", arg0);
    }

    /**
     * WSTCP0035: Channel-id {0} doesn't exist!
     * 
     */
    public static String WSTCP_0035_UNKNOWN_CHANNEL_UD(Object arg0) {
        return localizer.localize(localizableWSTCP_0035_UNKNOWN_CHANNEL_UD(arg0));
    }

    public static Localizable localizableWSTCP_1051_CONNECTION_OPEN_TCP_SOCKET(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1051.CONNECTION_OPEN_TCP_SOCKET", arg0, arg1);
    }

    /**
     * WSTCP1051:Connection.create Opening connection host: {0} port: {1}
     * 
     */
    public static String WSTCP_1051_CONNECTION_OPEN_TCP_SOCKET(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1051_CONNECTION_OPEN_TCP_SOCKET(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1114_APP_SERV_REG_GET_ENDP_URL_PATTERN_NON_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1114.APP_SERV_REG_GET_ENDP_URL_PATTERN_NON_EJB", arg0);
    }

    /**
     * WSTCP1114: EndpointUrlPattern nonEJB WS. URLPattern: {0}
     * 
     */
    public static String WSTCP_1114_APP_SERV_REG_GET_ENDP_URL_PATTERN_NON_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1114_APP_SERV_REG_GET_ENDP_URL_PATTERN_NON_EJB(arg0));
    }

    public static Localizable localizableWSTCP_1162_UNSUPPORTED_PORT_ATTRIBUTE() {
        return messageFactory.getMessage("WSTCP1162.UNSUPPORTED_PORT_ATTRIBUTE");
    }

    /**
     * WSTCP1162: SOAP/TCP doesn't have own TCP listener, so the SOAP/TCP runtime is not able to set the valid 'port' attribute. 'Port' attribute is ignored
     * 
     */
    public static String WSTCP_1162_UNSUPPORTED_PORT_ATTRIBUTE() {
        return localizer.localize(localizableWSTCP_1162_UNSUPPORTED_PORT_ATTRIBUTE());
    }

    public static Localizable localizableWSTCP_1105_WSTCP_DELEGATE_DESTROY() {
        return messageFactory.getMessage("WSTCP1105.WSTCP_DELEGATE_DESTROY");
    }

    /**
     * WSTCP1105: destroy
     * 
     */
    public static String WSTCP_1105_WSTCP_DELEGATE_DESTROY() {
        return localizer.localize(localizableWSTCP_1105_WSTCP_DELEGATE_DESTROY());
    }

    public static Localizable localizableWSTCP_0028_UNKNOWN_MESSAGE_ID(Object arg0) {
        return messageFactory.getMessage("WSTCP0028.UNKNOWN_MESSAGE_ID", arg0);
    }

    /**
     * WSTCP0028: Unknown message identifier: {0}
     * 
     */
    public static String WSTCP_0028_UNKNOWN_MESSAGE_ID(Object arg0) {
        return localizer.localize(localizableWSTCP_0028_UNKNOWN_MESSAGE_ID(arg0));
    }

    public static Localizable localizableWSTCP_1150_CON_MNGMNT_SETTINGS_POLICY() {
        return messageFactory.getMessage("WSTCP1150.CON_MNGMNT_SETTINGS_POLICY");
    }

    /**
     * WSTCP1150: Policy based ConnectionManagementSettings holder is taken
     * 
     */
    public static String WSTCP_1150_CON_MNGMNT_SETTINGS_POLICY() {
        return localizer.localize(localizableWSTCP_1150_CON_MNGMNT_SETTINGS_POLICY());
    }

    public static Localizable localizableWSTCP_1160_PORT_ATTR_INVALID_VALUE(Object arg0) {
        return messageFactory.getMessage("WSTCP1160.PORT_ATTR_INVALID_VALUE", arg0);
    }

    /**
     * WSTCP1160: Invalid SOAP/TCP port value: {0}. Value will be set by the runtime
     * 
     */
    public static String WSTCP_1160_PORT_ATTR_INVALID_VALUE(Object arg0) {
        return localizer.localize(localizableWSTCP_1160_PORT_ATTR_INVALID_VALUE(arg0));
    }

    public static Localizable localizableWSTCP_1020_CONNECTION_CACHE_ENTER() {
        return messageFactory.getMessage("WSTCP1020.CONNECTION_CACHE_ENTER");
    }

    /**
     * WSTCP1020:WSConnectionCache.lockConnection entering
     * 
     */
    public static String WSTCP_1020_CONNECTION_CACHE_ENTER() {
        return localizer.localize(localizableWSTCP_1020_CONNECTION_CACHE_ENTER());
    }

    public static Localizable localizableWSTCP_0021_TCP_ADAPTER_UNSUPPORTER_OPERATION() {
        return messageFactory.getMessage("WSTCP0021.TCP_ADAPTER_UNSUPPORTER_OPERATION");
    }

    /**
     * WSTCP0021: Unsupported operation. Codec can not recognize reply message type!
     * 
     */
    public static String WSTCP_0021_TCP_ADAPTER_UNSUPPORTER_OPERATION() {
        return localizer.localize(localizableWSTCP_0021_TCP_ADAPTER_UNSUPPORTER_OPERATION());
    }

    public static Localizable localizableWSTCP_1023_CONNECTION_CACHE_SESSION_ABORTED() {
        return messageFactory.getMessage("WSTCP1023.CONNECTION_CACHE_SESSION_ABORTED");
    }

    /**
     * WSTCP1023:WSConnectionCache.lockConnection session aborted
     * 
     */
    public static String WSTCP_1023_CONNECTION_CACHE_SESSION_ABORTED() {
        return localizer.localize(localizableWSTCP_1023_CONNECTION_CACHE_SESSION_ABORTED());
    }

    public static Localizable localizableWSTCP_1113_APP_SERV_REG_GET_ENDP_CR_EJB(Object arg0) {
        return messageFactory.getMessage("WSTCP1113.APP_SERV_REG_GET_ENDP_CR_EJB", arg0);
    }

    /**
     * WSTCP1113: EndpointContextRoot EJB WS. ContextRoot: {0}
     * 
     */
    public static String WSTCP_1113_APP_SERV_REG_GET_ENDP_CR_EJB(Object arg0) {
        return localizer.localize(localizableWSTCP_1113_APP_SERV_REG_GET_ENDP_CR_EJB(arg0));
    }

    public static Localizable localizableWSTCP_1080_INCOME_MSG_PROC_ENTER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1080.INCOME_MSG_PROC_ENTER", arg0, arg1);
    }

    /**
     * WSTCP1080:Start processing incoming request from host: {0} port: {1}:
     * 
     */
    public static String WSTCP_1080_INCOME_MSG_PROC_ENTER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1080_INCOME_MSG_PROC_ENTER(arg0, arg1));
    }

    public static Localizable localizableWSTCP_1021_CONNECTION_CACHE_SYNC() {
        return messageFactory.getMessage("WSTCP1021.CONNECTION_CACHE_SYNC");
    }

    /**
     * WSTCP1021:WSConnectionCache.lockConnection inside sync
     * 
     */
    public static String WSTCP_1021_CONNECTION_CACHE_SYNC() {
        return localizer.localize(localizableWSTCP_1021_CONNECTION_CACHE_SYNC());
    }

    public static Localizable localizableWSTCP_1122_CHANNEL_CONTEXT_DECODE_CT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSTCP1122.CHANNEL_CONTEXT_DECODE_CT", arg0, arg1);
    }

    /**
     * WSTCP1122: mimeId: {0} params: {1}
     * 
     */
    public static String WSTCP_1122_CHANNEL_CONTEXT_DECODE_CT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSTCP_1122_CHANNEL_CONTEXT_DECODE_CT(arg0, arg1));
    }

}
