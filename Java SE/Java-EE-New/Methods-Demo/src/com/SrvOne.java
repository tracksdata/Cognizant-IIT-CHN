package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	

public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("--- do Post");
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	
	out.println("<h1>SrvOne Servlet</h1>");
	
	out.println("<h1>First Line SrvOne Servlet</h1>");

	
	String s1=request.getParameter("name");
	String s2=request.getParameter("addr");
	


	out.println("<h1>Name: "+s1+"</h1>");
	out.println("<h1>Addfress: "+s2+"</h1>");

	
	
	
}

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	System.out.println("-- doGet");
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	
	out.println("<h1>SrvOne Servlet</h1>");
	
	out.println("<h1>First Line SrvOne Servlet</h1>");

	
	String s1=request.getParameter("name");
	String s2=request.getParameter("addr");
	


	out.println("<h1>Name: "+s1+"</h1>");
	out.println("<h1>Addfress: "+s2+"</h1>");

	
	
	
}
public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("-- Service--");
	response.setContentType("text/html");
	
	PrintWriter out=response.getWriter();
	
	out.println("<h1>SrvOne Servlet</h1>");
	
	out.println("<h1>First Line SrvOne Servlet</h1>");

	
	String s1=request.getParameter("name");
	String s2=request.getParameter("addr");
	


	out.println("<h1>Name: "+s1+"</h1>");
	out.println("<h1>Addfress: "+s2+"</h1>");

	
	
	
}


}
