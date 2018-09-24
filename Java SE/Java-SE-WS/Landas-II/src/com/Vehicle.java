package com;

public interface Vehicle {

	public String printName(String name);

	// Default Methods

	/*
	 * Two types 1. Default Method 2. static default met5hod
	 */

	default String getMessage(Object obj) {
		return "Good Morning";
	}

	default void printData() {
		System.out.println("--- Vehicle int5erface Default method");

	}

	static void f1() {
	}

	static void f2() {
		System.out.println("-- static method of f2");

	}

	

}
