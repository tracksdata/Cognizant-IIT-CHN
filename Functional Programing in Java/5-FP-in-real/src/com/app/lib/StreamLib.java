package com.app.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamLib {
	
	// How to do ?

	// 1. filter
	public static <T> List<T> filter(List<T> in, Predicate<T> predicate) {
		List<T> out = new ArrayList<>();
		for (T t : in) {
			if (predicate.test(t))
				out.add(t);
		}
		return out;
	}

	// 2. map
	public static <T, R> List<R> map(List<T> in, Function<T, R> function) {
		List<R> out = new ArrayList<>();
		for (T t : in) {
			out.add(function.apply(t));
		}
		return out;
	}

	// 3. sort
	public static <T> List<T> sort(List<T> in, Comparator<T> comparator) {
		Collections.sort(in, comparator);
		return in;
	}
	// 4. limit
	

	// 5. forEach
	public static <T> void forEach(List<T> in, Consumer<T> consumer) {
		for (T t : in) {
			consumer.accept(t);
		}
	}

}
