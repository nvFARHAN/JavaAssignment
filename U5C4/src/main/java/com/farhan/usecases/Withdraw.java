package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.AccountDao;
import com.farhan.dao.AccountDaoImpl;
import com.farhan.entities.Account;
import com.farhan.exceptions.InsufficientBalance;
import com.farhan.exceptions.InvalidAccount;

public class Withdraw {

	public static void main(String[] args) {
		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id : ");
		int id = sc.nextInt();
		System.out.println("Enter amount : ");
		double amount = sc.nextDouble();
		try {
			Account acc = dao.findById(id);
			int money = dao.withdraw(amount, acc);
			System.out.println(money);
			sc.close();
		} catch (InvalidAccount e) {
			e.printStackTrace();
		} catch (InsufficientBalance e) {
			e.printStackTrace();
		}
	}

}
