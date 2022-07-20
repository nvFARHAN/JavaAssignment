package com.farhan.exceptions;

public class InvalidAccount extends Exception {
	public InvalidAccount() {

	}

	public InvalidAccount(String msg) {
		super(msg);
	}
}
