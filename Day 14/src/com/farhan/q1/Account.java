package com.farhan.q1;

public class Account {
	String accountNumber;
	double balance;

	public Account(String accountNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = 0;
	}

	void deposite(double amount) {
		this.balance += amount;
	}

	void withdraw(double amount) throws InsufficientFundsException {
		if (amount > this.balance) {
			InsufficientFundsException ife = new InsufficientFundsException("Insufficient balance in your account");
			throw ife;
		} else
			this.balance -= amount;
	}
}
