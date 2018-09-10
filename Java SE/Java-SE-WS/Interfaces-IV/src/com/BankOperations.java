package com;

public class BankOperations implements Bank.BankEmployee {

	
	
	@Override
	public double getBalance() {
		System.out.println("--- Balance method");
		return 10000;
	}

	@Override
	public void openAccount() {
		System.out.println("--- Account opening");

	}

	public static void main(String[] args) {

		Bank.C1 c1 = new Bank.C1();
		c1.f1();

	}

}
