package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersionClient {

	public static void main(String[] args) {
		List<Person> personList=Arrays.asList(
	      new Person(101,"Kavitha"),			
				new Person(102,"Rama"),
				new Person(103,"Teja"),
				new Person(104,"Lovely"));
		 personList.forEach(System.out::println);
		 PersonConsumer print= new PersonConsumer();
		 personList.forEach(print);
		 
		 //personList.forEach(new Consumer<Person>(){(t)->{System.out.println("persn ID::"+t.getpId()+":::person Name::"+t.getName());}});
		 
	}
 
}
