package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.

		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<h1>SrvOne Servlet</h1>");
		
		
		
		
		
		String s1=request.getParameter("name");
		String s2=request.getParameter("addr");
		
		Cookie c1=new Cookie("aname", s1);
		Cookie c2=new Cookie("dddr", s2);
		
		c2.setMaxAge(5000);
		
		response.addCookie(c1);
		response.addCookie(c2);
		

		out.println("<h1>Name: "+s1+"</h1>");
		out.println("<h1>Addfress: "+s2+"</h1>");
	
		// Auto Redirections
		// Two Types
		// 1. sendRedirect
		// 2. forward
		
		 
		request.setAttribute("city", "Chennai"); // page scope 
		// PageContext
	     response.sendRedirect("SrvTwo");
		
		
		
	}

}
