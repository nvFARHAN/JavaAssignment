package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;
import com.farhan.exceptions.EmployeeException;

public class GetAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee Id : ");
		int id = sc.nextInt();
		sc.close();
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			String address = dao.getAddressOfEmployee(id);
			System.out.println(address);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}

}
