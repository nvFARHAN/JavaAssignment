package com.farhan.q3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
//	public static void main(String[] args) {
//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter the file name : ");
//			String file = br.readLine();
//			System.out.println("Enter the character to be counted : ");
//			char ch = (char) br.read();
//			br.close();
//			int count = 0;
//			Pattern p = Pattern.compile("" + Character.toLowerCase(ch));
//			br = new BufferedReader(new FileReader(file));
//			String line = br.readLine();
//			while (line != null) {
//				Matcher m = p.matcher(line.toLowerCase());
//				while (m.find()) {
//					count++;
//				}
//				line = br.readLine();
//			}
//			System.out.println("File " + file + " has " + count + " instances of letter " + ch);
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

//Alt solution...

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String file = sc.next();
		System.out.println("Enter the character to be counted : ");
		char find = sc.next().charAt(0);
		int count = 0;
		try {
			File f = new File(file);
			char ch[] = new char[(int) f.length()];
			BufferedReader br = new BufferedReader(new FileReader(f));
			br.read(ch);
			for (char c : ch) {
				if (Character.compare(Character.toLowerCase(c), Character.toLowerCase(find)) == 0)
					count++;
			}
			System.out.println("File " + file + " has " + count + " instances of letter " + find);
			br.close();
			sc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
