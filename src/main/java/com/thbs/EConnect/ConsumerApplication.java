package com.thbs.EConnect;

import java.util.Properties;

import org.json.simple.JSONObject;

import com.thbs.EConnect.controller.ConsumerBuilder;
import com.thbs.EConnect.controller.EConnect;

public class ConsumerApplication 
{
	public static void main(String[] args) {

		String bootstrapServerIP = null;
		String bootstrapServerPort = null;
		String topicName = null;
		

		for (int i = 0; i < args.length; i++) {
			int n = args[i].indexOf(':');

			if (args[i].substring(1, n).equals("config=ip")) {

				bootstrapServerIP = args[i].substring(n + 1, args[i].length());

			}

			else if (args[i].substring(1, n).equals("config=port")) {
				bootstrapServerPort = args[i].substring(n + 1, args[i].length());
			}

			else if (args[i].substring(1, n).equals("config=topic")) {
				topicName = args[i].substring(n + 1, args[i].length());
			}

		}

		System.out.println("bootstrapServerIP = " + bootstrapServerIP);
		System.out.println("bootstrapServerPort = " + bootstrapServerPort);
		System.out.println("topicName = " + topicName);

		EConnect<Object> connect = new EConnect<Object>();
	
		ConsumerBuilder<Object> consumerbuilder = connect.getConsumerBuilder();

		consumerbuilder.setBoostrap(bootstrapServerIP + ":" + bootstrapServerPort);
		//consumerbuilder.setBoostrap("");
		consumerbuilder.setgroupID("eConnectGroupId");
		consumerbuilder.setKeyDerializer("");
		consumerbuilder.setValueDeserializer("org.apache.kafka.connect.json.JsonDeserializer");

	
		Properties consumerproperties = consumerbuilder.getConsumerConfiguration();

		JSONObject object = new JSONObject();
		consumerbuilder.consumeMessage(object, consumerproperties, topicName, args);

	}
}
