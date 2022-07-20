package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.AccountDao;
import com.farhan.dao.AccountDaoImpl;
import com.farhan.entities.Account;
import com.farhan.exceptions.InvalidAccount;

public class Deposit {

	public static void main(String[] args) {
		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id : ");
		int id = sc.nextInt();
		sc.nextLine();
		try {
			Account acc = dao.findById(id);
			System.out.println("Enter amount : ");
			double amount = sc.nextDouble();
			String msg = dao.deposit(amount, acc);
			System.out.println(msg);
			sc.close();
		} catch (InvalidAccount e) {
			e.printStackTrace();
		}

	}

}
