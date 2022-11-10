package com.thbs.EConnect.controller;



import java.util.Properties;

public class EConnect<T> {
	ConsumerBuilder<T> consumerbuilder;
	
	
	
	Properties defaultproperties= new Properties();
		
	public EConnect(){
		LoadProperties loadprop = new LoadProperties();
		defaultproperties = loadprop.configProperties();	
	}
	
	
	public ConsumerBuilder<T> getConsumerBuilder() {		
		this.consumerbuilder = new ConsumerBuilder<T>();
		return consumerbuilder;
				
	}
	
	
	
	
	
}
