package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GiveBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id : ");
		int id = sc.nextInt();
		System.out.println("Enter bonus amount : ");
		int bonus = sc.nextInt();
		sc.close();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			String msg = dao.giveBonusToEmployee(id, bonus);
			System.out.println(msg);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}

}
