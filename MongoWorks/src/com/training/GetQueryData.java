package com.training;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

public class GetQueryData {

	public static void main(String[] args) {
MongoClient client=new MongoClient("localhost",27017);
		
		DB d=client.getDB("Rama");
		
		
		DBCollection dbc=d.getCollection("emps");
		
		Map<String,Integer> map=new HashMap();
		map.put("emid",1);
		map.put("emname",1);
		map.put("_id",0);
		
		DBObject query=new BasicDBObject(map);
		
		
		DBObject sort=new BasicDBObject("empname",-1);
		
		DBCursor cursor=dbc.find(query).sort(sort).limit(2);
		
		
		System.out.println(":::::::::::::::::::::::::::::");
		for(DBObject eacObj:cursor) {
			
			//DBCursor.....
			System.out.println(eacObj);
			System.out.println(JSON.serialize(eacObj));
			System.out.println("Employee ID:"+eacObj.get("emid")+" "+"Employee Name:"+eacObj.get("empname")+" "+"Employee salary:"+eacObj.get("salary"));
	}

	}
}
