package com;

public class Calculator {

	void calc() {

	}

	/*
	 * int calc(int x) { return 100; }
	 */

	void calc(int x, float y) {

	}

	void calc(float x, int y) {

	}

	void calc(int x, int y) {

	}
	
	void calc(int x) {
		System.out.println("Int " + x);
	}

	void calc(short x) {
		System.out.println("Short " + x);
	}

	void calc(long x) {
		System.out.println("Long " + x);
	}

	void calc(float x) {
		System.out.println("Float " + x);
	}

	void calc(byte x) {
		System.out.println("Byte " + x);
	}

	void calc(double x) {
		System.out.println("Double " + x);

	}

	void calc(boolean x) {
		System.out.println("Boolean " + x);
	}

	void calc(String x) {
		System.out.println("String " + x);
	}

	void calc(char x) {
		System.out.println("Char " + x);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();

		c.calc('A');

		// System.out.println(x);

		/*
		 * c.calc(1234); // int c.calc(3454L); // LOng c.calc((short) 665); // short
		 * c.calc((byte)76);
		 * 
		 * c.calc(34.76); // double c.calc(76.35f);// float
		 * 
		 * c.calc(false); // boolean c.calc('K'); // char c.calc("Hello"); // String
		 * //c.calc(34,87);
		 * 
		 */

	}

}
