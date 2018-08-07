package com.traing.servicelocator;

public class IntialContext {
 
	
	public Object lookup(String jndiName) {
		if(jndiName.equalsIgnoreCase("db")) {
			System.out.println("looking for DB service and creating");
			return new DBService();
		}else if(jndiName.equalsIgnoreCase("erp")) {
			System.out.println("looking for erp service and creating");
			return new ERPService();
		}
		return null;
	}
}
