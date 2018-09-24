package com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NumberTest {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		nums.add(0);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		System.out.println(nums);
		System.out.println("---------------");

		ListIterator<Integer> li = nums.listIterator();
		int c = 0;
		int p = 0;
		while (li.hasNext()) {
			c++;
			int num = li.next();

			if (c != 1) {

				if (num % 2 == 0) {
					li.remove();
					p = li.previous();
					li.next();
					li.add(p);
					li.previous();
				}

			}

		}

		System.out.println(nums);

		System.out.println((int) 12.65);

	}

}
