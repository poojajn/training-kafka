package com;

public class ExilantEmployee implements IEmployee,IDepartment {
   @Override
   public void salary() {
	   System.out.println("the salary decided for work to the employee ");
   }
   @Override
  public void noOfHrs() {
		  IEmployee.super.noOfHrs();
		  IDepartment.super.noOfHrs();
	  }
   @Override
   public void workLocation() {
	   System.out.println("work location");
 	  }
}
