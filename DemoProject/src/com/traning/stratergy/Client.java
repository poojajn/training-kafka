package com.traning.stratergy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		
		List<Item> items=Stream.of(
				new Item("ITM01-pen",30,4),
				new Item("ITM01-Monitor",400,2),
				new Item("ITM01-Bottle",65,1)).collect(Collectors.toList());
		
		
		
		
//				ShoppingCar shoppingCar=new ShoppingCar();
//			shoppingCar.addItem(new Item("ITM01-pen",30,4) );
//				shoppingCar.addItem(new Item("ITM02-Monitor",400,2) );
//			shoppingCar.addItem(new Item("ITM03-Bottle",65,1) );
//				System.out.println("Total Amount "+shoppingCar.calculateTotal());
//				Payment paymentStratergy=new EWallet("rama@gmail.com", "Rama@558", "CCAvenue");
//              shoppingCar.checkout(paymentStratergy);
              
              ShoppingCar shoppingCar1=new ShoppingCar();
                shoppingCar1.addList(items);
                System.out.println("Total Amount123::: "+shoppingCar1.calculateTotal());
                Payment paymentStratergy=new EWallet("rama@gmail.com", "Rama@558", "CCAvenue");
                shoppingCar1.checkout(paymentStratergy);
	}

}
