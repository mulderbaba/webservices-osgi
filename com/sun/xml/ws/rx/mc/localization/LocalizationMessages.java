
package com.sun.xml.ws.rx.mc.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.rx.mc.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSMC_0114_ERROR_UNMARSHALLING_SOAP_FAULT() {
        return messageFactory.getMessage("WSMC0114_ERROR_UNMARSHALLING_SOAP_FAULT");
    }

    /**
     * WSMC0114: Unable to unmarshall SOAP fault from the SOAP message.
     * 
     */
    public static String WSMC_0114_ERROR_UNMARSHALLING_SOAP_FAULT() {
        return localizer.localize(localizableWSMC_0114_ERROR_UNMARSHALLING_SOAP_FAULT());
    }

    public static Localizable localizableWSMC_0121_FAILED_TO_SEND_WSMC_REQUEST() {
        return messageFactory.getMessage("WSMC0121_FAILED_TO_SEND_WSMC_REQUEST");
    }

    /**
     * WSMC0121: Sending WS-MakeConnection request failed. Resuming all suspended fibers with a communication exception.
     * 
     */
    public static String WSMC_0121_FAILED_TO_SEND_WSMC_REQUEST() {
        return localizer.localize(localizableWSMC_0121_FAILED_TO_SEND_WSMC_REQUEST());
    }

    public static Localizable localizableWSMC_0106_EXCEPTION_IN_REQUEST_PROCESSING(Object arg0) {
        return messageFactory.getMessage("WSMC0106_EXCEPTION_IN_REQUEST_PROCESSING", arg0);
    }

    /**
     * WSMC0106: An exception has been thrown during a request processing for the client UID [ {0} ]
     * 
     */
    public static String WSMC_0106_EXCEPTION_IN_REQUEST_PROCESSING(Object arg0) {
        return localizer.localize(localizableWSMC_0106_EXCEPTION_IN_REQUEST_PROCESSING(arg0));
    }

    public static Localizable localizableWSMC_0119_UNABLE_TO_FIND_PROTOCOL_HANDLER(Object arg0) {
        return messageFactory.getMessage("WSMC0119_UNABLE_TO_FIND_PROTOCOL_HANDLER", arg0);
    }

    /**
     * WSMC0119: Unable to find a ProtocolMessageHandler to process WS-MC response with WS-Addressing action [ {0} ]
     * 
     */
    public static String WSMC_0119_UNABLE_TO_FIND_PROTOCOL_HANDLER(Object arg0) {
        return localizer.localize(localizableWSMC_0119_UNABLE_TO_FIND_PROTOCOL_HANDLER(arg0));
    }

    public static Localizable localizableWSMC_0116_RESUME_PARENT_FIBER_ERROR() {
        return messageFactory.getMessage("WSMC0116_RESUME_PARENT_FIBER_ERROR");
    }

    /**
     * WSMC0116: Unable to resume parent fiber for a response to a WS-MakeConnection request
     * 
     */
    public static String WSMC_0116_RESUME_PARENT_FIBER_ERROR() {
        return localizer.localize(localizableWSMC_0116_RESUME_PARENT_FIBER_ERROR());
    }

    public static Localizable localizableWSMC_0108_NULL_SELECTION_ADDRESS() {
        return messageFactory.getMessage("WSMC0108_NULL_SELECTION_ADDRESS");
    }

    /**
     * WSMC0108: Selection address is [null]
     * 
     */
    public static String WSMC_0108_NULL_SELECTION_ADDRESS() {
        return localizer.localize(localizableWSMC_0108_NULL_SELECTION_ADDRESS());
    }

    public static Localizable localizableWSMC_0117_PROCESSING_RESPONSE_AS_PROTOCOL_MESSAGE() {
        return messageFactory.getMessage("WSMC0117_PROCESSING_RESPONSE_AS_PROTOCOL_MESSAGE");
    }

    /**
     * WSMC0117: Proceeding with processing the response as a protocol message
     * 
     */
    public static String WSMC_0117_PROCESSING_RESPONSE_AS_PROTOCOL_MESSAGE() {
        return localizer.localize(localizableWSMC_0117_PROCESSING_RESPONSE_AS_PROTOCOL_MESSAGE());
    }

    public static Localizable localizableWSMC_0111_NO_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(Object arg0) {
        return messageFactory.getMessage("WSMC0111_NO_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID", arg0);
    }

    /**
     * WSMC0111: No pending message found for selection UUID [ {0} ]
     * 
     */
    public static String WSMC_0111_NO_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(Object arg0) {
        return localizer.localize(localizableWSMC_0111_NO_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(arg0));
    }

    public static Localizable localizableWSMC_0103_ERROR_RETRIEVING_WSA_REPLYTO_CONTENT() {
        return messageFactory.getMessage("WSMC0103_ERROR_RETRIEVING_WSA_REPLYTO_CONTENT");
    }

    /**
     * WSMC0103: Error unmarshalling content of WS-A ReplyTo header
     * 
     */
    public static String WSMC_0103_ERROR_RETRIEVING_WSA_REPLYTO_CONTENT() {
        return localizer.localize(localizableWSMC_0103_ERROR_RETRIEVING_WSA_REPLYTO_CONTENT());
    }

    public static Localizable localizableWSMC_0107_ERROR_UNMARSHALLING_PROTOCOL_MESSAGE() {
        return messageFactory.getMessage("WSMC0107_ERROR_UNMARSHALLING_PROTOCOL_MESSAGE");
    }

    /**
     * WSMC0107: Error unmarshalling content of a WS-MakeConnection protocol message
     * 
     */
    public static String WSMC_0107_ERROR_UNMARSHALLING_PROTOCOL_MESSAGE() {
        return localizer.localize(localizableWSMC_0107_ERROR_UNMARSHALLING_PROTOCOL_MESSAGE());
    }

    public static Localizable localizableWSMC_0118_PROCESSING_RESPONSE_IN_PROTOCOL_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSMC0118_PROCESSING_RESPONSE_IN_PROTOCOL_HANDLER", arg0, arg1);
    }

    /**
     * WSMC0118: Processing WS-MC response with WS-Addressing action [ {0} ] using ProtocolMessageHandler of class [ {1} ]
     * 
     */
    public static String WSMC_0118_PROCESSING_RESPONSE_IN_PROTOCOL_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSMC_0118_PROCESSING_RESPONSE_IN_PROTOCOL_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSMC_0102_NO_SOAP_HEADERS() {
        return messageFactory.getMessage("WSMC0102_NO_SOAP_HEADERS");
    }

    /**
     * WSMC0102: Required WS-Addressing headers not found: No SOAP headers present on a client request message.
     * 
     */
    public static String WSMC_0102_NO_SOAP_HEADERS() {
        return localizer.localize(localizableWSMC_0102_NO_SOAP_HEADERS());
    }

    public static Localizable localizableWSMC_0115_UNEXPECTED_PROTOCOL_ERROR(Object arg0) {
        return messageFactory.getMessage("WSMC0115_UNEXPECTED_PROTOCOL_ERROR", arg0);
    }

    /**
     * WSMC0115: Unexpected WS-MakeConnection protocol error: {0}
     * 
     */
    public static String WSMC_0115_UNEXPECTED_PROTOCOL_ERROR(Object arg0) {
        return localizer.localize(localizableWSMC_0115_UNEXPECTED_PROTOCOL_ERROR(arg0));
    }

    public static Localizable localizableWSMC_0109_SELECTION_ADDRESS_NOT_MATCHING_WSA_REPLYTO(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSMC0109_SELECTION_ADDRESS_NOT_MATCHING_WSA_REPLYTO", arg0, arg1);
    }

    /**
     * WSMC0109: Selection address [ {0} ] does not match specified WS-A ReplyTo address [ {1} ]
     * 
     */
    public static String WSMC_0109_SELECTION_ADDRESS_NOT_MATCHING_WSA_REPLYTO(Object arg0, Object arg1) {
        return localizer.localize(localizableWSMC_0109_SELECTION_ADDRESS_NOT_MATCHING_WSA_REPLYTO(arg0, arg1));
    }

    public static Localizable localizableWSMC_0123_RESPONSE_RETRIEVAL_TIMED_OUT() {
        return messageFactory.getMessage("WSMC0123_RESPONSE_RETRIEVAL_TIMED_OUT");
    }

    /**
     * WSMC0123: The attempts to retrieve a response for the request using WS-MakeConnection have timed out.
     * 
     */
    public static String WSMC_0123_RESPONSE_RETRIEVAL_TIMED_OUT() {
        return localizer.localize(localizableWSMC_0123_RESPONSE_RETRIEVAL_TIMED_OUT());
    }

    public static Localizable localizableWSMC_0112_NO_RESPONSE_RETURNED() {
        return messageFactory.getMessage("WSMC0112_NO_RESPONSE_RETURNED");
    }

    /**
     * WSMC0112: No response returned for a WS-MakeConnection request
     * 
     */
    public static String WSMC_0112_NO_RESPONSE_RETURNED() {
        return localizer.localize(localizableWSMC_0112_NO_RESPONSE_RETURNED());
    }

    public static Localizable localizableWSMC_0104_ERROR_STORING_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSMC0104_ERROR_STORING_RESPONSE", arg0);
    }

    /**
     * WSMC0104: Unable to store a response for client UUID [ {0} ]: Client queue has rejected the response
     * 
     */
    public static String WSMC_0104_ERROR_STORING_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSMC_0104_ERROR_STORING_RESPONSE(arg0));
    }

    public static Localizable localizableWSMC_0105_STORING_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSMC0105_STORING_RESPONSE", arg0);
    }

    /**
     * WSMC0105: Request processing finished. Storing a response for client UUID [ {0} ]
     * 
     */
    public static String WSMC_0105_STORING_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSMC_0105_STORING_RESPONSE(arg0));
    }

    public static Localizable localizableWSMC_0110_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(Object arg0) {
        return messageFactory.getMessage("WSMC0110_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID", arg0);
    }

    /**
     * WSMC0110: A pending message found for selection UUID [ {0} ]
     * 
     */
    public static String WSMC_0110_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(Object arg0) {
        return localizer.localize(localizableWSMC_0110_PENDING_MESSAGE_FOUND_FOR_SELECTION_UUID(arg0));
    }

    public static Localizable localizableWSMC_0101_DUPLICATE_PROTOCOL_MESSAGE_HANDLER(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSMC0101_DUPLICATE_PROTOCOL_MESSAGE_HANDLER", arg0, arg1, arg2);
    }

    /**
     * WSMC0101: Duplicate ProtocolMessageHandler registration detected for WS-A action [ {0} ].
     * Previously registered handler of class [ {1} ] has been replaced with a new handler of class [ {2} ]
     * 
     */
    public static String WSMC_0101_DUPLICATE_PROTOCOL_MESSAGE_HANDLER(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSMC_0101_DUPLICATE_PROTOCOL_MESSAGE_HANDLER(arg0, arg1, arg2));
    }

    public static Localizable localizableWSMC_0120_WSA_ACTION_HEADER_MISSING() {
        return messageFactory.getMessage("WSMC0120_WSA_ACTION_HEADER_MISSING");
    }

    /**
     * WSMC0120: Unable to find a proper response receiver: The response to a WS-MakeConnection request does not contain WS-Addressing Action header.
     * 
     */
    public static String WSMC_0120_WSA_ACTION_HEADER_MISSING() {
        return localizer.localize(localizableWSMC_0120_WSA_ACTION_HEADER_MISSING());
    }

    public static Localizable localizableWSMC_0122_DUPLICATE_ASSERTION_IN_POLICY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSMC0122_DUPLICATE_ASSERTION_IN_POLICY", arg0, arg1);
    }

    /**
     * WSMC0122: {0} duplicate [ {1} ] policy assertions in a single policy alternative detected
     * 
     */
    public static String WSMC_0122_DUPLICATE_ASSERTION_IN_POLICY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSMC_0122_DUPLICATE_ASSERTION_IN_POLICY(arg0, arg1));
    }

    public static Localizable localizableWSMC_0113_NO_WSMC_HEADERS_IN_RESPONSE() {
        return messageFactory.getMessage("WSMC0113_NO_WSMC_HEADERS_IN_RESPONSE");
    }

    /**
     * WSMC0113: Unable to find a proper response receiver: The response to a WS-MakeConnection request does not contain any headers.
     * 
     */
    public static String WSMC_0113_NO_WSMC_HEADERS_IN_RESPONSE() {
        return localizer.localize(localizableWSMC_0113_NO_WSMC_HEADERS_IN_RESPONSE());
    }

}
