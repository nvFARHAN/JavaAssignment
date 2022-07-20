package com.farhan.dao;

import javax.persistence.EntityManager;

import com.farhan.entities.Account;
import com.farhan.exceptions.InsufficientBalance;
import com.farhan.exceptions.InvalidAccount;
import com.farhan.utilities.EMUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public void save(Account account) {
		EntityManager em = EMUtil.getEntityManger();
		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public Account findById(int id) throws InvalidAccount {
		EntityManager em = EMUtil.getEntityManger();
		Account acc = em.find(Account.class, id);
		if (acc != null)
			return acc;
		else
			throw new InvalidAccount("Account not found...");
	}

	@Override
	public void update(Account account) throws InvalidAccount {
		EntityManager em = EMUtil.getEntityManger();
		Account acc = em.find(Account.class, account.getId());
		if (acc != null) {
			em.getTransaction().begin();
			em.merge(account);
			em.getTransaction().commit();
			em.clear();
		} else
			throw new InvalidAccount("Account not found...");

	}

	@Override
	public void remove(Account account) throws InvalidAccount {
		EntityManager em = EMUtil.getEntityManger();
		Account acc = em.find(Account.class, account.getId());
		if (acc != null) {
			em.getTransaction().begin();
			em.remove(account);
			em.getTransaction().commit();
			em.clear();
		} else
			throw new InvalidAccount("Account not found...");

	}

	@Override
	public int withdraw(double amount, Account account) throws InsufficientBalance {
		int x = 0;
		EntityManager em = EMUtil.getEntityManger();
		if (account.getBalance() >= amount) {
			em.getTransaction().begin();
			em.merge(account);
			account.setBalance(account.getBalance() - amount);
			em.getTransaction().commit();
			em.clear();
			x = (int) amount;
		} else
			throw new InsufficientBalance("Balanace not enough...");
		return x;
	}

	@Override
	public String deposit(double amount, Account account) throws InvalidAccount {
		EntityManager em = EMUtil.getEntityManger();
		Account acc = em.find(Account.class, account.getId());
		if (acc != null) {
			em.getTransaction().begin();
			acc.setBalance(acc.getBalance() + amount);
			em.getTransaction().commit();
			em.close();
			return "Amount deposited successfully";
		} else
			throw new InvalidAccount("Account not fomud...");
	}

}
