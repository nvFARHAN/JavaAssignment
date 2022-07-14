package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.bean.Employee;
import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GetEmployeeByIdUsecase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id = sc.nextInt();
		sc.close();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			Employee emp = dao.getEmployeeById(id);
			System.out.println(emp);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
