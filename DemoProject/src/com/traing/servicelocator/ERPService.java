package com.traing.servicelocator;

public class ERPService implements Service {
 
	@Override
	 public String getName() {
		 return "ERP";
	 }
	 @Override
	 public void execute() {
		 System.out.println("we r executing ERP service");
	 }
}