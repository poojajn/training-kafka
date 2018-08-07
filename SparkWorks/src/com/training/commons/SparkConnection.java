package com.training.commons;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

public class SparkConnection {
	
	private static String appName="sampleApp";
	private static String  sparkMaster="local[2]";
	
	private static JavaSparkContext context=null;
	private static SparkSession session=null;
	private static String tempDir="file:///Users/ramana.k/Desktop/spark-warehouse";
	
	private static void getConnection() {
		if(context==null) {
			SparkConf conf=new SparkConf().setAppName(appName).setMaster(sparkMaster);
			
			context=new JavaSparkContext(conf);
			
			 session=SparkSession.builder().appName(appName).master(sparkMaster).config("saprk.sql.warehouse.dir",tempDir).getOrCreate();
		}
		
	}
	public static JavaSparkContext getContext(){
		if(context==null) {
			getConnection();
		}
		return context;	
		
	}
 public static SparkSession getSession() {
	 if(session==null) {
			getSession();
		}
		return session;	
		
      }
}
