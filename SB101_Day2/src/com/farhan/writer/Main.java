package com.farhan.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("input.txt");
			pw.println("Alpha Beta Gamma Delta");
			pw.println("One Two Three Four");
			pw.println(100);
			pw.println(true);
			pw.println('a');
			pw.println(1.9999);
			pw.println("The End");
//			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
