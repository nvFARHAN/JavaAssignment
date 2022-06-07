package com.farhan.q3;

final public class Final {
	final int n = 10;

	final void print() // cannot be overriden
	{
		System.out.println("Inside final method");
	}

	public static void main(String[] args) {
		Final f = new Final();
		f.n = 10; // cannot be reassigned
	}
}

class Temp extends Final { // connot extend final class

}