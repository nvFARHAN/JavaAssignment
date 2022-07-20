package com.farhan.usecases;

import java.util.Scanner;

import com.farhan.dao.AccountDao;
import com.farhan.dao.AccountDaoImpl;
import com.farhan.entities.Account;

public class Save {

	public static void main(String[] args) {
		AccountDao dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		System.out.println("Enter account id : ");
		acc.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter address : ");
		acc.setAddress(sc.nextLine());
		System.out.println("Enter email : ");
		acc.setEmail(sc.nextLine());
		acc.setBalance(0);
		dao.save(acc);
		sc.close();
	}

}
