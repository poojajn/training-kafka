package com;
@FunctionalInterface
public interface Demo {
 public void draw();
 default void print() {
	 System.out.println("i am print....interface..");
 }
 
 public static void methoStatic() {
	 System.out.println("i am in methodStatic....interface..");
	 
 }
 default void defaultMethod() {
	 System.out.println("i am in defaultMethod....interface..");
 }
 public String toString();
}
