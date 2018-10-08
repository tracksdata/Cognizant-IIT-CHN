package com;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {
	AtomicInteger ai=new AtomicInteger(0);
	private long count = 0; // Mutable property

	public  void setCounter() {
		System.out.println("-- hehe");
		ai.incrementAndGet();
		//count++;
	}

	public long getCount() {
		return ai.get();
	}

}

public class App {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Runnable rt = () -> {

			for (int i = 1; i <= 1000; i++)
				c.setCounter();

		};

		Thread threads[] = new Thread[1000];

		for (int i = 0; i < 1_000; i++) {
			threads[i] = new Thread(rt, "Thread " + i);

		}

		for (int i = 0; i < 1_000; i++) {
			threads[i].start();

		}

		for (int i = 0; i < 1_000; i++) {

			threads[i].join();
		}
		System.out.println(c.getCount());

	}

}
