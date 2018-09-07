package com;

public class Bank implements CustomerOperations, BankEmployee, BankManager, Clerk {

	@Override
	public void clerkOperations() {
		System.out.println("--- Clerk Operatins");
	}

	@Override
	public void withDraw() {
		System.out.println("--- withdrawing by customer");

	}

	@Override
	public void deposit() {
		System.out.println("--- depositing by customer");

	}

	@Override
	public void openAccount() {
		System.out.println("-- Opening Account");

	}

	@Override
	public void closeAccount() {
		System.out.println("-- Closing account");

	}

	@Override
	public void lockerAccess() {
		System.out.println("--- Locker access is given");

	}

}
