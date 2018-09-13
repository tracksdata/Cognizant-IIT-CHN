package com;

public class Test5 implements Runnable {

	@Override
	public void run() {
		f1();
	}

	int sum;

	public synchronized void f1() {
		String tname = Thread.currentThread().getName();

		if (sum != 0) {
			System.out.println("Sum is " + sum + " by " + tname);
		}

		if (sum == 0) {
			for (int i = 1; i <= 5; i++) {
				sum = sum + i;
				System.out.println("I= " + i + " by " + tname);
			}
		}

	}

	public static void main(String[] args) {

		// Test t = new Test();
		// t.f1();
		/// t.f2();

		Test5 obj = new Test5();

		Thread t1 = new Thread(obj);// New Born
		Thread t2 = new Thread(obj);

		// Thread t1 = new Test3();
		// Thread t2 = new Test3();

		t1.setName("First");
		t2.setName("Second");

		t1.start();
		t2.start();

		// t1.stop();

	}

}
