package com.util;

import java.util.function.Function;

public class Timer {
	
	public static <S, T> T timeIt(Function<S, T> fun, S arg) {
		long start = System.nanoTime();
		T result = fun.apply(arg);
		long stop = System.nanoTime();
		System.out.println("Time: " + (stop - start) / 1000000.0 + " msec");
		return result;
	}


}
