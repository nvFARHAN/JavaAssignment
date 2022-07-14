package com.farhan.q3;

public class Withdraw extends Thread {
	int amount;
	Account account;

	public Withdraw(int amount, Account account) {
		super();
		this.amount = amount;
		this.account = account;
	}

	@Override
	public void run() {
		account.withdraw(amount);
	}
}
