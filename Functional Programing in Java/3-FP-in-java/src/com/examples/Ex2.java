package com.examples;


import java.util.function.*;

public class Ex2 {

	public static void main(String[] args) {

		Function<String, Double> strToDouble = s -> Double.parseDouble(s);
		Function<String, Integer> strToInteger = s -> Integer.parseInt(s);

		// -----------------------------------------

		int i=strToInteger.apply("123");
		System.out.println(i);
	}

}
