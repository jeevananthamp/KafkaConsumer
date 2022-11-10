package com.thbs.EConnect.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
	Properties prop = new Properties();
	public LoadProperties() {
		//// /EConnect/src/main/resources/config.properties
		// /home/anushaparas/eclipse-workspace2/EConnect/src/main/resources/
	 try (InputStream inputStream = new FileInputStream("/home/anushaparas/eclipse-workspace2/EConnect/src/main/resources/config.properties")) 
	 {
		 prop.load(inputStream); 	 
	}
	catch(IOException e) {
		//System.out.println("FFile not found");
	}
	}
	public Properties configProperties() {
		//System.out.println(prop);
		return prop;
	}
}
