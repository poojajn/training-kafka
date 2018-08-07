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

public class StoreEmpRecord {

	public static void main(String[] args) {
MongoClient client=new MongoClient("localhost",27017);
		
		DB d=client.getDB("Rama");
		
		
		DBCollection dbc=d.getCollection("emps");
		
		
		
		DBObject obj=new BasicDBObject();
		obj.put("emid", 345);
		obj.put("emname", "cat");
		obj.put("department", "hdwr");
		obj.put("salary", 34500);
		obj.put("empmail", "cat@gmail.com");
		
		//dbc.save(obj);
		
		//second wayyyyy
		
		
		
		Map<String,Object> map=new HashMap();
		map.put("emid",346);
		map.put("emname","dog");
		map.put("salary",35677);
		map.put("department","elec");
		
		dbc.save(new BasicDBObject(map));
		
		String jsonString= "{emid:347,empname:'Pig',salary:34656,empmail:'pig@gmail.com',department:'swt'}";
		
		dbc.save((DBObject)JSON.parse(jsonString));
		
		DBObject obj1=new BasicDBObject();
		
		Employee employee=new Employee();
		employee.setEmid(348);
		employee.setDepartment("swt");
		employee.setEmpmail("queen@gmail.com");
		employee.setSalary(23455);
		employee.setEmpname("queen1");
		Map<String,Object> map1=new HashMap();
			
			map1.put("emid",employee.getEmid());
			map1.put("emname",employee.getEmpname());
			map1.put("salary",employee.getSalary());
			map1.put("department",employee.getDepartment());
			
			DBObject obj2=new BasicDBObject();
			
			dbc.save((DBObject)employee);
		
			//dbc.save(new BasicDBObject(map1));
		
		

		
	}
}


