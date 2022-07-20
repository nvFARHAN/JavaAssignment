package com.farhan.dao;

import com.farhan.entities.Account;
import com.farhan.exceptions.InsufficientBalance;
import com.farhan.exceptions.InvalidAccount;

public interface AccountDao {
	void save(Account account);

	Account findById(int id) throws InvalidAccount;

	void update(Account account) throws InvalidAccount;

	void remove(Account account) throws InvalidAccount;

	int withdraw(double amount, Account account) throws InsufficientBalance;

	String deposit(double amount, Account account) throws InvalidAccount;
}
