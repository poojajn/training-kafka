package com.training.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		
//		System.setProperty("spring.profiles.active", "Development");
//		System.setProperty("spring.profiles.active", "Production");
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		
		((AnnotationConfigApplicationContext)applicationContext).getEnvironment().setActiveProfiles(new String[]{"Production", "Development"});
		//((AnnotationConfigApplicationContext)applicationContext).getEnvironment().setActiveProfiles("Production");
		((AnnotationConfigApplicationContext)applicationContext).scan("com.training.profile");
		
		((AnnotationConfigApplicationContext)applicationContext).refresh();
		((AnnotationConfigApplicationContext)applicationContext).close();
	}

}
