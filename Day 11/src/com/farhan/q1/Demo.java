package com.farhan.q1;

public class Demo {
	public static void main(String[] args) {
		ZImpl obj = new ZImpl();
		obj.abstractMethodX();
		obj.defaultMethodX();
		X.staticMethodX();
		
		obj.abstractMethodY();
		obj.defaultMethodY();
		Y.staticMethodY();
		
		obj.abstractMethodZ();
		
	}
}
