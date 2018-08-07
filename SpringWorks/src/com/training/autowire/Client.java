package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.helloi18n.AppConfig;
import com.training.helloi18n.Greeting;

public class Client {

	public static void main(String[] args) {
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-context3.xml");
		
		Mobile mobile=(Mobile)applicationContext.getBean("mobile",Mobile.class);
		System.out.println("Mobile Details:::");
		
		System.out.println("Camera Details:"+" camera type::"+mobile.getCamera().getType());
		System.out.println("Speaker details:"+"speaker type :"+mobile.getSpeaker().getType()+ "  volume:"+mobile.getSpeaker().getVolume());
		System.out.println("Screen Details:"+" glass type:"+mobile.getScreen().getGlsType()+" length:"+mobile.getScreen().getLeg()+"breadth :"+mobile.getScreen().getBre());
	}

}
