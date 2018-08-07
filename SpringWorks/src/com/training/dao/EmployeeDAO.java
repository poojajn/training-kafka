package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.entity.Employee;
import com.training.entity.IEmployeeDAO;
import com.training.mappers.EmployeeMapper;

public class EmployeeDAO implements IEmployeeDAO{
    
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	@Override
	public Employee getEmployee(int empId) {
		
		String sql="select empid,empname,empsal from employee where empid=?";
		
		//Employee employee=jdbcTemplateObject.queryForObject(sql, new Object[] {empId},new BeanPropertyRowMapper<Employee>(Employee.class));
		Employee employee=jdbcTemplateObject.queryForObject(sql, new Object[] {empId},new  EmployeeMapper());
		return employee;
	}

	@Override
	public List<Employee> getAllEmp() {

	String sql="select empid,empname,empsal from employee ";
	
	
	
	List<Employee> employee=new ArrayList<Employee>();
	//employee=jdbcTemplateObject.query(sql, new EmployeeMapper());
	
	List<Map<String,Object>> rows=jdbcTemplateObject.queryForList(sql);
	
	for(Map row:rows) {
		Employee employee2=new Employee();
		employee2.setEmpId((Integer.parseInt(row.get("empid").toString())));
		employee2.setEmpName((row.get("empid").toString()));
		employee2.setEmpSal(Double.parseDouble(row.get("empid").toString()));
		employee.add(employee2);
	}
		
	return employee;
		
		
	}

	@Override
	public void insertEmployee(Employee employee) {
		String sql="insert into employee(empid,empname,empsal) values(?,?,?)";
		jdbcTemplateObject.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
		System.out.println("Recodr Create"+employee);
		
		return;
		
	}

	@Override
	public void deleteEmployee(int empId) {
		
		
	}

	@Override
	public void updateEmployee(int empId, double empNewSalary) {
		
		
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}
  
}
