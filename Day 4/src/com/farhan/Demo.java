package com.farhan;

public class Demo {
	
	Demo()
	{
		System.out.println("This is Demo()");
	}
	Demo(String s)
	{
		this();
		System.out.println("This is Demo(String)");
	}
	Demo(int i)
	{
		this(Integer.toString(i));
		System.out.println("This is Demo(int)");
	}
	Demo(float f)
	{
		this((int)f);
		System.out.println("This is Demo(float)");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(10.55f);
	}
}
