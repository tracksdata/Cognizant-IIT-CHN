package com.examples;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex9 {

	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 10000000);

		int sum=intStream
		.parallel()		
		.filter(n -> {
			String name = Thread.currentThread().getName();
			System.out.println("THread-" + name + " processing - " + n);
			return n % 2 != 0;
		}).sum();

		System.out.println(sum);

	}

}
