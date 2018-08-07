package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.EmployeeDAO;
import com.training.entity.Employee;
import com.training.entity.IEmployeeDAO;


public class EmployeeClient {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("db-context.xml");
		 IEmployeeDAO employeeDAO=(IEmployeeDAO)applicationContext.getBean("employeeDaoTemplate",EmployeeDAO.class);
		 
//		 Employee employee1=new Employee(101,"rama",75000);
//		 
//		 Employee employee2=new Employee(102,"rama",75000);
//		 Employee employee3=new Employee(103,"teja",5500);
//		 Employee employee4=new Employee(104,"pooja",35000);
//		 Employee employee5=new Employee(105,"kavitha",55000);
//		 
//		 employeeDAO.insertEmployee(employee1);
//		 employeeDAO.insertEmployee(employee2);
//		 employeeDAO.insertEmployee(employee3);
//		 employeeDAO.insertEmployee(employee4);
//		 employeeDAO.insertEmployee(employee5);
		 
		 
		 Employee employee=employeeDAO.getEmployee(101);
		 System.out.println(employee);
		 
	}

}
