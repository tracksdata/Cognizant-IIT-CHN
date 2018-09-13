package com;

public class Test extends Thread {

	@Override
	public void run() {
		f1();

	}

	public void f1() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("I= " + i);
		}
	}

	public static void main(String[] args) {

		// Test t = new Test();
		// t.f1();
		/// t.f2();

		Thread t1 = new Test();
		t1.start();

	}

}
