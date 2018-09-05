package com;

public class Hdfc extends Bank {

	@Override
	public void closeAccount() {
		System.out.println("--- Hdfc closeAccount");

	}

	@Override
	public void openAccount() {
		System.out.println("--- Hdfc openAccount");

	}

	public void custInfo() {
		System.out.println("---- Hdfc cust info");
	}

	@Override
	public void clerkOperation() {
		// TODO Auto-generated method stub

	}

}
