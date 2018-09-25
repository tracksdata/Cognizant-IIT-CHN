package com.examples;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class Ex1 {

	public static void main(String[] args) {

		Function<Integer, Double> function = i -> i + 10.0;
		double r=function.apply(10);
		
		
		IntToDoubleFunction intToDoubleFunction=i->i+10.0;
		double d=intToDoubleFunction.applyAsDouble(10);
		
		
		ToIntFunction<String> intFunction=s->s.length();

	}

}
