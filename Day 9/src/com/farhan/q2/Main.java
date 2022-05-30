package com.farhan.q2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number from 1 to 10");
		int n = sc.nextInt();
		Parent p;
		if(n>=1 && n<=10)
		{
			p = new Child(n);
			p.method1();
			p.method2();
			p.method3();
			
			Child c = (Child)p;
			c.method4();
		}
		else
			System.out.println("Invalid number");
		
		sc.close();
	}
}
