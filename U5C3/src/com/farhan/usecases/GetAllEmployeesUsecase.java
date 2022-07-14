package com.farhan.usecases;

import java.util.List;

import com.farhan.bean.Employee;
import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;

public class GetAllEmployeesUsecase {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		List<Employee> list = dao.getAllEmployees();
		list.forEach(e -> System.out.println(e));
	}
}
