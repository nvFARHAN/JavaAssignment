package com.farhan.dao;

import java.util.List;

import com.farhan.entities.Employee;
import com.farhan.exceptions.EmployeeException;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();

	public String addEmployee(Employee e) throws EmployeeException;

	public String getAddressOfEmployee(int empId) throws EmployeeException;

	public String giveBonusToEmployee(int empId, int bonus) throws EmployeeException;

	public boolean deleteEmployee(int empId) throws EmployeeException;

	public String[] getNameAndAddress(int empId) throws EmployeeException;
}
