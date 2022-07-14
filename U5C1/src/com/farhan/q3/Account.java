package com.farhan.q3;

public class Account {
	int balance;
	int accountNo;

	void displayBalance() {
		System.out.println("Account No : " + accountNo + " Balance : " + balance);
	}

	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + " is deposited");
		displayBalance();
	}

	void withdraw(int amount) {
		balance -= amount;
		System.out.println(amount + " is withdrawn");
		displayBalance();
	}
}
