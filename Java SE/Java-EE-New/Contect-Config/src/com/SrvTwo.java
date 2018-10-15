package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>welcome to SrvTwo</h1>");
		
		ServletContext application=getServletContext();
		ServletConfig config=getServletConfig();
		
		out.println("<h1>Welcome dear "+application.getAttribute("user"));
		out.println("<h1>Company: "+application.getInitParameter("cname"));
		out.println("<h1>City: "+application.getInitParameter("city"));

		
		out.println("<h1>Employee Id: "+config.getInitParameter("eid"));
		out.println("<h1>Employee Name: "+config.getInitParameter("ename"));
		
		
		
	}
}
