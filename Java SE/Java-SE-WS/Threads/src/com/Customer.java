package com;

class Operartor implements Runnable {
	private int noOfSeats = 1;
	private int wantedSeats;

	public Operartor(int wantedSeats) {
		this.wantedSeats = wantedSeats;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {

		String tname = Thread.currentThread().getName();

		System.out.println("Number of Seats available: " + noOfSeats);
		synchronized (this) {

			if (wantedSeats <= noOfSeats) {
				try {
					System.out.println("Trying to Book " + wantedSeats + " Seats to " + tname);
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				noOfSeats = noOfSeats - wantedSeats;
				System.out.println(wantedSeats + " Seats Booked for " + tname);

			} else {
				System.out.println("Sorry. No Seats are avaialable");
				System.out.println("Available Seats: " + noOfSeats);
			}
		} // end of block

		// ---
		synchronized (this) {
			// --
		}

	}

}

public class Customer {

	public static void main(String[] args) {

		Operartor op = new Operartor(1);
		Thread p1 = new Thread(op);
		Thread p2 = new Thread(op);

		p1.setName("Passenger-1");
		p2.setName("Passenger-2");

		p1.start();
		p2.start();

	}

}
