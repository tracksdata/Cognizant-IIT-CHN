package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession(true);
		
		String s1=request.getParameter("userName");
		String s2=request.getParameter("password");
		
		if(s1.equals("admin") && s2.equals("admin")) {
			session.setAttribute("user", s1);
			response.sendRedirect("Welcome");
		}else {
			response.sendRedirect("login.html");
		}
		
		
	}

}
