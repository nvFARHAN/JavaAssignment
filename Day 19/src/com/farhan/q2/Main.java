package com.farhan.q2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Map<String, String> capitalOfState = new LinkedHashMap<>();
		capitalOfState.put("Jharkhand", "Ranchi");
		capitalOfState.put("West Bengal", "Kolkata");
		capitalOfState.put("Madhya Pradesh", "Bhopal");
		capitalOfState.put("Chattishgarh", "Raipur");
		capitalOfState.put("Maharastra", "Mumbai");

		Set<Map.Entry<String, String>> s = capitalOfState.entrySet();

		for (Map.Entry<String, String> e : s) {
			System.out.println(e);
		}
	}
}
