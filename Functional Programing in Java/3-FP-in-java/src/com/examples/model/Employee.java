package com.examples.model;

public class Employee implements Comparable<Employee> {

	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);
	}

}
