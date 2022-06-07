package com.farhan.q2;

import java.util.Scanner;

public class UserRegistration {
	void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		} else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your country : ");
		String country = sc.nextLine();
		UserRegistration user = new UserRegistration();
		try {
			user.registerUser(name, country);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
		sc.close();
	}
}
