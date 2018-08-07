package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("messageResource-context.xml");

		String  engGoodMrng=applicationContext.getMessage("goodmorning", new Object[] {},null);
		
		String  frGoodMrng=applicationContext.getMessage("goodmorning", new Object[] {},new Locale("fr"));
		
		System.out.println(engGoodMrng);
		System.out.println(frGoodMrng);
		System.out.println("................................");
		
		HelloWorld helloWorld=(HelloWorld)applicationContext.getBean("helloWorld",HelloWorld.class);
		
		helloWorld.sayHelloWorld();
		helloWorld.sayHelloWorld_fr();
		
	}

}
