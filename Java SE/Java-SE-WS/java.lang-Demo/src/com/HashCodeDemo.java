package com;

class Customer { // Complex by default is mutable
	int id;
	String name = new String(); //

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Customer c2 = (Customer) obj;
		return id == c2.getId() && name.equalsIgnoreCase(c2.getName());
	}

	public Customer(int id) {
		this.id = id;
	}

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class HashCodeDemo {

	public static void main(String[] args) {

		Customer c1 = new Customer(12, "PRAVEEN"); // Mutable
		Customer c2 = new Customer(12, "praveen"); // Mutable

		System.out.println("Hashcode of C1: " + c1.hashCode());
		System.out.println("Hashcode of C2: " + c2.hashCode());

		System.out.println("Identity Hashcode of C1 is " + System.identityHashCode(c1));
		System.out.println("Identity Hashcode of C2 is " + System.identityHashCode(c2));

		System.out.println("C1 Id: " + c1.getId());
		System.out.println("C2 Id: " + c2.getId());

		/*
		 * if (c1 == c2) { // == operator always compares hachcodes
		 * System.out.println("Equals"); } else { System.out.println("Not Equals"); }
		 */

		if (c1.equals(c2)) { // equals method always compares contents only
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
