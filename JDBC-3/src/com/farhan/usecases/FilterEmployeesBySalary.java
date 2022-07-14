package com.farhan.usecases;

import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class FilterEmployeesBySalary {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			List<Employee> list = dao.filterEmployeeBySalary();
			list.forEach(emp -> System.out.println(emp));
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
