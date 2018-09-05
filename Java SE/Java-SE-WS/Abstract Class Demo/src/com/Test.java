package com;

public class Test {

	public static void main(String[] args) {

		Bank bank=new Hdfc();
		bank.openAccount();
		bank.closeAccount();
		
		bank=new Sbi();
		bank.openAccount();
		bank.closeAccount();
		
		bank=new CityBank_V2();
		bank.openAccount();
		bank.closeAccount();
		
	}

}
