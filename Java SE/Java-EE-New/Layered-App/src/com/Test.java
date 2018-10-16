package com;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
	
		Employee emp=new Employee();
		emp.setEmpId(112);
		emp.setEmpName("Praveen");
		emp.setSalary(3445433);
		
		EmployeeService empService=new EmployeeServiceImpl();
		empService.saveEmployee(emp);
		

	}

}
