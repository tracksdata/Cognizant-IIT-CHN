package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>SrvTwo Servlet</h1>");
		
		String s1=request.getParameter("ename");
		String s2=request.getParameter("address");
	
	
		
		out.println("<h1>Name: "+s1+"</h1>");
		out.println("<h1>Addfress: "+s2+"</h1>");
	
		
		
		
	}

}
