package com.farhan.q3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of passengers : ");
		
		int numberOfPassengers = sc.nextInt();
		System.out.println("Enter number of kms : ");
		int numberOfKms = sc.nextInt();
		
		Ola ola = new Ola();
		Car car = ola.bookCar(numberOfPassengers, numberOfKms);
		
		int bill = ola.calculateBill(car);
		
		System.out.println("Total fare amount is : "+bill);
		
		sc.close();
	}
}
