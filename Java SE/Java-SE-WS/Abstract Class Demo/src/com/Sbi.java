package com;

public class Sbi extends Bank {
	@Override
	public void closeAccount() {
		System.out.println("--- Sbi closeAccount");

	}

	@Override
	public void openAccount() {
		System.out.println("--- Sbi openAccount");

	}

	public void custInfo() {
		System.out.println("---- Sbi cust info");
	}

	@Override
	public void clerkOperation() {
		// TODO Auto-generated method stub
		
	}

}
