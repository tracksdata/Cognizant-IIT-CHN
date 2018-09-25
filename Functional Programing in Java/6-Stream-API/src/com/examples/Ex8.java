package com.examples;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.examples.model.Employee;
import com.examples.model.Gender;

public class Ex8 {

	public static void main(String[] args) {
		
		

		String menu1 = "idly,dosa,vada";
		String menu2 = "biryani,meals,idly";
		Stream<String> stream = Stream.of(menu1, menu2);
		
		String newString=stream
		.flatMap(menu -> Stream.of(menu.split(",")))
		.collect(Collectors.joining(",", "[", "]"));

		
		stream = Stream.of(menu1, menu2);
		List<String> newList=stream
				.flatMap(menu -> Stream.of(menu.split(",")))
				.map(m->m.toUpperCase())
				.collect(Collectors.toList());
		

		stream = Stream.of(menu1, menu2);
		Set<String> newSet=stream
				.flatMap(menu -> Stream.of(menu.split(",")))
				.map(m->m.toUpperCase())
				.collect(Collectors.toSet());

		
		List<Employee> employees=Employee.randomlyGenerate(100);
		
		Map<Boolean, List<Employee>> map=employees
		.stream()
		.collect(Collectors.partitioningBy(e->e.getSalary()>5000));
		
		
		
		
		OptionalDouble optionalDouble=employees
		.stream()
		.mapToDouble(Employee::getSalary)
		.min();
		
		System.out.println(optionalDouble.getAsDouble());
		
		
	}
}
