package com;

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Praveen");
		Employee emp2 = new Employee(10, "Praveen");

		if (emp1.equals(emp2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

	}

}
