package com.examples;

import java.util.Comparator;
import java.util.function.Predicate;

import com.examples.model.Employee;

public class Ex4 {

	public static void main(String[] args) {

		Predicate<Integer> predicate1 = n -> n > 100;
		Predicate<Integer> predicate2 = n -> n < 500;
		Predicate<Integer> predicate = predicate1.and(predicate2);

		System.out.println(predicate.test(30));

		String s1 = "hello";
		String s2 = "world";

		System.out.println(s1.compareTo(s2));

		Employee employee1 = new Employee("E1");
		Employee employee2 = new Employee("E2");

		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.compareTo(o2);
			}
		};
		
		int diff=comparator.compare(employee1, employee2);
		
		Runnable runnable=()->System.out.println("ill run on any thread");

	}

}
