package com.farhan;
import java.util.Scanner;


public class AccountDetails {
	public Account getAccountDetails()
	{
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		while(true)
		{
			System.out.println("Enter account id : ");
			int id = sc.nextInt();
			System.out.println("Enter account type : ");
			String type = sc.next();
			System.out.println("Ennter balance : ");
			int balance = sc.nextInt();
			if(balance<=0)
			{
				System.out.println("Balance should be positive : ");
				continue;
			}
			a.setAccountId(id);
			a.setAccountType(type);
			a.setBalance(balance);
			sc.close();
			return a;
		}
	}
	public int getWithdrawAmount()
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the amount to be withdrawn : ");
			int amo = sc.nextInt();
			if(amo<=0)
			{
				System.out.println("Amount should be positive.");
				continue;
			}
//			sc.close();
			return amo;
		}	
	}
	public static void main(String[] args) {
		AccountDetails acc = new AccountDetails();
		Account a =  acc.getAccountDetails();
		int amount = acc.getWithdrawAmount();
		int balance = a.getBalance();
		if(a.withdraw(amount))
		{
			a.setBalance(balance-amount);
			System.out.println("Balance amount after withdraw : "+a.getBalance());
		}
	}
}
