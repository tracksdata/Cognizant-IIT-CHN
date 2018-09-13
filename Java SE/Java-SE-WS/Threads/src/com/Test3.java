package com;

public class Test3 implements Runnable {

	@Override
	public void run() {
		f1();
	}

	public void f1() {
		String tname = Thread.currentThread().getName();

		for (int i = 1; i <= 5; i++) {
			System.out.println("I= " + i + " by " + tname);
		}
	}

	public static void main(String[] args) {

		// Test t = new Test();
		// t.f1();
		/// t.f2();

		Test3 obj = new Test3();

		Thread t1 = new Thread(obj);// New Born
		Thread t2 = new Thread(obj);

		// Thread t1 = new Test3();
		// Thread t2 = new Test3();

		t1.setName("First");
		t2.setName("Second");

		t1.start();

		t2.start();

		// t1.stop();

		System.out.println("-- Done --");

	}

}
