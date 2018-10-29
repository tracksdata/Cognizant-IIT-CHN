package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository("price")
public class PriceMatrixImpl implements PriceMatric {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatricImpl Object Created");
	}

	
	
	public double getItemPrice(String itemCode) {
		// code to connect to DB and fetch price of given Id
		
		return 100.00;
	}

}
