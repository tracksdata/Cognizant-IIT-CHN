package com.examples;

import java.util.function.Consumer;

// Type Inference  ( Automatic Type detection ) with Lambdas

@FunctionalInterface
interface StringToIntMapper {
	int map(String str);
}

//----------------------------------------------------------------
interface Adder {
	int add(int x, int y);
}

interface Joiner {
	String join(String x, String y);
}

class Lib1 {

	public static void testAdd(Adder adder) {
		int a = 12;
		int b = 13;
		int result = adder.add(a, b);
		System.out.println(result);
	}

	public static void testJoin(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		String s = joiner.join(s1, s2);
		System.out.println(s);
	}

}

class Lib2 {

	public static void test(Adder adder) {
		int a = 12;
		int b = 13;
		int result = adder.add(a, b);
		System.out.println(result);
	}

	public static void test(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		String s = joiner.join(s1, s2);
		System.out.println(s);
	}

}

//----------------------------------------------------------------

public class Ex5 {

	public static Runnable getRunnable() {
		return () -> {
		};
	}

	public static void main(String[] args) {

		// a. R.H.S context

		// StringToIntMapper func = (String s) -> s.length();
		// or
		// StringToIntMapper func = (s) -> s.length();
		// or
		// StringToIntMapper func = s -> s.length();

		// b. parameter context
		// Thread thread = new Thread(() -> {
		// System.out.println("im running in thread");
		// });

		// c. return context
		// Runnable runnable=getRunnable();

		// ------------------------------------

		Lib1.testAdd((x, y) -> x + y);
		Lib1.testJoin((x, y) -> x + y);

		// --------------------------------------

		Lib2.test((int x, int y) -> x + y);
		Lib2.test((String x, String y) -> x + y);

		// --------------------------------------

		Adder adder = (x, y) -> x + y;
		Lib2.test(adder);

		Lib2.test((Joiner) (x, y) -> x + y); // Casting context

		// -----------------------------------------------

		// Standard syntax
		Consumer<String> c1 = msg -> System.out.println(msg.length());
		c1.accept("ibm");

		Consumer<Integer> c2 = i -> System.out.println(i);

		// Compile-time error: not enough info
		// Object x1 = msg -> System.out.println(msg.length());

		// Compile-time error: not enough info
		// Object x2 = (String msg) -> System.out.println(msg.length());

		// OK: cast added
		Consumer<String> c = (String msg) -> System.out.println(msg.length());
		Object o = c;
		if (o instanceof Consumer) {
			Consumer<String> consumer = (Consumer<String>) o;
			consumer.accept("ibm");
		}

		// OK: but inferred parameter type is Object
		Consumer<?> c3 = msg -> System.out.println(msg);

		// Compile-time error: Inference is *not* based on body of lambda
		// Consumer<?> c4 = msg -> System.out.println(msg.length());

		// OK: added manifest type to parameter
		Consumer<?> c4 = (String msg) -> System.out.println(msg.length());

	}

}
