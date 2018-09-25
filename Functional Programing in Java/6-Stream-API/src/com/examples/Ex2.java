package com.examples;

import java.util.List;
import java.util.stream.Stream;

import com.examples.model.Employee;

public class Ex2 {

	public static void main(String[] args) {

		List<Employee> employees = Employee.randomlyGenerate(10);

//		Print the names of the employees with salary at least 2500$,
//      alphabetically sorted
		
		employees
		         .stream()          // build
		         .parallel()
		         .filter(e->e.getSalary()>2500) // intermediate
		         //.map(Employee::getName) // intermediate
		         .sorted((e1,e2)->e1.getName().compareTo(e2.getName())) // intermediate
		         .limit(5)
		         .forEach(e->System.out.println(e.getName()+"\t"+e.getSalary()));

	}

}
