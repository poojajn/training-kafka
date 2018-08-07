package com.traning.stratergy;

public class CreditCard implements Payment{
  private String name;
  private String ccardNumber;
  private String dateOfExpiry;
  private double discount;
  private String bankName;
  @Override
public String toString() {
	return "CreditCard [name=" + name + ", ccardNumber=" + ccardNumber + ", dateOfExpiry=" + dateOfExpiry
			+ ", discount=" + discount + ", bankName=" + bankName + "]";
}
public CreditCard(String name, String ccardNumber, String dateOfExpiry, double discount, String bankName) {
	super();
	this.name = name;
	this.ccardNumber = ccardNumber;
	this.dateOfExpiry = dateOfExpiry;
	this.discount = discount;
	this.bankName = bankName;
}
protected String getName() {
	return name;
}
protected void setName(String name) {
	this.name = name;
}
protected String getCcardNumber() {
	return ccardNumber;
}
protected void setCcardNumber(String ccardNumber) {
	this.ccardNumber = ccardNumber;
}
protected String getDateOfExpiry() {
	return dateOfExpiry;
}
protected void setDateOfExpiry(String dateOfExpiry) {
	this.dateOfExpiry = dateOfExpiry;
}
protected double getDiscount() {
	return discount;
}
protected void setDiscount(double discount) {
	this.discount = discount;
}
protected String getBankName() {
	return bankName;
}
protected void setBankName(String bankName) {
	this.bankName = bankName;
}
@Override
public void pay(int amt) {
	if(this.bankName.equalsIgnoreCase("hdfc"))
	{ amt=(int)( amt-(amt*0.1));
	System.out.println("u r payment with HDFC");
	}else
	{ System.out.println("paid amount by HDFC");
	}
   }
}  