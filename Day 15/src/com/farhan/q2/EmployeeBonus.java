package com.farhan.q2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeBonus {
	double calculatebonus(String date) throws InvalidAgeException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d;
		try {
			d = LocalDate.parse(date, dtf);
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
			InvalidAgeException iae = new InvalidAgeException("Please pass the date in the correct format");
			throw iae;
		}
		LocalDate now = LocalDate.now();
		double yoe;
		yoe = ChronoUnit.YEARS.between(d, now);
		if (d.isAfter(now)) {
			InvalidAgeException iae = new InvalidAgeException("Age should not be in the future");
			throw iae;
		} else if (yoe < 1) {
			return 5000;
		} else if (yoe < 2) {
			return 8000;
		} else {
			return 10000;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter joining date in dd/MM/yyyy format");
		String date = sc.next();
		EmployeeBonus e = new EmployeeBonus();
		try {
			System.out.println("Bonus = " + e.calculatebonus(date));
		} catch (InvalidAgeException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		sc.close();
	}
}
