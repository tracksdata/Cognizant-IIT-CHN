package com;

class Shape {

	public void draw() {
		System.out.println("-- shape class Draw method");
	}

}

class Circle extends Shape {
	@Override // Annotation ==> JDK 5.0
	public void draw() {
		System.out.println("-- Drawing a circle");
	}
	
	void f1() {}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("--- Drawing a Square");
	}
}

public class Test {
	public static void main(String[] args) {

		Square s = new Square();
		s.draw();
		
		Circle c=new Circle();
		c.draw();
		

	}
}
