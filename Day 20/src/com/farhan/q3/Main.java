package com.farhan.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.farhan.q1.Student;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "name1", 750.0));
		students.add(new Student(2, "name2", 800.0));
		students.add(new Student(3, "name3", 850.0));
		students.add(new Student(4, "name4", 900.0));
		students.add(new Student(5, "name5", 600.0));

		List<Employee> employees = students.stream().map(s -> {
			Employee e = new Employee();
			e.setEmpId(s.getRoll());
			e.setEmpName(s.getName());
			e.setSalary(s.getMarks());
			return e;
		}).collect(Collectors.toList());

		System.out.println(employees);
	}
}
