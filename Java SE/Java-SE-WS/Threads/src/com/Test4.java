package com;

public class Test4 implements Runnable {

	@Override
	public void run() {
		f1();
	}

	public void f1() {
		String tname = Thread.currentThread().getName();

		int sum = 0;
		if (tname.equals("Second")) {
			try {
				System.out.println(tname + " is sleeping for 5 secs");
				Thread.sleep(5000);
				System.out.println(tname + " is Resumed from the sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
			System.out.println("I= " + i + " by " + tname);
		}
		System.out.println("Sum is " + sum + " by " + tname);
	}

	public static void main(String[] args) {

		// Test t = new Test();
		// t.f1();
		/// t.f2();

		Test4 obj = new Test4();

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
