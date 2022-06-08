package com.farhan.q1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

	public long findAge(String date) throws InvalidDateFormat {
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate d = LocalDate.parse(date, dtf);
			LocalDate now = LocalDate.now();
			if (d.isAfter(now))
				return -1;
			else {
				return ChronoUnit.YEARS.between(d, now);
			}

		} catch (Exception e) {
			// TODO: handle exception
			InvalidDateFormat idf = new InvalidDateFormat("InvalidDateFormat");
			throw idf;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DOB in format dd-MM-yyyy : ");
		String date = sc.next();
		Main obj = new Main();
		try {
			long age = obj.findAge(date);
			if (age != -1) {
				System.out.println("Age : " + age);
			} else
				System.out.println("Date should not be in future");
		} catch (InvalidDateFormat e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Please enter the DOB in valid format");
		}
		sc.close();
	}
}
