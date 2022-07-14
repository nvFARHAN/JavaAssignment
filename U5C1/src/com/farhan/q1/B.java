package com.farhan.q1;

public class B {

	public synchronized void funB(A a) {
		System.out.println("Inside funB of B, thread " + Thread.currentThread().getName());
		a.fun1();
	}

	public synchronized void fun2() {
		System.out.println("Inside fun2 of B, thread " + Thread.currentThread().getName());
	}
}
