package com.farhan;

public class CarMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("Car Model : "+c1.getModel());
		System.out.println("Car Company Name : "+c1.getCompanyName());
		System.out.println("Car Color : "+c1.getColor());
		System.out.println("Car RPM : "+c1.getEngine().getRpm());
		System.out.println("Car Power : " + c1.getEngine().getPower());
		System.out.println("Car Engine Manufacturer : "+c1.getEngine().getManufacturer());
		System.out.println("Car Has Turbo : "+c1.getEngine().isHasTurbo());
		
		System.out.println();
		
		Car c2 = new Car("Harrier","Tata","Black",10000,110,"Tata");
		c2.getEngine().setTurbo();
		System.out.println("Car Model : "+c2.getModel());
		System.out.println("Car Company Name : "+c2.getCompanyName());
		System.out.println("Car Color : "+c2.getColor());
		System.out.println("Car RPM : "+c2.getEngine().getRpm());
		System.out.println("Car Power : " + c2.getEngine().getPower());
		System.out.println("Car Engine Manufacturer : "+c2.getEngine().getManufacturer());
		System.out.println("Car Has Turbo : "+c2.getEngine().isHasTurbo());
	}
}
