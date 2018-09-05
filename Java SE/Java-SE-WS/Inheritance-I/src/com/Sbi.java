package com;

public class Sbi extends ReservBank {
	@Override
	public void openAccount() {
		System.out.println("--- Sbi openAccount");
	}

	@Override
	public void closeAccount() {
		System.out.println("--- Sbi closeAccount");
	}

	@Override
	public void withDraw() {
		System.out.println("--- Sbi withDraw");
	}

	@Override
	public void deposit() {
		System.out.println("--- Sbi deposit");
	}
	
	public void custInfo() {
		System.out.println("--- Sbi customer info");
	}

}
