package com.thbs.EConnect.util;

import java.util.Map.Entry;
import java.util.Properties;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigDef.ConfigKey;

public class SetDefnitionProperties {
	Properties prop = new Properties();
	public Properties setConfig(ConfigDef config,Properties parsedConfig) {
		for(Entry<String, ConfigKey> key :config.configKeys().entrySet()) {
			//|| !parsedConfig.containsKey(key.getKey())
			
			/*if(parsedConfig.get(key.getKey()) == null || parsedConfig.get(key.getKey()) == " " ||
					parsedConfig.get(key.getKey()).getClass() !=  config.parse(parsedConfig).get(key.getKey()).getClass() 
					) {
				if(config.parse(parsedConfig).get(key.getKey()) != null || 
						config.parse(parsedConfig).get(key.getKey()) == CONSTANTVALUES.NODEFAULTVALUE 
						|| config.parse(parsedConfig).get(key.getKey()) != " "  ) {
					{}*/
			
			if(parsedConfig.containsKey(key.getKey()) ) {
				System.out.println(key.getKey());
				System.out.println(config.defaultValues().get(key.getKey()));
				System.out.println(parsedConfig.get(key.getKey()));
				if((parsedConfig.get(key.getKey()) == null 
						|| parsedConfig.get(key.getKey()).toString().trim() == "")
						&&
						 (config.defaultValues().get(key.getKey()) != null 
						|| config.defaultValues().get(key.getKey()).toString().trim() != ""))
				{
					prop.put(key.getKey(),config.defaultValues().get(key.getKey()));
			
			
					
				}
				else {
					
						prop.put(key.getKey(),parsedConfig.get(key.getKey()));

					
				}
				
			}
			
			
		}
		System.out.println(prop);
		return prop;
	}
}
