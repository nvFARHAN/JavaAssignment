package com.farhan;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	Account()
	{
		
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public boolean withdraw(int amount)
	{
		int balance = this.getBalance();
		if(balance>=amount)
		{
			System.out.println("Balance amount after withdrawn : "+amount);
			this.setBalance(balance-amount);
			return true;
		}
		else
		{
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
	}
}
