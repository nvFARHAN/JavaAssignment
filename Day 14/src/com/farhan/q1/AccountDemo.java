package com.farhan.q1;

public class AccountDemo {
	public static void main(String[] args) {
		Account acc = new Account("123456789");
		acc.deposite(10000);
		try {
			acc.withdraw(11000);
			System.out.println("Remaining Balance : " + acc.balance);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
}
