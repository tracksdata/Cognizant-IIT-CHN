package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		Set<String> cities = new HashSet<>();

		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Bangalore");
		cities.add("Goa");
		cities.add("Atlanta");
		cities.add("Pune");
		cities.add("Chennai");

		// System.out.println(cities.get);

		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			String cityName = it.next();
			if (cityName.equals("Pune")) {
				// it.remove();
				cities.add("New Pune");
			}
			System.out.println(cityName);
		}

		System.out.println("-----------------");
		System.out.println(cities);

	}

}
