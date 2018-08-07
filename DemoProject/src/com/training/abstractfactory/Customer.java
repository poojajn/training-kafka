package com.training.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Customer {
 private int custId;
 private String custName;
 private List<Customer> references;
 public Customer() {}
public Customer(int custId, String custName) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.references=new ArrayList<>();
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", references=" + references + "]";
}
public Customer(int custId, String custName, List<Customer> references) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.references = references;
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public List<Customer> getReferences() {
	return references;
}
public void setReferences(List<Customer> references) {
	this.references = references;
}
 public void addReference(Customer customer) {
	 this.references.add(customer);
	 }
 public void removeReference(Customer customer) {
	 this.references.remove(customer);
	 }
}
