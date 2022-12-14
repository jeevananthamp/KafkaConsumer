package com.thbs.EConnect.util;

import java.util.Properties;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

import com.thbs.EConnect.CONSTANTS.CONSTANTKEYS;
import com.thbs.EConnect.CONSTANTS.CONSTANTVALUES;

public class ConsumerConfiguration extends AbstractConfig {
	static String CONSUMER_TOPIC;
	Properties prop = new Properties();
	SetDefnitionProperties setConfig;

	public ConsumerConfiguration(ConfigDef config, Properties parsedConfig) {
		super(config, parsedConfig, false);
		this.setConfig = new SetDefnitionProperties();
		this.prop = this.setConfig.setConfig(config, parsedConfig);

	}

	public ConsumerConfiguration(Properties properties) {
		
		this(conf(), properties);
	}

	public Properties getConsumerProperties() {
		
		return this.prop;
	}

	static ConfigDef conf() {
		return new ConfigDef()
				.define(CONSTANTKEYS.BOOTSTRAPSERVER_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.BOOTSTRAPSERVER_DEFAULTVALUE, ConfigDef.Importance.HIGH, "boostrap servers")
				.define(CONSTANTKEYS.KEYDESERIALIZER_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.KEYDESERIALIZER_VALUE,
						ConfigDef.Importance.HIGH, "keyDeserializer")
				.define(CONSTANTKEYS.VALUEDESERIALIZER_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.VALUEDESERIALIZER_VALUE, ConfigDef.Importance.HIGH, "valueDeserializer")
				.define(CONSTANTKEYS.GROUPID_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.GROUPID_VALUE,
						ConfigDef.Importance.HIGH, "GROUP ID")
				.define(CONSTANTKEYS.HEARTBEAT_KEY, ConfigDef.Type.INT, CONSTANTVALUES.HEARTBEAT_VALUE,
						ConfigDef.Importance.HIGH, "HEART BEAT")
				.define(CONSTANTKEYS.MAXPARTITIONS_KEY, ConfigDef.Type.INT, CONSTANTVALUES.MAXPARTITIONS_VALUE,
						ConfigDef.Importance.HIGH, "MAX PARTITIONS")
				.define(CONSTANTKEYS.SESSION_TIMEOUT_KEY, ConfigDef.Type.INT, CONSTANTVALUES.SESSION_TIMEOUT_VALUE,
						ConfigDef.Importance.HIGH, "SESSION TIMEOUT")
				.define(CONSTANTKEYS.SSL_KEY_PASSWORD_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_KEY_PASSWORD_DEFAULTVALUE, ConfigDef.Importance.HIGH, "SSL_KEY_PASSWORD")
				.define(CONSTANTKEYS.SSL_KEYSTORE_CERTIFICATE_CHAIN_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_KEYSTORE_CERTIFICATE_CHAIN_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_KEYSTORE_CERTIFICATE_CHAIN")
				.define(CONSTANTKEYS.SSL_KEYSTORE_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_KEYSTORE_KEY_DEFAULTVALUE, ConfigDef.Importance.HIGH, "SSL_KEYSTORE_KEY")
				.define(CONSTANTKEYS.SSL_KEYSTORE_LOCATION_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_KEYSTORE_LOCATION_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_KEYSTORE_LOCATION")
				.define(CONSTANTKEYS.SSL_KEYSTORE_PASSWORD_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_KEYSTORE_PASSWORD_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_KEYSTORE_PASSWORD")
				.define(CONSTANTKEYS.SSL_TRUSTSTORE_CERTIFICATES_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_TRUSTSTORE_CERTIFICATES_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_TRUSTSTORE_CERTIFICATES")
				.define(CONSTANTKEYS.SSL_TRUSTSTORE_LOCATION_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_TRUSTSTORE_LOCATION_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_TRUSTSTORE_LOCATION")
				.define(CONSTANTKEYS.SSL_TRUSTSTORE_PASSWORD_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SSL_TRUSTSTORE_PASSWORD_DEFAULTVALUE, ConfigDef.Importance.HIGH,
						"SSL_TRUSTSTORE_PASSWORD")
				.define(CONSTANTKEYS.ALLOW_AUTO_CREATE_TOPICS_KEY, ConfigDef.Type.BOOLEAN,
						CONSTANTVALUES.ALLOW_AUTO_CREATE_TOPICS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"ALLOW_AUTO_CREATE_TOPICS")
				.define(CONSTANTKEYS.AUTO_OFFSET_RESET_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.AUTO_OFFSET_RESET_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "AUTO_OFFSET_RESET")
				.define(CONSTANTKEYS.CLEINT_DNS_LOOKUP_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.CLEINT_DNS_LOOKUP_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "CLEINT_DNS_LOOKUP")
				.define(CONSTANTKEYS.DEFAULT_API_TIMEOUT_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.DEFAULT_API_TIMEOUT_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"DEFAULT_API_TIMEOUT")
				.define(CONSTANTKEYS.ENABLE_AUTO_COMMIT_KEY, ConfigDef.Type.BOOLEAN,
						CONSTANTVALUES.ENABLE_AUTO_COMMIT_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"ENABLE_AUTO_COMMIT_KEY")
				.define(CONSTANTKEYS.EXCLUDE_INTERNAL_TOPICS_KEY, ConfigDef.Type.BOOLEAN,
						CONSTANTVALUES.EXCLUDE_INTERNAL_TOPICS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"EXCLUDE_INTERNAL_TOPICS")
				.define(CONSTANTKEYS.FETCH_MAX_BYTES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.FETCH_MAX_BYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "FETCH_MAX_BYTES")
				.define(CONSTANTKEYS.GROUP_INSTANCE_ID_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.GROUP_INSTANCE_ID_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "GROUP_INSTANCE_ID")
				.define(CONSTANTKEYS.ISOLATION_LEVEL_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.ISOLATION_LEVEL_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, " ISOLATION_LEVEL")
				.define(CONSTANTKEYS.MAX_POLL_INTERVAL_MS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.MAX_POLL_INTERVAL_MS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"MAX_POLL_INTERVAL_MS")
				.define(CONSTANTKEYS.MAX_POLL_RECORDS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.MAX_POLL_RECORDS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "MAX_POLL_RECORDS")
				.define(CONSTANTKEYS.PARTITION_ASSIGNMENT_STRATEGY_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.PARTITION_ASSIGNMENT_STRATEGY_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"PARTITION_ASSIGNMENT_STRATEGY")
				.define(CONSTANTKEYS.AUTO_COMMIT_INTERVAL_MS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.AUTO_COMMIT_INTERVAL_MS_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"AUTO_COMMIT_INTERVAL_MS")
				.define(CONSTANTKEYS.CHECK_CRCS_KEY, ConfigDef.Type.BOOLEAN, CONSTANTVALUES.CHECK_CRCS_DEFAULTVALUE,
						ConfigDef.Importance.LOW, "CHECK_CRCS")
				.define(CONSTANTKEYS.CLIENT_RACK_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.CLIENT_RACK_DEFAULTVALUE,
						ConfigDef.Importance.LOW, "CLIENT_RACK")
				.define(CONSTANTKEYS.FETCH_MAX_WAIT_MS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.FETCH_MAX_WAIT_MS_DEFAULTVALUE, ConfigDef.Importance.LOW, "FETCH_MAX_WAIT_MS")
				.define(CONSTANTKEYS.RECEIVE_BUFFER_BYTES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.RECEIVE_BUFFER_BYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"RECEIVE_BUFFER_BYTES")
				.define(CONSTANTKEYS.REQUEST_TIMEOUT_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.REQUEST_TIMEOUT_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "REQUEST_TIMEOUT")

				.define(CONSTANTKEYS.SASL_CLIENT_CALLBACK_HANDLER_CLASS_KEY, ConfigDef.Type.CLASS,
						CONSTANTVALUES.SASL_CLIENT_CALLBACK_HANDLER_CLASS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SASL_CLIENT_CALLBACK_HANDLER_CLASS")
				.define(CONSTANTKEYS.SASL_JAAS_CONFIG_KEY, ConfigDef.Type.PASSWORD,
						CONSTANTVALUES.SASL_JAAS_CONFIG_DEFAULTVALUE, ConfigDef.Importance.HIGH, "SASL_JAAS_CONFIG")
				.define(CONSTANTKEYS.SASL_KERBEROS_SERVICE_NAME_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SASL_KERBEROS_SERVICE_NAME_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SASL_KERBEROS_SERVICE_NAME")
				.define(CONSTANTKEYS.SASL_LOGIN_CALLBACK_HANDLER_KEY, ConfigDef.Type.CLASS,
						CONSTANTVALUES.SASL_LOGIN_CALLBACK_HANDLER_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SASL_LOGIN_CALLBACK_HANDLER")
				.define(CONSTANTKEYS.SASL_LOGIN_CLASS_KEY, ConfigDef.Type.CLASS,
						CONSTANTVALUES.SASL_LOGIN_CLASS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "SASL_LOGIN_CLASS")
				.define(CONSTANTKEYS.SASL_MECHANISM_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SASL_MECHANISM_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "SASL_MECHANISM")

				.define(CONSTANTKEYS.SECURITY_PROTOCOL_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SECURITY_PROTOCOL_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "SECURITY_PROTOCOL")
				.define(CONSTANTKEYS.SEND_BUFFER_BYTES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.SEND_BUFFER_BYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "SEND_BUFFER_BYTES")
				.define(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_DEFAULTVALUE")
				.define(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.SOCKET_CONNECTION_SETUP_TIMEOUT_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SOCKET_CONNECTION_SETUP_TIMEOUT")
				.define(CONSTANTKEYS.SSL_ENABLED_PROTOCOLS_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.SSL_ENABLED_PROTOCOLS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SSL_ENABLED_PROTOCOLS")
				.define(CONSTANTKEYS.SSL_KEYSTORE_TYPE_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_KEYSTORE_TYPE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "SSL_KEYSTORE_TYPE")
				.define(CONSTANTKEYS.SSL_PROTOCOL_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.SSL_PROTOCOL_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "SSL_PROTOCOL")
				.define(CONSTANTKEYS.SSL_PROVIDER_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.SSL_PROVIDER_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "SSL_PROVIDER")
				.define(CONSTANTKEYS.SSL_TRUSTSTORE_TYPE_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_TRUSTSTORE_TYPE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"SSL_TRUSTSTORE_TYPE")
				.define(CONSTANTKEYS.CLIENT_ID_KEY, ConfigDef.Type.STRING, CONSTANTVALUES.CLIENT_ID_DEFAULTVALUE,
						ConfigDef.Importance.LOW, "CLIENT_ID")
				.define(CONSTANTKEYS.INTERCEPTOR_CLASSES_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.INTERCEPTOR_CLASSES_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"INTERCEPTOR_CLASSES")
				.define(CONSTANTKEYS.METADATA_MAX_AGE_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.METADATA_MAX_AGE_DEFAULTVALUE, ConfigDef.Importance.LOW, "METADATA_MAX_AGE")
				.define(CONSTANTKEYS.METRIC_REPORTERS_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.METRIC_REPORTERS_DEFAULTVALUE, ConfigDef.Importance.LOW, "METRIC_REPORTERS")
				.define(CONSTANTKEYS.METRICS_NUM_SAMPLES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.METRICS_NUM_SAMPLES_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"METRICS_NUM_SAMPLES")
				.define(CONSTANTKEYS.METRICS_RECORDING_LEVEL_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.METRICS_RECORDING_LEVEL_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"METRICS_RECORDING_LEVEL")
				.define(CONSTANTKEYS.METRICS_SAMPLE_WINDOW_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.METRICS_SAMPLE_WINDOW_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"METRICS_SAMPLE_WINDOW")
				.define(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_MS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.RECONNECT_BACKOFF_MAX_MS_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"RECONNECT_BACKOFF_MAX_MS")
				.define(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.RECONNECT_BACKOFF_MAX_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"RECONNECT_BACKOFF_MAX")
				.define(CONSTANTKEYS.RETRY_BACKOFF_KEY, ConfigDef.Type.LONG, CONSTANTVALUES.RETRY_BACKOFF_DEFAULTVALUE,
						ConfigDef.Importance.LOW, "RETRY_BACKOFF")
				.define(CONSTANTKEYS.SASL_KERBEROS_KINIT_CMD_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SASL_KERBEROS_KINIT_CMD_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_KERBEROS_KINIT_CMD")
				.define(CONSTANTKEYS.SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN")
				.define(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_JITTER_KEY, ConfigDef.Type.DOUBLE,
						CONSTANTVALUES.SASL_KERBEROS_TICKET_RENEW_JITTER_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_KERBEROS_TICKET_RENEW_JITTER")
				.define(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_KEY, ConfigDef.Type.DOUBLE,
						CONSTANTVALUES.SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR")
				.define(CONSTANTKEYS.SASL_LOGIN_REFRESH_BUFFER_SECONDS_KEY, ConfigDef.Type.SHORT,
						CONSTANTVALUES.SASL_LOGIN_REFRESH_BUFFER_SECONDS_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_LOGIN_REFRESH_BUFFER_SECONDS")
				.define(CONSTANTKEYS.SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_KEY, ConfigDef.Type.SHORT,
						CONSTANTVALUES.SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS")
				.define(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_FACTOR_KEY, ConfigDef.Type.DOUBLE,
						CONSTANTVALUES.SASL_LOGIN_REFRESH_WINDOW_FACTOR_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_LOGIN_REFRESH_WINDOW_FACTOR")
				.define(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_JITTER_KEY, ConfigDef.Type.DOUBLE,
						CONSTANTVALUES.SASL_LOGIN_REFRESH_WINDOW_JITTER_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SASL_LOGIN_REFRESH_WINDOW_JITTER")
				.define(CONSTANTKEYS.SECURITY_PROVIDERS_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SECURITY_PROVIDERS_DEFAULTVALUE, ConfigDef.Importance.LOW, "SECURITY_PROVIDERS")
				.define(CONSTANTKEYS.SSL_CIPHER_SUITES_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.SSL_CIPHER_SUITES_DEFAULTVALUE, ConfigDef.Importance.LOW, "SSL_CIPHER_SUITES")
				.define(CONSTANTKEYS.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SSL_ENDPOINT_IDENTIFICATION_ALGORITHM")
				.define(CONSTANTKEYS.SSL_ENGINE_FACTORY_CLASS_KEY, ConfigDef.Type.CLASS,
						CONSTANTVALUES.SSL_ENGINE_FACTORY_CLASS_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SSL_ENGINE_FACTORY_CLASS")
				.define(CONSTANTKEYS.SSL_KEYMANAGER_ALGORITHM_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_KEYMANAGER_ALGORITHM_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SSL_KEYMANAGER_ALGORITHM")
				.define(CONSTANTKEYS.SSL_SECURE_RANDOM_IMPLEMENTATION_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_SECURE_RANDOM_IMPLEMENTATION_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SSL_SECURE_RANDOM_IMPLEMENTATION")
				.define(CONSTANTKEYS.SSL_TRUSTMANAGER_ALGORITHM_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.SSL_TRUSTMANAGER_ALGORITHM_DEFAULTVALUE, ConfigDef.Importance.LOW,
						"SSL_TRUSTMANAGER_ALGORITHM");
	}
}
