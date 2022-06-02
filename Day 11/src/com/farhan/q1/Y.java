package com.farhan.q1;

public interface Y {
	void abstractMethodY();
	default void defaultMethodY()
	{
		System.out.println("This is a default methos of Y");
	}
	static void staticMethodY()
	{
		System.out.println("This is a static method of Y");
	}
}
