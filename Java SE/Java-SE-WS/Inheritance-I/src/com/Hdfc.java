package com;

public class Hdfc extends ReservBank {

	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("--- Hdfc openAccount");
	}
	


	@Override
	public void withDraw() {
		System.out.println("--- Hdfc withDraw");
	}

	@Override
	public void deposit() {
		System.out.println("--- Hdfc deposit");
	}

	public void custInfo() {
		System.out.println("--- Hdfc customer info");
	}

}
