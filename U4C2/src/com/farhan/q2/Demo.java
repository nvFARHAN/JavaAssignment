package com.farhan.q2;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Student s[] = new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of student "+(i+1));
			s[i]=new Student();
			System.out.println("Enter name : ");
			s[i].setName(sc.nextLine());
			System.out.println("Enter roll : ");
			s[i].setRoll(sc.nextInt());
			System.out.println("Enter marks : ");
			s[i].setMarks(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter address : ");
			s[i].setAddress(sc.nextLine());
		}
		System.out.println();
		int sum = 0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of student "+(i+1));
			System.out.println("Name : "+s[i].getName());
			System.out.println("Roll : "+s[i].getRoll());
			System.out.println("Marks : "+s[i].getMarks());
			System.out.println("Address : "+s[i].getAddress());
			System.out.println("===============================");
			sum+=s[i].getMarks();
		}
		System.out.println("Average marks : "+(sum/n));
		sc.close();
	}
}
