package com.examples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Box implements Iterable<Object> {
	// ...
	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Object next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Ex1 {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // data-structure

		// external iteration

		// way-1
		for (int i = 0; i < integers.size(); i++) {
			int item = integers.get(i);
			System.out.println(item);
		}
		System.out.println("----------------------------------------");

		// way-2
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);

		}
		// way-3
		for (Integer integer : integers) {
			System.out.println(integer);
		}

		// way-4
		Box box = new Box();
		for (Object obj : box) {
			// ..
		}

		// ---------------------------------------------------------

		// Internal iteration

		integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // data-structure

		integers
		.stream()
		.forEach(System.out::println);
		
		
	}
	

}
