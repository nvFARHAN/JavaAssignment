package com.farhan.q4;

public class Main {
	public static void main(String[] args) {
		Area a = new Area();
		System.out.println("Area of Square : "+a.squareArea(5)+" sq. m");
		System.out.println("Area of Rectangle : "+a.rectangleArea(4, 3)+" sq. m");
		System.out.println("Area of Circle : "+String.format("%.2f",a.circleArea(3))+" sq. m");
	}
}
