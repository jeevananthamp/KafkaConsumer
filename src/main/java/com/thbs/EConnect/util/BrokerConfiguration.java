package com.thbs.EConnect.util;

import java.util.Properties;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

import com.thbs.EConnect.CONSTANTS.CONSTANTKEYS;
import com.thbs.EConnect.CONSTANTS.CONSTANTVALUES;

public class BrokerConfiguration  extends AbstractConfig{
	static String PRODUCER_TOPIC;
	static String CONSUMER_TOPIC;
	Properties prop = new Properties();
	SetDefnitionProperties setConfig;
	public BrokerConfiguration(ConfigDef config, Properties parsedConfig) {
		super(config, parsedConfig);
		// TODO Auto-generated constructor stub
				this.setConfig = new SetDefnitionProperties();
				this.prop = this.setConfig.setConfig(config,parsedConfig);		
				
			
		}
		public Properties getProducerProperties() {
			return this.prop;
		}
  public BrokerConfiguration(Properties properties) {
		this(conf(), properties);
		// TODO Auto-generated constructor stub
	}
static ConfigDef conf() {
		return new ConfigDef()
				.define(CONSTANTKEYS.BOOTSTRAPSERVER_KEY, ConfigDef.Type.STRING,CONSTANTVALUES.BOOTSTRAPSERVER_DEFAULTVALUE ,ConfigDef.Importance.HIGH, "boostrap servers")
				;
		}
}
