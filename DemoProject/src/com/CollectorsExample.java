package com;

import java.util.stream.Collectors;  
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;  
class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
        Set<Float> productPriceSet =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toSet());   // collecting as list  
        System.out.println(productPriceSet);  
        Set<String> productNameSet =   
                productsList.stream()  
                            .map(x->x.name)         // fetching price  
                            .collect(Collectors.toSet());   // collecting as list  
        System.out.println(productNameSet);  
        List<Integer> productIdList =   
                productsList.stream()  
                            .map(x->x.id)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productIdList); 
        Double sumOfPrices =   
                productsList.stream() 
                .collect(Collectors.summingDouble(x->x.price));  // collecting as list  
        System.out.println(sumOfPrices); 
        List<Float> productPriceList2 =productsList.stream()  
                .filter(p -> p.price < 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
System.out.println(productPriceList2); 
Map<Integer,String> productPriceMap =   
productsList.stream()  
            .collect(Collectors.toMap(p->p.id, p->p.name));  
  
System.out.println(productPriceMap);  
    }  
}  