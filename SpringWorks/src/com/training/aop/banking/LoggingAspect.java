package com.training.aop.banking;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	//@Before("execution(public double getBalance())")
	//@Before("execution(public double com.training.aop.model.CAAccount.showBalance())")
	//@Before("execution(public * get*(..))")
	@Before("execution(* com.training.aop.model.*.getBalance())")
	public void loggingAdviceBefore() {
		System.out.println("*****Logging Before Called*****");
		
	}

	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("second advice invoked for all gettetrs");
	}
	@Before("allGettersSBAccount()")
	public void secondAdviceForSBAccount()
	{
		System.out.println("only for sb accounts.......");
	}
	@Pointcut("execution(* get*(..))")
	public void allGetters() {
		System.out.println("this is data should not be display....");
	}
//	@Pointcut("execution(* get*(..))")
//	public void allGettersSBAccount() {
//		System.out.println("this is data should not be display..sb account..");
//	}
	@Before("allGettersSBAccount()||allGetters()")
	public void compoundAdvice()
	{
		System.out.println("this is compound Advice:::::"+"clause of getters and sb getters.......");
	}
	
	@Pointcut("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void allGettersSBAccount() {
		System.out.println("this is data should not be display..sb account..");
	}
}
