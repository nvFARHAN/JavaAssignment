package com.farhan.q3;

public class Main {
	public static void main(String[] args) {
		Account account = new Account();
		account.accountNo = 123456789;
		account.balance = 1000;

		Deposit deposit = new Deposit(500, account);
		Withdraw withdraw = new Withdraw(900, account);
		Thread thread1 = new Thread(deposit);
		Thread thread2 = new Thread(withdraw);
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		thread2.start();
	}
}
