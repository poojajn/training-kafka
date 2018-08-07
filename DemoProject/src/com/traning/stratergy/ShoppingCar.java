package com.traning.stratergy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCar {

	
	List<Item> items;
	
	public ShoppingCar() {
		this.items=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		this.items.add(item);
	
	}
	public void removeItem(Item item) {
		this.items.remove(item);
	
	}
	public void addList(List<Item> itemsList ) {
		this.items=itemsList;
	}
	public void modifyItemCount(Item item) {}
	public int calculateTotal() {
		int sum=0;
		for(Item item:items) {
			sum=sum+item.getPrice()+item.getQty();
			
		}
		return sum;
	}
	public void checkout(Payment paymentStratergy) {
		paymentStratergy.pay(calculateTotal());
	}
}
