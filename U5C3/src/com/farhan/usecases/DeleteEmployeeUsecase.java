package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class DeleteEmployeeUsecase {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id = sc.nextInt();
		sc.close();
		try {
			String msg = dao.deleteEmployee(id);
			System.out.println(msg);
		} catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}
}
