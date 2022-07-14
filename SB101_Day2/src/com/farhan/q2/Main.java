package com.farhan.q2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		try {
			File f = new File("abc.txt");
			long charCount = f.length();
			FileReader fr = new FileReader(f);
			char c[] = new char[(int) charCount];
			fr.read(c);
			for (char i : c) {
				System.out.print(i);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
