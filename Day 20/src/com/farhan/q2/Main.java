package com.farhan.q2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Delhi", "Kolkata", "Mumbai", "Hydrabad", "Bangalore");
		Collections.sort(cities, (str1, str2) -> {
			return str1.compareTo(str2);
		});
		System.out.println(cities);
	}
}
