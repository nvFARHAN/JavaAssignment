package com.farhan.usecases;

import com.farhan.dao.EmployeeDao;
import com.farhan.dao.EmployeeDaoImpl;

public class AddBonus {
	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDaoImpl();
		String msg = dao.addBonus();
		System.out.println(msg);
	}
}
