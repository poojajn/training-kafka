package com.traing.servicelocator;



public class ServiceLocator {
  private static Cache cache;
  static {
	  cache=new Cache();
	  }
	  public static Service getService(String jndiName) {
		  Service service=cache.getService(jndiName);
	if(service!=null) {
		return service;
	}
	
	IntialContext context=new IntialContext();
	Service newService=(Service)context.lookup(jndiName);
	cache.addService(newService);
	return newService;
	  }
  }

