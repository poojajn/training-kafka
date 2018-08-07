package com;
//interface one method
@FunctionalInterface
interface MathOperation{
	int operation(int num1,int num2);
}

public class LamdaExpWays {

	public static int operate(int num1,int num2,MathOperation opr) {
		return opr.operation(num1,num2);
	}
	
	public static void main(String[] args) {
		MathOperation add=(num1,num2)->num1+num2;
		MathOperation sub=(int num1,int num2)->num1-num2;
		
		System.out.println(operate(10,20,add));
		System.out.println(operate(20,30,sub));
		
		MathOperation m1=(num1,num2)->num1+num2;
		System.out.println(m1.operation(10,20));
	}

}
