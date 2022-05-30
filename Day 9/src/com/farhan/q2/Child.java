package com.farhan.q2;

final public class Child extends Parent {
	
	Child(int n)
	{
		super(n);
	}
	
	@Override
	void method1()
	{
		System.out.println("Method 1 of Child class");
		System.out.println("Number : "+this.number);
	}
	void method4()
	{
		System.out.println("Method 4 of Child class");
	}
}
