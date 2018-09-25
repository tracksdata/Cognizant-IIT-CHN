package com.examples;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {

	public static void main(String[] args) {

		Random random = new Random();
		Supplier<Integer> supplier = random::nextInt;

		Stream<Integer> stream = Stream.generate(supplier);
		
		//stream.forEach(System.out::println);
		
		
		Stream<String> stars=Stream.iterate("*",s->s+"*");
		stars.forEach(System.out::println);

	}

}
