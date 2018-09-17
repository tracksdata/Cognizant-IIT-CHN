package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class HR {
	ArrayList<Employee> emps = new ArrayList<>();

	public void addEmployee(Employee emp) {
		System.out.println("--- Hashcode: " + emp.hashCode());

		if (emps.size() == 0) {
			emps.add(emp);
			System.out.println("-- Added  " + emp.getEmpId());

		} else {
			if (emps.contains(emp)) {
				System.out.println("Duplicate " + emp.getEmpId() + " Not Added");
			} else {
				emps.add(emp);
				System.out.println("-- Added  " + emp.getEmpId());
			}
		}

	}

	public static void main(String[] args) throws ParseException {

		Employee e1 = new Employee(130, "Abcd", 838847, Employee.setDate(20, 02, 2018));
		Employee e2 = new Employee(130, "Abcd", 454555, Employee.setDate(20, 04, 2018));
		Employee e3 = new Employee(123, "Lkjh", 343555, Employee.setDate(20, 02, 2017));
		Employee e4 = new Employee(132, "Mfff", 354545, Employee.setDate(12, 12, 2015));
		Employee e5 = new Employee(123, "Deva", 545455, Employee.setDate(15, 07, 1987));

		HR h = new HR();

		h.addEmployee(e1);
		h.addEmployee(e2);
		h.addEmployee(e3);
		h.addEmployee(e4);
		h.addEmployee(e5);

		System.out.println("Total Elements added: " + h.emps.size());
		System.out.println("-- DOne ");

		// Employee.disolay_V1();

	}

}
