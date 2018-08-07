package com.training.aop.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {

	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvise(ProceedingJoinPoint proceedingJoinPoint) {
		
		
		Object retval=null;
		try {
			System.out.println("before job goes here....");
			retval=proceedingJoinPoint.proceed();
			System.out.println("after job goes here....");	
		}catch(Throwable e) {
			e.printStackTrace();
		}
		return retval;
	}
	
}
