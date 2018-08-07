package com.training.sparkworks;

import java.util.Arrays;
import java.util.Iterator;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;

import com.training.commons.DataSource;
import com.training.commons.SparkConnection;
import com.training.commons.Utilities;

public class SaprkOperationsClient {

	public static void main(String[] args) {
		Logger.getLogger("org").setLevel(Level.ERROR);

		Logger.getLogger("akka").setLevel(Level.ERROR);
		
		JavaSparkContext context=SparkConnection.getContext();
		
		
		
		//start  loading the data
		//1.load the collection and cache it
		JavaRDD<Integer> collData=DataSource.getCollData();
		
		System.out.println("Total Number of Recodrs:"+collData.count());
		
		
		//2.load the file and cache it
		
		JavaRDD<String> autoDataContent=context.textFile("./data/auto-data.csv");
		//to know numbrs of records
		
		
		System.out.println("Number of Records::"+autoDataContent.count());
		System.out.println("Loading......data from file.....");
		//autoDataContent.take(5).forEach(System.out::println);
		
		
		//Utilities.printStringRDD(autoDataContent, 10);
		
		//storing RDDs
		//autoDataContent.saveAsTextFile("./data/auto-data-modified.csv");
		
		//spark transformation
		//conversion from csv to tsv
		System.out.println("TSV DATA.........");
		JavaRDD<String> tsvData=autoDataContent.map(temp->temp.replace(",","\t"));
		//tsvData.take(5).forEach(System.out::println);
		Utilities.printStringRDD(tsvData, 10);
		
		////////////FILTER EXAMPLE/////////////
		//to remove header
		
		String header=autoDataContent.first();
		System.out.println("header:::::"+header);
		JavaRDD<String> autoDataWithOutHeader=autoDataContent.filter(s->!s.equals(header));
		
		Utilities.printStringRDD(autoDataWithOutHeader, 10);
		
JavaRDD<String> autoDataToyota=autoDataContent.filter(s->s.contains("toyota"));
		
   System.out.println("........TOYOTA DATA.........");
		Utilities.printStringRDD(autoDataToyota, 10);
		
		JavaRDD<String> uniqueData=autoDataContent.distinct();
		System.out.println("........UNIQUE DATA.........");
		
		//uniqueData.take(autoDataContent.).forEach(System.out::println);
		//Utilities.printStringRDD(autoDataToyota, autoDataContent.count());
		uniqueData.foreach(item -> {
	            System.out.println(item);
	        });
		System.out.println("........autoDataContent DATA........."+autoDataContent.count());
		System.out.println("........uniqueData DATA........."+uniqueData.count());
		
		//to count number of words in RDD
		System.out.println("........count words DATA.........");
		JavaRDD<String> wordsCount=autoDataToyota.flatMap(new FlatMapFunction<String, String>() {
			@Override
			public Iterator<String> call(String t)throws Exception 
			{
				return Arrays.asList(t.split(",")).iterator();
			}
		});
		System.out.println("toyota words count......"+wordsCount.count());
		//after cleansing dat
		System.out.println("......................");
		JavaRDD<String> clense=autoDataToyota.map(new ClenseRDDCars());
		
		Utilities.printStringRDD(clense, 5);
		
		
		//set operations.......
		JavaRDD<String> words1=context.parallelize(Arrays.asList("hello","how","are","you","today"));
		JavaRDD<String> words2=context.parallelize(Arrays.asList("hello","how","were","yesterday"));
		System.out.println("Union operation--Set");
		Utilities.printStringRDD(words1.union(words2),9);
		
		System.out.println("Intersection operation--Set");
		Utilities.printStringRDD(words1.intersection(words2),9);
		//find sum of number in the given RDD
		System.out.println("summmmmm operation--");
		
		Integer collectData=collData.reduce((x,y)->x+y);
		System.out.println("sum of given numbers...."+collectData);
		
		
		System.out.println("......................");
		//JavaRDD<String> clense=autoDataToyota.spl
		
		Utilities.printStringRDD(clense, 5);
		//JavaRDD<String> city=tsvData.
		
		
		//System.out.println(" MPG-CITY...."+city);
		//JavaRDD<String> mpg=city.reduce((x,
		//System.out.println("sum of given MPG-CITY...."+collectData);
		
		//MPG-CITY,MPG-HWY,
	}

}
