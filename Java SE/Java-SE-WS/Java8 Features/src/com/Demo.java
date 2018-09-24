package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		List<Integer> objects = new ArrayList<>();
		objects.add(100);
		objects.add(800);
		objects.add(200);
		objects.add(400);
		objects.add(300);

		for (Integer obj : objects) {
			System.out.println(obj);

		}

		System.out.println("---------------------");

		objects.forEach(obj -> {
			System.out.println(obj);
		});

		System.out.println("--------------------");

		Iterator<Integer> it = objects.iterator();

		it.forEachRemaining(obj -> {
			System.out.println(obj);
		});

		System.out.println("=======================");

		objects.forEach(System.out::println);
		
		
		

	}

}
