package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamdaBasic01 
{
public static void main(String args[]){
	System.out.println("Hello...welcome to fisrst programme");
	
	List<Integer> intList=Arrays.asList(11,30,23,65,18);
	System.out.println(":::jdk1.5:::::::;");
	for(int i=0;i<intList.size();i++)
	{
		System.out.println(intList.get(i));
		
	}// jdk1.5
	System.out.println(":::jdk1.7:::::::;");
	for(int x:intList) {
		System.out.println(x);
	}//jdk1.7
	System.out.println(":::jdk1.8:::::::;");
	intList.forEach(x->{
		
	System.out.println(x);
	int y=x+1;
	
	System.out.println("y::"+y);
	});//jdk1.8
	System.out.println("with consumer:::::::;");
	intList.forEach(new Consumer<Integer>() {
		
		@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
	});
	System.out.println("lamda way:::::01:;");
	intList.forEach((temp)->System.out.println(temp));
	System.out.println("lamda way:::::02:;");
	intList.forEach(System.out::println);
	System.out.println("sum of Numbers::1.7::::;");
	int sum=0;
	for(int x:intList) {
		sum+=x*2;
		
	}//jdk1.7
	System.out.println(sum);
	System.out.println("sum of Numbers::earlier verstion:::;");
	System.out.println(intList.stream().map(e->e*2).reduce((s,e)->s+e));
	
  }
}