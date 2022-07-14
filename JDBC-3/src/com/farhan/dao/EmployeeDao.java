package com.farhan.dao;

import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.exceptions.EmployeeException;

public interface EmployeeDao {
	public int getSalaryById(int id) throws EmployeeException;

	public List<Employee> getEmployees() throws EmployeeException;

	public String addBonus();

	public String addPartialDetails(Employee e);

	public Employee getEmployeeById(int id) throws EmployeeException;

	public List<Employee> filterEmployeeBySalary() throws EmployeeException;
}
