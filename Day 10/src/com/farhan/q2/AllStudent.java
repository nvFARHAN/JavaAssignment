package com.farhan.q2;
import java.util.Scanner;

public class AllStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of science student : ");
		System.out.println("Name : ");
		String name = sc.nextLine();
		System.out.println("Address : ");
		String address = sc.nextLine();
		System.out.println("Physics Marks : ");
		int physicsMarks = sc.nextInt();
		System.out.println("Chemistry Marks : ");
		int chemistryMarks = sc.nextInt();
		System.out.println("Maths marks : ");
		int mathsMarks = sc.nextInt();
		ScienceStudent s1 = new ScienceStudent(name, address, physicsMarks, chemistryMarks, mathsMarks);
		
		sc.nextLine();
		
		System.out.println("Enter the details of history student : ");
		System.out.println("Name : ");
		String name1 = sc.nextLine();
		System.out.println("Address : ");
		String address1 = sc.nextLine();
		System.out.println("History Marks : ");
		int historyMarks = sc.nextInt();
		System.out.println("Civics Marks : ");
		int civicsMarks = sc.nextInt();
		HistoryStudent s2 = new HistoryStudent(name1, address1, historyMarks, civicsMarks);
		
		System.out.println("Percentage of science student : "+ String.format("%.2f",s1.getPercentage())+"%");
		System.out.println("Percentage of history student : "+ String.format("%.2f",s2.getPercentage())+"%");
//		System.out.println(String.format("%.2f",3.33333333));
		sc.close();
	}
}
