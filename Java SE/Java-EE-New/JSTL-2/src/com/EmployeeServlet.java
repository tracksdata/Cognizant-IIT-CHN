package com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee e1=new Employee(10, "Praveen", 3843684);
		Employee e2=new Employee(11, "James", 3435);
		Employee e3=new Employee(12, "Sarah", 564556);
		Employee e4=new Employee(13, "Bucky Wall", 343566);
		Employee e5=new Employee(14, "Ozvitha", 4753979);
		
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		request.setAttribute("employees", emps);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("/display.jsp");
		rd.forward(request, response);
		
		
		
	}

}
