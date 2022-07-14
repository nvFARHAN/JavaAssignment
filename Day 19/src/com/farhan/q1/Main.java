package com.farhan.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String, Student> hm = new HashMap<>();

		hm.put("Delhi", new Student(10, "Lily", 100.0));
		hm.put("Mumbai", new Student(11, "Harry", 95.5));
		hm.put("Pune", new Student(12, "Madhu", 100.0));
		hm.put("Bangalore", new Student(11, "Harry", 95.5));
		hm.put("Kolkata", new Student(15, "James", 90.3));

		Set<Map.Entry<String, Student>> s = hm.entrySet();
		List<Map.Entry<String, Student>> list1 = new ArrayList<>(s);

		Collections.sort(list1, (s1, s2) -> {
			return s1.getValue().getMarks() > s2.getValue().getMarks() ? +1 : -1;
		});
		for (Map.Entry<String, Student> student : list1) {
			System.out.println(student);
			System.out.println();
		}
	}
}
