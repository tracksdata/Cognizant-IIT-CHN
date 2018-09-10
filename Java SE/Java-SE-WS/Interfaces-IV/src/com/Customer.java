package com;

public class Customer implements Bank {

	@Override
	public void deposit() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Bank.BankEmployee be = new BankOperations();
		System.out.println(be.getBalance());
		be.openAccount();

	}

}
