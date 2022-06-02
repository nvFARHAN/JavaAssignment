package com.farhan.q1;
import java.util.Scanner;

public class Demo {
	public Hotel provideFood(int amount)
	{
		Hotel h;
		if(amount>1000)
			h = new TajHotel();
		else if(amount>200 && amount<=1000)
			h = new RoadSideHotel();
		else
			h = null;
		return h;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Demo d = new Demo();
		System.out.println("Enter the amount : ");
		Hotel h = d.provideFood(sc.nextInt());
		if(h instanceof TajHotel)
		{
			TajHotel h1 = (TajHotel)h;
			h1.welcomeDrink();
			h1.masalaDosa();
			h1.chickenBiryani();
		}
		else if(h instanceof RoadSideHotel)
		{
			RoadSideHotel h1 = (RoadSideHotel)h;
			h1.masalaDosa();
			h1.chickenBiryani();
		}
		else
			System.out.println("Please enter a valid amount");
		sc.close();
	}
}
