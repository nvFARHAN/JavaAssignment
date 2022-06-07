package com.farhan.q3;

public class Finally {
	public static void main(String[] args) {
		try {
			int a = 100 / 1;
			System.out.println(a);
			return;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getClass().getSimpleName());
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
