package com;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaSort05 {
	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
	new Customer(101,"Rama",6000,"Engineer")	,
	new Customer(102,"Teja",6500,"Developer"),
	new Customer(103,"Kavitha",7500,"Lead")	,
	new Customer(104,"Pooja",5600,"Engineer"),
	new Customer(105,"Lovely",4000,"Developer"),	
	new Customer(106,"Deepthi",200,"Developer")
	);
		System.out.println(":::::before sort::::::::");
		customers.forEach(System.out::println);
		//jdk1.7
		Collections.sort(customers,new Comparator<Customer>() {
			@Override
			public int compare(Customer o1,Customer o2) {
				return o1.getCustomerName().compareTo(o2.getCustomerName());
			}
			
		});
		System.out.println(":::::after sort:on name:::::::");
		customers.forEach(System.out::println);
		//jdk1.8
		System.out.println(":::::after sort:on purchases(asc):::::::");
		customers.sort((Customer c1,Customer c2)->(int)(c1.getCustomerPurchases()-c2.getCustomerPurchases()));
		customers.forEach(System.out::println);
		System.out.println(":::::after sort:on designation(asc):::::::");	
		customers.sort((c1, c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		customers.forEach(System.out::println);
		
		Comparator<Customer> custNameASC=(c1,c2)->c1.getCustomerName().compareTo(c2.getCustomerName());
		
		Collections.sort(customers,custNameASC);
		System.out.println(":::::after sort:on name:ASC::::::");
		customers.forEach(System.out::println);
		Collections.sort(customers,custNameASC.reversed());
		System.out.println(":::::after sort:on name:::DESC::::");
		customers.forEach(System.out::println);
		
   }
}