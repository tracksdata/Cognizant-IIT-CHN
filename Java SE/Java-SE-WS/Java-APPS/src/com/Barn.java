package com;

import java.util.HashSet;

public class Barn {
	private String s;

	public Barn(String s) {
		this.s = s;
	}

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<Object>();

		Barn ws1 = new Barn("aardvark");
		Barn ws2 = new Barn("aardvark");
		
		System.out.println(ws1.hashCode());
		System.out.println(ws2.hashCode());
		System.out.println("---");
		
		
		Integer s1 = new Integer(122);
		Integer s2 = new Integer(122);
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println("---");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		// hs.add(s2);
		System.out.println(hs.size());

	}
}
