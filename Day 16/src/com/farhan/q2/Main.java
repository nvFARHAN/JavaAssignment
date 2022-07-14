package com.farhan.q2;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Employee> employeeSet = new TreeSet<>(new EmployeeSortSalary());
		for (int i = 0; i < 4; i++) {
			Employee e = new Employee();
			System.out.println("Enter details of employee " + (i + 1));
			System.out.println("Enter employee Id : ");
			e.setEmpId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter employee name : ");
			e.setEmpName(sc.nextLine());
			System.out.println("Enter salary   : ");
			e.setSalary(sc.nextDouble());
			sc.nextLine();
			employeeSet.add(e);
		}

		for (Employee e : employeeSet) {
			System.out.println("===================================");
			System.out.println("Employee Id : " + e.getEmpId());
			System.out.println("Employee Name : " + e.getEmpName());
			System.out.println("Salary : " + e.getSalary());
		}
		sc.close();
	}
}
