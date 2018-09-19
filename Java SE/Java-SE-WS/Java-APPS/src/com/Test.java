package com;

public class Test {

	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		Bank.InnerOperations io=b.new InnerOperations();
		io.processSalary();
		
		
		
		
		
		

	}

}
