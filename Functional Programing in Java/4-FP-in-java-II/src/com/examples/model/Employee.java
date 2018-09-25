package com.examples.model;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private int exp;
	private Gender gender;

	public Employee(int id, String name, double salary, int exp, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", exp=" + exp + ", gender=" + gender
				+ "]";
	}



	private static Random rand = new Random();
	public static List<Employee> randomlyGenerate(int n) {
		return Stream.generate(() -> {
			int rn=rand.nextInt(100);
			String name = "ibm-employee-"+rn;
			return new Employee(rn,name,rn*1000.00,rn+1,Gender.MALE);
		}).limit(n).collect(Collectors.toList());
	}

}
