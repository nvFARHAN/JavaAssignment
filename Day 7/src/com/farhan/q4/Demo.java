package com.farhan.q4;
import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);
	public static Bank getBank(String bank)
	{
		if(bank.equals("icici"))
		{
			ICICIBank obj = new ICICIBank();
			System.out.println("Enter Branch Name : ");
			obj.branchName = sc.nextLine();
			System.out.println("Enter IFSC Code : ");
			obj.ifscCode = sc.nextLine();
			System.out.println("Enter Rate of Interest : ");
			obj.rateOfInterest = sc.nextDouble();
			sc.nextLine();
			return obj;
		}
		else if(bank.equals("axis"))
		{
			AxisBank obj = new AxisBank();
			System.out.println("Enter Branch Name : ");
			obj.branchName = sc.nextLine();
			System.out.println("Enter IFSC Code : ");
			obj.ifscCode = sc.nextLine();
			System.out.println("Enter Rate of Interest : ");
			obj.rateOfInterest = sc.nextDouble();
			sc.nextLine();
			return obj;
		}
		else
		{
			return null;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Enter Bank Name : ");
		Bank b = Demo.getBank(sc.nextLine());
		if(b!=null)
		{
			b.displayDetails();
			if(b.getClass().getSimpleName().equals("AxisBank"))
			{
				AxisBank ab = new AxisBank();
				ab.getCreditCard();
			}
		}
		else
			System.out.println("Not a valid bank name");
	}
}
