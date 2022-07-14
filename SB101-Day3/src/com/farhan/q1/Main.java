package com.farhan.q1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Path p = Paths.get("abc.txt");
		try {
			List<String> list = Files.readAllLines(p);
			list.forEach(l -> System.out.println(l));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
