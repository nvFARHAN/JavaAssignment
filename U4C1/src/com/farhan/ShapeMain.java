package com.farhan;

public class ShapeMain {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 5;
		Rectangle r = new Rectangle();
		r.length = 10;
		r.breadth = 5;
		Square s = new Square();
		s.side = 7;
		Shapes shape = new Shapes();
		shape.area(c);
		shape.area(r);
		shape.area(s);
	}
}
