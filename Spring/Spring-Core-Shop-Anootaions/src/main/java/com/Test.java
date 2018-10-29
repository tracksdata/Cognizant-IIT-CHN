package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingIml;
import com.pricematrix.PriceMatric;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		BillingIml bill=ac.getBean("bill",BillingIml.class);

		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart-1 Total is " + total);

		total = bill.getCartTotal(cart2);

		System.out.println("Cart-2 Total is " + total);

	}

}
