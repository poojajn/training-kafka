package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class DemoImp {
	
	
	DemoImp(String msg){  
	        System.out.print(msg);  
	    } 
	
	public static void methoStatic() {
		 System.out.println("i am in methodStatic....class..");
		 
	 }
	
	public static void drawSomething() {
		System.out.println("Hello, this is static method...");
	}
	public static int add(int a,int b) {
		System.out.println("adding two numbers...");
		
		return a+b;
	}
	public static void then(String a) {
		System.out.println("andThen two numbers...");
		
		
	}
	public  void instaMethod() {
		System.out.println("instaMethod ........");
		
		
	}
	public static void main(String[] args) {
		
	  int width=10;
	  //lamda expression
		Demo d=()->{ System.out.println("width:::"+width);};
		d.draw();
		List<String> list=new ArrayList<String>();
		list.add("A");
		list.add("C");
		list.add("B");
		//lamda expression on sorted data of type non-primitive
		Collections.sort(list);
		list.forEach(n->System.out.println(n));
		 List<Product> list1=new ArrayList<Product>();  
         
	        //Adding Products  
		 list1.add(new Product(1,"HP Laptop",25000f));  
		 list1.add(new Product(3,"Keyboard",300f));  
		 list1.add(new Product(2,"Dell Mouse",150f)); 
		 
		
	          
	        System.out.println("Sorting on the basis of name...");  
	  
	        // implementing lambda expression  
	       
		  
		 
	        Collections.sort(list1,(p1,p2)->{  
	        return p1.name.compareTo(p2.name);  
	        });  
	        for(Product p:list1){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }  
	        //filter concept.....
	        System.out.println("..................");  
	        Stream<Product> prod=list1.stream().filter(p->p.price>100);
		prod.forEach(p->System.out.println(p.id+":"+p.name+":"+p.price));
		
		
		// method reference
		
	Demo demo=DemoImp::drawSomething;
		demo.draw();
		Thread thread=new Thread(DemoImp::drawSomething);
		thread.start();
		//predef fnInter to refer methods  BiFunction==apply
		
		BiFunction<Integer, Integer, Integer> adder = DemoImp::add;  
		int result = adder.apply(10, 20);  
		System.out.println(result);  
		
		//Bifunction==andThen
		BiFunction<String, String,String> bi = (x, y) -> {      
		      return x + y;
		    };
		    Function<String,String> f = x-> x+" new";
		    
		    System.out.println(bi.andThen(f).andThen(f).andThen(f).apply("java2s.com", " tutorial"));
		  }
		//method ref::instance method
	
   // Demo demo1=new DemoImp()::instaMethod;
    //demo1.draw();
	
   // Messageable hello = DemoImp::new;  
   //  hello.getMessage("Hello....");
	Demo d3=DemoImp::drawSomething;
		//Demo.methoStatic();
		
		}  
	

	
	


