package com;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Object> obj = new ArrayList<>();

		obj.add(1000);
		obj.add(34);
		obj.add(343);
		obj.add(123);
		obj.add(543);

		System.out.println(obj);

		// Iteratng Collection ELEMENTS OF LIST

		// 1. For Loop

		for (int i = 0; i < obj.size(); i++) {

			/*
			 * if (obj.get(i) == "34") { obj.remove(i); obj.add(343434); }
			 * 
			 */
			System.out.println(obj.get(i));
		}

		System.out.println("--------------------");
		for (int i = obj.size() - 1; i >= 0; i--) {
			System.out.println(obj.get(i));
		}

		System.out.println("-------------------------");

		// 2. for each loop

		for (Object e : obj) {
			
			Integer o=(Integer) e;
			if(o==34) {
				//obj.remove(o);
				obj.add(45545);
			}
			System.out.println(e);
		}

	}

}
