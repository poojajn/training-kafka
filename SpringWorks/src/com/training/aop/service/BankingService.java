package com.training.aop.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SBAccount;

public class BankingService {
    
	 private SBAccount sbAccount;
    
	 private CAAccount aaccount;
	 
	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", aaccount=" + aaccount + "]";
	}
	public SBAccount getSbAccount() {
		
		System.out.println(".......getSbAccount.......");
		
		return sbAccount;
	}
	
	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}
	public CAAccount getAaccount() {
		return aaccount;
	}
	public void setAaccount(CAAccount aaccount) {
		this.aaccount = aaccount;
	}
	 public String setAndGet(String name) {
		  return "Hello "+name;
	 }
	 public String setAndGet1(String name) {
		  return "Hi "+name;
	 }
	 public void throwException() {
		 int a=0;
		 if(a==1) {
			 throw new RuntimeErrorException(null,"user throw Exception");
			 
		 }
		 System.out.println("user is ok without Exception...");
	 }
	 
}
