package com.farhan.q1;

public class ThreadA extends Thread {
	A a;
	B b;

	public ThreadA(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		a.funA(b);
	}
}
