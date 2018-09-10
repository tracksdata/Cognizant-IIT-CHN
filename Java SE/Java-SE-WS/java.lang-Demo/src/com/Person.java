package com;

public class Person implements Cloneable {

	private int personId;
	private String personName;

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person();
		p1.personId = 100;
		p1.personName = "James";

		Person p2;
		// p2 = p1;

		p2 = (Person) p1.clone();

		p1.personId = 10000;
		System.out.println(p1.personId);
		System.out.println(p2.personId);

		System.out.println("hashcode of P1: " + p1.hashCode());
		System.out.println("hashcode of P2: " + p2.hashCode());

	}

}
