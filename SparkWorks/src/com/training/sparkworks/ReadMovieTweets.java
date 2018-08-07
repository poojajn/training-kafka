package com.training.sparkworks;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadMovieTweets {

	public static void main(String[] args) {
		String appName="sampleApp";
		
		String sparkMaster="local[2]";
		JavaSparkContext context=null;
		SparkConf conf=new SparkConf().setAppName(appName)
        .setMaster(sparkMaster);
		
		context=new JavaSparkContext(conf);
		
		JavaRDD<String> tweetsRDD=context.textFile("./data/movietweets.csv");
		
		tweetsRDD.take(5).forEach(System.out::println);
		
		int count=(int)tweetsRDD.count();
		
		System.out.println("NUmber of Tweets are "+count);

		
		JavaRDD<String> uperCaseRDD=tweetsRDD.map(temp->temp.toUpperCase());
		
		uperCaseRDD.take(10).forEach(System.out::println);
		
		while(true) {
			try { Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		
	}

}
