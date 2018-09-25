package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		List<Integer> squareNums=numbers
		.stream()
		.filter(i-> i>=10)
		.map(i-> i*i)
		.distinct()
		.collect(Collectors.toList());

		System.out.println(squareNums);
	}

}
