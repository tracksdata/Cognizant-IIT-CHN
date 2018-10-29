package com;

import com.bill.BillingIml;
import com.pricematrix.PriceMatric;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };
		BillingIml bill = new BillingIml();
		//----------------------------------------
		//1. Get Dependency object
		
		PriceMatric price=new PriceMatrixImpl();
		
		//----------------------------------------
		
		
		// 2. Inject dependency object to dependent.
		
		bill.setPrice(price); // DI
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart-1 Total is " + total);

		total = bill.getCartTotal(cart2);

		System.out.println("Cart-2 Total is " + total);

	}

}
