package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h1>welcome to EmployeeServlet</h1>");
		
		String empName=request.getParameter("empName");
		String salary=request.getParameter("empSalary");
		String gender=request.getParameter("gender");
		String [] hobbies=request.getParameterValues("hobbies");
		String deptName=request.getParameter("deptName");
		
		out.println("<h1>Name: "+empName);
		out.println("<h1>Salary: "+salary);
		out.println("<h1>Gender: "+gender);
		out.println("<h1>Selected Hbbies");
		
		for(String hobby:hobbies) {
			out.println("<h1> "+hobby+"</h1>");
		}
		
		out.println("<h1>Dept name: "+deptName);
		
		
		out.println("<h2><a href='form.html'>Add Another</a>");
	}

}
