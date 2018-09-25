package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Util {
	public static String replaceVegWithNonVeg(String item) {
		if (item.equals("nveg"))
			return "veg";
		else
			return item;
	}
}

public class Ex9 {

	public static void main(String[] args) {

		// #1

		List<String> list = new ArrayList<>();
		list.add("veg");
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("veg");
		list.add("nveg");
		list.add("veg");
		list.add("nveg");

		// way-1
		list.replaceAll(item -> {
			if (item.equals("nveg"))
				return "veg";
			else
				return item;
		});

		// way-2
		UnaryOperator<String> operator1 = item -> {
			if (item.equals("nveg"))
				return "veg";
			else
				return item;
		};
		list.replaceAll(operator1);

		// way-3
		UnaryOperator<String> operator2 = item -> Util.replaceVegWithNonVeg(item);
		list.replaceAll(operator2);

		// way-4
		UnaryOperator<String> operator = Util::replaceVegWithNonVeg;
		list.replaceAll(operator);

		// way-5
		list.replaceAll(Util::replaceVegWithNonVeg);

		System.out.println(list);

		/// -------------------------------------------------------------

		UnaryOperator<Integer> unaryOperator = x -> x + 10;
		BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
		Function<Integer, Double> function = x -> x + 10.00;
		Predicate<Integer> predicate=x->true;
		Supplier<String> supplier=()->"biryani";
		Consumer<String> consumer=(s)->System.out.println(s);
		
		//--------------------------------------------------------------

	}

}
