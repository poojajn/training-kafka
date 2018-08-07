package com.training;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class GetOneRecord {

	public static void main(String[] args) {
		MongoClient client=new MongoClient("localhost",27017);
		
		DB d=client.getDB("Rama");
		
		
		DBCollection dbc=d.getCollection("emps");
		
		DBObject dbObject=dbc.findOne();
		
		
		System.out.println("Employee ID:"+dbObject.get("emid"));
		System.out.println("Employee Name:"+dbObject.get("empname"));
		System.out.println("Employee salary:"+dbObject.get("salary"));
     
		
		System.out.println(":::::::::::::::::::::::::::::");
		for(DBObject eacObj:dbc.find()) {
			
			//DBCursor.....
			System.out.println("Employee ID:"+eacObj.get("emid")+" "+"Employee Name:"+eacObj.get("empname")+" "+"Employee salary:"+eacObj.get("salary"));
//			System.out.println("Employee Name:"+eacObj.get("empname"));
//			System.out.println("Employee salary:"+eacObj.get("salary"));
		}
		
		
	}

}
