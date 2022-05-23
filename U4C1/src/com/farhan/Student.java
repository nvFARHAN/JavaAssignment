package com.farhan;

public class Student {
	private int rollNumber;
	private String studentName;
	private double marks;
	
	Student(){}
	
	Student(int roll,String name,double marks)
	{
		this.rollNumber = roll;
		this.studentName = name;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
