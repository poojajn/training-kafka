package com.training.abstractfactory;

public class CustomerClient {

	public static void main(String[] args) {
		Customer customer1=new Customer(101,"Rama");
		Customer customer2=new Customer(102,"Teja");
		Customer customer3=new Customer(103,"Kavitha");
		Customer customer4=new Customer(104,"Pooja");
		Customer customer5=new Customer(105,"Bhawana");
		Customer customer6=new Customer(106,"Rama");
		Customer customer7=new Customer(107,"Lovely");
		Customer customer8=new Customer(108,"Sharmila");
		Customer customer9=new Customer(109,"Sowji");
		
		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer1.addReference(customer4);
		
		customer2.addReference(customer5);
		customer2.addReference(customer6);
		
		customer5.addReference(customer7);
		customer5.addReference(customer8);
		customer5.addReference(customer9);
		
		System.out.println("print all customer reference tree");
		System.out.println("customer1's reference:::"+customer1.getCustName());
		for(Customer temp:customer1.getReferences()) {
			System.out.println(temp.getCustId()+","+temp.getCustName());
		}
		
	}

}
