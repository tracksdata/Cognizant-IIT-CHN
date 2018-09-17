package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HR2 {

	Set<Employee2> emps = new HashSet<>();

	public void addEmployee(Employee2 emp) {
		System.out.println("--- Hashcode: " + emp.hashCode());
		emps.add(emp);
	}

	public static void main(String[] args) throws ParseException {

		Employee2 e1 = new Employee2(130, "Abcd", 838847, Employee.setDate(20, 02, 2018));
		Employee2 e2 = new Employee2(130, "Abvg", 454555, Employee.setDate(20, 04, 2018));
		Employee2 e3 = new Employee2(123, "Lkjh", 343555, Employee.setDate(20, 02, 2017));
		Employee2 e4 = new Employee2(132, "Mfff", 354545, Employee.setDate(12, 12, 2015));
		Employee2 e5 = new Employee2(190, "Deva", 545455, Employee.setDate(15, 07, 1987));

		HR2 h = new HR2();

		h.addEmployee(e1);
		h.addEmployee(e2);
		h.addEmployee(e3);
		h.addEmployee(e4);
		h.addEmployee(e5);

		System.out.println("Total Elements added: " + h.emps.size());
		System.out.println("-- DOne ");
		// Employee.disolay_V1(emps);

	}

}
