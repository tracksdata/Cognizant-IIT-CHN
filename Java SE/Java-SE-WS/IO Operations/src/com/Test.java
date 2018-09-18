package com;

public class Test {

	static void f1() {
		try {
			System.out.println("--- Hello f1");
			String f = "5.6";
			Integer.parseInt(f);
			int y = 2 / 0;
			System.out.println("-- Welcome to Java");

		} catch (NumberFormatException e) {
			System.out.println("--- Number format in f1");
			throw e;
		} catch (RuntimeException e) {
			System.out.println("-- runtime in f1 " + e);
		}

	}

	public static void main(String[] args) {

		try {

			f1();
			System.out.println("-- AFter method");

		} catch (RuntimeException e) {
			System.out.println("--- Runtime Execution in main method " + e);

		} catch (Exception e) {
			System.out.println("- Exception");
		}

		// all below

	}

}
