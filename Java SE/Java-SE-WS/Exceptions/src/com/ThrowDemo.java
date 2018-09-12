package com;

public class ThrowDemo {

	public static void main(String[] args) throws NegativeNumberException {

		int x = 87;

		String name = "Ab";

		if (x < 0) {
			// ---?
			throw new NegativeNumberException("Number is Negative");

		} else {
			System.out.println("Value of X is " + x);
		}

		if (name.length() <= 3) {
			throw new InvalidNameException("Name lengtgh should be minimium 3 letters");
		} else {
			System.out.println("Name is " + name);
		}

	}

}
