
package com.sun.xml.ws.tx.at.localization;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class LocalizationMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.tx.at.localization.Localization");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSAT_4623_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return messageFactory.getMessage("WSAT4623_FAILED_TO_CREATE_URL_FOR_WSDL");
    }

    /**
     * WSAT4623: Failed to create URL for the wsdl Location: 'file:wstx-wscoor-1.1-wsdl-200702.wsdl', retrying as a local file
     * 
     */
    public static String WSAT_4623_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return localizer.localize(localizableWSAT_4623_FAILED_TO_CREATE_URL_FOR_WSDL());
    }

    public static Localizable localizableWSAT_4572_INVALID_TRANSACTION_EXCEPTION_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4572_INVALID_TRANSACTION_EXCEPTION_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4572: InvalidTransactionException while attempting to resume suspended transaction ''{0}'' on thread ''{1}'' .  Resume will be forced and transaction marked for rollback.
     * 
     */
    public static String WSAT_4572_INVALID_TRANSACTION_EXCEPTION_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4572_INVALID_TRANSACTION_EXCEPTION_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4575_WSAT_INFO_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSAT4575_WSAT_INFO_IN_CLIENT_SIDE_HANDLER", arg0, arg1, arg2, arg3);
    }

    /**
     * WSAT4575: WS-AT transaction id is ''{0}'' and time to live is ''{1}'' for transaction ''{2}'' on thread {3}
     * 
     */
    public static String WSAT_4575_WSAT_INFO_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSAT_4575_WSAT_INFO_IN_CLIENT_SIDE_HANDLER(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSAT_4559_INTERRUPTED_EXCEPTION_DURING_ROLLBACK(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4559_INTERRUPTED_EXCEPTION_DURING_ROLLBACK", arg0, arg1);
    }

    /**
     * WSAT4559: InterruptedException during WS-AT XAResource rollback for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4559_INTERRUPTED_EXCEPTION_DURING_ROLLBACK(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4559_INTERRUPTED_EXCEPTION_DURING_ROLLBACK(arg0, arg1));
    }

    public static Localizable localizableWSAT_4597_PREPARE_PARTICIPANT_SYNCHRONIZATION_PLACED_IN_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4597_PREPARE_PARTICIPANT_SYNCHRONIZATION_PLACED_IN_CACHE", arg0);
    }

    /**
     * WSAT4597: Volatile participant XAResource placed in cache for Xid ''{0}'' for prepare.
     * 
     */
    public static String WSAT_4597_PREPARE_PARTICIPANT_SYNCHRONIZATION_PLACED_IN_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4597_PREPARE_PARTICIPANT_SYNCHRONIZATION_PLACED_IN_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4581_XID_NOT_IN_DURABLE_RESOURCE_MAP(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4581_XID_NOT_IN_DURABLE_RESOURCE_MAP", arg0, arg1);
    }

    /**
     * WSAT4581: Xid ''{0}'' not found in durable participant resource map for status ''{1}''
     * 
     */
    public static String WSAT_4581_XID_NOT_IN_DURABLE_RESOURCE_MAP(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4581_XID_NOT_IN_DURABLE_RESOURCE_MAP(arg0, arg1));
    }

    public static Localizable localizableWSAT_4606_WLSWSATTX_ID_IN_HEADER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4606_WLSWSATTX_ID_IN_HEADER", arg0, arg1);
    }

    /**
     * WSAT4606: Weblogic WS-AT transaction id in header is ''{0}'' on thread ''{1}''
     * 
     */
    public static String WSAT_4606_WLSWSATTX_ID_IN_HEADER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4606_WLSWSATTX_ID_IN_HEADER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4555_ROLLBACK_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4555_ROLLBACK_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4555: Rollback waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4555_ROLLBACK_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4555_ROLLBACK_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4541_PREPARE_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4541_PREPARE_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4541: Prepare waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4541_PREPARE_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4541_PREPARE_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4536_BEFORE_COMPLETION_TRANSACTION_NULL_DURING_SET_ROLLBACK_ONLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4536_BEFORE_COMPLETION_TRANSACTION_NULL_DURING_SET_ROLLBACK_ONLY", arg0, arg1);
    }

    /**
     * WSAT4536: Transaction is null during setRollbackOnly for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4536_BEFORE_COMPLETION_TRANSACTION_NULL_DURING_SET_ROLLBACK_ONLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4536_BEFORE_COMPLETION_TRANSACTION_NULL_DURING_SET_ROLLBACK_ONLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4577_ABOUT_TO_SUSPEND_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4577_ABOUT_TO_SUSPEND_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4577: About to suspend transaction ''{0}'' on thread ''{1}''
     * 
     */
    public static String WSAT_4577_ABOUT_TO_SUSPEND_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4577_ABOUT_TO_SUSPEND_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4620_GET_RESPONSE_REQUEST(Object arg0) {
        return messageFactory.getMessage("WSAT4620_GET_RESPONSE_REQUEST", arg0);
    }

    /**
     * WSAT4620: Registered response for request: ''{0}''
     * 
     */
    public static String WSAT_4620_GET_RESPONSE_REQUEST(Object arg0) {
        return localizer.localize(localizableWSAT_4620_GET_RESPONSE_REQUEST(arg0));
    }

    public static Localizable localizableWSAT_4599_VOLATILE_PARTICIPANT_PORT_PLACED_IN_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4599_VOLATILE_PARTICIPANT_PORT_PLACED_IN_CACHE", arg0);
    }

    /**
     * WSAT4599: Volatile participant port placed in cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4599_VOLATILE_PARTICIPANT_PORT_PLACED_IN_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4599_VOLATILE_PARTICIPANT_PORT_PLACED_IN_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4527_BEFORE_COMPLETION_ENTERED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4527_BEFORE_COMPLETION_ENTERED", arg0, arg1);
    }

    /**
     * WSAT4527: beforeCompletion entered for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4527_BEFORE_COMPLETION_ENTERED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4527_BEFORE_COMPLETION_ENTERED(arg0, arg1));
    }

    public static Localizable localizableWSAT_4602_DURABLE_PARTICIPANT_PORT_PLACED_IN_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4602_DURABLE_PARTICIPANT_PORT_PLACED_IN_CACHE", arg0);
    }

    /**
     * WSAT4602: Durable participant port placed in cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4602_DURABLE_PARTICIPANT_PORT_PLACED_IN_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4602_DURABLE_PARTICIPANT_PORT_PLACED_IN_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4615_WSAT_XARESOURCE_INFO(Object arg0) {
        return messageFactory.getMessage("WSAT4615_WSAT_XARESOURCE_INFO", arg0);
    }

    /**
     * WSAT4615: WSATXAResource: ''{0}''
     * 
     */
    public static String WSAT_4615_WSAT_XARESOURCE_INFO(Object arg0) {
        return localizer.localize(localizableWSAT_4615_WSAT_XARESOURCE_INFO(arg0));
    }

    public static Localizable localizableWSAT_4535_BEFORE_COMPLETION_SYSTEM_EXCEPTION_DURING_SET_ROLLBACK_ONLY(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4535_BEFORE_COMPLETION_SYSTEM_EXCEPTION_DURING_SET_ROLLBACK_ONLY", arg0, arg1, arg2);
    }

    /**
     * WSAT4535: SystemException ''{0}'' during attempt to setRollbackOnly for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4535_BEFORE_COMPLETION_SYSTEM_EXCEPTION_DURING_SET_ROLLBACK_ONLY(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4535_BEFORE_COMPLETION_SYSTEM_EXCEPTION_DURING_SET_ROLLBACK_ONLY(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4607_REGISTER_TYPE_INFO(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSAT4607_REGISTER_TYPE_INFO", arg0, arg1, arg2, arg3);
    }

    /**
     * WSAT4607: RegisterType otherAttributes ''{0}'' protocolIdentifier ''{1}'' participantProtocolServiceEndpointReferenceType ''{2}'' for Xid {3}
     * 
     */
    public static String WSAT_4607_REGISTER_TYPE_INFO(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSAT_4607_REGISTER_TYPE_INFO(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSAT_4528_BEFORE_COMPLETION_COMMITTED_BEFORE_WAIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4528_BEFORE_COMPLETION_COMMITTED_BEFORE_WAIT", arg0, arg1);
    }

    /**
     * WSAT4528: beforeCompletion received reply COMMITTED before wait was entered for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4528_BEFORE_COMPLETION_COMMITTED_BEFORE_WAIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4528_BEFORE_COMPLETION_COMMITTED_BEFORE_WAIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4532_BEFORE_COMPLETION_UNEXCEPTED_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4532_BEFORE_COMPLETION_UNEXCEPTED_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4532: Unexpected failed status ''{0}'' during WS-AT Synchronization beforeCompletion for Address ''{1}'' and Xid ''{2}'' .  Marking transaction for rollback.
     * 
     */
    public static String WSAT_4532_BEFORE_COMPLETION_UNEXCEPTED_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4532_BEFORE_COMPLETION_UNEXCEPTED_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4590_ABOUT_TO_SEND_COMMIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4590_ABOUT_TO_SEND_COMMIT", arg0, arg1);
    }

    /**
     * WSAT4590: About to send commit for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4590_ABOUT_TO_SEND_COMMIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4590_ABOUT_TO_SEND_COMMIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4592_ABOUT_TO_SEND_ROLLBACK(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4592_ABOUT_TO_SEND_ROLLBACK", arg0, arg1);
    }

    /**
     * WSAT4592: About to send abort for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4592_ABOUT_TO_SEND_ROLLBACK(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4592_ABOUT_TO_SEND_ROLLBACK(arg0, arg1));
    }

    public static Localizable localizableWSAT_4509_PREPARED_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4509_PREPARED_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4509: preparedOperation entered with Notification ''{0}''
     * 
     */
    public static String WSAT_4509_PREPARED_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4509_PREPARED_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4537_AFTER_COMPLETION_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4537_AFTER_COMPLETION_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4537: afterCompletion status for Address ''{0}'' and Xid ''{1}'' is ''{2}''
     * 
     */
    public static String WSAT_4537_AFTER_COMPLETION_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4537_AFTER_COMPLETION_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4583_DURABLE_PORT_REMOVED(Object arg0) {
        return messageFactory.getMessage("WSAT4583_DURABLE_PORT_REMOVED", arg0);
    }

    /**
     * WSAT4583: Durable participant port removed from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4583_DURABLE_PORT_REMOVED(Object arg0) {
        return localizer.localize(localizableWSAT_4583_DURABLE_PORT_REMOVED(arg0));
    }

    public static Localizable localizableWSAT_4617_TXN_MGR_LOOKUP_TXN_TIMEOUT() {
        return messageFactory.getMessage("WSAT4617_TXN_MGR_LOOKUP_TXN_TIMEOUT");
    }

    /**
     * WSAT4617: looking up remaining txn timeout, no current transaction
     * 
     */
    public static String WSAT_4617_TXN_MGR_LOOKUP_TXN_TIMEOUT() {
        return localizer.localize(localizableWSAT_4617_TXN_MGR_LOOKUP_TXN_TIMEOUT());
    }

    public static Localizable localizableWSAT_4516_READ_ONLY_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSAT4516_READ_ONLY_OPERATION", arg0);
    }

    /**
     * WSAT4516: readOnlyOperation Xid: ''{0}''
     * 
     */
    public static String WSAT_4516_READ_ONLY_OPERATION(Object arg0) {
        return localizer.localize(localizableWSAT_4516_READ_ONLY_OPERATION(arg0));
    }

    public static Localizable localizableWSAT_4591_COMMIT_SENT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4591_COMMIT_SENT", arg0, arg1);
    }

    /**
     * WSAT4591: Commit sent for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4591_COMMIT_SENT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4591_COMMIT_SENT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4544_FAILED_STATE_FOR_PREPARE(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4544_FAILED_STATE_FOR_PREPARE", arg0, arg1, arg2);
    }

    /**
     * WSAT4544: Failed state of ''{0}'' during WS-AT XAResource prepare for Address ''{1}'' and Xid ''{2}'' .  This may be due to a timeout waiting for a response.
     * 
     */
    public static String WSAT_4544_FAILED_STATE_FOR_PREPARE(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4544_FAILED_STATE_FOR_PREPARE(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4526_WSAT_SYNCHRONIZATION(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4526_WSAT_SYNCHRONIZATION", arg0, arg1, arg2);
    }

    /**
     * WSAT4526: Volatile2PC WS-AT Participant created for Address ''{0}'' and Xid ''{1}'' with ReferenceParameters ''{2}''
     * 
     */
    public static String WSAT_4526_WSAT_SYNCHRONIZATION(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4526_WSAT_SYNCHRONIZATION(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4552_INTERRUPTED_EXCEPTION_DURING_COMMIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4552_INTERRUPTED_EXCEPTION_DURING_COMMIT", arg0, arg1);
    }

    /**
     * WSAT4552: InterruptedException during WS-AT XAResource commit for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4552_INTERRUPTED_EXCEPTION_DURING_COMMIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4552_INTERRUPTED_EXCEPTION_DURING_COMMIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4534_BEFORE_COMPLETION_EXCEPTION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4534_BEFORE_COMPLETION_EXCEPTION", arg0, arg1);
    }

    /**
     * WSAT4534: Exception during beforeCompletion for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4534_BEFORE_COMPLETION_EXCEPTION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4534_BEFORE_COMPLETION_EXCEPTION(arg0, arg1));
    }

    public static Localizable localizableWSAT_4573_SYSTEM_EXCEPTION_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4573_SYSTEM_EXCEPTION_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4573: SystemException while attempting to resume suspended transaction ''{0}''  on thread ''{1}'' .  Resume will be forced and transaction marked for rollback.
     * 
     */
    public static String WSAT_4573_SYSTEM_EXCEPTION_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4573_SYSTEM_EXCEPTION_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4529_BEFORE_COMPLETION_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4529_BEFORE_COMPLETION_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4529: beforeCompletion waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4529_BEFORE_COMPLETION_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4529_BEFORE_COMPLETION_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4557_ROLLBACK_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4557_ROLLBACK_RECEIVED_REPLY_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4557: Rollback received reply status of ''{0}'' for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4557_ROLLBACK_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4557_ROLLBACK_RECEIVED_REPLY_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4609_REFERENCE_PARAMETER_TYPE_VALUE_IN_ARRAY(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4609_REFERENCE_PARAMETER_TYPE_VALUE_IN_ARRAY", arg0, arg1, arg2);
    }

    /**
     * WSAT4609: Xid ''{0}'' ReferenceParameters ''{1}'' value is ''{2}''
     * 
     */
    public static String WSAT_4609_REFERENCE_PARAMETER_TYPE_VALUE_IN_ARRAY(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4609_REFERENCE_PARAMETER_TYPE_VALUE_IN_ARRAY(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4512_ABORTED_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4512_ABORTED_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4512: abortedOperation entered with Notification ''{0}''
     * 
     */
    public static String WSAT_4512_ABORTED_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4512_ABORTED_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4551_FAILED_STATE_FOR_COMMIT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4551_FAILED_STATE_FOR_COMMIT", arg0, arg1, arg2);
    }

    /**
     * WSAT4551: Failed state of ''{0}'' during WS-AT XAResource commit for Address ''{1}'' and Xid ''{2}'' .  This may be due to a timeout waiting for a response.
     * 
     */
    public static String WSAT_4551_FAILED_STATE_FOR_COMMIT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4551_FAILED_STATE_FOR_COMMIT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4589_DURABLE_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE_FROM_PREPARE(Object arg0) {
        return messageFactory.getMessage("WSAT4589_DURABLE_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE_FROM_PREPARE", arg0);
    }

    /**
     * WSAT4589: Durable participant XAResource placed in cache for Xid ''{0}'' for prepare.
     * 
     */
    public static String WSAT_4589_DURABLE_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE_FROM_PREPARE(Object arg0) {
        return localizer.localize(localizableWSAT_4589_DURABLE_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE_FROM_PREPARE(arg0));
    }

    public static Localizable localizableWSAT_1003_INCOMPATIBLE_FEATURES_DETECTED(Object arg0) {
        return messageFactory.getMessage("WSAT1003_INCOMPATIBLE_FEATURES_DETECTED", arg0);
    }

    /**
     * WSAT1003: Incompatible features produced by policy: ''{0}''
     * 
     */
    public static String WSAT_1003_INCOMPATIBLE_FEATURES_DETECTED(Object arg0) {
        return localizer.localize(localizableWSAT_1003_INCOMPATIBLE_FEATURES_DETECTED(arg0));
    }

    public static Localizable localizableWSAT_4506_EXCEPTION_DURING_ENLIST_RESOURCE(Object arg0) {
        return messageFactory.getMessage("WSAT4506_EXCEPTION_DURING_ENLIST_RESOURCE", arg0);
    }

    /**
     * WSAT4506: SystemException while registering WS-AT XAResource ''{0}''
     * 
     */
    public static String WSAT_4506_EXCEPTION_DURING_ENLIST_RESOURCE(Object arg0) {
        return localizer.localize(localizableWSAT_4506_EXCEPTION_DURING_ENLIST_RESOURCE(arg0));
    }

    public static Localizable localizableWSAT_4621_IGNORE_RESPONSE(Object arg0) {
        return messageFactory.getMessage("WSAT4621_IGNORE_RESPONSE", arg0);
    }

    /**
     * WSAT4621: Ignore response for timed out request: ''{0}''
     * 
     */
    public static String WSAT_4621_IGNORE_RESPONSE(Object arg0) {
        return localizer.localize(localizableWSAT_4621_IGNORE_RESPONSE(arg0));
    }

    public static Localizable localizableWSAT_4613_WSAT_PARTICIPANT(Object arg0) {
        return messageFactory.getMessage("WSAT4613_WSAT_PARTICIPANT", arg0);
    }

    /**
     * WSAT4613: WSATParticipant ''{0}''
     * 
     */
    public static String WSAT_4613_WSAT_PARTICIPANT(Object arg0) {
        return localizer.localize(localizableWSAT_4613_WSAT_PARTICIPANT(arg0));
    }

    public static Localizable localizableWSAT_4562_ENTER_CLIENT_SID_EHANDLE_FAULT(Object arg0) {
        return messageFactory.getMessage("WSAT4562_ENTER_CLIENT_SID_EHANDLE_FAULT", arg0);
    }

    /**
     * WSAT4562: Enter client-side handleFault ''{0}''
     * 
     */
    public static String WSAT_4562_ENTER_CLIENT_SID_EHANDLE_FAULT(Object arg0) {
        return localizer.localize(localizableWSAT_4562_ENTER_CLIENT_SID_EHANDLE_FAULT(arg0));
    }

    public static Localizable localizableWSAT_1001_DUPLICATE_ASSERTION_IN_POLICY(Object arg0) {
        return messageFactory.getMessage("WSAT1001_DUPLICATE_ASSERTION_IN_POLICY", arg0);
    }

    /**
     * WSAT1001: Duplicate 'ATAssertion' policy assertions in a single policy alternative detected: {0}
     * 
     */
    public static String WSAT_1001_DUPLICATE_ASSERTION_IN_POLICY(Object arg0) {
        return localizer.localize(localizableWSAT_1001_DUPLICATE_ASSERTION_IN_POLICY(arg0));
    }

    public static Localizable localizableWSAT_4570_WILL_RESUME_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4570_WILL_RESUME_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4570: Suspended transaction ''{0}'' will be resumed on thread ''{1}''
     * 
     */
    public static String WSAT_4570_WILL_RESUME_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4570_WILL_RESUME_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4513_ABORTED_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSAT4513_ABORTED_OPERATION", arg0);
    }

    /**
     * WSAT4513: abortedOperation Xid: ''{0}''
     * 
     */
    public static String WSAT_4513_ABORTED_OPERATION(Object arg0) {
        return localizer.localize(localizableWSAT_4513_ABORTED_OPERATION(arg0));
    }

    public static Localizable localizableWSAT_4554_ROLLBACK_BEFORE_WAIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4554_ROLLBACK_BEFORE_WAIT", arg0, arg1);
    }

    /**
     * WSAT4554: Rollback call received reply ABORTED before wait was entered for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4554_ROLLBACK_BEFORE_WAIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4554_ROLLBACK_BEFORE_WAIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4556_ROLLBACK_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4556_ROLLBACK_FINISHED_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4556: Rollback finished waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4556_ROLLBACK_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4556_ROLLBACK_FINISHED_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4539_PREPARE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4539_PREPARE", arg0, arg1);
    }

    /**
     * WSAT4539: Prepare called for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4539_PREPARE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4539_PREPARE(arg0, arg1));
    }

    public static Localizable localizableWSAT_4611_WLS_TRANSACTION_SERVICESIMPL(Object arg0) {
        return messageFactory.getMessage("WSAT4611_WLS_TRANSACTION_SERVICESIMPL", arg0);
    }

    /**
     * WSAT4611: WLSTransactionServicesImpl ''{0}''
     * 
     */
    public static String WSAT_4611_WLS_TRANSACTION_SERVICESIMPL(Object arg0) {
        return localizer.localize(localizableWSAT_4611_WLS_TRANSACTION_SERVICESIMPL(arg0));
    }

    public static Localizable localizableWSAT_4614_WSAT_NO_CONTEXT_HEADER_LIST(Object arg0) {
        return messageFactory.getMessage("WSAT4614_WSAT_NO_CONTEXT_HEADER_LIST", arg0);
    }

    /**
     * WSAT4614: txid does not exist in header in WebServiceContext ''{0}'' while calling getWSATTidFromWebServiceContextHeaderList
     * 
     */
    public static String WSAT_4614_WSAT_NO_CONTEXT_HEADER_LIST(Object arg0) {
        return localizer.localize(localizableWSAT_4614_WSAT_NO_CONTEXT_HEADER_LIST(arg0));
    }

    public static Localizable localizableWSAT_4596_PREPARE_VOLATILE_SENT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4596_PREPARE_VOLATILE_SENT", arg0, arg1);
    }

    /**
     * WSAT4596: Prepare sent for volatile participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4596_PREPARE_VOLATILE_SENT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4596_PREPARE_VOLATILE_SENT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4580_UNKNOWN_PARTICIPANT_IDENTIFIER(Object arg0) {
        return messageFactory.getMessage("WSAT4580_UNKNOWN_PARTICIPANT_IDENTIFIER", arg0);
    }

    /**
     * WSAT4580: Unknown participant protocol identifier in WS-AT context ''{0}''
     * 
     */
    public static String WSAT_4580_UNKNOWN_PARTICIPANT_IDENTIFIER(Object arg0) {
        return localizer.localize(localizableWSAT_4580_UNKNOWN_PARTICIPANT_IDENTIFIER(arg0));
    }

    public static Localizable localizableWSAT_4538_WSAT_XARESOURCE(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4538_WSAT_XARESOURCE", arg0, arg1, arg2);
    }

    /**
     * WSAT4538: Durable2PC WS-AT Participant created for Address ''{0}'' and Xid ''{1}'' with ReferenceParameters ''{2}''
     * 
     */
    public static String WSAT_4538_WSAT_XARESOURCE(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4538_WSAT_XARESOURCE(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4594_ROLLBACK_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4594_ROLLBACK_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE", arg0);
    }

    /**
     * WSAT4594: Durable participant XAResource placed in cache for Xid ''{0}'' for rollback.
     * 
     */
    public static String WSAT_4594_ROLLBACK_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4594_ROLLBACK_PARTICIPANT_XARESOURCE_PLACED_IN_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4542_PREPARE_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4542_PREPARE_FINISHED_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4542: Prepare finished waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4542_PREPARE_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4542_PREPARE_FINISHED_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4601_CANNOT_CREATE_DURABLE_PARTICIPANT_PORT(Object arg0) {
        return messageFactory.getMessage("WSAT4601_CANNOT_CREATE_DURABLE_PARTICIPANT_PORT", arg0);
    }

    /**
     * WSAT4601: Cannot create durable participant port for Xid ''{0}''
     * 
     */
    public static String WSAT_4601_CANNOT_CREATE_DURABLE_PARTICIPANT_PORT(Object arg0) {
        return localizer.localize(localizableWSAT_4601_CANNOT_CREATE_DURABLE_PARTICIPANT_PORT(arg0));
    }

    public static Localizable localizableWSAT_4618_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return messageFactory.getMessage("WSAT4618_FAILED_TO_CREATE_URL_FOR_WSDL");
    }

    /**
     * WSAT4618: Failed to create URL for the wsdl Location: 'file:wsat.wsdl', retrying as a local file
     * 
     */
    public static String WSAT_4618_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return localizer.localize(localizableWSAT_4618_FAILED_TO_CREATE_URL_FOR_WSDL());
    }

    public static Localizable localizableWSAT_4510_PREPARED_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSAT4510_PREPARED_OPERATION", arg0);
    }

    /**
     * WSAT4510: preparedOperation Xid: ''{0}''
     * 
     */
    public static String WSAT_4510_PREPARED_OPERATION(Object arg0) {
        return localizer.localize(localizableWSAT_4510_PREPARED_OPERATION(arg0));
    }

    public static Localizable localizableWSAT_4587_ABOUT_TO_SEND_PREPARE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4587_ABOUT_TO_SEND_PREPARE", arg0, arg1);
    }

    /**
     * WSAT4587: About to send prepare for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4587_ABOUT_TO_SEND_PREPARE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4587_ABOUT_TO_SEND_PREPARE(arg0, arg1));
    }

    public static Localizable localizableWSAT_4608_ENDPOINT_REFERENCE_TYPE_INFO(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
        return messageFactory.getMessage("WSAT4608_ENDPOINT_REFERENCE_TYPE_INFO", arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    /**
     * WSAT4608: EndpointReferenceType participantServiceEPRAttributedURI value ''{0}'' attributedURI.getValue() ''{1}'' anyList ''{2}'' participantProtocolServiceEndpointReferenceTypeOtherAttributesMap {3} portType {4} referencePropertiesType {5} serviceName {6} referenceParametersType {7} for Xid {8}
     * 
     */
    public static String WSAT_4608_ENDPOINT_REFERENCE_TYPE_INFO(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8) {
        return localizer.localize(localizableWSAT_4608_ENDPOINT_REFERENCE_TYPE_INFO(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8));
    }

    public static Localizable localizableWSAT_4565_EXIT_CLIENT_SIDE_CLOSE(Object arg0) {
        return messageFactory.getMessage("WSAT4565_EXIT_CLIENT_SIDE_CLOSE", arg0);
    }

    /**
     * WSAT4565: Exit client-side close ''{0}'' 
     * 
     */
    public static String WSAT_4565_EXIT_CLIENT_SIDE_CLOSE(Object arg0) {
        return localizer.localize(localizableWSAT_4565_EXIT_CLIENT_SIDE_CLOSE(arg0));
    }

    public static Localizable localizableWSAT_4579_SYSTEM_EXCEPTION_DURING_SUSPEND(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4579_SYSTEM_EXCEPTION_DURING_SUSPEND", arg0, arg1);
    }

    /**
     * WSAT4579: SystemException during suspend for transaction ''{0}'' on thread ''{1}''
     * 
     */
    public static String WSAT_4579_SYSTEM_EXCEPTION_DURING_SUSPEND(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4579_SYSTEM_EXCEPTION_DURING_SUSPEND(arg0, arg1));
    }

    public static Localizable localizableWSAT_4578_SUSPENDED_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4578_SUSPENDED_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4578: Suspended transaction ''{0}'' on thread ''{1}''
     * 
     */
    public static String WSAT_4578_SUSPENDED_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4578_SUSPENDED_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4564_ENTERC_LIENT_SIDE_CLOSE(Object arg0) {
        return messageFactory.getMessage("WSAT4564_ENTERC_LIENT_SIDE_CLOSE", arg0);
    }

    /**
     * WSAT4564: Enter client-side close ''{0}''
     * 
     */
    public static String WSAT_4564_ENTERC_LIENT_SIDE_CLOSE(Object arg0) {
        return localizer.localize(localizableWSAT_4564_ENTERC_LIENT_SIDE_CLOSE(arg0));
    }

    public static Localizable localizableWSAT_4515_READ_ONLY_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4515_READ_ONLY_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4515: readOnlyOperation entered with Notification ''{0}''
     * 
     */
    public static String WSAT_4515_READ_ONLY_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4515_READ_ONLY_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4569_INBOUND_APPLICATION_MESSAGE() {
        return messageFactory.getMessage("WSAT4569_INBOUND_APPLICATION_MESSAGE");
    }

    /**
     * WSAT4569: Client-side inbound message received
     * 
     */
    public static String WSAT_4569_INBOUND_APPLICATION_MESSAGE() {
        return localizer.localize(localizableWSAT_4569_INBOUND_APPLICATION_MESSAGE());
    }

    public static Localizable localizableWSAT_4595_ABOUT_TO_SEND_PREPARE_VOLATILE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4595_ABOUT_TO_SEND_PREPARE_VOLATILE", arg0, arg1);
    }

    /**
     * WSAT4595: About to send prepare for volatile participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4595_ABOUT_TO_SEND_PREPARE_VOLATILE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4595_ABOUT_TO_SEND_PREPARE_VOLATILE(arg0, arg1));
    }

    public static Localizable localizableWSAT_4605_REPLY_TO_ADDED_TO_HEADER(Object arg0) {
        return messageFactory.getMessage("WSAT4605_REPLY_TO_ADDED_TO_HEADER", arg0);
    }

    /**
     * WSAT4605: ReplyTo added to header for Xid ''{0}''
     * 
     */
    public static String WSAT_4605_REPLY_TO_ADDED_TO_HEADER(Object arg0) {
        return localizer.localize(localizableWSAT_4605_REPLY_TO_ADDED_TO_HEADER(arg0));
    }

    public static Localizable localizableWSAT_4604_REFERENCE_PARAMETER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSAT4604_REFERENCE_PARAMETER", arg0, arg1, arg2, arg3);
    }

    /**
     * WSAT4604: Reference parameter namespaceURI ''{0}'' localName ''{1}'' textContent ''{2}'' for Xid {3}
     * 
     */
    public static String WSAT_4604_REFERENCE_PARAMETER(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSAT_4604_REFERENCE_PARAMETER(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSAT_4503_ENLIST_RESOURCE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4503_ENLIST_RESOURCE", arg0, arg1);
    }

    /**
     * WSAT4503: Registering Durable2PC Participant ''{0}'' with Xid ''{1}''
     * 
     */
    public static String WSAT_4503_ENLIST_RESOURCE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4503_ENLIST_RESOURCE(arg0, arg1));
    }

    public static Localizable localizableWSAT_4610_WSAT_ROUTING_INFO_FINDER(Object arg0) {
        return messageFactory.getMessage("WSAT4610_WSAT_ROUTING_INFO_FINDER", arg0);
    }

    /**
     * WSAT4610: WSATRoutingInfoFinder ''{0}''
     * 
     */
    public static String WSAT_4610_WSAT_ROUTING_INFO_FINDER(Object arg0) {
        return localizer.localize(localizableWSAT_4610_WSAT_ROUTING_INFO_FINDER(arg0));
    }

    public static Localizable localizableWSAT_4531_BEFORE_COMPLETION_RECEIVED_REPLY_WITH_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4531_BEFORE_COMPLETION_RECEIVED_REPLY_WITH_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4531: beforeCompletion received reply with status ''{0}'' for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4531_BEFORE_COMPLETION_RECEIVED_REPLY_WITH_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4531_BEFORE_COMPLETION_RECEIVED_REPLY_WITH_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4540_PREPARED_BEFORE_WAIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4540_PREPARED_BEFORE_WAIT", arg0, arg1);
    }

    /**
     * WSAT4540: Prepare call received reply PREPARED before wait was entered for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4540_PREPARED_BEFORE_WAIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4540_PREPARED_BEFORE_WAIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4574_SUSPEND_SUCCESSFUL_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4574_SUSPEND_SUCCESSFUL_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4574: Transaction ''{0}'' suspended sucessfully on thread ''{1}''
     * 
     */
    public static String WSAT_4574_SUSPEND_SUCCESSFUL_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4574_SUSPEND_SUCCESSFUL_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4505_REGISTER_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4505_REGISTER_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4505: registerOperation exited returning RegisterResponseType ''{0}''
     * 
     */
    public static String WSAT_4505_REGISTER_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4505_REGISTER_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4619_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return messageFactory.getMessage("WSAT4619_FAILED_TO_CREATE_URL_FOR_WSDL");
    }

    /**
     * WSAT4619: Failed to create URL for the wsdl Location: 'file:wstx-wsat-1.1-wsdl-200702.wsdl', retrying as a local file
     * 
     */
    public static String WSAT_4619_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return localizer.localize(localizableWSAT_4619_FAILED_TO_CREATE_URL_FOR_WSDL());
    }

    public static Localizable localizableWSAT_4600_DURABLE_PARTICIPANT_PORT_RETREIVED_FROM_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4600_DURABLE_PARTICIPANT_PORT_RETREIVED_FROM_CACHE", arg0);
    }

    /**
     * WSAT4600: Durable participant port retrieved from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4600_DURABLE_PARTICIPANT_PORT_RETREIVED_FROM_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4600_DURABLE_PARTICIPANT_PORT_RETREIVED_FROM_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4567_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_BEFORE_ADDING_CONTEXT(Object arg0) {
        return messageFactory.getMessage("WSAT4567_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_BEFORE_ADDING_CONTEXT", arg0);
    }

    /**
     * WSAT4567: Client-side outbound application message before adding transaction context for ''{0}''
     * 
     */
    public static String WSAT_4567_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_BEFORE_ADDING_CONTEXT(Object arg0) {
        return localizer.localize(localizableWSAT_4567_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_BEFORE_ADDING_CONTEXT(arg0));
    }

    public static Localizable localizableWSAT_4521_REPLAY_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4521_REPLAY_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4521: replayOperation entered with Notification ''{0}''
     * 
     */
    public static String WSAT_4521_REPLAY_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4521_REPLAY_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4593_ROLLBACK_SENT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4593_ROLLBACK_SENT", arg0, arg1);
    }

    /**
     * WSAT4593: Abort sent for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4593_ROLLBACK_SENT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4593_ROLLBACK_SENT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4563_EXIT_CLIENT_SIDE_HANDLE_FAULT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4563_EXIT_CLIENT_SIDE_HANDLE_FAULT", arg0, arg1);
    }

    /**
     * WSAT4563: Exit client-side handleFault with ''{0}'' ''{1}''
     * 
     */
    public static String WSAT_4563_EXIT_CLIENT_SIDE_HANDLE_FAULT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4563_EXIT_CLIENT_SIDE_HANDLE_FAULT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4553_ROLLBACK(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4553_ROLLBACK", arg0, arg1);
    }

    /**
     * WSAT4553: Rollback called for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4553_ROLLBACK(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4553_ROLLBACK(arg0, arg1));
    }

    public static Localizable localizableWSAT_4598_VOLATILE_PARTICIPANT_RETRIEVED_FROM_CACHE(Object arg0) {
        return messageFactory.getMessage("WSAT4598_VOLATILE_PARTICIPANT_RETRIEVED_FROM_CACHE", arg0);
    }

    /**
     * WSAT4598: Volatile participant port retrieved from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4598_VOLATILE_PARTICIPANT_RETRIEVED_FROM_CACHE(Object arg0) {
        return localizer.localize(localizableWSAT_4598_VOLATILE_PARTICIPANT_RETRIEVED_FROM_CACHE(arg0));
    }

    public static Localizable localizableWSAT_4543_PREPARE_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4543_PREPARE_RECEIVED_REPLY_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4543: Prepare received reply status of ''{0}'' for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4543_PREPARE_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4543_PREPARE_RECEIVED_REPLY_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_1002_ADD_AT_POLICY_ASSERTION(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
        return messageFactory.getMessage("WSAT1002_ADD_AT_POLICY_ASSERTION", arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    /**
     * WSAT1002: Adding WS-AT policy to WSDL-bound operation ''{0}'':''{1}'', backed by web method ''{2}''.''{3}'' with effective TransactionFlowType ''{4}'' and EJB Transaction attribute ''{5}'':
     * ''{6}''
     * 
     */
    public static String WSAT_1002_ADD_AT_POLICY_ASSERTION(Object arg0, Object arg1, Object arg2, Object arg3, Object arg4, Object arg5, Object arg6) {
        return localizer.localize(localizableWSAT_1002_ADD_AT_POLICY_ASSERTION(arg0, arg1, arg2, arg3, arg4, arg5, arg6));
    }

    public static Localizable localizableWSAT_1004_ENDPOINT_AND_OPERATION_POLICIES_DONT_MATCH(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT1004_ENDPOINT_AND_OPERATION_POLICIES_DONT_MATCH", arg0, arg1);
    }

    /**
     * WSAT1004: WS-AT policies for endpoint policy key ''{0}'' and operation policy key ''{1}'' are incompatible
     * 
     */
    public static String WSAT_1004_ENDPOINT_AND_OPERATION_POLICIES_DONT_MATCH(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_1004_ENDPOINT_AND_OPERATION_POLICIES_DONT_MATCH(arg0, arg1));
    }

    public static Localizable localizableWSAT_4549_COMMIT_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4549_COMMIT_FINISHED_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4549: Commit finished waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4549_COMMIT_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4549_COMMIT_FINISHED_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4518_COMMITTED_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4518_COMMITTED_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4518: committedOperation entered with Notification ''{0}''
     * 
     */
    public static String WSAT_4518_COMMITTED_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4518_COMMITTED_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4511_PREPARED_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4511_PREPARED_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4511: preparedOperation exited with Notification ''{0}''
     * 
     */
    public static String WSAT_4511_PREPARED_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4511_PREPARED_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4523_REPLAY_OPERATION_SOAPEXCEPTION(Object arg0) {
        return messageFactory.getMessage("WSAT4523_REPLAY_OPERATION_SOAPEXCEPTION", arg0);
    }

    /**
     * WSAT4523: replayOperation Xid: ''{0}'' resulted in SOAPException: 
     * 
     */
    public static String WSAT_4523_REPLAY_OPERATION_SOAPEXCEPTION(Object arg0) {
        return localizer.localize(localizableWSAT_4523_REPLAY_OPERATION_SOAPEXCEPTION(arg0));
    }

    public static Localizable localizableWSAT_4504_REGISTER_OPERATION_ENTERED(Object arg0) {
        return messageFactory.getMessage("WSAT4504_REGISTER_OPERATION_ENTERED", arg0);
    }

    /**
     * WSAT4504: registerOperation entered with RegisterType ''{0}''
     * 
     */
    public static String WSAT_4504_REGISTER_OPERATION_ENTERED(Object arg0) {
        return localizer.localize(localizableWSAT_4504_REGISTER_OPERATION_ENTERED(arg0));
    }

    public static Localizable localizableWSAT_4550_COMMIT_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4550_COMMIT_RECEIVED_REPLY_STATUS", arg0, arg1, arg2);
    }

    /**
     * WSAT4550: Commit received reply status of ''{0}'' for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4550_COMMIT_RECEIVED_REPLY_STATUS(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4550_COMMIT_RECEIVED_REPLY_STATUS(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4612_WSAT_SERVERHELPER(Object arg0) {
        return messageFactory.getMessage("WSAT4612_WSAT_SERVERHELPER", arg0);
    }

    /**
     * WSAT4612: WSATServerHelper ''{0}''
     * 
     */
    public static String WSAT_4612_WSAT_SERVERHELPER(Object arg0) {
        return localizer.localize(localizableWSAT_4612_WSAT_SERVERHELPER(arg0));
    }

    public static Localizable localizableWSAT_4588_PREPARE_SENT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4588_PREPARE_SENT", arg0, arg1);
    }

    /**
     * WSAT4588: Prepare sent for durable participant with Xid ''{0}'' on Thread ''{1}''
     * 
     */
    public static String WSAT_4588_PREPARE_SENT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4588_PREPARE_SENT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4519_COMMITTED_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSAT4519_COMMITTED_OPERATION", arg0);
    }

    /**
     * WSAT4519: commitOperation Xid: ''{0}''
     * 
     */
    public static String WSAT_4519_COMMITTED_OPERATION(Object arg0) {
        return localizer.localize(localizableWSAT_4519_COMMITTED_OPERATION(arg0));
    }

    public static Localizable localizableWSAT_4507_EXCEPTION_DURING_REGISTER_SYNCHRONIZATION() {
        return messageFactory.getMessage("WSAT4507_EXCEPTION_DURING_REGISTER_SYNCHRONIZATION");
    }

    /**
     * WSAT4507: SystemException while registering WS-AT XAResource
     * 
     */
    public static String WSAT_4507_EXCEPTION_DURING_REGISTER_SYNCHRONIZATION() {
        return localizer.localize(localizableWSAT_4507_EXCEPTION_DURING_REGISTER_SYNCHRONIZATION());
    }

    public static Localizable localizableWSAT_4571_RESUMED_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4571_RESUMED_IN_CLIENT_SIDE_HANDLER", arg0, arg1);
    }

    /**
     * WSAT4571: Suspended transaction ''{0}'' resumed on thread ''{1}''
     * 
     */
    public static String WSAT_4571_RESUMED_IN_CLIENT_SIDE_HANDLER(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4571_RESUMED_IN_CLIENT_SIDE_HANDLER(arg0, arg1));
    }

    public static Localizable localizableWSAT_4524_REPLAY_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4524_REPLAY_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4524: replayOperation exited with Notification ''{0}''
     * 
     */
    public static String WSAT_4524_REPLAY_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4524_REPLAY_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4533_BEFORE_COMPLETION_INTERRUPTED_EXCEPTION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4533_BEFORE_COMPLETION_INTERRUPTED_EXCEPTION", arg0, arg1);
    }

    /**
     * WSAT4533: InterruptedException during beforeCompletion for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4533_BEFORE_COMPLETION_INTERRUPTED_EXCEPTION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4533_BEFORE_COMPLETION_INTERRUPTED_EXCEPTION(arg0, arg1));
    }

    public static Localizable localizableWSAT_4576_SOAP_EXCEPTION_CREATING_COORDINATOR_CONTEXT(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4576_SOAP_EXCEPTION_CREATING_COORDINATOR_CONTEXT", arg0, arg1, arg2);
    }

    /**
     * WSAT4576: SOAPException ''{0}'' while creating coordinator context for transaction ''{1}'' on thread ''{2}''
     * 
     */
    public static String WSAT_4576_SOAP_EXCEPTION_CREATING_COORDINATOR_CONTEXT(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4576_SOAP_EXCEPTION_CREATING_COORDINATOR_CONTEXT(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4546_COMMIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4546_COMMIT", arg0, arg1);
    }

    /**
     * WSAT4546: Commit called for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4546_COMMIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4546_COMMIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4561_EXIT_CLIENT_SIDE_HANDLE_MESSAGE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4561_EXIT_CLIENT_SIDE_HANDLE_MESSAGE", arg0, arg1);
    }

    /**
     * WSAT4561: Exit client-side handleMessage with ''{0}'' ''{1}''
     * 
     */
    public static String WSAT_4561_EXIT_CLIENT_SIDE_HANDLE_MESSAGE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4561_EXIT_CLIENT_SIDE_HANDLE_MESSAGE(arg0, arg1));
    }

    public static Localizable localizableWSAT_4616_EXCEPTION_WSATXARESOURCE_ENLIST(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4616_EXCEPTION_WSATXARESOURCE_ENLIST", arg0, arg1, arg2);
    }

    /**
     * WSAT4616: Error Enlisting EndpointReferencetype ''{0}'' with Xid ''{1}'': ''{2}''
     * 
     */
    public static String WSAT_4616_EXCEPTION_WSATXARESOURCE_ENLIST(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4616_EXCEPTION_WSATXARESOURCE_ENLIST(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4584_DURABLE_XARESOURCE_REMOVED(Object arg0) {
        return messageFactory.getMessage("WSAT4584_DURABLE_XARESOURCE_REMOVED", arg0);
    }

    /**
     * WSAT4584: Durable participant XAResource removed from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4584_DURABLE_XARESOURCE_REMOVED(Object arg0) {
        return localizer.localize(localizableWSAT_4584_DURABLE_XARESOURCE_REMOVED(arg0));
    }

    public static Localizable localizableWSAT_4548_COMMIT_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4548_COMMIT_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4548: Commit waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4548_COMMIT_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4548_COMMIT_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4585_VOLATILE_PORT_REMOVED(Object arg0) {
        return messageFactory.getMessage("WSAT4585_VOLATILE_PORT_REMOVED", arg0);
    }

    /**
     * WSAT4585: Volatile participant port removed from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4585_VOLATILE_PORT_REMOVED(Object arg0) {
        return localizer.localize(localizableWSAT_4585_VOLATILE_PORT_REMOVED(arg0));
    }

    public static Localizable localizableWSAT_4525_REGISTER_SYNCHRONIZATION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4525_REGISTER_SYNCHRONIZATION", arg0, arg1);
    }

    /**
     * WSAT4525: Registering Volatile2PC Participant ''{0}'' with Xid ''{1}''
     * 
     */
    public static String WSAT_4525_REGISTER_SYNCHRONIZATION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4525_REGISTER_SYNCHRONIZATION(arg0, arg1));
    }

    public static Localizable localizableWSAT_4530_BEFORE_COMPLETION_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4530_BEFORE_COMPLETION_FINISHED_WAITING_FOR_REPLY", arg0, arg1);
    }

    /**
     * WSAT4530: beforeCompletion finished waiting for reply for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4530_BEFORE_COMPLETION_FINISHED_WAITING_FOR_REPLY(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4530_BEFORE_COMPLETION_FINISHED_WAITING_FOR_REPLY(arg0, arg1));
    }

    public static Localizable localizableWSAT_4566_OUT_BOUND_APPLICATION_MESSAGE_NO_TRANSACTION() {
        return messageFactory.getMessage("WSAT4566_OUT_BOUND_APPLICATION_MESSAGE_NO_TRANSACTION");
    }

    /**
     * WSAT4566: Client-side outbound application message.  No transaction is present.
     * 
     */
    public static String WSAT_4566_OUT_BOUND_APPLICATION_MESSAGE_NO_TRANSACTION() {
        return localizer.localize(localizableWSAT_4566_OUT_BOUND_APPLICATION_MESSAGE_NO_TRANSACTION());
    }

    public static Localizable localizableWSAT_4501_ERROR_DELETING_BRANCH_RECORD(Object arg0) {
        return messageFactory.getMessage("WSAT4501_ERROR_DELETING_BRANCH_RECORD", arg0);
    }

    /**
     * WSAT4501: Error deleting branch record for branch ''{0}'':
     * 
     */
    public static String WSAT_4501_ERROR_DELETING_BRANCH_RECORD(Object arg0) {
        return localizer.localize(localizableWSAT_4501_ERROR_DELETING_BRANCH_RECORD(arg0));
    }

    public static Localizable localizableWSAT_4547_COMMIT_BEFORE_WAIT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4547_COMMIT_BEFORE_WAIT", arg0, arg1);
    }

    /**
     * WSAT4547: Commit call received reply COMMITTED before wait was entered for Address ''{0}'' and Xid ''{1}''
     * 
     */
    public static String WSAT_4547_COMMIT_BEFORE_WAIT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4547_COMMIT_BEFORE_WAIT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4622_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return messageFactory.getMessage("WSAT4622_FAILED_TO_CREATE_URL_FOR_WSDL");
    }

    /**
     * WSAT4622: Failed to create URL for the wsdl Location: 'file:wscoor.wsdl', retrying as a local file
     * 
     */
    public static String WSAT_4622_FAILED_TO_CREATE_URL_FOR_WSDL() {
        return localizer.localize(localizableWSAT_4622_FAILED_TO_CREATE_URL_FOR_WSDL());
    }

    public static Localizable localizableWSAT_4522_REPLAY_OPERATION(Object arg0) {
        return messageFactory.getMessage("WSAT4522_REPLAY_OPERATION", arg0);
    }

    /**
     * WSAT4522: replayOperation Xid: ''{0}''
     * 
     */
    public static String WSAT_4522_REPLAY_OPERATION(Object arg0) {
        return localizer.localize(localizableWSAT_4522_REPLAY_OPERATION(arg0));
    }

    public static Localizable localizableWSAT_4582_XID_NOT_IN_VOLATILE_RESOURCE_MAP(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4582_XID_NOT_IN_VOLATILE_RESOURCE_MAP", arg0, arg1);
    }

    /**
     * WSAT4582: Xid ''{0}'' not found in volatile participant resource map for status ''{1}''
     * 
     */
    public static String WSAT_4582_XID_NOT_IN_VOLATILE_RESOURCE_MAP(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4582_XID_NOT_IN_VOLATILE_RESOURCE_MAP(arg0, arg1));
    }

    public static Localizable localizableWSAT_4586_VOLATILE_SYNCHRONIZATION_REMOVED(Object arg0) {
        return messageFactory.getMessage("WSAT4586_VOLATILE_SYNCHRONIZATION_REMOVED", arg0);
    }

    /**
     * WSAT4586: Volatile participant Synchronization removed from cache for Xid ''{0}''
     * 
     */
    public static String WSAT_4586_VOLATILE_SYNCHRONIZATION_REMOVED(Object arg0) {
        return localizer.localize(localizableWSAT_4586_VOLATILE_SYNCHRONIZATION_REMOVED(arg0));
    }

    public static Localizable localizableWSAT_4517_READ_ONLY_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4517_READ_ONLY_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4517: readOnlyOperation exited with Notification ''{0}''
     * 
     */
    public static String WSAT_4517_READ_ONLY_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4517_READ_ONLY_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4545_INTERRUPTED_EXCEPTION_DURING_PREPARE(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4545_INTERRUPTED_EXCEPTION_DURING_PREPARE", arg0, arg1, arg2);
    }

    /**
     * WSAT4545: InterruptedException ''{0}'' during WSATXAResource prepare for Address ''{1}'' and Xid ''{2}''
     * 
     */
    public static String WSAT_4545_INTERRUPTED_EXCEPTION_DURING_PREPARE(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4545_INTERRUPTED_EXCEPTION_DURING_PREPARE(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4502_REGISTRATION_SERVICE_INSTANTIATED(Object arg0) {
        return messageFactory.getMessage("WSAT4502_REGISTRATION_SERVICE_INSTANTIATED", arg0);
    }

    /**
     * WSAT4502: WS-AT Registration Service instantiated ''{0}''
     * 
     */
    public static String WSAT_4502_REGISTRATION_SERVICE_INSTANTIATED(Object arg0) {
        return localizer.localize(localizableWSAT_4502_REGISTRATION_SERVICE_INSTANTIATED(arg0));
    }

    public static Localizable localizableWSAT_4500_ERROR_PERSISTING_BRANCH_RECORD(Object arg0) {
        return messageFactory.getMessage("WSAT4500_ERROR_PERSISTING_BRANCH_RECORD", arg0);
    }

    /**
     * WSAT4500: Error persisting branch record for branch ''{0}'':
     * 
     */
    public static String WSAT_4500_ERROR_PERSISTING_BRANCH_RECORD(Object arg0) {
        return localizer.localize(localizableWSAT_4500_ERROR_PERSISTING_BRANCH_RECORD(arg0));
    }

    public static Localizable localizableWSAT_4520_COMMITTED_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4520_COMMITTED_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4520: committedOperation exited with Notification ''{0}''
     * 
     */
    public static String WSAT_4520_COMMITTED_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4520_COMMITTED_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4508_COORDINATOR_SERVICE_INSTANTIATED(Object arg0) {
        return messageFactory.getMessage("WSAT4508_COORDINATOR_SERVICE_INSTANTIATED", arg0);
    }

    /**
     * WSAT4508: WS-AT Coordinator Service instantiated ''{0}''
     * 
     */
    public static String WSAT_4508_COORDINATOR_SERVICE_INSTANTIATED(Object arg0) {
        return localizer.localize(localizableWSAT_4508_COORDINATOR_SERVICE_INSTANTIATED(arg0));
    }

    public static Localizable localizableWSAT_4568_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_AFTER_ADDING_CONTEXT(Object arg0) {
        return messageFactory.getMessage("WSAT4568_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_AFTER_ADDING_CONTEXT", arg0);
    }

    /**
     * WSAT4568: Client-side outbound application message after adding transaction context for ''{0}''
     * 
     */
    public static String WSAT_4568_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_AFTER_ADDING_CONTEXT(Object arg0) {
        return localizer.localize(localizableWSAT_4568_OUTBOUND_APPLICATION_MESSAGE_TRANSACTION_AFTER_ADDING_CONTEXT(arg0));
    }

    public static Localizable localizableWSAT_4558_FAILED_STATE_FOR_ROLLBACK(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSAT4558_FAILED_STATE_FOR_ROLLBACK", arg0, arg1, arg2);
    }

    /**
     * WSAT4558: Failed state of ''{0}'' during WS-AT XAResource rollback for Address ''{1}'' and Xid ''{2}'' .  This may be due to a timeout waiting for a response.
     * 
     */
    public static String WSAT_4558_FAILED_STATE_FOR_ROLLBACK(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSAT_4558_FAILED_STATE_FOR_ROLLBACK(arg0, arg1, arg2));
    }

    public static Localizable localizableWSAT_4514_ABORTED_OPERATION_EXITED(Object arg0) {
        return messageFactory.getMessage("WSAT4514_ABORTED_OPERATION_EXITED", arg0);
    }

    /**
     * WSAT4514: abortedOperation exited with Notification ''{0}''
     * 
     */
    public static String WSAT_4514_ABORTED_OPERATION_EXITED(Object arg0) {
        return localizer.localize(localizableWSAT_4514_ABORTED_OPERATION_EXITED(arg0));
    }

    public static Localizable localizableWSAT_4603_SUCCESSFULLY_CREATED_PARTICIPANT_PORT(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSAT4603_SUCCESSFULLY_CREATED_PARTICIPANT_PORT", arg0, arg1);
    }

    /**
     * WSAT4603: Successfully created participant port ''{0}'' for Xid ''{1}''
     * 
     */
    public static String WSAT_4603_SUCCESSFULLY_CREATED_PARTICIPANT_PORT(Object arg0, Object arg1) {
        return localizer.localize(localizableWSAT_4603_SUCCESSFULLY_CREATED_PARTICIPANT_PORT(arg0, arg1));
    }

    public static Localizable localizableWSAT_4560_ENTER_CLIENT_SIDE_HANDLE_MESSAGE(Object arg0) {
        return messageFactory.getMessage("WSAT4560_ENTER_CLIENT_SIDE_HANDLE_MESSAGE", arg0);
    }

    /**
     * WSAT4560: Enter client-side handleMessage ''{0}''
     * 
     */
    public static String WSAT_4560_ENTER_CLIENT_SIDE_HANDLE_MESSAGE(Object arg0) {
        return localizer.localize(localizableWSAT_4560_ENTER_CLIENT_SIDE_HANDLE_MESSAGE(arg0));
    }

}
