package com.pricematrix;

//Dependency
public class PriceMatrixImpl implements PriceMatric {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatricImpl Object Created");
	}

	
	@Override
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price of given Id
		
		return 100.00;
	}

}
