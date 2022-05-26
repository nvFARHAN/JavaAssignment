package com.farhan.q2;

public class Main {
	public static void main(String[] args) {
		DayScholar s1 = new DayScholar(101,"Farhan",1000,2000);
		DayScholar s2 = new DayScholar(102,"Madhuri",1000,2500);
		Hosteller s3 = new Hosteller(103,"Shivam",1000,5000);
		Hosteller s4 = new Hosteller(104,"Sumangal",1000,4000);
		double x = s1.payFee(7000);
		if(x>0)
		{
			System.out.println("Remaining fee for"+s1.studName+" : "+x);
		}
		else
		{
			System.out.println("All fee cleared for "+s1.studName+". Amount to be returned : "+(-x));
		}
		double y = s2.payFee(1000);
		if(y>0)
		{
			System.out.println("Remaining fee for "+s2.studName+" : "+y);
		}
		else
		{
			System.out.println("All fee cleared for "+s2.studName+". Amount to be returned : "+(-y));
		}
	}
}
