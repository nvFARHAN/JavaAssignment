package com.farhan;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		Student s2 = new Student(239,"Madhuri Patel",20,300);
		System.out.println("Roll : "+s1.getRoll());
		System.out.println("Name : "+s1.getName());
		System.out.println("Age : "+s1.getAge());
		System.out.println("Marks : "+s1.getMarks());
		System.out.println();
		System.out.println("Roll : "+s2.getRoll());
		System.out.println("Name : "+s2.getName());
		System.out.println("Age : "+s2.getAge());
		System.out.println("Marks : "+s2.getMarks());

	}

}
