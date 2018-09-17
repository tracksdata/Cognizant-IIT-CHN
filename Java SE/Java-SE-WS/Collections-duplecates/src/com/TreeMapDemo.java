package com;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Object, Object> cities = new TreeMap<>();
		cities.put(10, "Hyderabad");
		cities.put(13, 12345);
		cities.put(12, "Bangalore");
		cities.put(11, "Mangalore");
		cities.put(19, "Chennai");
		cities.put(1, "North Goa");
		cities.put(12, "Kolkata");
		cities.put(null,"Pune");

		//System.out.println("Size: " + cities.size());

		//System.out.println(cities.get(10));
		//cities.remove(19);
		//cities.replace(14, "South Goa");

		System.out.println(cities);

	}

}
