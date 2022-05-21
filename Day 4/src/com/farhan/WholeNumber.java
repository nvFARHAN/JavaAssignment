package com.farhan;

public class WholeNumber {
	
	void print(int n)
	{
		if(n<0)
		{
			System.out.println("Error");
		}
		else if(n%2!=0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println((n/10+1)*10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WholeNumber x = new WholeNumber();
		x.print(44);
		x.print(45);
		x.print(-5);
	}

}
