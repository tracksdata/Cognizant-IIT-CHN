package com.examples;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

// Method Reference ( MR )

class Food {
	String name;

	public Food(String name) {
		this.name = name;
	}
}

class FoodLib {
	public static String getFood() {
		// ............
		return "curd price";
	}

	public static String getFood(double pay) {
		// ............
		return "biryanni" + "- " + "drink";
	}

	public static String getFood(double pay, double tips) {
		// ............
		return "biryanni" + "- " + " beer ";
	}
}

public class Ex8 {

	public static void main(String[] args) {

		// static method reference
		// -----------------------------------------

		// Supplier<Thread> threadSupplier = () -> Thread.currentThread(); // LE

		// or

		Supplier<Thread> threadSupplier = Thread::currentThread; // LE
		Thread thread = threadSupplier.get();

// 		Supplier<String> foodSupllier = () -> FriendLib.getFood();
//		Supplier<String> foosSupplier = () -> "curd rice";
//		Supplier<String> foosSupplier = () -> FoodLib.getFood();
		Supplier<String> foosSupplier = FoodLib::getFood;
		System.out.println(foosSupplier.get());

		Function<Double, String> function = FoodLib::getFood;
		System.out.println(function.apply(221.00));

		BiFunction<Double, Double, String> biFunction = FoodLib::getFood;

//		-----------------------------------------
		// instance method reference

		// a. specified instance
		String str = "ibm"; // instance
		// Supplier<Integer> supplier=()->str.length();
		// or
		Supplier<Integer> supplier = str::length;
		System.out.println(supplier.get());

		// b. unsepcified instance

		Function<String, Integer> func = String::length;
		System.out.println(func.apply("ibm"));
		System.out.println(func.apply("chennai"));

//		-----------------------------------------

		// to invoke constructor

		Function<String, Food> sup = s -> new Food(s);
		//
		Function<String, Food> sup2 = Food::new;

	}

}
