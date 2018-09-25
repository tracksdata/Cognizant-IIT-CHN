package com;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Reduce_Ex {

	public static void main(String[] args) {

		// reduce ==> summarization

		IntStream intStream = IntStream.range(1, 11);

//		int total = intStream.reduce(45, (acc, next) -> {
//			System.out.println(acc);
//			System.out.println(next);
//			return acc + next;
//		});
//		System.out.println(total);
//		
		DoubleStream doubleStream = DoubleStream.of(12.12, 23.0, 13.0);
		DoubleSummaryStatistics sta = doubleStream.summaryStatistics();
		System.out.println(sta.getCount());
		System.out.println(sta.getSum());
		System.out.println(sta.getMax());
		System.out.println(sta.getMin());

	}

}
