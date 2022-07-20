package com.farhan.usecases;

import java.util.List;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.entities.Employee;

public class GetAllEmployees {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getAllEmployee();
		for (Employee e : list) {
			System.out.println(e);
		}
	}

}
