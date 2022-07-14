package com.farhan.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB in dd-MM-yyyy format : ");
		String date = sc.next();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		try {
			LocalDate d = LocalDate.parse(date, dtf);
			LocalDate now = LocalDate.now();
			long years = ChronoUnit.YEARS.between(d, now);
			if (d.getMonth() == now.getMonth() && d.getDayOfMonth() == now.getDayOfMonth())
				System.out.println("Happy Birthday");
			if (d.isAfter(now)) {
				System.out.println("Date of birth should not be in future");
			} else if (years >= 18) {
				System.out.println("You are eligible to cast you vote");
			} else {
				System.out.println("You are not eligible");
			}
		} catch (Exception e) {
			System.out.println("Please pass the date in proper format");
		}
		sc.close();
	}
}
