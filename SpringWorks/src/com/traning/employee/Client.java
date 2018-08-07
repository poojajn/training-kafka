package com.traning.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basics.DefaultHello;
import com.training.basics.HelloService;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
		Employee employee=(Employee)context.getBean("employee",Employee.class);
		System.out.println("Emp Id:"+employee.hashCode());
		System.out.println("Emp Id:"+employee.getEmpId());
		System.out.println("Emp Name:"+employee.getEmpName());
		System.out.println("Emp Salary:"+employee.getEmpSal());
		
		System.out.println(".....................................");
		
		HelloService helloService=(HelloService)context.getBean("defaultHello");
		System.out.println(helloService.sayHello());
		context.registerShutdownHook();
	}

}
