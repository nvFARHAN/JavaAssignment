package com.farhan.q1;
import java.util.Scanner;

public class Student {
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	Student(){}
	
	public void displayDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
		this.name = sc.nextLine();
		System.out.println("Enter Roll No. : ");
		this.roll = sc.nextInt();
		System.out.println("Enter Marks : ");
		this.marks = sc.nextInt();
		char grade = this.calculateGrade();
		this.grade = grade;
		
		System.out.println(this);
	}
	
	public char calculateGrade()
	{
		if(this.marks>=500)
			return 'A';
		else if(this.marks>=400)
			return 'B';
		else
			return  'C';
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
}
