package com.training.aop.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.service.BankingService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("aop-context.xml");
		
		BankingService bankingService=(BankingService)applicationContext.getBean("banking",BankingService.class);
		System.out.println(bankingService.getSbAccount().getAcc().getBalance());
		System.out.println(bankingService.getAaccount().showBalance());
		bankingService.getAaccount().getOneparameter(12);
		bankingService.setAndGet("Rama");
		bankingService.setAndGet1("Teja");
		bankingService.throwException();
	}

}
