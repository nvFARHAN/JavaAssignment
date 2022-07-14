package com.farhan.q3;

public class Deposit extends Thread {
	int amount;
	Account account;

	public Deposit(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {
		account.deposit(amount);
	}
}
