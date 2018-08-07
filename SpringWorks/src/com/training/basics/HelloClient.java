package com.training.basics;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloClient {

	public static void main(String args[]) {
		
//		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
//		HelloService helloService=(HelloService)factory.getBean("defaultHello");
		ApplicationContext appletContext=new ClassPathXmlApplicationContext("spring-context.xml");
		HelloService helloService=(HelloService)appletContext.getBean("defaultHello");
		System.out.println(helloService.sayHello());
	}
	
}
