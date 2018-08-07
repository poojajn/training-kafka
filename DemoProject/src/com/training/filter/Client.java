package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		list.add(new Person("Lohit","male","single"));
		list.add(new Person("Ramana","female","single"));
		list.add(new Person("Kumar","male","married"));
		list.add(new Person("Kavitha","female","single"));
		list.add(new Person("Teja","female","married"));
		list.add(new Person("Pooja","female","single"));
		list.add(new Person("vinod","male","married"));
		
		ICriteria maleCriteria=new Male();
		
		System.out.println("..................only male...............");
		maleCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria femaleCriteria=new Female();
		
		System.out.println("..................only female...............");
		femaleCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria martialStatus=new MartialStatus();
		System.out.println("..................martialStatus...............");
		System.out.println("..................male&single...............");
		martialStatus.meetCriteria(list).forEach(System.out::println);
//		System.out.println("..................male&married...............");
//		martialStatus.meetCriteria(list).forEach(System.out::println);
		//AndCriteria andCriteria=new AndCriteria(femaleCriteria,martialStatus);
		
//		System.out.println("..................martialStatus...............");
//		andCriteria.meetCriteria(list).forEach(System.out::println);
	}

}
