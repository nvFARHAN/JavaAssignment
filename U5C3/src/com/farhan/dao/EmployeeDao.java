package com.farhan.dao;

import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.exceptions.EmployeeException;

public interface EmployeeDao {
	public String saveEmployeeDetails(Employee employee);

	public Employee getEmployeeById(int empId) throws EmployeeException;

	public List<Employee> getAllEmployees();

	public String deleteEmployee(int empId) throws EmployeeException;

}
