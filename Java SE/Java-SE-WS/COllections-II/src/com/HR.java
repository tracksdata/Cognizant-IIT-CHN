package com;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class HR {

	public static void main(String[] args) throws ParseException {

		Employee e1 = new Employee(130, "Abcd", 838847, Employee.setDate(20, 02, 2018));
		Employee e2 = new Employee(130, "Abvg", 454555, Employee.setDate(20, 04, 2018));
		Employee e3 = new Employee(123, "Lkjh", 343555, Employee.setDate(20, 02, 2017));
		Employee e4 = new Employee(132, "Mfff", 354545, Employee.setDate(12, 12, 2015));
		Employee e5 = new Employee(190, "Deva", 545455, Employee.setDate(15, 07, 1987));

		List<Employee> emps = new ArrayList<>();
		
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		//Employee.display(e1);
		//Employee.display(e2);
		//Employee.display(e3);
		//Employee.display(e4);
		//Employee.display(e5);
		
		Employee.disolay_V1(emps);
		
		
		
		
		
		
	}

}
