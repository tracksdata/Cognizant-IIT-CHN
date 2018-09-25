package com.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;

import com.examples.model.Employee;
import com.examples.model.Gender;

public class Ex2 {

	public static void main(String[] args) throws IOException {

		PrintWriter writer = new PrintWriter("filename.txt");

		Consumer<String> fileLogger = writer::println;
		Consumer<String> consoleLoger = System.out::println;

		String message = "started...";

//		fileLogger.accept(message);
//		consoleLoger.accept(message);

		Consumer<String> consumer = consoleLoger.andThen(fileLogger);
		consumer.accept(message);
		
		
		//--------------------------------------
		
		Function<Employee,String> getName=Employee::getName;
		Function<String,Character> getFirstLetter=name->name.charAt(0);
		Function<Employee, Character> initial=getName.andThen(getFirstLetter);
		
		System.out.println(initial.apply(new Employee(234234, "Nag", 1000.00, 12, Gender.MALE)));
		
		
		//------------------------------------------
		
		Comparator<Employee> byName=Comparator.comparing(Employee::getName);
		Comparator<Employee> bySalary=Comparator.comparing(Employee::getSalary);
		Comparator<Employee> byNameAndSalary=byName.thenComparing(bySalary);
		
		
		Employee employee1=new Employee(1212, "Nag", 1000.00, 12, Gender.MALE);
		Employee employee2=new Employee(1212, "Nag", 3000.00, 1, Gender.MALE);
				
	
		System.out.println(byNameAndSalary.compare(employee1, employee2));

	}
}
