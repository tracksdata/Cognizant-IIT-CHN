package com;

public class Use {

	public static void main(String[] args) {

		Adition sum = (int x, int y) -> x + y;
		Adition sum1 = (x, y) -> x + y;
		Adition diff = (int x, int y) -> x - y;
		Adition prod = (int x, int y) -> x * y;

		// System.out.println(sum.add(100, 200));
		System.out.println("Sum is " + sum.operation(100, 200));
		System.out.println("Diff" + diff.operation(1000, 200));
		System.out.println("Product: " + prod.operation(10, 2));
		// System.out.println("SUm1: " + sum1.operation(100.56f, 10.56f));

	}
}
