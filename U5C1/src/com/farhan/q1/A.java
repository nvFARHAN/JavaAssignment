package com.farhan.q1;

public class A {

	public synchronized void funA(B b) {
		System.out.println("Inside funA of A, thread " + Thread.currentThread().getName());
		b.fun2();
	}

	public synchronized void fun1() {
		System.out.println("Inside fun1 of A, thread " + Thread.currentThread().getName());
	}
}
