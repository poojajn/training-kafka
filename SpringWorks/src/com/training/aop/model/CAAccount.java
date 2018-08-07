package com.training.aop.model;

public class CAAccount {

	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	public double showBalance() {
		getTest();
		return account.getBalance();
	}
	public  void getTest() {
		System.out.println("this is default test....");
	}
	public void getOneparameter(int x) {
		System.out.println("X:::"+x);
	}
}
