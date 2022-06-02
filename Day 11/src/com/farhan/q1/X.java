package com.farhan.q1;

public interface X {
	void abstractMethodX();
	default void defaultMethodX()
	{
		System.out.println("This is a default methos of X");
	}
	static void staticMethodX()
	{
		System.out.println("This is a static method of X");
	}
}
