package com.training;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class GetMetaData {

	public static void main(String[] args) {
		
		MongoClient client=new  MongoClient("localhost",27017);
		
		
		System.out.println("connection got to"+client);
		
		
		
		System.out.println("list of DBS from Mongo:::;");
		
		
		
		for( String dbName:client.getDatabaseNames()) {
			
			System.out.println("\t"+dbName);
			
			DB db=client.getDB(dbName);
			
			for(String collectionName:db.getCollectionNames()) {
				System.out.println("\t"+collectionName);
			}
			
			
		}

	}

}
