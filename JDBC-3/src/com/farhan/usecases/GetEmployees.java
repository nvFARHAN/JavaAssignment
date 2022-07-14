package com.farhan.usecases;

import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GetEmployees {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			List<Employee> list = dao.getEmployees();
			list.forEach(e -> System.out.println(e));
		} catch (EmployeeException ee) {
			System.out.println(ee.getMessage());
		}
	}
}
