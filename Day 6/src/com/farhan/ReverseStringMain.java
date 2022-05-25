package com.farhan;
import java.util.Scanner;

public class ReverseStringMain {
	public static String reversString(String input){
		//write the logic
			int n = input.length();
			char c[] = new char[n];
			for(int i=0;i<input.length();i++)
			{
				c[i] = input.charAt(n-1-i);
			}
			return new String(c);
		}
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
		sc.close();
		}
}
