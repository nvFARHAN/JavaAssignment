package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.AccountDao;
import com.farhan.dao.AccountDaoImpl;
import com.farhan.entities.Account;
import com.farhan.exceptions.InvalidAccount;

public class Remove {
	public static void main(String[] args) {
		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account id : ");
		try {
			Account acc = dao.findById(sc.nextInt());
			dao.remove(acc);
			sc.close();
		} catch (InvalidAccount e) {
			e.printStackTrace();
		}
	}
}
