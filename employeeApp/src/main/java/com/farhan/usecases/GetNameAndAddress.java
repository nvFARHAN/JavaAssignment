package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GetNameAndAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao dao = new EmployeeDaoImpl();
		System.out.println("Enter enmployee id : ");
		try {
			String res[] = dao.getNameAndAddress(sc.nextInt());
			System.out.println("Name : " + res[0]);
			System.out.println("Address : " + res[1]);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
