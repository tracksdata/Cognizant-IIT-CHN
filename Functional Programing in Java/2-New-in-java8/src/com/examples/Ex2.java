package com.examples;

import java.util.ArrayList;
import java.util.Comparator;

public class Ex2 {
	public static void main(String[] args) {

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};

		comparator = Comparator.nullsLast(comparator);

		String s1 = "hello";
		String s2 = null;
		System.out.println(comparator.compare(s1, s2));

//		Comparator<String> reversedComparator = comparator.reversed();
//		System.out.println(reversedComparator.compare(s1, s2));
//		

	}
}
