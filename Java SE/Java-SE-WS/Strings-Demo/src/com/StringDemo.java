package com;

public class StringDemo {

	public static void main(String[] args) {

		String s1=new String("Abc");
		//s1= "Abc";
		//String s2;
		String s2= new String("Abc");
		//s2="Abc";
		String s3=new String("Xyz");

		System.out.println("hashcode of s1: " + s1.hashCode());
		System.out.println("hashcode of s2: " + s2.hashCode());

		System.out.println("S1: " + s1);
		System.out.println("Identity Hashcode: " + System.identityHashCode(s1));

		System.out.println("S2: " + s2);
		System.out.println("Identity Hashcode: " + System.identityHashCode(s2));

		if (s1.equals(s2)) {
			System.out.println("-- Equal");
		} else {
			System.out.println("-- Not Equal");
		}

	}

}
