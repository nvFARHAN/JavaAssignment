package com.farhan.exceptions;

public class InsufficientBalance extends Exception {
	public InsufficientBalance() {

	}

	public InsufficientBalance(String msg) {
		super(msg);
	}
}
