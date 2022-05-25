package com.farhan;
import java.lang.Math;

public class CLAMain {
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		if(args.length>2)
			System.out.println("Error");
		else if(args.length==2)
		{
			int x = Math.abs(Integer.parseInt(args[0])-Integer.parseInt(args[1]));
			System.out.println(CLAMain.factorial(x)); 
		}
		else
			System.out.println(CLAMain.factorial(Integer.parseInt(args[0])));
	}
}
