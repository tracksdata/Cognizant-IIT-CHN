package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	private int empId;
	private String empName;
	private double salary;
	private Calendar dob;

	@Override
	public int compareTo(Employee emp) {

		return empId - emp.getEmpId();
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double salary, Calendar dob) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.dob = dob;
	}

	public static Calendar setDate(int dd, int mm, int yyyy) {
		Calendar cl = Calendar.getInstance();
		cl.set(yyyy, mm, dd);
		return cl;
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
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Calendar getDob() {
		return dob;
	}

	public void setDob(Calendar dob) {
		this.dob = dob;
	}

	public static void disolay_V1(List<Employee> emps) {
		SimpleDateFormat sdm = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("Emp Id\tName\tSalary\t\tDate of Birth");
		System.out.println("----------------------------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + " \t");
			System.out.print(emp.getEmpName() + " \t");
			System.out.print(emp.getSalary() + " \t");
			System.out.print(sdm.format(emp.getDob().getTime()) + " \t");
			System.out.println();

		}
		System.out.println("----------------------------------------------");
	}

	public static void display(Employee emp) {
		SimpleDateFormat sdm = new SimpleDateFormat("dd/MMM/yyyy");
		System.out.println("Emp Id: " + emp.getEmpId());
		System.out.println("Name: " + emp.getEmpName());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("DOB: " + sdm.format(emp.getDob().getTime()));
		System.out.println("-----------------------------");
	}

}
