package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.bean.Employee;
import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;

public class InsertPartialDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		Employee e = new Employee();
		System.out.println("Enter employee id : ");
		e.setEid(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter name : ");
		e.setName(sc.nextLine());
		System.out.println("Enter salary : ");
		e.setSalary(sc.nextInt());
		sc.close();
		String msg = dao.addPartialDetails(e);
		System.out.println(msg);
	}
}
