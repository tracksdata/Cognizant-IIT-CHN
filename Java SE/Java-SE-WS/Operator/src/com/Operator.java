package com;

class Bus implements Runnable {

	@Override
	public void run() {
		bookTicket();

	}

	public void bookTicket() {

		if(Thread.currentThread().getName().equals("First Passenger")) {
			//notifyAll();
			//this.notify();
			System.out.println("--- Hehe");
		}
		System.out.println("Outside of Synchromozed Block: " + Thread.currentThread().getName());
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() + " is in synchronized block waiting for 10 secs");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class Operator {

	public static void main(String[] args) throws InterruptedException {

		Bus b1 = new Bus();
		Thread p1 = new Thread(b1);
		Thread p2 = new Thread(b1);

		p1.setName("First Passenger");
		p2.setName("Second Passenger");
		p1.start();

		//p1.join();
		//p2.join();
		 p2.start();

	}

}
