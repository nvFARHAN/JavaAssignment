package com.farhan;

public class Shapes {

	public void area(Circle circle)
	{
		double area = 3.14*circle.radius*circle.radius;
		System.out.println("Area : "+area);
	}
	public void area(Rectangle rectangle)
	{
		int area = rectangle.breadth*rectangle.length;
		System.out.println("Area : "+area);
	}
	public void area(Square square)
	{
		int area = square.side*square.side;
		System.out.println("Area : "+area);
	}
	
}
/*
 * Static polymorphism is basically method overloading in java.
If we have multiple function with same name but with different parameters,then,
when we call the method,that function will be called that has parameters suitable with
the caller.
 */
