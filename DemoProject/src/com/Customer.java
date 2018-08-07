package com;

public class Customer {

	private int customerId;
	private String customerName;
	private double customerPurchases;
	private String designation;
	
	public Customer(int customerId, String customerName, double customerPurchases, String designation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPurchases = customerPurchases;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPurchases="
				+ customerPurchases + ", designation=" + designation + "]";
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerPurchases() {
		return customerPurchases;
	}
	public void setCustomerPurchases(double customerPurchases) {
		this.customerPurchases = customerPurchases;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
