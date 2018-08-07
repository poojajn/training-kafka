package com.training.helloi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Greeting greeting=applicationContext.getBean("french",Greeting.class);
		Greeting greeting1=applicationContext.getBean("english",Greeting.class);
		System.out.println(greeting.greetHello());
		System.out.println(greeting1.greetHello());
	}

}
