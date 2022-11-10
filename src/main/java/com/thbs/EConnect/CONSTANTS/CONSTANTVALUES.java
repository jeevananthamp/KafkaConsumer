package com.thbs.EConnect.CONSTANTS;

import org.apache.kafka.common.config.types.Password;

public interface CONSTANTVALUES {
	
		String BOOTSTRAPSERVER_DEFAULTVALUE = "localhost:9092";
		String PRODUCER_TOPIC="eConnectProducerdemo";
		String CONSUMER_TOPIC="eConnectConsumerdemo";
		String NODEFAULTVALUE= "NO_DEFAULT_VALUE";
		
		//Producer CONSTANT_VALUES
		String ACKS_VALUE = "1";
		int RETRIES_VALUE = 2147483647;
		String KEYSERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringSerializer";
		String VALUESERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringSerializer";
		int BATCHSIZE_VALUE = 16384;
		long LINGERMS_VALUE = 0;
		long BUFFERMEMORY_VALUE = 33554432;
		String PRODUCERTOPIC_VALUE = "producertopic";
		int HEARTBEAT_VALUE = 3000;
		int MAXPARTITIONS_VALUE=1048576;
		int  SESSION_TIMEOUT_VALUE = 10000;
		
		
		int MAX_REQUEST_SIZE_DEFAULTVALUE = 1048576;
		String COMPRESSION_TYPE_DEFAULTVALUE = "";
		Password SSL_KEY_PASSWORD_DEFAULTVALUE = null;
		Password SSL_KEYSTORE_CERTIFICATE_CHAIN_DEFAULTVALUE = null;
		Password SSL_KEYSTORE_KEY_DEFAULTVALUE = null;
		String SSL_KEYSTORE_LOCATION_DEFAULTVALUE = null;
		Password SSL_KEYSTORE_PASSWORD_DEFAULTVALUE = null;
		String SSL_TRUSTSTORE_CERTIFICATES_DEFAULTVALUE = null;
		String SSL_TRUSTSTORE_LOCATION_DEFAULTVALUE = null;
		Password SSL_TRUSTSTORE_PASSWORD_DEFAULTVALUE = null;
		String CLEINT_DNS_LOOKUP_DEFAULTVALUE = "";
		String CLIENT_ID_DEFAULTVALUE = "";
		int CONNECTION_IDLE_DEFAULTVALUE = 540000;
		int DELIVERY_TIMEOUT_DEFAULTVALUE = 120000;
		String PARTITIONER_CLASS_DEFAULTVALUE = "org.apache.kafka.clients.producer.Partitioner";
		int RECEIVE_BUFFER_BYTES_DEFAULTVALUE = 32768;
		int REQUEST_TIMEOUT_DEFAULTVALUE = 30000;
		Class SASL_CLIENT_CALLBACK_HANDLER_CLASS_DEFAULTVALUE = null;
		Password SASL_JAAS_CONFIG_DEFAULTVALUE = null;
		String SASL_KERBEROS_SERVICE_NAME_DEFAULTVALUE = null;
		Class SASL_LOGIN_CALLBACK_HANDLER_DEFAULTVALUE = null;
		Class SASL_LOGIN_CLASS_DEFAULTVALUE = null;
		String SASL_MECHANISM_DEFAULTVALUE = "GSSAPI";
		String SECURITY_PROTOCOL_DEFAULTVALUE = "PLAINTEXT";
		int SEND_BUFFER_BYTES_DEFAULTVALUE = 131072;
		long SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_DEFAULTVALUE = 30000;
		long SOCKET_CONNECTION_SETUP_TIMEOUT_DEFAULTVALUE = 10000;
		String SSL_ENABLED_PROTOCOLS_DEFAULTVALUE = "TLSv1.2"; // list
		String SSL_KEYSTORE_TYPE_DEFAULTVALUE = "JKS";
		String SSL_PROTOCOL_DEFAULTVALUE = "TLSv1.2";
		String SSL_PROVIDER_DEFAULTVALUE = null;
		String SSL_TRUSTSTORE_TYPE_DEFAULTVALUE = "JKS";
		boolean ENABLE_IDEMPOTENCE_DEFAULTVALUE = false;
		String INTERCEPTOR_CLASSES_DEFAULTVALUE = ""; // list
		int MAX_IN_FLIGHTS_REQUESTS_DEFAULTVALUE = 5;
		long METADATA_MAX_AGE_DEFAULTVALUE = 300000;
		long METADATA_MAX_IDLE_DEFAULTVALUE = 300000;
		String METRIC_REPORTERS_DEFAULTVALUE = ""; // list
		int METRICS_NUM_SAMPLES_DEFAULTVALUE = 2;
		String METRICS_RECORDING_LEVEL_DEFAULTVALUE = "INFO";
		long METRICS_SAMPLE_WINDOW_DEFAULTVALUE = 30000;
		long RECONNECT_BACKOFF_MAX_MS_DEFAULTVALUE = 1000;
		long RECONNECT_BACKOFF_MAX_DEFAULTVALUE = 50;
		long RETRY_BACKOFF_DEFAULTVALUE = 100;
		String SASL_KERBEROS_KINIT_CMD_DEFAULTVALUE = ""; // path -> /usr/bin/kinit
		long SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_DEFAULTVALUE = 60000;
		double SASL_KERBEROS_TICKET_RENEW_JITTER_DEFAULTVALUE = 0.05;
		double SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_DEFAULTVALUE = 0.8;
		short SASL_LOGIN_REFRESH_BUFFER_SECONDS_DEFAULTVALUE = 300;
		short SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_DEFAULTVALUE = 60;
		double SASL_LOGIN_REFRESH_WINDOW_FACTOR_DEFAULTVALUE = 0.8;
		double SASL_LOGIN_REFRESH_WINDOW_JITTER_DEFAULTVALUE = 0.05;
		String SECURITY_PROVIDERS_DEFAULTVALUE = null;
		String SSL_CIPHER_SUITES_DEFAULTVALUE = null; // list
		String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_DEFAULTVALUE = "https";
		Class SSL_ENGINE_FACTORY_CLASS_DEFAULTVALUE = null;
		String SSL_KEYMANAGER_ALGORITHM_DEFAULTVALUE = "SunX509";
		String SSL_SECURE_RANDOM_IMPLEMENTATION_DEFAULTVALUE = null;
		String SSL_TRUSTMANAGER_ALGORITHM_DEFAULTVALUE = "PKIX";
		int TRANSACTION_TIMEOUT_MS_DEFAULTVALUE = 60000;
		String TRANSACTIONAL_ID_DEFAULTVALUE = null;


		// Consumer CONSTANT_VALUES
		String KEYDESERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringDeserializer";
		String VALUEDESERIALIZER_VALUE = "org.apache.kafka.common.serialization.StringDeserializer";
		String CONSUMERTOPIC_VALUE = "consumertopic";
		String GROUPID_VALUE = "eConnectGroup";
		
		int FETCH_MIN_BYTES_DEFAULTVALUE = 1;
		boolean ALLOW_AUTO_CREATE_TOPICS_DEFAULTVALUE = true;
		String AUTO_OFFSET_RESET_DEFAULTVALUE = "latest";
		int DEFAULT_API_TIMEOUT_DEFAULTVALUE = 60000;
		boolean ENABLE_AUTO_COMMIT_DEFAULTVALUE = true;
		boolean EXCLUDE_INTERNAL_TOPICS_DEFAULTVALUE = true;
		int FETCH_MAX_BYTES_DEFAULTVALUE = 52428800;
		String GROUP_INSTANCE_ID_DEFAULTVALUE = null;
		String ISOLATION_LEVEL_DEFAULTVALUE = "read_uncommitted";
		int MAX_POLL_INTERVAL_MS_DEFAULTVALUE = 300000;
		int MAX_POLL_RECORDS_DEFAULTVALUE = 500;
		String PARTITION_ASSIGNMENT_STRATEGY_DEFAULTVALUE = "org.apache.kafka.clients.consumer.RangeAssignor";
		int AUTO_COMMIT_INTERVAL_MS_DEFAULTVALUE = 5000;
		boolean CHECK_CRCS_DEFAULTVALUE = true;
		String CLIENT_RACK_DEFAULTVALUE = "";
		int FETCH_MAX_WAIT_MS_DEFAULTVALUE = 500;

		// TOPIC CONSTANT VALUES
		String CLEANUPPOLICY_DEFAULTVALUE = "delete";
		String COMPRESSIONTYPE_DEFAULTVALUE = "producer";
		long DELETERETENTIONMS_DEFAULTVALUE = 86400000;
		long FILEDELETEDELAYMS_DEFAULTVALUE = 60000;
		long FLUSHMESSAGES_DEFAULTVALUE = 9223372;
		long FLUSHMS_DEFAULTVALUE = 922337203;
		int INDEXINTERVALMS_DEFAULTVALUE = 4096;
		String LEADERREPLICATIONTHROTTLEDREPLICAS_DEFAULTVALUE = ""; // LIST
		String FOLLOWERREPLICATIONTHROTTLEDREPLICAS_DEFAULTVALUE = ""; // LIST
		long MAXCOMPACTIONLAGMS_DEFAULTVALUE = 92233720;
		int MAXMESSAGEBYTES_DEFAULTVALUE = 1048588;
		String MESSAGEFORMATVERSION_DEFAULTVALUE = "2.8-IV1";
		long MESSAGETIMESTAMPDIFFERENCEMAXMS_DEFAULTVALUE = 92233720;
		String MESSAGETIMESTAMPTYPE_DEFAULTVALUE = "CreateTime";
		double MINCLEANABLEDIRTYRATIO_DEFAULTVALUE = 0.5;
		long MINCOMPACTIONLAGMS_DEFAULTVALUE = 0;
		int MININSYNCREPLICAS_DEFAULTVALUE = 1;
		boolean PREALLOCATE_DEFAULTVALUE = false;
		long RETENTIONBYTES_DEFAULTVALUE = -1;
		long RETENTIONMS_DEFAULTVALUE = 604800000;
		int SEGMENTBYTES_DEFAULTVALUE = 1073741824;
		int SEGMENTINDEXBYTES_DEFAULTVALUE = 10485760;
		long SEGMENTJITTERMS_DEFAULTVALUE = 0;
		long SEGMENTMS_DEFAULTVALUE = 604800000;
		boolean UNCLEANLEADERELECTIONENABLE_DEFAULTVALUE = false;
		boolean MESSAGEDOWNCONVERSIONENABLE_DEFAULTVALUE = true;

}