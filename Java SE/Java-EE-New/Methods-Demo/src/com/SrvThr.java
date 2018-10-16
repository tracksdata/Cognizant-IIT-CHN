package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvThr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<h1>SrvThr Servlet</h1>");
		out.println("<h1>First Line SrvThr Servlet</h1>");
		
		
		out.println("<h1>Name : "+request.getAttribute("name"));
		out.println("<h1>Address : "+request.getAttribute("addr"));
		
		out.println("<h1>Last Line SrvThr Servlet</h1>");
		
		
		
	}

}
