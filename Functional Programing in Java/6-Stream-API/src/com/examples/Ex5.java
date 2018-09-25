package com.examples;

import java.util.stream.Stream;

public class Ex5 {

	public static void main(String[] args) {

//		Stream<Integer> fib = Stream.of(1, 1, 2, 3);
//		fib.forEach(System.out::println);
//		fib.forEach(System.out::println);  Exception

		Stream<Integer> fib = Stream.of(1, 1, 2, 3);
		fib.limit(2); // intermediate
		fib.forEach(System.out::println); // Exception

	}
	
	
	

}
