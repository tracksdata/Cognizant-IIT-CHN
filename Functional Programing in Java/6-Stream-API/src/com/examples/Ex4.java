package com.examples;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {

		// Lazy vs Eager

		String s1 = "hello";
		String s2 = "world";

		int hashing = computeHashingV2(s1, s2);
		System.out.println(hashing);
		
		
		
		//---------------------------------------------
		
		
		Stream<Integer> numStream=Stream.of(1,2,2,4,7,3,4,5,6,7,8,9);
		
		numStream
		.filter(n->{
			System.out.println("filtering "+n);
			return n%2!=0;
		})
		.map(n->{
			System.out.println("mapping "+n);
			return n*n;
		})
		.limit(3)
		.forEach(n->{
			System.out.println("sq "+n);
		});
		
		
		

	}

	public static String getApplicationStatus() {
		// long running....
		System.out.println("getting application status");
		return "application-staus " + LocalDateTime.now();
	}

	private static int computeHashing(String s1, String s2) {
		Objects.requireNonNull(s1, "s1 should not be null :" + getApplicationStatus());
		Objects.requireNonNull(s2, "s2 should not be null :" + getApplicationStatus());
		return s1.hashCode() ^ s2.hashCode();
	}

	private static int computeHashingV2(String s1, String s2) {
		Objects.requireNonNull(s1, () -> "s1 should not be null :" + getApplicationStatus());
		Objects.requireNonNull(s2, () -> "s2 should not be null :" + getApplicationStatus());
		return s1.hashCode() ^ s2.hashCode();
	}

}
