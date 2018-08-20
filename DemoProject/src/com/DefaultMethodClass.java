package com;

import java.util.ArrayList;
import java.util.List;

public class DefaultMethodClass  {

	public static void test() {
		System.out.println("i am test ref to draw");
	}

public static void main(String[] args) {
	
	//Demo d=()->{System.out.println("i am in main class");};
	Demo d=DefaultMethodClass::test;
	//d.draw();
	d.defaultMethod();
	Demo.methoStatic();
	
	List<String> gamesList = new ArrayList<String>();  
    gamesList.add("Football");  
    gamesList.add("Cricket");  
    gamesList.add("Chess");  
    gamesList.add("Hocky");  
    System.out.println("------------Iterating by passing method reference---------------");  
    gamesList.forEach(System.out::println);
    System.out.println("------------Iterating by passing lambda expression---------------");  
    gamesList.stream().forEachOrdered(games -> System.out.println(games));  
    System.out.println("------------Iterating by passing method reference---------------");  
    gamesList.stream().forEachOrdered(System.out::println);  
    
    System.out.println(":::::::::::::::::::::::::::::::::");
    String str = "sushil mittal";
    System.out.println("****forEach without using parallel****");
    str.chars().forEach(s -> System.out.print((char) s));
    System.out.println("\n****forEach with using parallel****");

    str.chars().parallel().forEach(s -> System.out.print((char) s));
    System.out.println("\n****forEachOrdered with using parallel****");

    str.chars().parallel().forEachOrdered(s -> System.out.print((char) s));
    
    
    
   }
}
