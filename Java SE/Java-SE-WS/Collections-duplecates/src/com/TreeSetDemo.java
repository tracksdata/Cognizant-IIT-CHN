package com;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Set<Object> cities = new TreeSet<>();

		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Goa");
		cities.add("Atlanta");
		// cities.add(122);
		cities.add("Chennai");

		// System.out.println(cities.get);

		System.out.println(cities);

	}

}
