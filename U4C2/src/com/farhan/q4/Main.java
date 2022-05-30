package com.farhan.q4;
import java.util.Scanner;

public class Main {
	
	public static Person generatePerson(Person person)
	{
		Scanner sc = new Scanner(System.in);
		if(person instanceof Instructor)
		{
			System.out.println("Enter instructor details : ");
			Instructor i = new Instructor();
			System.out.println("Enter Instructor Id : ");
			i.instructorId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			i.name = sc.nextLine();
			System.out.println("Enter salary : ");
			i.salary = sc.nextInt();
			System.out.println("Enter gender : ");
			i.gender = sc.next();
			System.out.println("Enter city : " );
			i.a.city = sc.next();
			System.out.println("Enter state : ");
			i.a.state = sc.next();
			System.out.println("Enter pin code : ");
			i.a.pinCode = sc.next();
			return i;
		}
		else
		{
			System.out.println("Enter student details : ");
			Student i = new Student();
			System.out.println("Enter student Id : ");
			i.studentId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name : ");
			i.name = sc.nextLine();
			System.out.println("Enter the enrolled course : ");
			i.courseEnrolled = sc.nextLine();
			System.out.println("Enter course fee : ");
			i.courseFee = sc.nextInt();
			System.out.println("Enter gender : ");
			i.gender = sc.next();
			System.out.println("Enter city : " );
			i.a.city = sc.next();
			System.out.println("Enter state : ");
			i.a.state = sc.next();
			System.out.println("Enter pin code : ");
			i.a.pinCode = sc.next();
			return i;
		}
	}
	
	public static void main(String[] args) {
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		System.out.println();
		System.out.println(newTeacher);
	}
}
