package com.traing.servicelocator;

public class Client {

	public static void main(String[] args) {
		Service dbService=ServiceLocator.getService("db");
		dbService.execute();
		System.out.println("...........................");
		
		Service erpService=ServiceLocator.getService("erp");
		erpService.execute();
		System.out.println("............***...............");
		
		Service dbService1=ServiceLocator.getService("db");
		dbService1.execute();
		System.out.println("............***...............");
		dbService1=ServiceLocator.getService("db");
		dbService1.execute();
		System.out.println("...........................");
		Service erpService1=ServiceLocator.getService("erp");
		erpService1.execute();
		System.out.println("...........................");
	}

}
