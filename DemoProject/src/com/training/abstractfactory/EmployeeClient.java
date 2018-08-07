package com.training.abstractfactory;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee model=new Employee(101, "Divya");
      StarView view= new StarView();
      
	  EmployeeController controller=new EmployeeController(model,view);
	  //controller.updateView("star");
	  controller.updateView("dash");
	  
	  
	  
	}
  private static Employee retrive() {
	  return new Employee(101, "Divya");
  }
}
