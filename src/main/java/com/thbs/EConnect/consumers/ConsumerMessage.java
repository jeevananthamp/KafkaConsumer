package com.thbs.EConnect.consumers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.util.regex.Pattern;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ConsumerMessage<T> {
	Consumer<String, T> consumer;
	ConsumerRecords<String, T> records;
	String recordValue;
	String serviceName;
	String bootstrapServer;
	String bootstrapServerIP;
	String bootstrapServerPort;
	String clientApplicationIP;
	String clientApplicationPort;
	String topicName;

	public Consumer<String, T> buildConsumer(T modelObj, Properties props) {
		
		consumer = new KafkaConsumer<String, T>(props);
		return consumer;
	}

	public T subscribeRecords(String topic, String[] args) {

		consumer.subscribe(Pattern.compile("^" + topic + ".*"));

		while (true) {

			records = consumer.poll(1000);

			for (ConsumerRecord<String, T> record : records) {
				recordValue = record.value().toString();
				JSONParser parser = new JSONParser();
				JSONObject topicRecords;
				try {
					topicRecords = (JSONObject) parser.parse(recordValue);
					if (topicRecords.containsKey("service")) {
						serviceName = topicRecords.get("service").toString();
						System.out.println("serviceName = " + serviceName);

						topicRecords.remove("service", serviceName);
						callConsumerAPI(topicRecords, args, serviceName);
					} else {
						callConsumerAPI(topicRecords, args, null);
					}

				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			consumer.commitSync();

		}
	}

	public void callConsumerAPI(JSONObject recordValue, String[] args, String serviceName) {
		for (int i = 0; i < args.length; i++) {
			int n = args[i].indexOf(':');

			if (args[i].substring(1, n).equals("config=clientip")) {

				clientApplicationIP = args[i].substring(n + 1, args[i].length());
			}

			if (args[i].substring(1, n).equals("config=clientport")) {

				clientApplicationPort = args[i].substring(n + 1, args[i].length());

			}
		}

		System.out.println("clientApplicationIP = " + clientApplicationIP);
		System.out.println("clientApplicationPort = " + clientApplicationPort);

		URL url = null;

		System.out.println("url = " + "http://" + clientApplicationIP + ":" + clientApplicationPort + "/sf/api/v1/subscribe/"
				+ serviceName);

		try {
			url = new URL("http://" + clientApplicationIP + ":" + clientApplicationPort + "/sf/api/v1/subscribe/" + serviceName);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();

			os.write(recordValue.toString().getBytes());

			System.out.println(os);
			int responseCode = con.getResponseCode();
			System.out.println("POST Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}

				// print result
				System.out.println(response.toString());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
