package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              
            // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList);   // displaying data  
        
        
        List<Float> productPriceList1=productsList.stream().filter(x->x.price<30000).map(p->p.price).collect(Collectors.toList());
        List<Product> productPriceList23=productsList.stream().filter(x->x.price<30000).collect(Collectors.toList());
        	System.out.println(productPriceList1);
        	System.out.println(":::::::::::::::::::::::");
        // 	productPriceList23.forEach(System.out::println);
        	System.out.println(":::::::::::::::::::::::");
        	for(Product p:productPriceList23){
        	System.out.println(p.id+":"+p.name+":"+p.price);
        	}
        //iterater
        	
        	Stream.iterate(6, element->element+1)  
            .filter(element->element%2==0)  
            .limit(5)  
            .forEach(System.out::println);  
        	//filter and iterator
        	productsList.stream().filter(p->p.price==30000).forEach(p->System.out.println(p.name));
        //reduce method
        	 Float totalPrice = productsList.stream().map(p->p.price).reduce(0.0f,(Float sum,Float p)->sum+p);
        	Float totalPrice67 = productsList.stream().map(p->p.price).reduce(0.0f,Float::sum);
        	 System.out.println(totalPrice67);
        	//by using collectors.......
        	 	Double totalPrice1 = productsList.stream().collect(Collectors.summingDouble(p->p.price));
        	 	 System.out.println(totalPrice1);
        //get max price.....
        	 	Product productA = productsList.stream()  
                        .max((p1,p2)->p1.price>p2.price?1:-1).get(); 
        	 	System.out.println(productA.price);   
        	 	Product productB= productsList.stream()  
                        .min((p1,p2)->p1.price>p2.price?1:-1).get(); 
        	 	System.out.println(productB.price);
        	 	long productC = productsList.stream().filter(p->p.price<30000).count();
        	 	System.out.println(productC);
        	 	
        	 	
        	 	  // Converting product List into Set  
                Set<Float> productPriceset =   
                    productsList.stream()  
                    .filter(product->product.price < 30000)   // filter product on the base of price  
                    .map(product->product.price)  
                    .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
                System.out.println(productPriceset);  
                
                //method reference in stream
                
                List<Float> productPriceList2 =   
                        productsList.stream()  
                                    .filter(p -> p.price < 30000).map(Product::getPrice).collect(Collectors.toList());
                System.out.println(productPriceList2);
                
                
                Set<Float> productPriceList3 =   
                        productsList.stream()  
                                    .filter(p -> p.price < 30000).map(Product::getPrice).collect(Collectors.toSet());
                
                System.out.println(productPriceList3);
                
                Map<Integer,String> productPriceList4=   
                        productsList.stream().collect(Collectors.toMap(p->p.id,p->p.name));  
                                    
                System.out.println(productPriceList4);
                

                Map<Integer,String> productPriceList5=   
                        productsList.stream().collect(Collectors.toMap(Product::getId,Product::getName));  
                                    
                System.out.println(productPriceList5);
	}

}
