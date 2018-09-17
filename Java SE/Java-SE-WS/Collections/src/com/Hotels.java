package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotels {

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
		// 1. Iterator --> Only for List and Set interfaces
		// 2. ListIterator --> Only for List interfaces
		// 3. Enumerator --> Only for Vector and Stack classes

		// 1. Iterator
		System.out.println("--------------");

		Iterator<String> it = hotels.iterator();

		while (it.hasNext()) {
			String hotelName = it.next();
			if (hotelName.equals("raj")) {
				it.remove();
				continue;
			}
			System.out.println(hotelName);
		}

		System.out.println(hotels);

	}

}
