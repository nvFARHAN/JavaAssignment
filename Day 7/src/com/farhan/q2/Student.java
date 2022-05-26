package com.farhan.q2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	public Student(int studId, String studName, double examFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	void displayDetails() {
		System.out.println("Student Name : "+this.studName);
		System.out.println("Student Id : "+this.studId);
		System.out.println("Exam Fee : "+this.examFee);
	}
	double payFee(double fee) {
		double x = fee-this.examFee;
		if(fee>this.examFee)
			this.examFee = 0;
		else
			this.examFee -= fee;
		return x;
	}
}
