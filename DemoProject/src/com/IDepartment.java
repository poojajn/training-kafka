package com;


public interface IDepartment {
  public void workLocation();
  
  default void noOfHrs() {
	  System.out.println("the projects demand work for only till 6PM");
  }
  public static void commonUtility() {
  
	  System.out.println("all employee have to pass background verification");
  }
}
