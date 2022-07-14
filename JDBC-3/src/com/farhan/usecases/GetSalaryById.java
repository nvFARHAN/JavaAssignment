package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GetSalaryById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id : ");
		int id = sc.nextInt();
		sc.close();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			int salary = dao.getSalaryById(id);
			System.out.println("Salary : " + salary);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
