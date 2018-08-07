package com.training;

public class Employee {

	private int emid;
	private String empname;
	private String department;
	private double salary;
	private String empmail;
	public int getEmid() {
		return emid;
	}
	public void setEmid(int emid) {
		this.emid = emid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	public Employee() {}
	
	public Employee(int emid, String empname, String department, double salary, String empmail) {
		super();
		this.emid = emid;
		this.empname = empname;
		this.department = department;
		this.salary = salary;
		this.empmail = empmail;
	}
	
}
