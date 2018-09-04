package com;

public class Employee {

	/*
	 * int =0 float 0.0 double 0.0 String null char blank_space boolean false
	 * 
	 */

	private int empId;
	private String empName;
	// int age;
	private double salary;

	public Employee(int empId, String empName, double salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Employee(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {

		return empId;
	}

	public void setEmpId(int empId) {

		this.empId = empId;

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		// Computations

		return salary;
	}

	public void setSalary(double salary) {

		// User verification code

		this.salary = salary;
	}

	public static void display(Employee emp) {
		System.out.println("EMpId: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());

	}

}
