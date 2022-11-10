package com.thbs.EConnect.CONSTANTS;


public interface CONSTANTKEYS {
	String BOOTSTRAPSERVER_KEY = "bootstrap.servers";
	
	//Producer CONSTANT
	String PRODUCERTOPIC_KEY = "producertopic";
	String ACKS_KEY = "acks";
	String GROUPID_KEY = "group.id";
	String RETRIES_KEY="retries";
	String KEYSERIALIZER_KEY = "key.serializer";
	String VALUESERIALIZER_KEY = "value.serializer";
	String BATCHSIZE_KEY="batch.size";
	String LINGERMS_KEY="linger.ms";
	String BUFFERMEMORY_KEY="buffer.memory";	
	String HEARTBEAT_KEY = "heartbeat.interval.ms";
	String MAXPARTITIONS_KEY = "max.partition.fetch.bytes";
	String SESSION_TIMEOUT_KEY = "session.timeout.ms";
	String COMPRESSION_TYPE_KEY = "compression.type";
	String SSL_KEY_PASSWORD_KEY = "ssl.key.password";
	String SSL_KEYSTORE_CERTIFICATE_CHAIN_KEY = "ssl.keystore.certificate.chain";
	String SSL_KEYSTORE_KEY = "ssl.keystore.key";
	String SSL_KEYSTORE_LOCATION_KEY = "ssl.keystore.location";
	String SSL_KEYSTORE_PASSWORD_KEY = "ssl.keystore.password";
	String SSL_TRUSTSTORE_CERTIFICATES_KEY = "ssl.truststore.certificates";
	String SSL_TRUSTSTORE_LOCATION_KEY = "ssl.truststore.location";
	String SSL_TRUSTSTORE_PASSWORD_KEY = "ssl.truststore.password";
	String CLEINT_DNS_LOOKUP_KEY = "client.dns.lookup";
	String CLIENT_ID_KEY = "client.id";
	String CONNECTION_IDLE_KEY = "connections.max.idle.ms";
	String DELIVERY_TIMEOUT_KEY = "delivery.timeout.ms";
	String PARTITIONER_CLASS_KEY = "partitioner.class";
	String RECEIVE_BUFFER_BYTES_KEY = "receive.buffer.bytes";
	String REQUEST_TIMEOUT_KEY = "request.timeout.ms";
	String SASL_CLIENT_CALLBACK_HANDLER_CLASS_KEY = "sasl.client.callback.handler.class";
	String SASL_JAAS_CONFIG_KEY = "sasl.jaas.config";
	String SASL_KERBEROS_SERVICE_NAME_KEY = "sasl.kerberos.service.name";
	String SASL_LOGIN_CALLBACK_HANDLER_KEY = "sasl.login.callback.handler.class";
	String SASL_LOGIN_CLASS_KEY = "sasl.login.class";
	String SASL_MECHANISM_KEY = "sasl.mechanism";
	String SECURITY_PROTOCOL_KEY = "security.protocol";
	String SEND_BUFFER_BYTES_KEY = "send.buffer.bytes";
	String SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_KEY = "socket.connection.setup.timeout.max.ms";
	String SOCKET_CONNECTION_SETUP_TIMEOUT_KEY = "socket.connection.setup.timeout.ms";
	String SSL_ENABLED_PROTOCOLS_KEY = "ssl.enabled.protocols";
	String SSL_KEYSTORE_TYPE_KEY = "ssl.keystore.type";
	String SSL_PROTOCOL_KEY = "ssl.protocol";
	String SSL_PROVIDER_KEY = "ssl.provider";
	String SSL_TRUSTSTORE_TYPE_KEY = "ssl.truststore.type";
	String ENABLE_IDEMPOTENCE_KEY = "enable.idempotence";
	String INTERCEPTOR_CLASSES_KEY = "interceptor.classes";
	String MAX_IN_FLIGHTS_REQUESTS_KEY = "max.in.flight.requests.per.connection";
	String METADATA_MAX_AGE_KEY = "metadata.max.age.ms";
	String METADATA_MAX_IDLE_KEY = "metadata.max.idle.ms";
	String METRIC_REPORTERS_KEY = "metric.reporters";
	String METRICS_NUM_SAMPLES_KEY = "metrics.num.samples";
	String METRICS_RECORDING_LEVEL_KEY = "metrics.recording.level";
	String METRICS_SAMPLE_WINDOW_KEY = "metrics.sample.window.ms";
	String RECONNECT_BACKOFF_MAX_MS_KEY = "reconnect.backoff.max.ms";
	String RECONNECT_BACKOFF_MAX_KEY = "reconnect.backoff.ms";
	String RETRY_BACKOFF_KEY = "retry.backoff.ms";
	String SASL_KERBEROS_KINIT_CMD_KEY = "sasl.kerberos.kinit.cmd";
	String SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_KEY = "sasl.kerberos.min.time.before.relogin";
	String SASL_KERBEROS_TICKET_RENEW_JITTER_KEY = "sasl.kerberos.ticket.renew.jitter";
	String SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_KEY = "sasl.kerberos.ticket.renew.window.factor";
	String SASL_LOGIN_REFRESH_BUFFER_SECONDS_KEY = "sasl.login.refresh.buffer.seconds";
	String SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_KEY = "sasl.login.refresh.min.period.seconds";
	String SASL_LOGIN_REFRESH_WINDOW_FACTOR_KEY = "sasl.login.refresh.window.factor";
	String SASL_LOGIN_REFRESH_WINDOW_JITTER_KEY = "sasl.login.refresh.window.jitter";
	String SECURITY_PROVIDERS_KEY = "security.providers";
	String SSL_CIPHER_SUITES_KEY = "ssl.cipher.suites";
	String SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_KEY = "ssl.endpoint.identification.algorithm";
	String SSL_ENGINE_FACTORY_CLASS_KEY = "ssl.engine.factory.class";
	String SSL_KEYMANAGER_ALGORITHM_KEY = "ssl.keymanager.algorithm";
	String SSL_SECURE_RANDOM_IMPLEMENTATION_KEY = "ssl.secure.random.implementation";
	String SSL_TRUSTMANAGER_ALGORITHM_KEY = "ssl.trustmanager.algorithm";
	String TRANSACTION_TIMEOUT_MS_KEY = "transaction.timeout.ms";
	String TRANSACTIONAL_ID_KEY = "transactional.id";
	String CLIENT_DNS_LOOKUP_KEY = "client.dns.lookup";

	
	//Consumer CONSTANT
	String CONSUMERTOPIC_KEY = "consumertopic";
	String KEYDESERIALIZER_KEY = "key.deserializer";
	String VALUEDESERIALIZER_KEY = "value.deserializer";
	
	String FETCH_MIN_BYTES_KEY = "fetch.min.bytes";
	String ALLOW_AUTO_CREATE_TOPICS_KEY = "allow.auto.create.topics";
	String AUTO_OFFSET_RESET_KEY = "auto.offset.reset";
	String DEFAULT_API_TIMEOUT_KEY = "default.api.timeout.ms";
	String ENABLE_AUTO_COMMIT_KEY = "enable.auto.commit";
	String EXCLUDE_INTERNAL_TOPICS_KEY = "exclude.internal.topics";
	String FETCH_MAX_BYTES_KEY = "fetch.max.bytes";
	String GROUP_INSTANCE_ID_KEY = "group.instance.id";
	String ISOLATION_LEVEL_KEY = "isolation.level";
	String MAX_POLL_INTERVAL_MS_KEY = "max.poll.interval.ms";
	String MAX_POLL_RECORDS_KEY = "max.poll.records";
	String PARTITION_ASSIGNMENT_STRATEGY_KEY = "partition.assignment.strategy";
	String AUTO_COMMIT_INTERVAL_MS_KEY = "auto.commit.interval.ms";
	String CHECK_CRCS_KEY = "check.crcs";
	String CLIENT_RACK_KEY = "client.rack";
	String FETCH_MAX_WAIT_MS_KEY = "fetch.max.wait.ms";

	// TOPIC CONSTANT
		String CLEANUPPOLICY_KEY = "cleanup.policy";
		String COMPRESSIONTYPE_KEY = "compression.type";
		String DELETERETENTIONMS_KEY = "delete.retention.ms";
		String FILEDELETEDELAYMS_KEY = "file.delete.delay.ms";
		String FLUSHMESSAGES_KEY = "flush.messages";
		String FLUSHMS_KEY = "flush.ms";
		String INDEXINTERVALMS_KEY = "index.Stringerval.bytes";
		String LEADERREPLICATIONTHROTTLEDREPLICAS_KEY = "leader.replication.throttled.replicas";
		String FOLLOWERREPLICATIONTHROTTLEDREPLICAS_KEY = "follower.replication.throttled.replicas";
		String MAXCOMPACTIONLAGMS_KEY = "max.compaction.lag.ms";
		String MAXMESSAGEBYTES_KEY = "max.message.bytes";
		String MESSAGEFORMATVERSION_KEY = "message.format.version";
		String MESSAGETIMESTAMPDIFFERENCEMAXMS_KEY = "message.timestamp.difference.max.ms";
		String MESSAGETIMESTAMPTYPE_KEY = "message.timestamp.type";
		String MINCLEANABLEDIRTYRATIO_KEY = "min.cleanable.dirty.ratio";
		String MINCOMPACTIONLAGMS_KEY = "min.compaction.lag.ms";
		String MININSYNCREPLICAS_KEY = "min.insync.replicas";
		String PREALLOCATE_KEY = "preallocate";
		String RETENTIONBYTES_KEY = "retention.bytes";
		String RETENTIONMS_KEY = "retention.ms";
		String SEGMENTBYTES_KEY = "segment.bytes";
		String SEGMENTINDEXBYTES_KEY = "segment.index.bytes";
		String SEGMENTJITTERMS_KEY = "segment.jitter.ms";
		String SEGMENTMS_KEY = "segment.ms";
		String UNCLEANLEADERELECTIONENABLE_KEY = "unclean.leader.election.enable";
		String MESSAGEDOWNCONVERSIONENABLE_KEY = "message.downconversion.enable";

		


	
	
	
	//AdminCLIENT CONSTANT
	
	//KSTREAM CONSTANT
	
	
	//KCONNECT CONSTANT
	
	
	//TOPIC CONSTANT
	
	//BROKER CONSTANT
	
}
