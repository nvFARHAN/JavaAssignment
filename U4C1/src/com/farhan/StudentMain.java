package com.farhan;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students to add : ");
		int n = sc.nextInt();
		Student s[] = new Student[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("=============================================");
			System.out.println("Enter the Roll Number : ");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name : ");
			String name = sc.nextLine();
			System.out.println("Enter the marks : ");
			double marks = sc.nextInt();
			sc.nextLine();
			s[i] = new Student(roll,name,marks);
			System.out.println("Student Details "+(i+1));
			System.out.println("Student Roll Number : "+s[i].getRollNumber());
			System.out.println("Student Name : "+s[i].getStudentName());
			System.out.println("Student Marks : "+s[i].getMarks());
		}
		sc.close();
	}
}
