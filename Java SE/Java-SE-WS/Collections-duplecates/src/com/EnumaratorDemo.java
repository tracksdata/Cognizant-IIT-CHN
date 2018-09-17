package com;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.DelayQueue;

public class EnumaratorDemo {

	public static void main(String[] args) {

		Stack<String> hotels = new Stack<>();

		hotels.add("Taj");
		hotels.add("Abc");
		hotels.add("Xyz");
		hotels.add("raj");
		hotels.add("Moon");

		Enumeration<String> em = hotels.elements();

		while (em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}

		System.out.println("--------------------");

		System.out.println(hotels);

	}

}
