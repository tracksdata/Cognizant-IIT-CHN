package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatric;
import com.pricematrix.PriceMatrixImpl;
//Dependent

/*
 * Issues with this code
 * ---------------------------
 * 
 * -> Too many Dependency class objects.
 * -> Because of this perfomance of application goes down
 * 
 * Why this issue Happened?
 * ----------------------------
 * -> Dependent class is creating a dependency class object
 * 
 * What is the Solution?
 * -----------------------
 * -> DO not create dependency obj in the dependent class
 * -> Insted, Find it using JNDI
 *
 *Issue with JNDI calls
 *------------------------
 *-> JNDI location is tightly binded with Dependent class obj. 
 * 
 * What is the best Solution?
 * ------------------------------
 * -> Do not find, Do not create, insted, ask some one (IOC)
 * 
 *-> Dependency Injection (DI)
 *	-> Injecting Dependency to a Dependent
 *Can be done two ways
 *
 *1. using setters
 *2. using constructors
 *
 * 
 * 
 * 
 * 
 */

@Service("bill")
public class BillingIml {

	@Autowired
	private PriceMatric price;

	

	public double getCartTotal(String[] cart) {

		// PriceMatrixImpl price = new PriceMatrixImpl();

		double total = 0.0;
		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
