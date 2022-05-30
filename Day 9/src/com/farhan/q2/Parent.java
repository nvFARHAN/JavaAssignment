package com.farhan.q2;

public class Parent {
	
	final int number;
	
	Parent(int n)
	{
		number = n ;
	}
	
	void method1()
	{
		System.out.println("Method 1 of Parent class");
		System.out.println("Number : "+this.number);
	}
	final void method2()
	{
		System.out.println("Method 2 of Parent class");
	}
	void method3()
	{
		System.out.println("Method 3 of Parent class");
	}
}
