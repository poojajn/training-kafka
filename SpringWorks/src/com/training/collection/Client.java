package com.training.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collection-context.xml");

		MyCollection collection=(MyCollection)applicationContext.getBean("myCollection",MyCollection.class);
		
		System.out.println(collection.getAccountMap());
		System.out.println(collection.getAddressSet());
		System.out.println(collection.getQuestionBank());
	}

}
