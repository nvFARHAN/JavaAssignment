package com.farhan.q2;
import java.util.Scanner;

public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard)
	{
		if(name.matches("[a-zA-z]{3,8}") && mobileNum.matches("[+][9][1][6789][0-9]{9}") && aadharCard.matches("[1-9][0-9]{11}"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter mobile number : ");
		String mobileNumber = sc.nextLine();
		System.out.println("Enter aadhar number");
		String aadharNumber = sc.nextLine();
		
		Demo d1 = new Demo();
		if(d1.validate(name, mobileNumber, aadharNumber))
		{
			Citizen c = new Citizen();
			c.setName(name);
			c.setMobileNumber(mobileNumber);
			c.setAadharNumber(aadharNumber);
			System.out.println("Name : "+c.getName());
			System.out.println("Mobile : "+c.getMobileNumber());
			System.out.println("Aadhar : "+c.getAadharNumber());
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
