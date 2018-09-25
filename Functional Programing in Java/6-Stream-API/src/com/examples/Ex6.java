package com.examples;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.examples.model.Employee;

public class Ex6 {

	public static void main(String[] args) {

		List<Employee> employees = Employee.randomlyGenerate(100);

		employees.stream()
		.distinct()
		.forEach(e -> System.out.println(e));

		// ----------------------------------------------

		IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
		intStream.mapToObj(n -> n * n).forEach(System.out::println);

		// ----------------------------------------------

		String menu1 = "idly,dosa,vada";
		String menu2 = "biryani,meals";

		Stream<String> stream = Stream.of(menu1, menu2);
		stream.flatMap(menu -> Stream.of(menu.split(","))).forEach(item -> System.out.println(item));

		// ----------------------------------------------
		
		employees
		.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.limit(10)
		.forEach(System.out::println);
		

	}

}
