package com.farhan.q1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		System.out.println("Enter employee details : ");
		System.out.println("Enter name : ");
		e.name = sc.nextLine();
		System.out.println("Enter age : ");
		e.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter phone number : ");
		e.phoneNumber = sc.nextLine();
		System.out.println("Enter address : ");
		e.address = sc.nextLine();
		System.out.println("Enter salary : ");
		e.salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter department : ");
		e.department = sc.nextLine();
		System.out.println("Enter specialisation : ");
		e.specialisation = sc.nextLine();
		
		System.out.println();
		
		Manager m = new Manager();
		System.out.println("Enter employee details : ");
		System.out.println("Enter name : ");
		m.name = sc.nextLine();
		System.out.println("Enter age : ");
		m.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter phone number : ");
		m.phoneNumber = sc.nextLine();
		System.out.println("Enter address : ");
		m.address = sc.nextLine();
		System.out.println("Enter salary : ");
		m.salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter department : ");
		m.department = sc.nextLine();
		System.out.println("Enter specialisation : ");
		m.specialisation = sc.nextLine();
		
		System.out.println("Employee Info : ");
		e.printDetails();
		System.out.println();
		System.out.println("Manager info : ");
		m.printDetails();
		
		sc.close();
	}
}
