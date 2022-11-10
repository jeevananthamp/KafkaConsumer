package com.thbs.EConnect.controller;

import java.util.List;
import java.util.Properties;

import org.apache.kafka.common.config.types.Password;
import org.json.simple.parser.ParseException;

import com.thbs.EConnect.CONSTANTS.CONSTANTKEYS;
import com.thbs.EConnect.consumers.ConsumerMessage;
import com.thbs.EConnect.util.ConsumerConfiguration;

public class ConsumerBuilder<T> {

	static Properties properties;
	String configDefinitionName;
	ConsumerMessage consumerData;

	public ConsumerBuilder() {
		properties = new Properties();
	}

	public void setBoostrap(String bootstrapserver) {
		properties.put(CONSTANTKEYS.BOOTSTRAPSERVER_KEY, bootstrapserver);
	}

	/**
	 * @param gROUP_ID
	 *            the gROUP_ID to set
	 */
	public void setgroupID(String groupID) {
		properties.put(CONSTANTKEYS.GROUPID_KEY, groupID);
	}

	/**
	 * @param kEY_DESERIALIZER
	 *            the kEY_DESERIALIZER to set
	 */
	public void setKeyDerializer(String keyDeSerializer) {
		properties.put(CONSTANTKEYS.KEYDESERIALIZER_KEY, keyDeSerializer);
	}

	/**
	 * @param vALUE_DESERIALIZER
	 *            the vALUE_DESERIALIZER to set
	 */
	public void setValueDeserializer(String valueDeserializer) {
		properties.put(CONSTANTKEYS.VALUEDESERIALIZER_KEY, valueDeserializer);
	}

	// set values for ConsumerConfigurations
	public void setHeartbeat(int heartbeat) {
		properties.put(CONSTANTKEYS.HEARTBEAT_KEY, heartbeat);
	}

	public void setMaxpartitions(int maxpartitions) {
		properties.put(CONSTANTKEYS.MAXPARTITIONS_KEY, maxpartitions);
	}

	public void setSessiontimeout(int sessiontimeout) {
		properties.put(CONSTANTKEYS.SESSION_TIMEOUT_KEY, sessiontimeout);
	}

	public void setSslkeypassword(Password sslkeypassword) {
		properties.put(CONSTANTKEYS.SSL_KEY_PASSWORD_KEY, sslkeypassword);
	}

	public void setSslkeystorecertificationchain(Password sslkeystorecertificationchain) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_CERTIFICATE_CHAIN_KEY, sslkeystorecertificationchain);
	}

	public void setSslkeystore(Password sslkeystore) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_KEY, sslkeystore);
	}

	public void setSslkeystorelocation(String sslkeystorelocation) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_LOCATION_KEY, sslkeystorelocation);
	}

	public void setSslkeystorepassword(Password sslkeystorepassword) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_PASSWORD_KEY, sslkeystorepassword);
	}

	public void setSsltruststorecertificates(Password ssltruststorecertificates) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_CERTIFICATES_KEY, ssltruststorecertificates);
	}

	public void setSsltruststoreloaction(String ssltruststoreloaction) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_LOCATION_KEY, ssltruststoreloaction);
	}

	public void setSsltruststorepassword(Password ssltruststorepassword) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_PASSWORD_KEY, ssltruststorepassword);
	}

	public void setAllowautocreatetopics(Boolean allowautocreatetopics) {
		properties.put(CONSTANTKEYS.ALLOW_AUTO_CREATE_TOPICS_KEY, allowautocreatetopics);
	}

	public void setAutooffsetreset(String autooffsetreset) {
		properties.put(CONSTANTKEYS.AUTO_OFFSET_RESET_KEY, autooffsetreset);
	}

	public void setClientdnslookup(String clientdnslookup) {
		properties.put(CONSTANTKEYS.CLIENT_DNS_LOOKUP_KEY, clientdnslookup);
	}

	public void setDefaultapitimeout(int defaultapitimeout) {
		properties.put(CONSTANTKEYS.DEFAULT_API_TIMEOUT_KEY, defaultapitimeout);
	}

	public void setEnableautocommit(Boolean enableautocommit) {
		properties.put(CONSTANTKEYS.ENABLE_AUTO_COMMIT_KEY, enableautocommit);
	}

	public void setExcludeinternaltopics(Boolean excludeinternaltopics) {
		properties.put(CONSTANTKEYS.EXCLUDE_INTERNAL_TOPICS_KEY, excludeinternaltopics);
	}

	public void setFetchmaxbytes(int fetchmaxbytes) {
		properties.put(CONSTANTKEYS.FETCH_MAX_BYTES_KEY, fetchmaxbytes);
	}

	public void setGroupinstanceid(String groupinstanceid) {
		properties.put(CONSTANTKEYS.GROUP_INSTANCE_ID_KEY, groupinstanceid);
	}

	public void setIsolationlevel(String isolationlevel) {
		properties.put(CONSTANTKEYS.ISOLATION_LEVEL_KEY, isolationlevel);
	}

	public void setMaxpollintervalms(int maxpollintervalms) {
		properties.put(CONSTANTKEYS.MAX_POLL_INTERVAL_MS_KEY, maxpollintervalms);
	}

	public void setMaxpollrecords(int maxpollrecords) {
		properties.put(CONSTANTKEYS.MAX_POLL_RECORDS_KEY, maxpollrecords);
	}

	public void setPartitionassignmentstrategy(List partitionassignmentstrategy) {
		properties.put(CONSTANTKEYS.PARTITION_ASSIGNMENT_STRATEGY_KEY, partitionassignmentstrategy);
	}

	public void setAutocommitintervalms(int autocommitintervalms) {
		properties.put(CONSTANTKEYS.AUTO_COMMIT_INTERVAL_MS_KEY, autocommitintervalms);
	}

	public void setCheckcrcs(Boolean checkcrcs) {
		properties.put(CONSTANTKEYS.CHECK_CRCS_KEY, checkcrcs);
	}

	public void setClientrack(String clientrack) {
		properties.put(CONSTANTKEYS.CLIENT_RACK_KEY, clientrack);
	}

	public void setFetchmaxwaitms(int fetchmaxwaitms) {
		properties.put(CONSTANTKEYS.FETCH_MAX_WAIT_MS_KEY, fetchmaxwaitms);
	}

	public void setReceivebufferbytes(int receivebufferbytes) {
		properties.put(CONSTANTKEYS.RECEIVE_BUFFER_BYTES_KEY, receivebufferbytes);
	}

	public void setRequesttimeout(int requesttimeout) {
		properties.put(CONSTANTKEYS.REQUEST_TIMEOUT_KEY, requesttimeout);
	}

	public void setSaslclientcallbackhandler(Class saslclientcallbackhandler) {
		properties.put(CONSTANTKEYS.SASL_CLIENT_CALLBACK_HANDLER_CLASS_KEY, saslclientcallbackhandler);
	}

	public void setSasljaasconfig(Password sasljaasconfig) {
		properties.put(CONSTANTKEYS.SASL_JAAS_CONFIG_KEY, sasljaasconfig);
	}

	public void setSaslkerberosservicename(String saslkerberosservicename) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_SERVICE_NAME_KEY, saslkerberosservicename);
	}

	public void setSasllogincallbackhandler(Class sasllogincallbackhandler) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_CALLBACK_HANDLER_KEY, sasllogincallbackhandler);
	}

	public void setSaslloginclass(Class saslloginclass) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_CLASS_KEY, saslloginclass);
	}

	public void setSaslmechanism(String saslmechanism) {
		properties.put(CONSTANTKEYS.SASL_MECHANISM_KEY, saslmechanism);
	}

	public void setSecurityprotocol(String securityprotocol) {
		properties.put(CONSTANTKEYS.SECURITY_PROTOCOL_KEY, securityprotocol);
	}

	public void setSendbufferbytes(int sendbufferbytes) {
		properties.put(CONSTANTKEYS.SEND_BUFFER_BYTES_KEY, sendbufferbytes);
	}

	public void setSocketconnectionsetuptimeoutmax(Long socketconnectionsetuptimeoutmax) {
		properties.put(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_KEY, socketconnectionsetuptimeoutmax);
	}

	public void setSocketconnectionsetuptimeout(Long socketconnectionsetuptimeout) {
		properties.put(CONSTANTKEYS.SOCKET_CONNECTION_SETUP_TIMEOUT_KEY, socketconnectionsetuptimeout);
	}

	public void setSslenabledprotocols(List sslenabledprotocols) {
		properties.put(CONSTANTKEYS.SSL_ENABLED_PROTOCOLS_KEY, sslenabledprotocols);
	}

	public void setSslkeystoretype(String sslkeystoretype) {
		properties.put(CONSTANTKEYS.SSL_KEYSTORE_TYPE_KEY, sslkeystoretype);
	}

	public void setSslprotocol(String sslprotocol) {
		properties.put(CONSTANTKEYS.SSL_PROTOCOL_KEY, sslprotocol);
	}

	public void setSslprovider(String sslprovider) {
		properties.put(CONSTANTKEYS.SSL_PROVIDER_KEY, sslprovider);
	}

	public void setSsltruststoretype(String ssltruststoretype) {
		properties.put(CONSTANTKEYS.SSL_TRUSTSTORE_TYPE_KEY, ssltruststoretype);
	}

	public void setClientid(String clientid) {
		properties.put(CONSTANTKEYS.CLIENT_ID_KEY, clientid);
	}

	public void setInterceptorclasses(List interceptorclasses) {
		properties.put(CONSTANTKEYS.INTERCEPTOR_CLASSES_KEY, interceptorclasses);
	}

	public void setMetadatamaxage(Long metadatamaxage) {
		properties.put(CONSTANTKEYS.METADATA_MAX_AGE_KEY, metadatamaxage);
	}

	public void setMetricreporters(List metricreporters) {
		properties.put(CONSTANTKEYS.METRIC_REPORTERS_KEY, metricreporters);
	}

	public void setMetricsnumsamples(int metricsnumsamples) {
		properties.put(CONSTANTKEYS.METRICS_NUM_SAMPLES_KEY, metricsnumsamples);
	}

	public void setMetricsrecordinglevel(String metricsrecordinglevel) {
		properties.put(CONSTANTKEYS.METRICS_RECORDING_LEVEL_KEY, metricsrecordinglevel);
	}

	public void setMetricssamplewindow(Long metricssamplewindow) {
		properties.put(CONSTANTKEYS.METRICS_SAMPLE_WINDOW_KEY, metricssamplewindow);
	}

	public void setReconnectbackoffmaxms(Long reconnectbackoffmaxms) {
		properties.put(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_MS_KEY, reconnectbackoffmaxms);
	}

	public void setReconnectbackoffmax(Long reconnectbackoffmax) {
		properties.put(CONSTANTKEYS.RECONNECT_BACKOFF_MAX_KEY, reconnectbackoffmax);
	}

	public void setRetrybackoff(Long retrybackoff) {
		properties.put(CONSTANTKEYS.RETRY_BACKOFF_KEY, retrybackoff);
	}

	public void setSaslkerberoskinitcmd(String saslkerberoskinitcmd) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_KINIT_CMD_KEY, saslkerberoskinitcmd);
	}

	public void setSaslkerberosminrelogintime(Long saslkerberosminrelogintime) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_MIN_TIME_BEFORE_RELOGIN_KEY, saslkerberosminrelogintime);
	}

	public void setSaslkerberostcktrenewjitter(Double saslkerberostcktrenewjitter) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_JITTER_KEY, saslkerberostcktrenewjitter);
	}

	public void setSaslkerberostcktrenewwindowfactor(Double saslkerberostcktrenewwindowfactor) {
		properties.put(CONSTANTKEYS.SASL_KERBEROS_TICKET_RENEW_WINDOW_FACTOR_KEY, saslkerberostcktrenewwindowfactor);
	}

	public void setSaslloginrefreshbufferseconds(Short saslloginrefreshbufferseconds) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_BUFFER_SECONDS_KEY, saslloginrefreshbufferseconds);
	}

	public void setSaslloginrefreshminperiodsc(Short saslloginrefreshminperiodsc) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_MIN_PERIOD_SECONDS_KEY, saslloginrefreshminperiodsc);
	}

	public void setSaslloginrefreshwindowfactory(Double saslloginrefreshwindowfactory) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_FACTOR_KEY, saslloginrefreshwindowfactory);
	}

	public void setSaslloginrefreshwindowjitter(Double saslloginrefreshwindowjitter) {
		properties.put(CONSTANTKEYS.SASL_LOGIN_REFRESH_WINDOW_JITTER_KEY, saslloginrefreshwindowjitter);
	}

	public void setSecurityproviders(String securityproviders) {
		properties.put(CONSTANTKEYS.SECURITY_PROVIDERS_KEY, securityproviders);
	}

	public void setSslciphersuites(List sslciphersuites) {
		properties.put(CONSTANTKEYS.SSL_CIPHER_SUITES_KEY, sslciphersuites);
	}

	public void setSslendpointidentificationalgorithm(String sslendpointidentificationalgorithm) {
		properties.put(CONSTANTKEYS.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_KEY, sslendpointidentificationalgorithm);
	}

	public void setSslenginefactoryclass(Class sslenginefactoryclass) {
		properties.put(CONSTANTKEYS.SSL_ENGINE_FACTORY_CLASS_KEY, sslenginefactoryclass);
	}

	public void setSslkeymanageralgorithm(String sslkeymanageralgorithm) {
		properties.put(CONSTANTKEYS.SSL_KEYMANAGER_ALGORITHM_KEY, sslkeymanageralgorithm);
	}

	public void setSslsecurerandomimplementation(String sslsecurerandomimplementation) {
		properties.put(CONSTANTKEYS.SSL_SECURE_RANDOM_IMPLEMENTATION_KEY, sslsecurerandomimplementation);
	}

	public void setSsltrustmanageralgorithm(String ssltrustmanageralgorithm) {
		properties.put(CONSTANTKEYS.SSL_TRUSTMANAGER_ALGORITHM_KEY, ssltrustmanageralgorithm);
	}

	public void consumeMessage(T modelObj, Properties properties, String topic, String[] args) {
		this.consumerData = new ConsumerMessage<T>();
		this.consumerData.buildConsumer(modelObj, properties);
		this.consumerData.subscribeRecords(topic, args);

	}

	public Properties getConsumerConfiguration() {
		Properties configProperties = new Properties();
		ConsumerConfiguration consumerProp = new ConsumerConfiguration(properties);
		configProperties = consumerProp.getConsumerProperties();
		return configProperties;
	}

}
