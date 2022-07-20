package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.entities.Employee;
import com.farhan.exceptions.EmployeeException;

public class AddEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter employee id : ");
		e.setEmpId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter name : ");
		e.setName(sc.nextLine());
		System.out.println("Enter address : ");
		e.setAddress(sc.nextLine());
		System.out.println("Enter salary : ");
		e.setSalary(sc.nextInt());
		sc.close();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			String msg = dao.addEmployee(e);
			System.out.println(msg);
		} catch (EmployeeException e1) {
			e1.printStackTrace();
		}
	}

}
