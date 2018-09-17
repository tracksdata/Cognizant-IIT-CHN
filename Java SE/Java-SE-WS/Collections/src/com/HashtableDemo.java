package com;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashtableDemo {

	public static void main(String[] args) {

		Map<Integer, Object> cities = new Hashtable<>();
		cities.put(10, "Hyderabad");
		cities.put(13, "Pune");
		cities.put(12, "Bangalore");
		cities.put(11, "Mangalore");
		cities.put(19, "Chennai");
		cities.put(14, "North Goa");
		cities.put(12, "Kolkata");
		cities.put(18, "Pune");

		System.out.println("Size: " + cities.size());

		System.out.println(cities.get(10));
		cities.remove(19);
		cities.replace(14, "South Goa");

		System.out.println(cities);

	}

}
