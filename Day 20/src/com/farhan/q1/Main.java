package com.farhan.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "name1", 750));
		students.add(new Student(2, "name2", 800));
		students.add(new Student(3, "name3", 850));
		students.add(new Student(4, "name4", 900));
		students.add(new Student(5, "name5", 600));

		List<Student> filteredList = students.stream().filter(s -> s.getMarks() < 800).collect(Collectors.toList());

		filteredList.forEach(s -> System.out.println(s));
	}
}
