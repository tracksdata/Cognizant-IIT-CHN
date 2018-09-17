package com;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		Set<String> cities = new LinkedHashSet<>();

		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Goa");
		cities.add("Pune");
		cities.add("Chennai");
		
		//System.out.println(cities.get);

		System.out.println(cities);

	}

}
