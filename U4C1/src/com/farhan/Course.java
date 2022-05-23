package com.farhan;
import java.util.Scanner;

public class Course {
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails()
	{
		System.out.println("Course ID : "+this.courseId);
		System.out.println("Course Name : "+this.courseName);
		System.out.println("Course Fee : "+this.courseFee);
	}
	
	public static void authenticate(String username,String password)
	{
		if(username.equals("Admin") && password.equals("1234"))
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Course ID : ");
			int courseId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Course Name : ");
			String courseName = sc.nextLine();
			System.out.println("Enter Course Fee : ");
			int courseFee = sc.nextInt();
			sc.nextLine();
			Course c1 = new Course();
			c1.courseId=courseId;
			c1.courseName=courseName;
			c1.courseFee=courseFee;
			c1.displayCourseDetails();
		}
		else
			System.out.println("Invalid username or password");
	}
	
	public static void main(String[] args) {
		Course.authenticate("Admin", "1234");
		System.out.println();
		Course.authenticate("Alpha", "Beta");
	}
}
