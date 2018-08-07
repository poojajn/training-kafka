package com.training.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonClient04 {

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		
		Singleton singleton=Singleton.getInstance();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("sample1.ser"));
		
		out.writeObject(singleton);
		System.out.println("object saved with hascode"+singleton);
      out.close();
      //////////////////////////////////////////////////
      ObjectInputStream ois=new ObjectInputStream(new FileInputStream("sample1.ser"));
      Singleton singleton1=(Singleton)ois.readObject();
      ois.close();
      System.out.println("object recieved with hascode"+singleton1);
      
      
      
	}

}
