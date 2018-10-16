package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import com.employee.service.EmployeeServiceImpl;
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empName=request.getParameter("empName");
		int empId=Integer.parseInt(request.getParameter("empId"));
		double salary=Double.parseDouble(request.getParameter("salary"));
		
		Employee emp=new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);
		
		EmployeeService empService=new EmployeeServiceImpl();
		empService.saveEmployee(emp);
		
		
		
	}

}
