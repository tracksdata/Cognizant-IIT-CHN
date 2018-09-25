package com.examples;

//-----------------------------------------------
interface Greeting {
	void greet();
}

class Greeter {
	public void greet(Greeting greeting) {
		greeting.greet();
	}
}

//-----------------------------------------------

class EnglishGreeting implements Greeting {
	public void greet() {
		System.out.println("hello");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		Greeter greeter = new Greeter();

		// way-1
		EnglishGreeting englishGreeting = new EnglishGreeting();
		greeter.greet(englishGreeting);

		// way-2
		greeter.greet(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Ola..");
			}
		});

		// way-3
		Greeting tn = () -> System.out.println("vanakkam");
		greeter.greet(tn);
		greeter.greet(()->System.out.println("namasthe"));

	}

}
