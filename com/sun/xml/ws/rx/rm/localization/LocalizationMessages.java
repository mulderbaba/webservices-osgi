
package com.sun.xml.ws.rx.rm.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.rx.rm.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSRM_1008_DUPLICATE_ASSERTION_IN_POLICY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1008_DUPLICATE_ASSERTION_IN_POLICY", arg0, arg1);
    }

    /**
     * WSRM1008: {0} duplicate [ {1} ] policy assertions in a single policy alternative detected
     * 
     */
    public static String WSRM_1008_DUPLICATE_ASSERTION_IN_POLICY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1008_DUPLICATE_ASSERTION_IN_POLICY(arg0, arg1));
    }

    public static Localizable localizableWSRM_1158_WAITING_FOR_SEQ_STATE_CHANGE_INTERRUPTED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1158_WAITING_FOR_SEQ_STATE_CHANGE_INTERRUPTED", arg0, arg1);
    }

    /**
     * WSRM1158: Waiting for sequence [ {0} ] state change to [ {1} ] has been interrupted
     * 
     */
    public static String WSRM_1158_WAITING_FOR_SEQ_STATE_CHANGE_INTERRUPTED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1158_WAITING_FOR_SEQ_STATE_CHANGE_INTERRUPTED(arg0, arg1));
    }

    public static Localizable localizableWSRM_1121_SECURE_CONVERSATION_INIT_FAILED() {
        return messageFactory.getMessage("WSRM1121_SECURE_CONVERSATION_INIT_FAILED");
    }

    /**
     * WSRM1121: Unable to start secure conversation
     * 
     */
    public static String WSRM_1121_SECURE_CONVERSATION_INIT_FAILED() {
        return localizer.localize(localizableWSRM_1121_SECURE_CONVERSATION_INIT_FAILED());
    }

    public static Localizable localizableWSRM_1114_NULL_RESPONSE_ON_PROTOCOL_MESSAGE_REQUEST(Object arg0) {
        return messageFactory.getMessage("WSRM1114_NULL_RESPONSE_ON_PROTOCOL_MESSAGE_REQUEST", arg0);
    }

    /**
     * WSRM1114: Response to {0} request message was 'null'
     * 
     */
    public static String WSRM_1114_NULL_RESPONSE_ON_PROTOCOL_MESSAGE_REQUEST(Object arg0) {
        return localizer.localize(localizableWSRM_1114_NULL_RESPONSE_ON_PROTOCOL_MESSAGE_REQUEST(arg0));
    }

    public static Localizable localizableWSRM_1002_MULTIPLE_WSRM_VERSIONS_IN_POLICY() {
        return messageFactory.getMessage("WSRM1002_MULTIPLE_WSRM_VERSIONS_IN_POLICY");
    }

    /**
     * WSRM1002: Multiple WS-ReliableMessaging Policy versions specified in a single policy alternative.
     * 
     */
    public static String WSRM_1002_MULTIPLE_WSRM_VERSIONS_IN_POLICY() {
        return localizer.localize(localizableWSRM_1002_MULTIPLE_WSRM_VERSIONS_IN_POLICY());
    }

    public static Localizable localizableWSRM_1157_WAITING_FOR_SEQ_STATE_CHANGE_TIMED_OUT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSRM1157_WAITING_FOR_SEQ_STATE_CHANGE_TIMED_OUT", arg0, arg1, arg2);
    }

    /**
     * WSRM1157: Waiting for sequence [ {0} ] state change to [ {1} ] has timed out after {2} milliseconds
     * 
     */
    public static String WSRM_1157_WAITING_FOR_SEQ_STATE_CHANGE_TIMED_OUT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSRM_1157_WAITING_FOR_SEQ_STATE_CHANGE_TIMED_OUT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSRM_1103_RM_SEQUENCE_NOT_TERMINATED_NORMALLY() {
        return messageFactory.getMessage("WSRM1103_RM_SEQUENCE_NOT_TERMINATED_NORMALLY");
    }

    /**
     * WSRM1103: Unable to terminate RM sequence normally due to an unexpected exception
     * 
     */
    public static String WSRM_1103_RM_SEQUENCE_NOT_TERMINATED_NORMALLY() {
        return localizer.localize(localizableWSRM_1103_RM_SEQUENCE_NOT_TERMINATED_NORMALLY());
    }

    public static Localizable localizableWSRM_1159_MAX_MESSAGE_RESEND_ATTEMPTS_REACHED() {
        return messageFactory.getMessage("WSRM1159_MAX_MESSAGE_RESEND_ATTEMPTS_REACHED");
    }

    /**
     * WSRM1159: Maximum number of message resend attempts has been reached.
     * 
     */
    public static String WSRM_1159_MAX_MESSAGE_RESEND_ATTEMPTS_REACHED() {
        return localizer.localize(localizableWSRM_1159_MAX_MESSAGE_RESEND_ATTEMPTS_REACHED());
    }

    public static Localizable localizableWSRM_1133_NO_SECURITY_TOKEN_IN_REQUEST_PACKET() {
        return messageFactory.getMessage("WSRM1133_NO_SECURITY_TOKEN_IN_REQUEST_PACKET");
    }

    /**
     * WSRM1133: No security token found in the request packet
     * 
     */
    public static String WSRM_1133_NO_SECURITY_TOKEN_IN_REQUEST_PACKET() {
        return localizer.localize(localizableWSRM_1133_NO_SECURITY_TOKEN_IN_REQUEST_PACKET());
    }

    public static Localizable localizableWSRM_1134_UNSUPPORTED_PROTOCOL_MESSAGE(Object arg0) {
        return messageFactory.getMessage("WSRM1134_UNSUPPORTED_PROTOCOL_MESSAGE", arg0);
    }

    /**
     * WSRM1134: Internal error - The RM protocol message processing for WS-Addressing action [ {0} ] is not implemented
     * 
     */
    public static String WSRM_1134_UNSUPPORTED_PROTOCOL_MESSAGE(Object arg0) {
        return localizer.localize(localizableWSRM_1134_UNSUPPORTED_PROTOCOL_MESSAGE(arg0));
    }

    public static Localizable localizableWSRM_5001_COULD_NOT_BEGIN_TRANSACTION() {
        return messageFactory.getMessage("WSRM5001_COULD_NOT_BEGIN_TRANSACTION");
    }

    /**
     * WSRM5001: Distributed transaction could not be started. Existing transaction found.
     * 
     */
    public static String WSRM_5001_COULD_NOT_BEGIN_TRANSACTION() {
        return localizer.localize(localizableWSRM_5001_COULD_NOT_BEGIN_TRANSACTION());
    }

    public static Localizable localizableWSRM_1102_RESENDING_DROPPED_MESSAGE() {
        return messageFactory.getMessage("WSRM1102_RESENDING_DROPPED_MESSAGE");
    }

    /**
     * WSRM1102: Resending dropped message
     * 
     */
    public static String WSRM_1102_RESENDING_DROPPED_MESSAGE() {
        return localizer.localize(localizableWSRM_1102_RESENDING_DROPPED_MESSAGE());
    }

    public static Localizable localizableWSRM_1105_SEQUENCE_ID_NOT_RECOGNIZED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1105_SEQUENCE_ID_NOT_RECOGNIZED", arg0, arg1);
    }

    /**
     * WSRM1105: Sequence id in the message header [ {0} ] does not match the expected sequence id bound to this session [ {1} ]
     * 
     */
    public static String WSRM_1105_SEQUENCE_ID_NOT_RECOGNIZED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1105_SEQUENCE_ID_NOT_RECOGNIZED(arg0, arg1));
    }

    public static Localizable localizableWSRM_1138_MESSAGE_NUMBER_ROLLOVER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1138_MESSAGE_NUMBER_ROLLOVER", arg0, arg1);
    }

    /**
     * WSRM1138: The maximum value for a message number on a sequence  [ {0} ] has been exceeded: {1}
     * 
     */
    public static String WSRM_1138_MESSAGE_NUMBER_ROLLOVER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1138_MESSAGE_NUMBER_ROLLOVER(arg0, arg1));
    }

    public static Localizable localizableWSRM_1142_ERROR_CREATING_HA_BACKING_STORE(Object arg0) {
        return messageFactory.getMessage("WSRM1142_ERROR_CREATING_HA_BACKING_STORE", arg0);
    }

    /**
     * WSRM1142: Unable to create [ {0} ] HA backing store.
     * 
     */
    public static String WSRM_1142_ERROR_CREATING_HA_BACKING_STORE(Object arg0) {
        return localizer.localize(localizableWSRM_1142_ERROR_CREATING_HA_BACKING_STORE(arg0));
    }

    public static Localizable localizableWSRM_1108_NULL_RESPONSE_FOR_ACK_REQUEST() {
        return messageFactory.getMessage("WSRM1108_NULL_RESPONSE_FOR_ACK_REQUEST");
    }

    /**
     * WSRM1108: Response for the acknowledgement request is 'null'
     * 
     */
    public static String WSRM_1108_NULL_RESPONSE_FOR_ACK_REQUEST() {
        return localizer.localize(localizableWSRM_1108_NULL_RESPONSE_FOR_ACK_REQUEST());
    }

    public static Localizable localizableWSRM_1140_NO_ADDRESSING_VERSION_ON_ENDPOINT() {
        return messageFactory.getMessage("WSRM1140_NO_ADDRESSING_VERSION_ON_ENDPOINT");
    }

    /**
     * WSRM1140: WS-Addressing not enabled on the service endpoint. In order to use WS-ReliableMessaging, you must enable WS-Addressing feature as well.
     * 
     */
    public static String WSRM_1140_NO_ADDRESSING_VERSION_ON_ENDPOINT() {
        return localizer.localize(localizableWSRM_1140_NO_ADDRESSING_VERSION_ON_ENDPOINT());
    }

    public static Localizable localizableWSRM_1160_DELIVERY_QUEUE_CLOSED() {
        return messageFactory.getMessage("WSRM1160_DELIVERY_QUEUE_CLOSED");
    }

    /**
     * WSRM1160: Sequence delivery queue has been closed
     * 
     */
    public static String WSRM_1160_DELIVERY_QUEUE_CLOSED() {
        return localizer.localize(localizableWSRM_1160_DELIVERY_QUEUE_CLOSED());
    }

    public static Localizable localizableWSRM_1112_WAITING_FOR_SEQ_ACKS_TIMED_OUT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1112_WAITING_FOR_SEQ_ACKS_TIMED_OUT", arg0, arg1);
    }

    /**
     * WSRM1112: Waiting for message acknowledgements on a sequence [ {0} ] timed out after {1} milliseconds.
     * 
     */
    public static String WSRM_1112_WAITING_FOR_SEQ_ACKS_TIMED_OUT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1112_WAITING_FOR_SEQ_ACKS_TIMED_OUT(arg0, arg1));
    }

    public static Localizable localizableWSRM_1003_MUTLIPLE_DA_TYPES_IN_POLICY() {
        return messageFactory.getMessage("WSRM1003_MUTLIPLE_DA_TYPES_IN_POLICY");
    }

    /**
     * WSRM1003: Inconsistent RM policy - multiple delivery assurance types specified.
     * 
     */
    public static String WSRM_1003_MUTLIPLE_DA_TYPES_IN_POLICY() {
        return localizer.localize(localizableWSRM_1003_MUTLIPLE_DA_TYPES_IN_POLICY());
    }

    public static Localizable localizableWSRM_5003_RECEIVED_WSRM_FAULT_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSRM5003_RECEIVED_WSRM_FAULT_RESPONSE", arg0);
    }

    /**
     * WSRM5003: Received WS-RM fault response. Fault action is: [ {0} ]
     * 
     */
    public static String WSRM_5003_RECEIVED_WSRM_FAULT_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSRM_5003_RECEIVED_WSRM_FAULT_RESPONSE(arg0));
    }

    public static Localizable localizableWSRM_1001_ASSERTION_NOT_COMPATIBLE_WITH_RM_VERSION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1001_ASSERTION_NOT_COMPATIBLE_WITH_RM_VERSION", arg0, arg1);
    }

    /**
     * WSRM1001: Assertion [ {0} ] is not compatible with [ {1} ] WS-RM version
     * 
     */
    public static String WSRM_1001_ASSERTION_NOT_COMPATIBLE_WITH_RM_VERSION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1001_ASSERTION_NOT_COMPATIBLE_WITH_RM_VERSION(arg0, arg1));
    }

    public static Localizable localizableWSRM_1129_INVALID_VALUE_OF_MESSAGE_HEADER(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSRM1129_INVALID_VALUE_OF_MESSAGE_HEADER", arg0, arg1, arg2);
    }

    /**
     * WSRM1129: Invalid value of "{0}" header on "{1}" message: [ {2} ]
     * 
     */
    public static String WSRM_1129_INVALID_VALUE_OF_MESSAGE_HEADER(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSRM_1129_INVALID_VALUE_OF_MESSAGE_HEADER(arg0, arg1, arg2));
    }

    public static Localizable localizableWSRM_1124_NO_SUCH_SEQUENCE_ID_REGISTERED(Object arg0) {
        return messageFactory.getMessage("WSRM1124_NO_SUCH_SEQUENCE_ID_REGISTERED", arg0);
    }

    /**
     * WSRM1124: No sequence registered with id [ {0} ]
     * 
     */
    public static String WSRM_1124_NO_SUCH_SEQUENCE_ID_REGISTERED(Object arg0) {
        return localizer.localize(localizableWSRM_1124_NO_SUCH_SEQUENCE_ID_REGISTERED(arg0));
    }

    public static Localizable localizableWSRM_4005_SEQUENCE_TOSTRING_STRING(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSRM4005_SEQUENCE_TOSTRING_STRING", arg0, arg1, arg2);
    }

    /**
     * WSRM4005: SequenceElement:
     * 	id = {0}
     * 	number = {1}
     * 	last = {2}
     * 
     */
    public static String WSRM_4005_SEQUENCE_TOSTRING_STRING(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSRM_4005_SEQUENCE_TOSTRING_STRING(arg0, arg1, arg2));
    }

    public static Localizable localizableWSRM_1004_EXPECTED_DA_NOT_SPECIFIED_IN_POLICY() {
        return messageFactory.getMessage("WSRM1004_EXPECTED_DA_NOT_SPECIFIED_IN_POLICY");
    }

    /**
     * WSRM1004: Inconsistent RM policy - expected delivery assurance not specified in RM1.1 assertion.
     * 
     */
    public static String WSRM_1004_EXPECTED_DA_NOT_SPECIFIED_IN_POLICY() {
        return localizer.localize(localizableWSRM_1004_EXPECTED_DA_NOT_SPECIFIED_IN_POLICY());
    }

    public static Localizable localizableWSRM_4004_SEQUENCE_ACKNOWLEDGEMENT_TOSTRING_STRING(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM4004_SEQUENCE_ACKNOWLEDGEMENT_TOSTRING_STRING", arg0, arg1);
    }

    /**
     * WSRM4004: SequenceAcknowledgement:
     * 	id = {0}
     * 	Ranges:
     * 	bufferRemaining = {1}
     * 
     * 
     */
    public static String WSRM_4004_SEQUENCE_ACKNOWLEDGEMENT_TOSTRING_STRING(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_4004_SEQUENCE_ACKNOWLEDGEMENT_TOSTRING_STRING(arg0, arg1));
    }

    public static Localizable localizableWSRM_1115_PROTOCOL_MESSAGE_REQUEST_REFUSED(Object arg0) {
        return messageFactory.getMessage("WSRM1115_PROTOCOL_MESSAGE_REQUEST_REFUSED", arg0);
    }

    /**
     * WSRM1115: {0} was refused by the RMDestination
     * 
     */
    public static String WSRM_1115_PROTOCOL_MESSAGE_REQUEST_REFUSED(Object arg0) {
        return localizer.localize(localizableWSRM_1115_PROTOCOL_MESSAGE_REQUEST_REFUSED(arg0));
    }

    public static Localizable localizableWSRM_1128_MAX_RM_SESSION_CONTROL_MESSAGE_RESEND_ATTEMPTS_REACHED(Object arg0) {
        return messageFactory.getMessage("WSRM1128_MAX_RM_SESSION_CONTROL_MESSAGE_RESEND_ATTEMPTS_REACHED", arg0);
    }

    /**
     * "WSRM1128: Failed to send a [ {0} ] RM session control message: Maximum number of resend attempts has been reached."
     * 
     */
    public static String WSRM_1128_MAX_RM_SESSION_CONTROL_MESSAGE_RESEND_ATTEMPTS_REACHED(Object arg0) {
        return localizer.localize(localizableWSRM_1128_MAX_RM_SESSION_CONTROL_MESSAGE_RESEND_ATTEMPTS_REACHED(arg0));
    }

    public static Localizable localizableWSRM_1117_UNEXPECTED_SEQUENCE_ID_IN_TERMINATE_SR(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1117_UNEXPECTED_SEQUENCE_ID_IN_TERMINATE_SR", arg0, arg1);
    }

    /**
     * WSRM1117: The sequence identifier in the terminate sequence response message [ {0} ] does not correspond to the terminating outbound sequence identifier [ {1} ]
     * 
     */
    public static String WSRM_1117_UNEXPECTED_SEQUENCE_ID_IN_TERMINATE_SR(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1117_UNEXPECTED_SEQUENCE_ID_IN_TERMINATE_SR(arg0, arg1));
    }

    public static Localizable localizableWSRM_1147_ADDING_MSG_TO_QUEUE_INTERRUPTED() {
        return messageFactory.getMessage("WSRM1147_ADDING_MSG_TO_QUEUE_INTERRUPTED");
    }

    /**
     * WSRM1147: Operation of adding a message to an internal message queue was interrupted
     * 
     */
    public static String WSRM_1147_ADDING_MSG_TO_QUEUE_INTERRUPTED() {
        return localizer.localize(localizableWSRM_1147_ADDING_MSG_TO_QUEUE_INTERRUPTED());
    }

    public static Localizable localizableWSRM_1153_TERMINATING_SEQUENCE(Object arg0) {
        return messageFactory.getMessage("WSRM1153_TERMINATING_SEQUENCE", arg0);
    }

    /**
     * WSRM1153: Terminating sequence [ {0} ]
     * 
     */
    public static String WSRM_1153_TERMINATING_SEQUENCE(Object arg0) {
        return localizer.localize(localizableWSRM_1153_TERMINATING_SEQUENCE(arg0));
    }

    public static Localizable localizableWSRM_1110_ACK_REQUEST_FAILED() {
        return messageFactory.getMessage("WSRM1110_ACK_REQUEST_FAILED");
    }

    /**
     * WSRM1110: Acknowledgement request failed
     * 
     */
    public static String WSRM_1110_ACK_REQUEST_FAILED() {
        return localizer.localize(localizableWSRM_1110_ACK_REQUEST_FAILED());
    }

    public static Localizable localizableWSRM_1006_MULTIPLE_BUFFER_SIZES_IN_POLICY() {
        return messageFactory.getMessage("WSRM1006_MULTIPLE_BUFFER_SIZES_IN_POLICY");
    }

    /**
     * WSRM1006: Inconsistent RM policy - multiple flow control buffer sizes specified.
     * 
     */
    public static String WSRM_1006_MULTIPLE_BUFFER_SIZES_IN_POLICY() {
        return localizer.localize(localizableWSRM_1006_MULTIPLE_BUFFER_SIZES_IN_POLICY());
    }

    public static Localizable localizableWSRM_1123_ERROR_UNMARSHALLING_MESSAGE() {
        return messageFactory.getMessage("WSRM1123_ERROR_UNMARSHALLING_MESSAGE");
    }

    /**
     * WSRM1123: Unable to unmarshall a message
     * 
     */
    public static String WSRM_1123_ERROR_UNMARSHALLING_MESSAGE() {
        return localizer.localize(localizableWSRM_1123_ERROR_UNMARSHALLING_MESSAGE());
    }

    public static Localizable localizableWSRM_1132_SECURITY_REFERENCE_ERROR(Object arg0) {
        return messageFactory.getMessage("WSRM1132_SECURITY_REFERENCE_ERROR", arg0);
    }

    /**
     * WSRM1132: Cannot handle the Reference from the SecurityToken reference; class name {0}
     * 
     */
    public static String WSRM_1132_SECURITY_REFERENCE_ERROR(Object arg0) {
        return localizer.localize(localizableWSRM_1132_SECURITY_REFERENCE_ERROR(arg0));
    }

    public static Localizable localizableWSRM_1116_ACKS_TO_NOT_EQUAL_TO_ENDPOINT_DESTINATION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1116_ACKS_TO_NOT_EQUAL_TO_ENDPOINT_DESTINATION", arg0, arg1);
    }

    /**
     * WSRM1116: Unsupported "AcksTo" destination. Inbound sequence "AcksTo" destination [ {0} ] must be the same as the service endpoint destination [ {1} ]
     * 
     */
    public static String WSRM_1116_ACKS_TO_NOT_EQUAL_TO_ENDPOINT_DESTINATION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1116_ACKS_TO_NOT_EQUAL_TO_ENDPOINT_DESTINATION(arg0, arg1));
    }

    public static Localizable localizableWSRM_1125_ILLEGAL_MESSAGE_ID(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1125_ILLEGAL_MESSAGE_ID", arg0, arg1);
    }

    /**
     * WSRM1125: "Message number [ {1} ] not found among the unacknowledged message numbers on a sequence [ {0} ]."
     * 
     */
    public static String WSRM_1125_ILLEGAL_MESSAGE_ID(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1125_ILLEGAL_MESSAGE_ID(arg0, arg1));
    }

    public static Localizable localizableWSRM_1154_UNEXPECTED_CLASS_OF_JNDI_BOUND_OBJECT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSRM1154_UNEXPECTED_CLASS_OF_JNDI_BOUND_OBJECT", arg0, arg1, arg2);
    }

    /**
     * WSRM1154: Object of class [ {0} ] bound in the JNDI under [ {1} ] is not an instance of [ {2} ]
     * 
     */
    public static String WSRM_1154_UNEXPECTED_CLASS_OF_JNDI_BOUND_OBJECT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSRM_1154_UNEXPECTED_CLASS_OF_JNDI_BOUND_OBJECT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSRM_4002_BOTH_ACKS_AND_NACKS_MESSAGE() {
        return messageFactory.getMessage("WSRM4002_BOTH_ACKS_AND_NACKS_MESSAGE");
    }

    /**
     * WSRM4002: A SequenceAcknowledgement cannot contain both AcknowledgementRanges and NACKS.
     * 
     */
    public static String WSRM_4002_BOTH_ACKS_AND_NACKS_MESSAGE() {
        return localizer.localize(localizableWSRM_4002_BOTH_ACKS_AND_NACKS_MESSAGE());
    }

    public static Localizable localizableWSRM_1145_DUPLICATE_MSG_NUMBER_RECEIVED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1145_DUPLICATE_MSG_NUMBER_RECEIVED", arg0, arg1);
    }

    /**
     * WSRM1145: Duplicate message number [ {0} ] received on sequence [ {1} ]
     * 
     */
    public static String WSRM_1145_DUPLICATE_MSG_NUMBER_RECEIVED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1145_DUPLICATE_MSG_NUMBER_RECEIVED(arg0, arg1));
    }

    public static Localizable localizableWSRM_1009_INCONSISTENCIES_IN_POLICY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1009_INCONSISTENCIES_IN_POLICY", arg0, arg1);
    }

    /**
     * WSRM1009: Inconsistency detected in a WS-Policy expression:
     *  [ {0} ] assertion is not compatible with WS-ReliableMessaging version [ {1} ].
     *  Please, update your WS-Policy expression by replacing current assertion with the assertions compatible with the used WS-ReliableMessaging version. Note that future Metro release may decide reject such inconsistent policies and fail to deploy your web service.
     * 
     */
    public static String WSRM_1009_INCONSISTENCIES_IN_POLICY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1009_INCONSISTENCIES_IN_POLICY(arg0, arg1));
    }

    public static Localizable localizableWSRM_1156_MAX_CONCURRENT_SESSIONS_REACHED(Object arg0) {
        return messageFactory.getMessage("WSRM1156_MAX_CONCURRENT_SESSIONS_REACHED", arg0);
    }

    /**
     * WSRM1156: Unable to create new Reliable Messaging sequence - maximum number ( {0} ) of concurrently opened Reliable Messaging sessions has been reached.
     * 
     */
    public static String WSRM_1156_MAX_CONCURRENT_SESSIONS_REACHED(Object arg0) {
        return localizer.localize(localizableWSRM_1156_MAX_CONCURRENT_SESSIONS_REACHED(arg0));
    }

    public static Localizable localizableWSRM_1139_NO_OUTBOUND_SEQUENCE_FOR_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSRM1139_NO_OUTBOUND_SEQUENCE_FOR_RESPONSE", arg0);
    }

    /**
     * WSRM1139: Unable to send response reliably - no outbound sequence bound to an inbound sequence [ {0} ]
     * 
     */
    public static String WSRM_1139_NO_OUTBOUND_SEQUENCE_FOR_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSRM_1139_NO_OUTBOUND_SEQUENCE_FOR_RESPONSE(arg0));
    }

    public static Localizable localizableWSRM_1118_MANDATORY_HEADER_NOT_PRESENT(Object arg0) {
        return messageFactory.getMessage("WSRM1118_MANDATORY_HEADER_NOT_PRESENT", arg0);
    }

    /**
     * WSRM1118: Mandatory {0} header not present on the response message
     * 
     */
    public static String WSRM_1118_MANDATORY_HEADER_NOT_PRESENT(Object arg0) {
        return localizer.localize(localizableWSRM_1118_MANDATORY_HEADER_NOT_PRESENT(arg0));
    }

    public static Localizable localizableWSRM_1122_ERROR_MARSHALLING_RM_HEADER(Object arg0) {
        return messageFactory.getMessage("WSRM1122_ERROR_MARSHALLING_RM_HEADER", arg0);
    }

    /**
     * WSRM1122: Unable to unmarshall RM header [ {0} ]
     * 
     */
    public static String WSRM_1122_ERROR_MARSHALLING_RM_HEADER(Object arg0) {
        return localizer.localize(localizableWSRM_1122_ERROR_MARSHALLING_RM_HEADER(arg0));
    }

    public static Localizable localizableWSRM_1120_RESPONSE_NOT_IDENTIFIED_AS_PROTOCOL_MESSAGE() {
        return messageFactory.getMessage("WSRM1120_RESPONSE_NOT_IDENTIFIED_AS_PROTOCOL_MESSAGE");
    }

    /**
     * WSRM1120: Unable to process response packet - the packet was not identified as an RM protocol message
     * 
     */
    public static String WSRM_1120_RESPONSE_NOT_IDENTIFIED_AS_PROTOCOL_MESSAGE() {
        return localizer.localize(localizableWSRM_1120_RESPONSE_NOT_IDENTIFIED_AS_PROTOCOL_MESSAGE());
    }

    public static Localizable localizableWSRM_1127_UNEXPECTED_EXCEPTION_WHEN_SENDING_ACK_REQUEST() {
        return messageFactory.getMessage("WSRM1127_UNEXPECTED_EXCEPTION_WHEN_SENDING_ACK_REQUEST");
    }

    /**
     * WSRM1127: An unexpected exception occured while sending acknowledgement request
     * 
     */
    public static String WSRM_1127_UNEXPECTED_EXCEPTION_WHEN_SENDING_ACK_REQUEST() {
        return localizer.localize(localizableWSRM_1127_UNEXPECTED_EXCEPTION_WHEN_SENDING_ACK_REQUEST());
    }

    public static Localizable localizableWSRM_1136_WRONG_SEQUENCE_STATE_MESSAGE_REGISTRATION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1136_WRONG_SEQUENCE_STATE_MESSAGE_REGISTRATION", arg0, arg1);
    }

    /**
     * WSRM1136: The sequence [ {0} ] is in state [ {1} ] and is not ready to register messages
     * 
     */
    public static String WSRM_1136_WRONG_SEQUENCE_STATE_MESSAGE_REGISTRATION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1136_WRONG_SEQUENCE_STATE_MESSAGE_REGISTRATION(arg0, arg1));
    }

    public static Localizable localizableWSRM_1104_RM_VERSION_NOT_SUPPORTED(Object arg0) {
        return messageFactory.getMessage("WSRM1104_RM_VERSION_NOT_SUPPORTED", arg0);
    }

    /**
     * WSRM1104: Unsupported WS-ReliableMessaging version [ {0} ]
     * 
     */
    public static String WSRM_1104_RM_VERSION_NOT_SUPPORTED(Object arg0) {
        return localizer.localize(localizableWSRM_1104_RM_VERSION_NOT_SUPPORTED(arg0));
    }

    public static Localizable localizableWSRM_5002_CLIENTTUBE_PROCESSING_CANNNOT_HAVE_TRANSACTION() {
        return messageFactory.getMessage("WSRM5002_CLIENTTUBE_PROCESSING_CANNNOT_HAVE_TRANSACTION");
    }

    /**
     * WSRM5002: ClientTube message processing cannot be part of a distributed transaction.
     * 
     */
    public static String WSRM_5002_CLIENTTUBE_PROCESSING_CANNNOT_HAVE_TRANSACTION() {
        return localizer.localize(localizableWSRM_5002_CLIENTTUBE_PROCESSING_CANNNOT_HAVE_TRANSACTION());
    }

    public static Localizable localizableWSRM_1149_DIFFERENT_MSG_SEQUENCE_ID(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1149_DIFFERENT_MSG_SEQUENCE_ID", arg0, arg1);
    }

    /**
     * WSRM1149: Cannot register message: Sequence identifier on the application message [ {0} ] is different from the identifier of this sequence [ {1} ]
     * 
     */
    public static String WSRM_1149_DIFFERENT_MSG_SEQUENCE_ID(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1149_DIFFERENT_MSG_SEQUENCE_ID(arg0, arg1));
    }

    public static Localizable localizableWSRM_1113_WAITING_FOR_SEQ_ACKS_INTERRUPTED(Object arg0) {
        return messageFactory.getMessage("WSRM1113_WAITING_FOR_SEQ_ACKS_INTERRUPTED", arg0);
    }

    /**
     * WSRM1113: Waiting for message acknowledgements on a sequence [ {0} ] has been interrupted
     * 
     */
    public static String WSRM_1113_WAITING_FOR_SEQ_ACKS_INTERRUPTED(Object arg0) {
        return localizer.localize(localizableWSRM_1113_WAITING_FOR_SEQ_ACKS_INTERRUPTED(arg0));
    }

    public static Localizable localizableWSRM_1151_TERMINATING_SEQUENCE_MAINTENANCE_TASK(Object arg0) {
        return messageFactory.getMessage("WSRM1151_TERMINATING_SEQUENCE_MAINTENANCE_TASK", arg0);
    }

    /**
     * WSRM1151: Terminating sequence maintenance task for an endpoint UID [ {0} ]: Sequence manager instance has been garbage-collected
     * 
     */
    public static String WSRM_1151_TERMINATING_SEQUENCE_MAINTENANCE_TASK(Object arg0) {
        return localizer.localize(localizableWSRM_1151_TERMINATING_SEQUENCE_MAINTENANCE_TASK(arg0));
    }

    public static Localizable localizableWSRM_1150_UNABLE_TO_RESCHEDULE_SEQUENCE_MAINTENANCE_TASK(Object arg0) {
        return messageFactory.getMessage("WSRM1150_UNABLE_TO_RESCHEDULE_SEQUENCE_MAINTENANCE_TASK", arg0);
    }

    /**
     * WSRM1150: Unable to re-schedule the sequence maintenance task for an endpoint UID [ {0} ]
     * 
     */
    public static String WSRM_1150_UNABLE_TO_RESCHEDULE_SEQUENCE_MAINTENANCE_TASK(Object arg0) {
        return localizer.localize(localizableWSRM_1150_UNABLE_TO_RESCHEDULE_SEQUENCE_MAINTENANCE_TASK(arg0));
    }

    public static Localizable localizableWSRM_1131_SECURITY_TOKEN_AUTHORIZATION_ERROR(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1131_SECURITY_TOKEN_AUTHORIZATION_ERROR", arg0, arg1);
    }

    /**
     * WSRM1131: SecurityToken Authorization error Got {0} Expected {1}
     * 
     */
    public static String WSRM_1131_SECURITY_TOKEN_AUTHORIZATION_ERROR(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1131_SECURITY_TOKEN_AUTHORIZATION_ERROR(arg0, arg1));
    }

    public static Localizable localizableWSRM_1155_RM_JDBC_CONNECTION_POOL_NOT_FOUND() {
        return messageFactory.getMessage("WSRM1155_RM_JDBC_CONNECTION_POOL_NOT_FOUND");
    }

    /**
     * WSRM1155: Unable to lookup Metro reliable messaging JDBC connection pool
     * 
     */
    public static String WSRM_1155_RM_JDBC_CONNECTION_POOL_NOT_FOUND() {
        return localizer.localize(localizableWSRM_1155_RM_JDBC_CONNECTION_POOL_NOT_FOUND());
    }

    public static Localizable localizableWSRM_1005_MULTIPLE_SECURITY_BINDINGS_IN_POLICY() {
        return messageFactory.getMessage("WSRM1005_MULTIPLE_SECURITY_BINDINGS_IN_POLICY");
    }

    /**
     * WSRM1005: Inconsistent RM policy - multiple security binding types specified.
     * 
     */
    public static String WSRM_1005_MULTIPLE_SECURITY_BINDINGS_IN_POLICY() {
        return localizer.localize(localizableWSRM_1005_MULTIPLE_SECURITY_BINDINGS_IN_POLICY());
    }

    public static Localizable localizableWSRM_1141_UNEXPECTED_MESSAGE_CLASS(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1141_UNEXPECTED_MESSAGE_CLASS", arg0, arg1);
    }

    /**
     * WSRM1141: Unexpected message class [ {0} ], expected class [ {1} ]
     * 
     */
    public static String WSRM_1141_UNEXPECTED_MESSAGE_CLASS(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1141_UNEXPECTED_MESSAGE_CLASS(arg0, arg1));
    }

    public static Localizable localizableWSRM_1137_OFFERED_ID_ALREADY_IN_USE(Object arg0) {
        return messageFactory.getMessage("WSRM1137_OFFERED_ID_ALREADY_IN_USE", arg0);
    }

    /**
     * WSRM1137: The offered sequence identifier [ {0} ] is already in use
     * 
     */
    public static String WSRM_1137_OFFERED_ID_ALREADY_IN_USE(Object arg0) {
        return localizer.localize(localizableWSRM_1137_OFFERED_ID_ALREADY_IN_USE(arg0));
    }

    public static Localizable localizableWSRM_1106_SENDING_RM_SESSION_CONTROL_MESSAGE_FAILED(Object arg0) {
        return messageFactory.getMessage("WSRM1106_SENDING_RM_SESSION_CONTROL_MESSAGE_FAILED", arg0);
    }

    /**
     * WSRM1106: Attempt to send a [ {0} ] RM session control message failed with an exception
     * 
     */
    public static String WSRM_1106_SENDING_RM_SESSION_CONTROL_MESSAGE_FAILED(Object arg0) {
        return localizer.localize(localizableWSRM_1106_SENDING_RM_SESSION_CONTROL_MESSAGE_FAILED(arg0));
    }

    public static Localizable localizableWSRM_1148_DUPLICATE_MSG_NUMBER_REGISTRATION_ATTEMPTED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1148_DUPLICATE_MSG_NUMBER_REGISTRATION_ATTEMPTED", arg0, arg1);
    }

    /**
     * WSRM1148: Attempt to register a duplicate message number [ {0} ] detected on the sequence [ {1} ]
     * 
     */
    public static String WSRM_1148_DUPLICATE_MSG_NUMBER_REGISTRATION_ATTEMPTED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1148_DUPLICATE_MSG_NUMBER_REGISTRATION_ATTEMPTED(arg0, arg1));
    }

    public static Localizable localizableWSRM_4003_UPPERBOUND_LESSTHAN_LOWERBOUND_MESSAGE() {
        return messageFactory.getMessage("WSRM4003_UPPERBOUND_LESSTHAN_LOWERBOUND_MESSAGE");
    }

    /**
     * WSRM4003: The Upper Bound of a SequenceAcknowledgement range is less than the Lower Bound.      
     * 
     */
    public static String WSRM_4003_UPPERBOUND_LESSTHAN_LOWERBOUND_MESSAGE() {
        return localizer.localize(localizableWSRM_4003_UPPERBOUND_LESSTHAN_LOWERBOUND_MESSAGE());
    }

    public static Localizable localizableWSRM_1126_DUPLICATE_SEQUENCE_ID(Object arg0) {
        return messageFactory.getMessage("WSRM1126_DUPLICATE_SEQUENCE_ID", arg0);
    }

    /**
     * WSRM1126: Sequence with id [ {0} ] already registered.
     * 
     */
    public static String WSRM_1126_DUPLICATE_SEQUENCE_ID(Object arg0) {
        return localizer.localize(localizableWSRM_1126_DUPLICATE_SEQUENCE_ID(arg0));
    }

    public static Localizable localizableWSRM_1107_MAX_RM_SESSION_INIT_ATTEMPTS_REACHED() {
        return messageFactory.getMessage("WSRM1107_MAX_RM_SESSION_INIT_ATTEMPTS_REACHED");
    }

    /**
     * WSRM1107: Unable to initiate RM Session - maximum attempts to initiate RM session reached
     * 
     */
    public static String WSRM_1107_MAX_RM_SESSION_INIT_ATTEMPTS_REACHED() {
        return localizer.localize(localizableWSRM_1107_MAX_RM_SESSION_INIT_ATTEMPTS_REACHED());
    }

    public static Localizable localizableWSRM_1111_WAITING_FOR_SEQ_ACKS_UNEXPECTED_EXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSRM1111_WAITING_FOR_SEQ_ACKS_UNEXPECTED_EXCEPTION", arg0);
    }

    /**
     * WSRM1111: Unexpected exception occured while waiting for message acknowledgements on a sequence [ {0} ]
     * 
     */
    public static String WSRM_1111_WAITING_FOR_SEQ_ACKS_UNEXPECTED_EXCEPTION(Object arg0) {
        return localizer.localize(localizableWSRM_1111_WAITING_FOR_SEQ_ACKS_UNEXPECTED_EXCEPTION(arg0));
    }

    public static Localizable localizableWSRM_1101_UNSUPPORTED_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSRM1101_UNSUPPORTED_OPERATION", arg0);
    }

    /**
     * WSRM1101: This operation is not supported in [ {0} ] implementation
     * 
     */
    public static String WSRM_1101_UNSUPPORTED_OPERATION(Object arg0) {
        return localizer.localize(localizableWSRM_1101_UNSUPPORTED_OPERATION(arg0));
    }

    public static Localizable localizableWSRM_1109_SOAP_FAULT_RESPONSE_FOR_ACK_REQUEST() {
        return messageFactory.getMessage("WSRM1109_SOAP_FAULT_RESPONSE_FOR_ACK_REQUEST");
    }

    /**
     * WSRM1109: Acknowledgement request ended in a SOAP fault
     * 
     */
    public static String WSRM_1109_SOAP_FAULT_RESPONSE_FOR_ACK_REQUEST() {
        return localizer.localize(localizableWSRM_1109_SOAP_FAULT_RESPONSE_FOR_ACK_REQUEST());
    }

    public static Localizable localizableWSRM_1119_UNEXPECTED_SEQUENCE_ID_IN_CLOSE_SR(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1119_UNEXPECTED_SEQUENCE_ID_IN_CLOSE_SR", arg0, arg1);
    }

    /**
     * WSRM1119: The sequence identifier in the close sequence response message [ {0} ] does not correspond to the closing outbound sequence identifier [ {1} ]
     * 
     */
    public static String WSRM_1119_UNEXPECTED_SEQUENCE_ID_IN_CLOSE_SR(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1119_UNEXPECTED_SEQUENCE_ID_IN_CLOSE_SR(arg0, arg1));
    }

    public static Localizable localizableWSRM_1007_MULTIPLE_OCCURENCES_OF_ASSERTION_PARAMETER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1007_MULTIPLE_OCCURENCES_OF_ASSERTION_PARAMETER", arg0, arg1);
    }

    /**
     * WSRM1007: Multiple occurences of assertion parameter [ {0} ] detected in the policy assertion [ {1} ]
     * 
     */
    public static String WSRM_1007_MULTIPLE_OCCURENCES_OF_ASSERTION_PARAMETER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1007_MULTIPLE_OCCURENCES_OF_ASSERTION_PARAMETER(arg0, arg1));
    }

    public static Localizable localizableWSRM_1152_REMOVING_SEQUENCE(Object arg0) {
        return messageFactory.getMessage("WSRM1152_REMOVING_SEQUENCE", arg0);
    }

    /**
     * WSRM1152: Removing sequence [ {0} ]
     * 
     */
    public static String WSRM_1152_REMOVING_SEQUENCE(Object arg0) {
        return localizer.localize(localizableWSRM_1152_REMOVING_SEQUENCE(arg0));
    }

    public static Localizable localizableWSRM_1130_MISSING_MESSAGE_HEADER(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSRM1130_MISSING_MESSAGE_HEADER", arg0, arg1, arg2);
    }

    /**
     * WSRM1130: Missing "{0}" header on "{1}" message: [ {2} ]
     * 
     */
    public static String WSRM_1130_MISSING_MESSAGE_HEADER(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSRM_1130_MISSING_MESSAGE_HEADER(arg0, arg1, arg2));
    }

    public static Localizable localizableWSRM_1146_UNEXPECTED_ERROR_WHILE_REGISTERING_MESSAGE() {
        return messageFactory.getMessage("WSRM1146_UNEXPECTED_ERROR_WHILE_REGISTERING_MESSAGE");
    }

    /**
     * WSRM1146: Unexpected exception while registering message
     * 
     */
    public static String WSRM_1146_UNEXPECTED_ERROR_WHILE_REGISTERING_MESSAGE() {
        return localizer.localize(localizableWSRM_1146_UNEXPECTED_ERROR_WHILE_REGISTERING_MESSAGE());
    }

    public static Localizable localizableWSRM_1135_WRONG_SEQUENCE_STATE_ACKNOWLEDGEMENT_REJECTED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSRM1135_WRONG_SEQUENCE_STATE_ACKNOWLEDGEMENT_REJECTED", arg0, arg1);
    }

    /**
     * WSRM1135: The sequence [ {0} ] is in state [ {1} ] and does not accept further acknowledgements
     * 
     */
    public static String WSRM_1135_WRONG_SEQUENCE_STATE_ACKNOWLEDGEMENT_REJECTED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSRM_1135_WRONG_SEQUENCE_STATE_ACKNOWLEDGEMENT_REJECTED(arg0, arg1));
    }

}
