
package com.sun.xml.ws.config.management;

import com.sun.istack.localization.Localizable;
import com.sun.istack.localization.LocalizableMessageFactory;
import com.sun.istack.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 * 
 */
public final class ManagementMessages {

    private final static LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("com.sun.xml.ws.config.management.Management");
    private final static Localizer localizer = new Localizer();

    public static Localizable localizableWSM_5087_FAILED_POLLER_START() {
        return messageFactory.getMessage("WSM_5087_FAILED_POLLER_START");
    }

    /**
     * WSM5087: Cannot start config reader, it is already running and must be stopped first.
     * 
     */
    public static String WSM_5087_FAILED_POLLER_START() {
        return localizer.localize(localizableWSM_5087_FAILED_POLLER_START());
    }

    public static Localizable localizableWSM_5004_RECONFIGURED_ENDPOINT(Object arg0) {
        return messageFactory.getMessage("WSM_5004_RECONFIGURED_ENDPOINT", arg0);
    }

    /**
     * WSM5004: Reconfigured Metro managed endpoint with id "{0}".
     * 
     */
    public static String WSM_5004_RECONFIGURED_ENDPOINT(Object arg0) {
        return localizer.localize(localizableWSM_5004_RECONFIGURED_ENDPOINT(arg0));
    }

    public static Localizable localizableWSM_5051_FOUND_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5051_FOUND_JMX_CONNECTOR_SERVER_CREATOR", arg0);
    }

    /**
     * WSM5051: Found JmxConnectorServerCreator "{0}". Instantiating.
     * 
     */
    public static String WSM_5051_FOUND_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return localizer.localize(localizableWSM_5051_FOUND_JMX_CONNECTOR_SERVER_CREATOR(arg0));
    }

    public static Localizable localizableWSM_5023_EXECUTE_SQL(Object arg0) {
        return messageFactory.getMessage("WSM_5023_EXECUTE_SQL", arg0);
    }

    /**
     * WSM5023: Executing SQL command "{0}".
     * 
     */
    public static String WSM_5023_EXECUTE_SQL(Object arg0) {
        return localizer.localize(localizableWSM_5023_EXECUTE_SQL(arg0));
    }

    public static Localizable localizableWSM_5084_ATTRIBUTE_UPDATE_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5084_ATTRIBUTE_UPDATE_FAILED", arg0);
    }

    /**
     * WSM5084: Failed to update MBean attribute "{0}". Please see the server log for more details.
     * 
     */
    public static String WSM_5084_ATTRIBUTE_UPDATE_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5084_ATTRIBUTE_UPDATE_FAILED(arg0));
    }

    public static Localizable localizableWSM_5030_NO_UPDATED_CONFIG() {
        return messageFactory.getMessage("WSM_5030_NO_UPDATED_CONFIG");
    }

    /**
     * WSM5030: SQL query did not find any updated configuration data.
     * 
     */
    public static String WSM_5030_NO_UPDATED_CONFIG() {
        return localizer.localize(localizableWSM_5030_NO_UPDATED_CONFIG());
    }

    public static Localizable localizableWSM_5073_ATTRIBUTE_NAME_NULL() {
        return messageFactory.getMessage("WSM_5073_ATTRIBUTE_NAME_NULL");
    }

    /**
     * WSM5073: Attribute name cannot be null.
     * 
     */
    public static String WSM_5073_ATTRIBUTE_NAME_NULL() {
        return localizer.localize(localizableWSM_5073_ATTRIBUTE_NAME_NULL());
    }

    public static Localizable localizableWSM_5008_MULTIPLE_INTERFACE_IMPLS(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5008_MULTIPLE_INTERFACE_IMPLS", arg0, arg1);
    }

    /**
     * WSM5008: Found more than one implementation of interface {0}. Picking class {1}.
     * 
     */
    public static String WSM_5008_MULTIPLE_INTERFACE_IMPLS(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5008_MULTIPLE_INTERFACE_IMPLS(arg0, arg1));
    }

    public static Localizable localizableWSM_5088_SERVICE_ID_NULL() {
        return messageFactory.getMessage("WSM_5088_SERVICE_ID_NULL");
    }

    /**
     * WSM5088: Service ID was null. Please specify a valid service ID.
     * 
     */
    public static String WSM_5088_SERVICE_ID_NULL() {
        return localizer.localize(localizableWSM_5088_SERVICE_ID_NULL());
    }

    public static Localizable localizableWSM_5083_CANNOT_INVOKE_SETTER(Object arg0) {
        return messageFactory.getMessage("WSM_5083_CANNOT_INVOKE_SETTER", arg0);
    }

    /**
     * WSM5083: Cannot invoke a setter of "{0}".
     * 
     */
    public static String WSM_5083_CANNOT_INVOKE_SETTER(Object arg0) {
        return localizer.localize(localizableWSM_5083_CANNOT_INVOKE_SETTER(arg0));
    }

    public static Localizable localizableWSM_5067_FAILED_CLASS_CAST(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5067_FAILED_CLASS_CAST", arg0, arg1);
    }

    /**
     * WSM5067: Failed to cast object "{0}" to type "{1}".
     * 
     */
    public static String WSM_5067_FAILED_CLASS_CAST(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5067_FAILED_CLASS_CAST(arg0, arg1));
    }

    public static Localizable localizableWSM_5052_INVOKING_JMX_CONNECTOR_SERVER_CREATOR(Object arg0, Object arg1, Object arg2, Object arg3) {
        return messageFactory.getMessage("WSM_5052_INVOKING_JMX_CONNECTOR_SERVER_CREATOR", arg0, arg1, arg2, arg3);
    }

    /**
     * WSM5052: Invoking JmxConnectorServerCreator instance [{0}] with parameters jmxServiceUrl = [{1}], environment = [{2}], server = [{3}].
     * 
     */
    public static String WSM_5052_INVOKING_JMX_CONNECTOR_SERVER_CREATOR(Object arg0, Object arg1, Object arg2, Object arg3) {
        return localizer.localize(localizableWSM_5052_INVOKING_JMX_CONNECTOR_SERVER_CREATOR(arg0, arg1, arg2, arg3));
    }

    public static Localizable localizableWSM_5079_ATTRIBUTE_NOT_FOUND(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5079_ATTRIBUTE_NOT_FOUND", arg0, arg1);
    }

    /**
     * WSM5079: Attribute "{0}" not found in "{1}".
     * 
     */
    public static String WSM_5079_ATTRIBUTE_NOT_FOUND(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5079_ATTRIBUTE_NOT_FOUND(arg0, arg1));
    }

    public static Localizable localizableWSM_5005_JMX_SERVICE_URL(Object arg0) {
        return messageFactory.getMessage("WSM_5005_JMX_SERVICE_URL", arg0);
    }

    /**
     * WSM5005: JMX Service URL is <{0}>.
     * 
     */
    public static String WSM_5005_JMX_SERVICE_URL(Object arg0) {
        return localizer.localize(localizableWSM_5005_JMX_SERVICE_URL(arg0));
    }

    public static Localizable localizableWSM_5100_INIT_RECEIVED() {
        return messageFactory.getMessage("WSM_5100_INIT_RECEIVED");
    }

    /**
     * WSM5100: Received query for "init-cm". The endpoint is getting initialized now.
     * 
     */
    public static String WSM_5100_INIT_RECEIVED() {
        return localizer.localize(localizableWSM_5100_INIT_RECEIVED());
    }

    public static Localizable localizableWSM_5055_STARTING_CONFIGURATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5055_STARTING_CONFIGURATOR", arg0);
    }

    /**
     * WSM5055: Starting configurator "{0}".
     * 
     */
    public static String WSM_5055_STARTING_CONFIGURATOR(Object arg0) {
        return localizer.localize(localizableWSM_5055_STARTING_CONFIGURATOR(arg0));
    }

    public static Localizable localizableWSM_5019_FAILED_LOOKUP(Object arg0) {
        return messageFactory.getMessage("WSM_5019_FAILED_LOOKUP", arg0);
    }

    /**
     * WSM5019: Failed to look up JDBC data source with name "{0}".
     * 
     */
    public static String WSM_5019_FAILED_LOOKUP(Object arg0) {
        return localizer.localize(localizableWSM_5019_FAILED_LOOKUP(arg0));
    }

    public static Localizable localizableWSM_5032_POLLER_START_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5032_POLLER_START_FAILED", arg0);
    }

    /**
     * WSM5032: Failed to start poller task: This instance of class {0} has not been initialized. Please call init() method first.
     * 
     */
    public static String WSM_5032_POLLER_START_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5032_POLLER_START_FAILED(arg0));
    }

    public static Localizable localizableWSM_5044_MBEAN_SERVER_START_FAILED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5044_MBEAN_SERVER_START_FAILED", arg0, arg1);
    }

    /**
     * WSM5044: Failed to start the JMX agent. MBean server [{0}] or connector [{1}] was null.
     * 
     */
    public static String WSM_5044_MBEAN_SERVER_START_FAILED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5044_MBEAN_SERVER_START_FAILED(arg0, arg1));
    }

    public static Localizable localizableWSM_5009_RECONFIGURATION_FAILED() {
        return messageFactory.getMessage("WSM_5009_RECONFIGURATION_FAILED");
    }

    /**
     * WSM5009: Failed to reconfigure web service. You can find a detailed exception message in the server log.
     * 
     */
    public static String WSM_5009_RECONFIGURATION_FAILED() {
        return localizer.localize(localizableWSM_5009_RECONFIGURATION_FAILED());
    }

    public static Localizable localizableWSM_5065_BLOCKING_ENDPOINT() {
        return messageFactory.getMessage("WSM_5065_BLOCKING_ENDPOINT");
    }

    /**
     * WSM5065: Waiting for a start signal. Blocking endpoint instantiation.
     * 
     */
    public static String WSM_5065_BLOCKING_ENDPOINT() {
        return localizer.localize(localizableWSM_5065_BLOCKING_ENDPOINT());
    }

    public static Localizable localizableWSM_5034_DUPLICATE_START(Object arg0) {
        return messageFactory.getMessage("WSM_5034_DUPLICATE_START", arg0);
    }

    /**
     * WSM5034: Duplicate start of instance {0} detected: Instance already running.
     * 
     */
    public static String WSM_5034_DUPLICATE_START(Object arg0) {
        return localizer.localize(localizableWSM_5034_DUPLICATE_START(arg0));
    }

    public static Localizable localizableWSM_5002_ENDPOINT_NOT_CREATED() {
        return messageFactory.getMessage("WSM_5002_ENDPOINT_NOT_CREATED");
    }

    /**
     * WSM5002: Did not find any ManagedService policy assertion. Creating unmanaged Metro endpoint.
     * 
     */
    public static String WSM_5002_ENDPOINT_NOT_CREATED() {
        return localizer.localize(localizableWSM_5002_ENDPOINT_NOT_CREATED());
    }

    public static Localizable localizableWSM_5069_FAILED_CONFIG_READER_CAST() {
        return messageFactory.getMessage("WSM_5069_FAILED_CONFIG_READER_CAST");
    }

    /**
     * WSM5069: Failed to cast object to ConfigReader<T>.
     * 
     */
    public static String WSM_5069_FAILED_CONFIG_READER_CAST() {
        return localizer.localize(localizableWSM_5069_FAILED_CONFIG_READER_CAST());
    }

    public static Localizable localizableRECONFIG_ATTRIBUTE_DESCRIPTION() {
        return messageFactory.getMessage("RECONFIG_ATTRIBUTE_DESCRIPTION");
    }

    /**
     * A XML document with policies in external attachment format.
     * 
     */
    public static String RECONFIG_ATTRIBUTE_DESCRIPTION() {
        return localizer.localize(localizableRECONFIG_ATTRIBUTE_DESCRIPTION());
    }

    public static Localizable localizableWSM_5048_MBEAN_UNREGISTRATION_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5048_MBEAN_UNREGISTRATION_FAILED", arg0);
    }

    /**
     * WSM5048: Failed to unregister MBean [{0}].
     * 
     */
    public static String WSM_5048_MBEAN_UNREGISTRATION_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5048_MBEAN_UNREGISTRATION_FAILED(arg0));
    }

    public static Localizable localizableWSM_5049_INVALID_OBJECT_NAME() {
        return messageFactory.getMessage("WSM_5049_INVALID_OBJECT_NAME");
    }

    /**
     * WSM5049: Web service MBean name was invalid.
     * 
     */
    public static String WSM_5049_INVALID_OBJECT_NAME() {
        return localizer.localize(localizableWSM_5049_INVALID_OBJECT_NAME());
    }

    public static Localizable localizableWSM_5082_ATTRIBUTE_LIST_NULL() {
        return messageFactory.getMessage("WSM_5082_ATTRIBUTE_LIST_NULL");
    }

    /**
     * WSM5082: AttributeList attributes cannot be null.
     * 
     */
    public static String WSM_5082_ATTRIBUTE_LIST_NULL() {
        return localizer.localize(localizableWSM_5082_ATTRIBUTE_LIST_NULL());
    }

    public static Localizable localizableWSM_5016_FAILED_INSTANTIATE_OBJECT(Object arg0) {
        return messageFactory.getMessage("WSM_5016_FAILED_INSTANTIATE_OBJECT", arg0);
    }

    /**
     * WSM5016: Failed to instantiate object of type "{0}".
     * 
     */
    public static String WSM_5016_FAILED_INSTANTIATE_OBJECT(Object arg0) {
        return localizer.localize(localizableWSM_5016_FAILED_INSTANTIATE_OBJECT(arg0));
    }

    public static Localizable localizableWSM_5057_STARTING_COMMUNICATION(Object arg0) {
        return messageFactory.getMessage("WSM_5057_STARTING_COMMUNICATION", arg0);
    }

    /**
     * WSM5057: Starting communication interface "{0}".
     * 
     */
    public static String WSM_5057_STARTING_COMMUNICATION(Object arg0) {
        return localizer.localize(localizableWSM_5057_STARTING_COMMUNICATION(arg0));
    }

    public static Localizable localizableWSM_5063_FAILED_COMMUNICATION_STOP(Object arg0) {
        return messageFactory.getMessage("WSM_5063_FAILED_COMMUNICATION_STOP", arg0);
    }

    /**
     * WSM5063: Failed to stop communication interface "{0}".
     * 
     */
    public static String WSM_5063_FAILED_COMMUNICATION_STOP(Object arg0) {
        return localizer.localize(localizableWSM_5063_FAILED_COMMUNICATION_STOP(arg0));
    }

    public static Localizable localizableWSM_5101_DISPOSE_FAILED() {
        return messageFactory.getMessage("WSM_5101_DISPOSE_FAILED");
    }

    /**
     * WSM5101: Execution of the dispose method threw an exception.
     * 
     */
    public static String WSM_5101_DISPOSE_FAILED() {
        return localizer.localize(localizableWSM_5101_DISPOSE_FAILED());
    }

    public static Localizable localizableRECONFIG_MBEAN_CONSTRUCTOR_DESCRIPTION(Object arg0) {
        return messageFactory.getMessage("RECONFIG_MBEAN_CONSTRUCTOR_DESCRIPTION", arg0);
    }

    /**
     * Constructs a "{0}" instance allowing to reconfigure Metro.
     * 
     */
    public static String RECONFIG_MBEAN_CONSTRUCTOR_DESCRIPTION(Object arg0) {
        return localizer.localize(localizableRECONFIG_MBEAN_CONSTRUCTOR_DESCRIPTION(arg0));
    }

    public static Localizable localizableWSM_5027_PARAMETER_MISSING_ATTRIBUTE(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5027_PARAMETER_MISSING_ATTRIBUTE", arg0, arg1);
    }

    /**
     * WSM5027: The parameter "{0}" must have a "{1}" attribute.
     * 
     */
    public static String WSM_5027_PARAMETER_MISSING_ATTRIBUTE(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5027_PARAMETER_MISSING_ATTRIBUTE(arg0, arg1));
    }

    public static Localizable localizableWSM_5089_CREATING_JMX_CONNECTOR_SERVER(Object arg0, Object arg1, Object arg2) {
        return messageFactory.getMessage("WSM_5089_CREATING_JMX_CONNECTOR_SERVER", arg0, arg1, arg2);
    }

    /**
     * WSM5089: Creating JmxConnectorServer instance with parameters jmxServiceUrl = [{0}], environment = [{1}], server = [{2}].
     * 
     */
    public static String WSM_5089_CREATING_JMX_CONNECTOR_SERVER(Object arg0, Object arg1, Object arg2) {
        return localizer.localize(localizableWSM_5089_CREATING_JMX_CONNECTOR_SERVER(arg0, arg1, arg2));
    }

    public static Localizable localizableWSM_5000_RECONFIGURED_ENDPOINT(Object arg0) {
        return messageFactory.getMessage("WSM_5000_RECONFIGURED_ENDPOINT", arg0);
    }

    /**
     * WSM5000: Reconfigured Metro managed endpoint with id "{0}".
     * 
     */
    public static String WSM_5000_RECONFIGURED_ENDPOINT(Object arg0) {
        return localizer.localize(localizableWSM_5000_RECONFIGURED_ENDPOINT(arg0));
    }

    public static Localizable localizableWSM_5042_MBEAN_REGISTRATION_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5042_MBEAN_REGISTRATION_FAILED", arg0);
    }

    /**
     * WSM5042: Failed to register MBean [{0}].
     * 
     */
    public static String WSM_5042_MBEAN_REGISTRATION_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5042_MBEAN_REGISTRATION_FAILED(arg0));
    }

    public static Localizable localizableRECONFIG_NOTIFICATION_MESSAGE() {
        return messageFactory.getMessage("RECONFIG_NOTIFICATION_MESSAGE");
    }

    /**
     * Reconfigured the endpoint successfully.
     * 
     */
    public static String RECONFIG_NOTIFICATION_MESSAGE() {
        return localizer.localize(localizableRECONFIG_NOTIFICATION_MESSAGE());
    }

    public static Localizable localizableWSM_5098_NOTIFICATION_SENT(Object arg0) {
        return messageFactory.getMessage("WSM_5098_NOTIFICATION_SENT", arg0);
    }

    /**
     * WSM5098: Sent this notification to all listeners: "{0}".
     * 
     */
    public static String WSM_5098_NOTIFICATION_SENT(Object arg0) {
        return localizer.localize(localizableWSM_5098_NOTIFICATION_SENT(arg0));
    }

    public static Localizable localizableWSM_5054_FAILED_CLASS_CAST_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5054_FAILED_CLASS_CAST_JMX_CONNECTOR_SERVER_CREATOR", arg0);
    }

    /**
     * WSM5054: Failed to cast class "{0}" to JmxConnectorServerCreator.
     * 
     */
    public static String WSM_5054_FAILED_CLASS_CAST_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return localizer.localize(localizableWSM_5054_FAILED_CLASS_CAST_JMX_CONNECTOR_SERVER_CREATOR(arg0));
    }

    public static Localizable localizableWSM_5038_FAILED_CONFIG_READ() {
        return messageFactory.getMessage("WSM_5038_FAILED_CONFIG_READ");
    }

    /**
     * WSM5038: Failed to read configuration data.
     * 
     */
    public static String WSM_5038_FAILED_CONFIG_READ() {
        return localizer.localize(localizableWSM_5038_FAILED_CONFIG_READ());
    }

    public static Localizable localizableWSM_5075_CANNOT_FIND_ATTRIBUTE(Object arg0) {
        return messageFactory.getMessage("WSM_5075_CANNOT_FIND_ATTRIBUTE", arg0);
    }

    /**
     * WSM5075: Cannot find attribute "{0}".
     * 
     */
    public static String WSM_5075_CANNOT_FIND_ATTRIBUTE(Object arg0) {
        return localizer.localize(localizableWSM_5075_CANNOT_FIND_ATTRIBUTE(arg0));
    }

    public static Localizable localizableWSM_5050_INVALID_JMX_SERVICE_URL(Object arg0) {
        return messageFactory.getMessage("WSM_5050_INVALID_JMX_SERVICE_URL", arg0);
    }

    /**
     * WSM5050: <{0}> is not a valid JMXServiceURL.
     * 
     */
    public static String WSM_5050_INVALID_JMX_SERVICE_URL(Object arg0) {
        return localizer.localize(localizableWSM_5050_INVALID_JMX_SERVICE_URL(arg0));
    }

    public static Localizable localizableWSM_5085_ATTRIBUTE_UNREADABLE(Object arg0) {
        return messageFactory.getMessage("WSM_5085_ATTRIBUTE_UNREADABLE", arg0);
    }

    /**
     * WSM5085: The attribute "{0}" is not readable.
     * 
     */
    public static String WSM_5085_ATTRIBUTE_UNREADABLE(Object arg0) {
        return localizer.localize(localizableWSM_5085_ATTRIBUTE_UNREADABLE(arg0));
    }

    public static Localizable localizableWSM_5097_FAILED_CONFIG_PARSE() {
        return messageFactory.getMessage("WSM_5097_FAILED_CONFIG_PARSE");
    }

    /**
     * WSM5097: Failed to parse the new configuration data. The policies document is not valid.
     * 
     */
    public static String WSM_5097_FAILED_CONFIG_PARSE() {
        return localizer.localize(localizableWSM_5097_FAILED_CONFIG_PARSE());
    }

    public static Localizable localizableWSM_5041_MBEAN_INSTANCE_EXISTS(Object arg0) {
        return messageFactory.getMessage("WSM_5041_MBEAN_INSTANCE_EXISTS", arg0);
    }

    /**
     * WSM5041: Failed to register MBean [{0}], instance apparently exists already.
     * 
     */
    public static String WSM_5041_MBEAN_INSTANCE_EXISTS(Object arg0) {
        return localizer.localize(localizableWSM_5041_MBEAN_INSTANCE_EXISTS(arg0));
    }

    public static Localizable localizableWSM_5070_FAILED_CONFIG_SAVER_CAST() {
        return messageFactory.getMessage("WSM_5070_FAILED_CONFIG_SAVER_CAST");
    }

    /**
     * WSM5070: Failed to cast object to ConfigSaver<T>.
     * 
     */
    public static String WSM_5070_FAILED_CONFIG_SAVER_CAST() {
        return localizer.localize(localizableWSM_5070_FAILED_CONFIG_SAVER_CAST());
    }

    public static Localizable localizableWSM_5029_FOUND_UPDATED_CONFIG() {
        return messageFactory.getMessage("WSM_5029_FOUND_UPDATED_CONFIG");
    }

    /**
     * WSM5029: SQL query found updated configuration data.
     * 
     */
    public static String WSM_5029_FOUND_UPDATED_CONFIG() {
        return localizer.localize(localizableWSM_5029_FOUND_UPDATED_CONFIG());
    }

    public static Localizable localizableWSM_5043_MBEAN_CONNECTOR_START_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5043_MBEAN_CONNECTOR_START_FAILED", arg0);
    }

    /**
     * WSM5043: Failed to start the JMXConnectorServer [{0}].
     * 
     */
    public static String WSM_5043_MBEAN_CONNECTOR_START_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5043_MBEAN_CONNECTOR_START_FAILED(arg0));
    }

    public static Localizable localizableWSM_5020_LOOKUP_DATASOURCE(Object arg0) {
        return messageFactory.getMessage("WSM_5020_LOOKUP_DATASOURCE", arg0);
    }

    /**
     * WSM5020: Looking up JDBC data source with name "{0}".
     * 
     */
    public static String WSM_5020_LOOKUP_DATASOURCE(Object arg0) {
        return localizer.localize(localizableWSM_5020_LOOKUP_DATASOURCE(arg0));
    }

    public static Localizable localizableWSM_5026_FAILED_STATEMENT_CLOSE(Object arg0) {
        return messageFactory.getMessage("WSM_5026_FAILED_STATEMENT_CLOSE", arg0);
    }

    /**
     * WSM5026: Failed to close SQL statement "{0}".
     * 
     */
    public static String WSM_5026_FAILED_STATEMENT_CLOSE(Object arg0) {
        return localizer.localize(localizableWSM_5026_FAILED_STATEMENT_CLOSE(arg0));
    }

    public static Localizable localizableWSM_5095_FAILED_SDDOCUMENT_CONVERSION(Object arg0) {
        return messageFactory.getMessage("WSM_5095_FAILED_SDDOCUMENT_CONVERSION", arg0);
    }

    /**
     * WSM5095: Failed to convert document "{0}" to a SDDocumentSource.
     * 
     */
    public static String WSM_5095_FAILED_SDDOCUMENT_CONVERSION(Object arg0) {
        return localizer.localize(localizableWSM_5095_FAILED_SDDOCUMENT_CONVERSION(arg0));
    }

    public static Localizable localizableWSM_5086_ATTRIBUTE_UNWRITABLE(Object arg0) {
        return messageFactory.getMessage("WSM_5086_ATTRIBUTE_UNWRITABLE", arg0);
    }

    /**
     * WSM5086: The attribute "{0}" is not writable.
     * 
     */
    public static String WSM_5086_ATTRIBUTE_UNWRITABLE(Object arg0) {
        return localizer.localize(localizableWSM_5086_ATTRIBUTE_UNWRITABLE(arg0));
    }

    public static Localizable localizableWSM_5059_STOPPING_CONFIGURATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5059_STOPPING_CONFIGURATOR", arg0);
    }

    /**
     * WSM5055: Stopping configurator "{0}".
     * 
     */
    public static String WSM_5059_STOPPING_CONFIGURATOR(Object arg0) {
        return localizer.localize(localizableWSM_5059_STOPPING_CONFIGURATOR(arg0));
    }

    public static Localizable localizableWSM_5010_EXPECTED_STRING(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5010_EXPECTED_STRING", arg0, arg1);
    }

    /**
     * WSM5010: Cannot set attribute {0} to a {1} object, String expected."
     * 
     */
    public static String WSM_5010_EXPECTED_STRING(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5010_EXPECTED_STRING(arg0, arg1));
    }

    public static Localizable localizableWSM_5090_FAILED_INSTANTIATION_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5090_FAILED_INSTANTIATION_JMX_CONNECTOR_SERVER_CREATOR", arg0);
    }

    /**
     * WSM5090: Failed to create an instance of class "{0}".
     * 
     */
    public static String WSM_5090_FAILED_INSTANTIATION_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return localizer.localize(localizableWSM_5090_FAILED_INSTANTIATION_JMX_CONNECTOR_SERVER_CREATOR(arg0));
    }

    public static Localizable localizableWSM_5076_ATTRIBUTE_NULL() {
        return messageFactory.getMessage("WSM_5076_ATTRIBUTE_NULL");
    }

    /**
     * WSM5076: Attribute cannot be null.
     * 
     */
    public static String WSM_5076_ATTRIBUTE_NULL() {
        return localizer.localize(localizableWSM_5076_ATTRIBUTE_NULL());
    }

    public static Localizable localizableWSM_5061_STOPPING_COMMUNICATION(Object arg0) {
        return messageFactory.getMessage("WSM_5061_STOPPING_COMMUNICATION", arg0);
    }

    /**
     * WSM5057: Stopping communication interface "{0}".
     * 
     */
    public static String WSM_5061_STOPPING_COMMUNICATION(Object arg0) {
        return localizer.localize(localizableWSM_5061_STOPPING_COMMUNICATION(arg0));
    }

    public static Localizable localizableRECONFIG_MBEAN_NAME() {
        return messageFactory.getMessage("RECONFIG_MBEAN_NAME");
    }

    /**
     * ReconfigMBean
     * 
     */
    public static String RECONFIG_MBEAN_NAME() {
        return localizer.localize(localizableRECONFIG_MBEAN_NAME());
    }

    public static Localizable localizableWSM_5078_ATTRIBUTE_VALUE_NULL(Object arg0) {
        return messageFactory.getMessage("WSM_5078_ATTRIBUTE_VALUE_NULL", arg0);
    }

    /**
     * WSM5078: Value of attribute "{0}" may not be null.
     * 
     */
    public static String WSM_5078_ATTRIBUTE_VALUE_NULL(Object arg0) {
        return localizer.localize(localizableWSM_5078_ATTRIBUTE_VALUE_NULL(arg0));
    }

    public static Localizable localizableWSM_5074_GET_ATTRIBUTE_NULL_NAME() {
        return messageFactory.getMessage("WSM_5074_GET_ATTRIBUTE_NULL_NAME");
    }

    /**
     * WSM5074: Cannot call getAttribute with null attribute name.
     * 
     */
    public static String WSM_5074_GET_ATTRIBUTE_NULL_NAME() {
        return localizer.localize(localizableWSM_5074_GET_ATTRIBUTE_NULL_NAME());
    }

    public static Localizable localizableWSM_5047_MBEAN_UNREGISTER_INSTANCE_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5047_MBEAN_UNREGISTER_INSTANCE_FAILED", arg0);
    }

    /**
     * WSM5047: Failed to unregister MBean [{0}]. Instance could not be found.
     * 
     */
    public static String WSM_5047_MBEAN_UNREGISTER_INSTANCE_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5047_MBEAN_UNREGISTER_INSTANCE_FAILED(arg0));
    }

    public static Localizable localizableWSM_5099_START_INTERRUPTED() {
        return messageFactory.getMessage("WSM_5099_START_INTERRUPTED");
    }

    /**
     * WSM5099: Endpoint creation was interrupted while waiting for start signal.
     * 
     */
    public static String WSM_5099_START_INTERRUPTED() {
        return localizer.localize(localizableWSM_5099_START_INTERRUPTED());
    }

    public static Localizable localizableWSM_5033_POLLER_STOP_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5033_POLLER_STOP_FAILED", arg0);
    }

    /**
     * WSM5033: Failed to stop poller task: This instance of class {0} has not been initialized. Please call init() method first.
     * 
     */
    public static String WSM_5033_POLLER_STOP_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5033_POLLER_STOP_FAILED(arg0));
    }

    public static Localizable localizableWSM_5037_FAILED_RECONFIGURE() {
        return messageFactory.getMessage("WSM_5037_FAILED_RECONFIGURE");
    }

    /**
     * WSM5037: Failed to reconfigure web service endpoint.
     * 
     */
    public static String WSM_5037_FAILED_RECONFIGURE() {
        return localizer.localize(localizableWSM_5037_FAILED_RECONFIGURE());
    }

    public static Localizable localizableWSM_5046_MBEAN_CONNECTOR_STOP_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5046_MBEAN_CONNECTOR_STOP_FAILED", arg0);
    }

    /**
     * WSM5046: Failed to stop JMXConnectorServer [{0}].
     * 
     */
    public static String WSM_5046_MBEAN_CONNECTOR_STOP_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5046_MBEAN_CONNECTOR_STOP_FAILED(arg0));
    }

    public static Localizable localizableWSM_5096_CANNOT_MARSHAL(Object arg0) {
        return messageFactory.getMessage("WSM_5096_CANNOT_MARSHAL", arg0);
    }

    /**
     * WSM5096: Failed to marshal policy expression onto XML stream "{0}".
     * 
     */
    public static String WSM_5096_CANNOT_MARSHAL(Object arg0) {
        return localizer.localize(localizableWSM_5096_CANNOT_MARSHAL(arg0));
    }

    public static Localizable localizableRECONFIG_MBEAN_DESCRIPTION() {
        return messageFactory.getMessage("RECONFIG_MBEAN_DESCRIPTION");
    }

    /**
     * Metro reconfiguration.
     * 
     */
    public static String RECONFIG_MBEAN_DESCRIPTION() {
        return localizer.localize(localizableRECONFIG_MBEAN_DESCRIPTION());
    }

    public static Localizable localizableWSM_5014_XML_VALUE_EMPTY(Object arg0) {
        return messageFactory.getMessage("WSM_5014_XML_VALUE_EMPTY", arg0);
    }

    /**
     * WSM5014: Expected a value for tag <{0}>.
     * 
     */
    public static String WSM_5014_XML_VALUE_EMPTY(Object arg0) {
        return localizer.localize(localizableWSM_5014_XML_VALUE_EMPTY(arg0));
    }

    public static Localizable localizableRECONFIG_NOTIFICATION_DESCRIPTION() {
        return messageFactory.getMessage("RECONFIG_NOTIFICATION_DESCRIPTION");
    }

    /**
     * Issued if the endpoint was reconfigured.
     * 
     */
    public static String RECONFIG_NOTIFICATION_DESCRIPTION() {
        return localizer.localize(localizableRECONFIG_NOTIFICATION_DESCRIPTION());
    }

    public static Localizable localizableWSM_5081_GET_ATTRIBUTES_NULL_NAME() {
        return messageFactory.getMessage("WSM_5081_GET_ATTRIBUTES_NULL_NAME");
    }

    /**
     * WSM5081: Cannot call getAttributes with null attribute names.
     * 
     */
    public static String WSM_5081_GET_ATTRIBUTES_NULL_NAME() {
        return localizer.localize(localizableWSM_5081_GET_ATTRIBUTES_NULL_NAME());
    }

    public static Localizable localizableWSM_5024_EXECUTE_SQL_UPDATE(Object arg0) {
        return messageFactory.getMessage("WSM_5024_EXECUTE_SQL_UPDATE", arg0);
    }

    /**
     * WSM5024: SQL UPDATE returned row count 0. Executing SQL command "{0}".
     * 
     */
    public static String WSM_5024_EXECUTE_SQL_UPDATE(Object arg0) {
        return localizer.localize(localizableWSM_5024_EXECUTE_SQL_UPDATE(arg0));
    }

    public static Localizable localizableWSM_5045_MBEAN_CONNECTOR_CREATE_FAILED(Object arg0) {
        return messageFactory.getMessage("WSM_5045_MBEAN_CONNECTOR_CREATE_FAILED", arg0);
    }

    /**
     * WSM5045: Failed to create JMXConnectorServer with URL <{0}>.
     * 
     */
    public static String WSM_5045_MBEAN_CONNECTOR_CREATE_FAILED(Object arg0) {
        return localizer.localize(localizableWSM_5045_MBEAN_CONNECTOR_CREATE_FAILED(arg0));
    }

    public static Localizable localizableWSM_5091_ENDPOINT_CREATION_FAILED() {
        return messageFactory.getMessage("WSM_5091_ENDPOINT_CREATION_FAILED");
    }

    /**
     * WSM5091: Failed to create new Endpoint instance.
     * 
     */
    public static String WSM_5091_ENDPOINT_CREATION_FAILED() {
        return localizer.localize(localizableWSM_5091_ENDPOINT_CREATION_FAILED());
    }

    public static Localizable localizableWSM_5064_FAILED_CONFIGURATOR_STOP(Object arg0) {
        return messageFactory.getMessage("WSM_5064_FAILED_CONFIGURATOR_STOP", arg0);
    }

    /**
     * WSM5064: Failed to stop configurator "{0}".
     * 
     */
    public static String WSM_5064_FAILED_CONFIGURATOR_STOP(Object arg0) {
        return localizer.localize(localizableWSM_5064_FAILED_CONFIGURATOR_STOP(arg0));
    }

    public static Localizable localizableWSM_5080_ATTRIBUTE_NAMES_ARRAY_NULL() {
        return messageFactory.getMessage("WSM_5080_ATTRIBUTE_NAMES_ARRAY_NULL");
    }

    /**
     * WSM5080: attributeNames[] cannot be null.
     * 
     */
    public static String WSM_5080_ATTRIBUTE_NAMES_ARRAY_NULL() {
        return localizer.localize(localizableWSM_5080_ATTRIBUTE_NAMES_ARRAY_NULL());
    }

    public static Localizable localizableWSM_5007_NO_INTERFACE_IMPL(Object arg0) {
        return messageFactory.getMessage("WSM_5007_NO_INTERFACE_IMPL", arg0);
    }

    /**
     * WSM5007: Failed to find any implementation of interface {0}.
     * 
     */
    public static String WSM_5007_NO_INTERFACE_IMPL(Object arg0) {
        return localizer.localize(localizableWSM_5007_NO_INTERFACE_IMPL(arg0));
    }

    public static Localizable localizableWSM_5018_FAILED_READ() {
        return messageFactory.getMessage("WSM_5018_FAILED_READ");
    }

    /**
     * WSM5018: Failed to read data.
     * 
     */
    public static String WSM_5018_FAILED_READ() {
        return localizer.localize(localizableWSM_5018_FAILED_READ());
    }

    public static Localizable localizableWSM_5053_CLASS_NOT_FOUND_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5053_CLASS_NOT_FOUND_JMX_CONNECTOR_SERVER_CREATOR", arg0);
    }

    /**
     * WSM5053: Failed to load implementation of interface JmxConnectorServerCreator with class name "{0}".
     * 
     */
    public static String WSM_5053_CLASS_NOT_FOUND_JMX_CONNECTOR_SERVER_CREATOR(Object arg0) {
        return localizer.localize(localizableWSM_5053_CLASS_NOT_FOUND_JMX_CONNECTOR_SERVER_CREATOR(arg0));
    }

    public static Localizable localizableWSM_5094_FAILED_POLICIES_REPLACE(Object arg0) {
        return messageFactory.getMessage("WSM_5094_FAILED_POLICIES_REPLACE", arg0);
    }

    /**
     * WSM5094: Failed to replace policies in WSDL document "{0}".
     * 
     */
    public static String WSM_5094_FAILED_POLICIES_REPLACE(Object arg0) {
        return localizer.localize(localizableWSM_5094_FAILED_POLICIES_REPLACE(arg0));
    }

    public static Localizable localizableWSM_5093_NO_SERVICE_DEFINITION() {
        return messageFactory.getMessage("WSM_5093_NO_SERVICE_DEFINITION");
    }

    /**
     * WSM5093: Cannot create an endpoint without service definition.
     * 
     */
    public static String WSM_5093_NO_SERVICE_DEFINITION() {
        return localizer.localize(localizableWSM_5093_NO_SERVICE_DEFINITION());
    }

    public static Localizable localizableWSM_5025_SQL_FAILED() {
        return messageFactory.getMessage("WSM_5025_SQL_FAILED");
    }

    /**
     * WSM5025: SQL command failed.
     * 
     */
    public static String WSM_5025_SQL_FAILED() {
        return localizer.localize(localizableWSM_5025_SQL_FAILED());
    }

    public static Localizable localizableWSM_5092_NEW_ENDPOINT_DELEGATE(Object arg0) {
        return messageFactory.getMessage("WSM_5092_NEW_ENDPOINT_DELEGATE", arg0);
    }

    /**
     * WSM5092: Created new Endpoint delegate instance: {0}.
     * 
     */
    public static String WSM_5092_NEW_ENDPOINT_DELEGATE(Object arg0) {
        return localizer.localize(localizableWSM_5092_NEW_ENDPOINT_DELEGATE(arg0));
    }

    public static Localizable localizableWSM_5036_WAIT_ENDPOINT_START(Object arg0) {
        return messageFactory.getMessage("WSM_5036_WAIT_ENDPOINT_START", arg0);
    }

    /**
     * WSM5036: Start attribute is "{0}". Waiting for configuration data before starting web service endpoint.
     * 
     */
    public static String WSM_5036_WAIT_ENDPOINT_START(Object arg0) {
        return localizer.localize(localizableWSM_5036_WAIT_ENDPOINT_START(arg0));
    }

    public static Localizable localizableWSM_5056_STARTED_CONFIGURATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5056_STARTED_CONFIGURATOR", arg0);
    }

    /**
     * WSM5056: Started configurator "{0}".
     * 
     */
    public static String WSM_5056_STARTED_CONFIGURATOR(Object arg0) {
        return localizer.localize(localizableWSM_5056_STARTED_CONFIGURATOR(arg0));
    }

    public static Localizable localizableWSM_5031_DUPLICATE_INITIALIZATION(Object arg0) {
        return messageFactory.getMessage("WSM_5031_DUPLICATE_INITIALIZATION", arg0);
    }

    /**
     * WSM5031: Duplicate initialization detected: This instance of class {0} has already been initialized.
     * 
     */
    public static String WSM_5031_DUPLICATE_INITIALIZATION(Object arg0) {
        return localizer.localize(localizableWSM_5031_DUPLICATE_INITIALIZATION(arg0));
    }

    public static Localizable localizableWSM_5068_FAILED_COMMUNICATION_SERVER_CAST() {
        return messageFactory.getMessage("WSM_5068_FAILED_COMMUNICATION_SERVER_CAST");
    }

    /**
     * WSM5068: Failed to cast object to CommunicationServer<T>.
     * 
     */
    public static String WSM_5068_FAILED_COMMUNICATION_SERVER_CAST() {
        return localizer.localize(localizableWSM_5068_FAILED_COMMUNICATION_SERVER_CAST());
    }

    public static Localizable localizableWSM_5066_STARTING_ENDPOINT() {
        return messageFactory.getMessage("WSM_5066_STARTING_ENDPOINT");
    }

    /**
     * WSM5066: Received a start signal. Unblocking endpoint instantiation.
     * 
     */
    public static String WSM_5066_STARTING_ENDPOINT() {
        return localizer.localize(localizableWSM_5066_STARTING_ENDPOINT());
    }

    public static Localizable localizableWSM_5021_NO_DB_CONNECT(Object arg0) {
        return messageFactory.getMessage("WSM_5021_NO_DB_CONNECT", arg0);
    }

    /**
     * WSM5021: Failed to establish a database connection with source "{0}".
     * 
     */
    public static String WSM_5021_NO_DB_CONNECT(Object arg0) {
        return localizer.localize(localizableWSM_5021_NO_DB_CONNECT(arg0));
    }

    public static Localizable localizableWSM_5062_STOPPED_COMMUNICATION(Object arg0) {
        return messageFactory.getMessage("WSM_5062_STOPPED_COMMUNICATION", arg0);
    }

    /**
     * WSM5058: Stopped communication interface "{0}".
     * 
     */
    public static String WSM_5062_STOPPED_COMMUNICATION(Object arg0) {
        return localizer.localize(localizableWSM_5062_STOPPED_COMMUNICATION(arg0));
    }

    public static Localizable localizableWSM_5022_NO_DB_CLOSE(Object arg0) {
        return messageFactory.getMessage("WSM_5022_NO_DB_CLOSE", arg0);
    }

    /**
     * WSM5022: Failed to close database connection "{0}".
     * 
     */
    public static String WSM_5022_NO_DB_CLOSE(Object arg0) {
        return localizer.localize(localizableWSM_5022_NO_DB_CLOSE(arg0));
    }

    public static Localizable localizableWSM_5077_SETTER_ATTRIBUTE_NULL(Object arg0) {
        return messageFactory.getMessage("WSM_5077_SETTER_ATTRIBUTE_NULL", arg0);
    }

    /**
     * WSM5077: Cannot invoke a setter of "{0}" with null attribute.
     * 
     */
    public static String WSM_5077_SETTER_ATTRIBUTE_NULL(Object arg0) {
        return localizer.localize(localizableWSM_5077_SETTER_ATTRIBUTE_NULL(arg0));
    }

    public static Localizable localizableWSM_5058_STARTED_COMMUNICATION(Object arg0) {
        return messageFactory.getMessage("WSM_5058_STARTED_COMMUNICATION", arg0);
    }

    /**
     * WSM5058: Started communication interface "{0}".
     * 
     */
    public static String WSM_5058_STARTED_COMMUNICATION(Object arg0) {
        return localizer.localize(localizableWSM_5058_STARTED_COMMUNICATION(arg0));
    }

    public static Localizable localizableWSM_5071_FAILED_CONFIGURATOR_CAST() {
        return messageFactory.getMessage("WSM_5071_FAILED_CONFIGURATOR_CAST");
    }

    /**
     * WSM5071: Failed to cast object to Configurator<T>.
     * 
     */
    public static String WSM_5071_FAILED_CONFIGURATOR_CAST() {
        return localizer.localize(localizableWSM_5071_FAILED_CONFIGURATOR_CAST());
    }

    public static Localizable localizableWSM_5039_FAILED_NUMBER_CONVERSION(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5039_FAILED_NUMBER_CONVERSION", arg0, arg1);
    }

    /**
     * WSM5039: Failed to convert parameter "{0}" with value "{1}" to an integer.
     * 
     */
    public static String WSM_5039_FAILED_NUMBER_CONVERSION(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5039_FAILED_NUMBER_CONVERSION(arg0, arg1));
    }

    public static Localizable localizableWSM_5017_FAILED_PARAMETERS_CAST(Object arg0) {
        return messageFactory.getMessage("WSM_5017_FAILED_PARAMETERS_CAST", arg0);
    }

    /**
     * WSM5017: Failed to cast parameter with name "{0}".
     * 
     */
    public static String WSM_5017_FAILED_PARAMETERS_CAST(Object arg0) {
        return localizer.localize(localizableWSM_5017_FAILED_PARAMETERS_CAST(arg0));
    }

    public static Localizable localizableWSM_5015_FAILED_LOAD_CLASS(Object arg0) {
        return messageFactory.getMessage("WSM_5015_FAILED_LOAD_CLASS", arg0);
    }

    /**
     * WSM5015: Failed to load class "{0}".
     * 
     */
    public static String WSM_5015_FAILED_LOAD_CLASS(Object arg0) {
        return localizer.localize(localizableWSM_5015_FAILED_LOAD_CLASS(arg0));
    }

    public static Localizable localizableWSM_5035_START_ENDPOINT_IMMEDIATELY(Object arg0) {
        return messageFactory.getMessage("WSM_5035_START_ENDPOINT_IMMEDIATELY", arg0);
    }

    /**
     * WSM5035: Start attribute is "{0}". Starting web service endpoint immediately.
     * 
     */
    public static String WSM_5035_START_ENDPOINT_IMMEDIATELY(Object arg0) {
        return localizer.localize(localizableWSM_5035_START_ENDPOINT_IMMEDIATELY(arg0));
    }

    public static Localizable localizableWSM_5040_CREATED_POLLER(Object arg0) {
        return messageFactory.getMessage("WSM_5040_CREATED_POLLER", arg0);
    }

    /**
     * WSM5040: Created configuration poller with polling interval {0} ms.
     * 
     */
    public static String WSM_5040_CREATED_POLLER(Object arg0) {
        return localizer.localize(localizableWSM_5040_CREATED_POLLER(arg0));
    }

    public static Localizable localizableWSM_5006_UNEXPECTED_ENTRY(Object arg0) {
        return messageFactory.getMessage("WSM_5006_UNEXPECTED_ENTRY", arg0);
    }

    /**
     * WSM5006: Expected parameter with name Entry but instead got {0}
     * 
     */
    public static String WSM_5006_UNEXPECTED_ENTRY(Object arg0) {
        return localizer.localize(localizableWSM_5006_UNEXPECTED_ENTRY(arg0));
    }

    public static Localizable localizableRECONFIG_ATTRIBUTE_NAME() {
        return messageFactory.getMessage("RECONFIG_ATTRIBUTE_NAME");
    }

    /**
     * policies
     * 
     */
    public static String RECONFIG_ATTRIBUTE_NAME() {
        return localizer.localize(localizableRECONFIG_ATTRIBUTE_NAME());
    }

    public static Localizable localizableWSM_5001_ENDPOINT_CREATED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5001_ENDPOINT_CREATED", arg0, arg1);
    }

    /**
     * WSM5001: Created Metro managed endpoint with id "{0}". JMXServiceURL = {1}
     * 
     */
    public static String WSM_5001_ENDPOINT_CREATED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5001_ENDPOINT_CREATED(arg0, arg1));
    }

    public static Localizable localizableWSM_5060_STOPPED_CONFIGURATOR(Object arg0) {
        return messageFactory.getMessage("WSM_5060_STOPPED_CONFIGURATOR", arg0);
    }

    /**
     * WSM5056: Stopped configurator "{0}".
     * 
     */
    public static String WSM_5060_STOPPED_CONFIGURATOR(Object arg0) {
        return localizer.localize(localizableWSM_5060_STOPPED_CONFIGURATOR(arg0));
    }

    public static Localizable localizableWSM_5072_ATTRIBUTE_UPDATE_FAILED(Object arg0, Object arg1) {
        return messageFactory.getMessage("WSM_5072_ATTRIBUTE_UPDATE_FAILED", arg0, arg1);
    }

    /**
     * WSM5072: Failed to update MBean attribute "{0}" with value "{1}".
     * 
     */
    public static String WSM_5072_ATTRIBUTE_UPDATE_FAILED(Object arg0, Object arg1) {
        return localizer.localize(localizableWSM_5072_ATTRIBUTE_UPDATE_FAILED(arg0, arg1));
    }

}
