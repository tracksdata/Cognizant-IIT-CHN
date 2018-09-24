package com;

public class Test {

	public static void main(String[] args) {

		Vehicle v = (String msg) -> msg;
		Vehicle v1 = (msg) -> msg;
		Vehicle v2 = msg -> msg;
		System.out.println("Name: " + v.printName("Honda"));
		System.out.println("Name: " + v1.printName("BMW"));
		System.out.println("Name: " + v2.printName("Hyundai"));

		v.printData();

		Vehicle.f2();

		System.out.println("-----------");

		Vehicle vi = new Car();
		vi.printData();
		
		System.out.println("-----------------");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
