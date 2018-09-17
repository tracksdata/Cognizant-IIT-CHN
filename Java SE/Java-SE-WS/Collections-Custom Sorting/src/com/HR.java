package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortBySalary implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}

	

}

class SortByDob implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getDob().compareTo(emp2.getDob());
	}
	
}

public class HR {

	public static void main(String[] args) throws ParseException {

		Employee e1 = new Employee(130, "Kbcd", 838847, Employee.setDate(20, 02, 2018));
		Employee e2 = new Employee(120, "Lbvg", 454555, Employee.setDate(20, 04, 2018));
		Employee e3 = new Employee(199, "Bkjh", 533555, Employee.setDate(20, 02, 2017));
		Employee e4 = new Employee(100, "Dfff", 354545, Employee.setDate(12, 12, 2015));
		Employee e5 = new Employee(188, "Aeva", 545455, Employee.setDate(11, 12, 2015));

		List<Employee> emps = new ArrayList<>();

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		System.out.println(" Actuval data");
		Employee.disolay_V1(emps);

		System.out.println("-- On EmpId");
		Collections.sort(emps);
		Employee.disolay_V1(emps);

		System.out.println("-- On EMpName");
		Collections.sort(emps, new Employee());
		Employee.disolay_V1(emps);
		
		System.out.println("-- On Salary");
		Collections.sort(emps, new SortBySalary());
		Employee.disolay_V1(emps);
		
		System.out.println("-- On DOB");
		Collections.sort(emps, new SortByDob());
		Employee.disolay_V1(emps);
		

	}

}
