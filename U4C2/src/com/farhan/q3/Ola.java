package com.farhan.q3;

public class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs)
	{
		if(numberOfPassenger<=3)
		{
			HatchBack h = new HatchBack();
			h.setNumberOfKms(numberOfKMs);
			h.setNumberOfPassenger(numberOfPassenger);
			return h;
		}
		else
		{
			Sedan s = new Sedan();
			s.setNumberOfKms(numberOfKMs);
			s.setNumberOfPassenger(numberOfPassenger);
			return s;
		}
	}
	public int calculateBill(Car car)
	{
		int totalFare;
		if(car instanceof Sedan)
		{
			Sedan s = (Sedan)car;
			totalFare = s.getNumberOfKms()*s.farePerKm;
		}
		else
		{
			HatchBack h = (HatchBack)car;
			totalFare = h.getNumberOfKms()*h.farePerKm;
		}
		return totalFare;
	}
}
