package com.traing.servicelocator;

public class DBService implements Service{
 @Override
 public String getName() {
	 return "DB";
 }
 @Override
 public void execute() {
	 System.out.println("we r executing DB service");
 }
}
