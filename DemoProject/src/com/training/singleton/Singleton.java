package com.training.singleton;

import java.io.Serializable;

//sigleton says there should be only one Object
//1.eager 2.lazy
public class Singleton implements Serializable{
	private static final Singleton instance=new Singleton();
 private Singleton() {
	 System.out.println("the constructor is called");
 }
 
 public static Singleton getInstance() {
	 return instance;
 }
 protected Object readResolver() {
	  return getInstance();
 }
 
}
