package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee(10, "Praveen Reddy S", 8463834);
		Employee emp1 = new Employee(11, "Bucky Wall", 454545);
		Employee emp2 = new Employee(10);

		Scanner sc = new Scanner("");
		Scanner sc1 = new Scanner(System.in);
		
		Display.disp("Praveen");
		Display.disp("Abc","Xyz");
		Display.disp("A","86484","jdfhdjf");
		
		
		

		// emp.setEmpId(10);
		// emp.setEmpName("Praveen");
		// emp.setSalary(343844);

		// emp1.setEmpId(11);
		// emp1.setEmpName("Ozvitha");
		// emp1.setSalary(83463864);

		/*
		 * System.out.println("Emp Id: "+emp.getEmpId());
		 * System.out.println("Name: "+emp.getEmpName());
		 * System.out.println("Salary: "+emp.getSalary());
		 */
		//Employee.display(emp);
		//Employee.display(emp1);

	}

}
