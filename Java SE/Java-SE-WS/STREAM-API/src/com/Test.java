package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("xbc", "", "lc", "efg", "abcd", "", "jkl","xyz");
		List<String> filtered = strings
								.stream()
								.filter(string -> !string.isEmpty())
								.collect(Collectors.toList());

		
		List<Object> data= strings
		.stream()
		.filter(s1-> s1.equals("xyz"))
		.collect(Collectors.toList());
		
		//System.out.println(searchData);
		
		
	
		
		
		System.out.println(strings);
		System.out.println(filtered);

	}

}
