package com.farhan.q6;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static Hosteller getHostellerDetails()
	{
		Hosteller h = new Hosteller();
		System.out.println("Enter the details : ");
		System.out.println("Student Id : ");
		h.setStudentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Student Name : ");
		h.setName(sc.nextLine());
		System.out.println("Department Id : ");
		h.setDepartmentId(sc.nextInt());
		sc.nextLine();
		System.out.println("Gender : ");
		h.setGender(sc.nextLine());
		System.out.println("Phone Number : ");
		h.setPhone(sc.nextLine());
		System.out.println("Hostel name : ");
		h.setHostelName(sc.nextLine());
		System.out.println("Room Number : ");
		h.setRoomNumber(sc.nextInt());
		sc.nextLine();
		return h;
	}
	
	public static void main(String[] args) {
		Hosteller h = Main.getHostellerDetails();
		System.out.println("Modify Room Number : (Y/N)");
		if(sc.next() == "Y")
		{
			System.out.println("New Room Number : ");
			h.setRoomNumber(sc.nextInt());
			sc.nextLine();
		}
		System.out.println("Modify Phone Number : (Y/N)");
		if(sc.next()=="Y")
		{
			System.out.println("New Phone Number : ");
			h.setPhone(sc.nextLine());
		}
	}
}
