package com.farhan.q1;

public class Member {
	String name;
	int age;
	String phoneNumber;
	String address;
	double salary;
	
	void printSalary() {
		System.out.println("Salary : "+this.salary);
	}
	void printDetails()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone Number : "+this.phoneNumber);
		System.out.println("Address : "+this.address);
		System.out.println("Salary : "+this.salary);
	}
}
