package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public class GetImage {

	public static void main(String[] args)throws IOException {
		 MongoClient mongoClient=new MongoClient("localhost",27017);
		 DB db=mongoClient.getDB("Rama");
		 //second param is optional
		 //second param will kept in named collection
		 GridFS gfs=new GridFS(db,"my image");
		 String path="/Users/ramana.k/Desktop/picture2/";
		 File folderpath=new File(path);
		 
		 
		 List<GridFSDBFile> list=gfs.find(new BasicDBObject());
		 

		 for(GridFSDBFile file:list)
		 {
			 file.writeTo(path+file.getFilename());
		 
		
		 }
		 System.out.println("Restored Image from Mongodb....");
	mongoClient.close();
	System.out.println("pic closed");
	
	
	}

	}


