package com.farhan;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		sc.nextLine();
		StudentBean s[] = new StudentBean[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new StudentBean();	
			System.out.println("Enter name : ");
			String name = sc.nextLine();
			System.out.println("Enter roll : ");
			int roll = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter address : ");
			String address = sc.nextLine();
			System.out.println("Enter marks : ");
			int marks = sc.nextInt();
			
			s[i].setName(name);
			s[i].setRoll(roll);
			s[i].setAddress(address);
			s[i].setMarks(marks);
			
			System.out.println("Name : "+s[i].getName());
			System.out.println("Roll : "+s[i].getRoll());
			System.out.println("Address : "+s[i].getAddress());
			System.out.println("Marks : "+s[i].getMarks());
		}
		sc.close();
	}

}
