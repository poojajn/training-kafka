package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args)throws IOException {
		
		writeToFile();
		writeToFile1();
		readFromFile1();
	}
  public static void writeToFile()throws IOException{
	  BufferedWriter bw=null;
	  try {
	   bw=new BufferedWriter(new FileWriter("note2.txt"));
  }catch(IOException ieo) {
	  ieo.printStackTrace();
  }finally {
	  try {
	bw.close();
   }catch(IOException e ) {
	   e.printStackTrace();
       }
   }
  }  
  public static void writeToFile1()throws IOException{
	 try( BufferedWriter bw=new BufferedWriter(new FileWriter("note2.txt"))){
		 bw.write("hello......");
		 bw.newLine();
		 bw.write("welcome.....");
		 
        }
  System.out.println("data added successfully....");
   }
  public static void readFromFile1()throws IOException{
		 try(BufferedReader br=new BufferedReader(new FileReader("note2.txt"))){
			 
			 br.lines().forEach(System.out::println);
			 
	        }
	  System.out.println("data read successfully....");
	   }
  
}
