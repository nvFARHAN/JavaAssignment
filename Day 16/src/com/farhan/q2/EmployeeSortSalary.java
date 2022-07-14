package com.farhan.q2;

import java.util.Comparator;

public class EmployeeSortSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getSalary(), o2.getSalary());
	}

}
