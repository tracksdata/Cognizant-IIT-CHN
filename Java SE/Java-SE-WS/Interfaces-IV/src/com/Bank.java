package com;

public interface Bank {

	void deposit();

	public interface BankEmployee { // sttaic interface
		double getBalance();

		void openAccount();
	}

	class C1 { // every class in interface is static
		void f1() {
			System.out.println("--- C1 class f1 method");
		}
	}

}
