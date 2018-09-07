package com;

public class Use {

	public static void main(String[] args) {

		CustomerOperations cp = new Bank();
		cp.withDraw();
		cp.deposit();

		BankEmployee be = new Bank();
		be.openAccount();
		be.closeAccount();

		BankManager bm = new Bank();
		bm.lockerAccess();

		Clerk c = new Bank();
		c.clerkOperations();
		
		
		
		
		
		
		
		
		
		

	}

}
