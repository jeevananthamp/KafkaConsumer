package com.thbs.EConnect.util;



import java.util.Properties;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

import com.thbs.EConnect.CONSTANTS.CONSTANTKEYS;

import com.thbs.EConnect.CONSTANTS.CONSTANTVALUES;

public class TopicConfiguration  extends AbstractConfig{
	Properties prop = new Properties();
	SetDefnitionProperties setConfig;
	
	public TopicConfiguration(ConfigDef config, Properties parsedConfig) {
		super(config, parsedConfig);
		// TODO Auto-generated constructor stub
				this.setConfig = new SetDefnitionProperties();
				this.prop = this.setConfig.setConfig(config,parsedConfig);		
				
			
		}
		public Properties getProducerProperties() {
			return this.prop;
		}
  public TopicConfiguration(Properties properties) {
		this(conf(), properties);
		// TODO Auto-generated constructor stub
	}
  static ConfigDef conf() {
		return new ConfigDef()
				.define(CONSTANTKEYS.BOOTSTRAPSERVER_KEY, ConfigDef.Type.STRING,CONSTANTVALUES.BOOTSTRAPSERVER_DEFAULTVALUE ,ConfigDef.Importance.HIGH, "boostrap servers")
				.define(CONSTANTKEYS.CLEANUPPOLICY_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.CLEANUPPOLICY_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "cleanup policy")
				.define(CONSTANTKEYS.COMPRESSIONTYPE_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.COMPRESSIONTYPE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "compression type")
				.define(CONSTANTKEYS.DELETERETENTIONMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.DELETERETENTIONMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "delete retention")
				.define(CONSTANTKEYS.FILEDELETEDELAYMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.FILEDELETEDELAYMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "filedelete delay")
				.define(CONSTANTKEYS.FLUSHMESSAGES_KEY, ConfigDef.Type.LONG, CONSTANTVALUES.FLUSHMESSAGES_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "flush messages")
				.define(CONSTANTKEYS.FLUSHMS_KEY, ConfigDef.Type.LONG, CONSTANTVALUES.FLUSHMS_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "flush ms")
				.define(CONSTANTKEYS.INDEXINTERVALMS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.INDEXINTERVALMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "index interval")
				.define(CONSTANTKEYS.LEADERREPLICATIONTHROTTLEDREPLICAS_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.LEADERREPLICATIONTHROTTLEDREPLICAS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"leader replication throttled replicas")
				.define(CONSTANTKEYS.FOLLOWERREPLICATIONTHROTTLEDREPLICAS_KEY, ConfigDef.Type.LIST,
						CONSTANTVALUES.FOLLOWERREPLICATIONTHROTTLEDREPLICAS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"follower replication throttled replicas")
				.define(CONSTANTKEYS.MAXCOMPACTIONLAGMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.MAXCOMPACTIONLAGMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"max compaction lag")
				.define(CONSTANTKEYS.MAXMESSAGEBYTES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.MAXMESSAGEBYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "max message bytes")
				.define(CONSTANTKEYS.MESSAGEFORMATVERSION_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.MESSAGEFORMATVERSION_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"message format version")
				.define(CONSTANTKEYS.MESSAGETIMESTAMPDIFFERENCEMAXMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.MESSAGETIMESTAMPDIFFERENCEMAXMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"message timestamp diff")
				.define(CONSTANTKEYS.MESSAGETIMESTAMPTYPE_KEY, ConfigDef.Type.STRING,
						CONSTANTVALUES.MESSAGETIMESTAMPTYPE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"message timestamp type")
				.define(CONSTANTKEYS.MINCLEANABLEDIRTYRATIO_KEY, ConfigDef.Type.DOUBLE,
						CONSTANTVALUES.MINCLEANABLEDIRTYRATIO_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"min cleanable dirty ratio")
				.define(CONSTANTKEYS.MINCOMPACTIONLAGMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.MINCOMPACTIONLAGMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"min compaction lags")
				.define(CONSTANTKEYS.MININSYNCREPLICAS_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.MININSYNCREPLICAS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"min insync replicas")
				.define(CONSTANTKEYS.PREALLOCATE_KEY, ConfigDef.Type.BOOLEAN, CONSTANTVALUES.PREALLOCATE_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "preallocate")
				.define(CONSTANTKEYS.RETENTIONBYTES_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.RETENTIONBYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "retention bytes")
				.define(CONSTANTKEYS.RETENTIONMS_KEY, ConfigDef.Type.LONG, CONSTANTVALUES.RETENTIONMS_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "retention ms")
				.define(CONSTANTKEYS.SEGMENTBYTES_KEY, ConfigDef.Type.INT, CONSTANTVALUES.SEGMENTBYTES_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "segment bytes")
				.define(CONSTANTKEYS.SEGMENTINDEXBYTES_KEY, ConfigDef.Type.INT,
						CONSTANTVALUES.SEGMENTINDEXBYTES_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"segment index bytes")
				.define(CONSTANTKEYS.SEGMENTJITTERMS_KEY, ConfigDef.Type.LONG,
						CONSTANTVALUES.SEGMENTJITTERMS_DEFAULTVALUE, ConfigDef.Importance.MEDIUM, "segment jitter ms")
				.define(CONSTANTKEYS.SEGMENTMS_KEY, ConfigDef.Type.LONG, CONSTANTVALUES.SEGMENTMS_DEFAULTVALUE,
						ConfigDef.Importance.MEDIUM, "segment ms")
				.define(CONSTANTKEYS.UNCLEANLEADERELECTIONENABLE_KEY, ConfigDef.Type.BOOLEAN,
						CONSTANTVALUES.UNCLEANLEADERELECTIONENABLE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"unclean leader election enable")
				.define(CONSTANTKEYS.MESSAGEDOWNCONVERSIONENABLE_KEY, ConfigDef.Type.BOOLEAN,
						CONSTANTVALUES.MESSAGEDOWNCONVERSIONENABLE_DEFAULTVALUE, ConfigDef.Importance.MEDIUM,
						"message downconversion enable")
				;
		}
}
