package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.traning.employee.Employee;

//if you want spring to kn this is post processor
//implements BeanPostProcessor,this way every bean
//when create by spring has to go through this

//since this class can handle any class/s all r given
public class EmployeeBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("after...initializing....");
		if(arg0 instanceof Employee) {
			Employee emp=(Employee)arg0;
			emp.setEmpName(emp.getEmpName().toUpperCase());
		return emp;}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("before...initializing....");
		return arg0;
	}
	
	
}
