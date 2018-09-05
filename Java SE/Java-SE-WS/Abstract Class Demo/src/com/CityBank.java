package com;

public abstract class CityBank extends Bank {

	@Override
	public void openAccount() {
		System.out.println("--- CityBank openAccount");

	}

	public void custInfo() {
		System.out.println("---- CityBank cust info");
	}

}
