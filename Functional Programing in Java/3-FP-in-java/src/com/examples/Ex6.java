package com.examples;

import java.util.function.Consumer;

// capturing values into lambda

class Xyz {

	static int staVar = 100; // class scope
	int insVar; // instance scope

	public Xyz(int insVar) {
		this.insVar = insVar;
	}

	public void someMethod() {

		int local = 300 * insVar; // local scope
		Consumer<String> consumer = str -> {
			System.out.println("im " + str);
			System.out.println(staVar);
			System.out.println(insVar);
			System.out.println(local);
		};

		consumer.accept("CONSUMER");

	}
}

public class Ex6 {

	public static void main(String[] args) {

		Xyz xyz1 = new Xyz(201);
		xyz1.someMethod();

		Xyz xyz2 = new Xyz(202);
		xyz2.someMethod();

	}

}
