package com;

public class Use {

	public static void main(String[] args) {
		
		 // Bad Practice
		
		/*
		Hdfc hb=new Hdfc();
		hb.openAccount();
		hb.closeAccount();
		
		Sbi sb=new Sbi();
		sb.openAccount();
		sb.closeAccount();
		*/
		
		Sbi s=new Sbi();
		//s.rbiInfo();
		
		
		ReservBank rb;
		rb=new Hdfc();
		//rb.custInfo();
		rb.openAccount();
		rb.closeAccount();
		//rb.rbiInfo();
	
		
		rb= new Sbi();
		rb.openAccount();
		rb.closeAccount();
		
		

	}

}
