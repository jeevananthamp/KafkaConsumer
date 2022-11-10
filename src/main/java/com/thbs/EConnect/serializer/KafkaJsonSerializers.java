package com.thbs.EConnect.serializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class KafkaJsonSerializers implements Serializer {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public void configure(Map configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	public byte[] serialize(String topic, Object o) {
		byte[] jsonByteVal = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			jsonByteVal = objectMapper.writeValueAsBytes(o);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return jsonByteVal;
	}

	
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
