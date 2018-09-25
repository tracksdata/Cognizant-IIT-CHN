package com.app;

import java.util.List;

import com.app.lib.StreamLib;
import com.app.model.Employee;
import com.app.model.Product;

public class App {

	public static void main(String[] args) {

		// what to do ?

		List<Employee> employees = Employee.randomlyGenerate(100);
		List<Employee> filteredList=
				StreamLib.filter(employees, e->e.getSalary()>1000);
		List<String> empNameList=
				StreamLib.map(filteredList, Employee::getName);
		empNameList=StreamLib.sort(empNameList, (e1,e2)->e2.compareTo(e1));
		StreamLib.forEach(empNameList, name->System.out.println(name));
		

	}
}
