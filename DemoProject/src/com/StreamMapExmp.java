package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapExmp {
	
	//sysntax is upto jdk1.7
	public static List<PriorityCustomer> filterCustomer(List<Customer> customers){
		List<PriorityCustomer> priorityCustomer=new ArrayList<>();
		for(Customer temp:customers) {
			if(temp.getCustomerPurchases()>5000) {
				priorityCustomer.add(new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),"Gold"));
				}
			}
		return priorityCustomer;
	}
	public static List<PriorityCustomer> filterCustomer1(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=customers.stream().map(temp->{ 
			return 	new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),temp.getCustomerPurchases()>0&&temp.getCustomerPurchases()<3000?"silver":temp.getCustomerPurchases()>3000&&temp.getCustomerPurchases()<5000?"Gold":"Platinum");	
		}).collect(Collectors.toList());
		return priorityCustomers;
		
		
	}
	public static List<PriorityCustomer> filterCustomer2(List<Customer> customers){
		
		return customers.stream().filter(temp->temp.getCustomerPurchases()>5000).map(temp->{
			return new PriorityCustomer(temp.getCustomerId(),temp.getCustomerName(),"Gold");}).collect(Collectors.toList());
		}
	

	
	
	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
	new Customer(101,"rama",6000,"Engineer")	,
	new Customer(102,"Teja",6500,"Developer"),
	new Customer(103,"Kavitha",7500,"Lead")	,
	new Customer(104,"Pooja",5600,"Engineer"),
	new Customer(105,"Lovely",4000,"Developer"),	
	new Customer(106,"deepthi",200,"Developer")
	);
		System.out.println(":::::::::thanComparing::::::::::::");
		//thanComparingExample(customers).forEach(System.out::println);
		
		filterCustomer(customers).forEach(System.out::println);
		System.out.println(":::::::::filterCustomer1::::::::::::");
		filterCustomer1(customers).forEach(System.out::println);
		System.out.println(":::::::::filterCustomer2::::::::::::");
		filterCustomer2(customers).forEach(System.out::println);
		
		System.out.println(":::::::::Predicate::::::::::::");
		Predicate<Customer> greaterThan=c->c.getCustomerPurchases()>3000;
		
		//Predicate<Integer> compoundPredicate=positiveNumbers.and(betweenRange);
	    List<Customer> compoundList=filteredList(customers,greaterThan);
	    List<Customer> compoundList1=filteredList1(customers,greaterThan);
	    Predicate<Customer> finalFilter=isEngineerGreaterThanSk(compoundList1);
	    List<Customer> finalCompoundList1=filteredList1(customers,finalFilter);
	    System.out.println("::::: list of values in predicate::::::");
	    compoundList.forEach(System.out::println);
	    System.out.println("::::: list of values in predicate1::finalCompoundList1::::");
	    finalCompoundList1.forEach(System.out::println);
		
	}
	public static List<Customer> filteredList(List<Customer> customers,Predicate<Customer> predicate){
		  List<Customer> filterList=new ArrayList<Customer>();
		  for(Customer temp:customers) {
			  if(predicate.test(temp)) {
				  filterList.add(temp);
			  }
		  }
		  return  filterList;
		  }
	public static List<Customer> filteredList1(List<Customer> customers,Predicate<Customer> predicate){
		  
		  return  customers.stream().filter(predicate).collect(Collectors.<Customer>toList());
		  }
	public static Predicate<Customer> isEngineerGreaterThanSk(List<Customer> customers){
		 Predicate<Customer> engineer=c->c.getDesignation().equals("Engineer");
		 return engineer;
	}
	//##############################################################
//	
//	public static List<Customer> thanComparingExample(List<Customer> customers){
//			
//		Comparator<Customer> employee_Purchases_Name_Comparator
//             = Comparator.comparing(Customer::getCustomerPurchases).thenComparing(Customer::getCustomerName);
//  
//         Arrays.sort(customers, employee_Purchases_Name_Comparator);
//   
//         assertTrue(Arrays.equals(customers, sortedEmployeesByAgeName));
//}

	
	
	
	
	}
