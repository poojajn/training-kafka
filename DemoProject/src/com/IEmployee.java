package com;

public interface IEmployee {
   public void salary();
   public default void noOfHrs() {
	   System.out.println("Every employee has to work for  8 hrs");
   }
}
