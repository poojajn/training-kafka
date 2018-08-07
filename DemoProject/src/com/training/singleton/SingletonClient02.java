package com.training.singleton;

class Company {
private Company() {
	System.out.println("constructor called....");
}
public static Company getInstance(Company company) {
	if(company==null) {
		return new Company();
	}
	return company;
}

}
class Emp{
	
	int empId;
	String empName;
	Company company;
}
public class SingletonClient02{
	
	public static void main(String args[]) {
		
		Company company=null;
		company=Company.getInstance(company);
		Emp emp1=new Emp();
		emp1.empId=101;
		emp1.empName="Rama";
		emp1.company=company;
		System.out.println(emp1.company.hashCode());
		Emp emp2=new Emp();
		emp2.empId=102;
		emp2.empName="Teja";
		emp2.company=company;
		System.out.println(emp2.company.hashCode());
	}
}