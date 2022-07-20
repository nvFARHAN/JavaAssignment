package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class DeleteEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		System.out.println("Enter enmployee id : ");
		try {
			boolean res = dao.deleteEmployee(sc.nextInt());
			if (res)
				System.out.println("Employee deleted...");
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
