package com;

public abstract class Bank {

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public static void f1() {
	}

	public abstract void openAccount(); // Spec

	public abstract void closeAccount();
	public abstract void clerkOperation();

	public final void bankInfo() { // concrete method
		System.out.println("--- bank information");
	}

	public void bankOperations() {
		System.out.println("--- internal bank operations");
	}

}
