package com.farhan.q1;

public class Manager extends Member {
	String specialisation;
	String department;
	void printDetails()
	{
		super.printDetails();
		System.out.println("Specialisation : "+this.specialisation);
		System.out.println("Department : "+this.department);
	}
}
