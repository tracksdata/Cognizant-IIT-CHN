package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Hotels2 {

	public static void main(String[] args) {

		List<String> hotels = new ArrayList<>();

		hotels.add("Taj");
		hotels.add("Abc");
		hotels.add("Xyz");
		hotels.add("raj");
		hotels.add("Moon");

		for (String hotelName : hotels) {
			// if (hotels.contains("raj")) {
			// hotels.remove(hotelName);
			// }
			System.out.println(hotelName);
		}

		// Iterating interfaces in Collections
		// 1. Iterator
		// 2. ListIterator
		// 3. Enumerator

		System.out.println("--------------");

		// 2. ListIterator

		ListIterator<String> li = hotels.listIterator();

		while (li.hasNext()) {
			String hotelName = li.next();

			if (hotelName.equals("raj")) {
				// li.set("New Hotel");
				// li.add("Tet Hotel");
				li.remove();
				continue;
			}

			System.out.println(hotelName);
		}
		System.out.println("-----------------");

		System.out.println(hotels);

	}

}
