package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.println("<h1>SrvTwo Servlet</h1>");

		Cookie[] cookies = request.getCookies();

			
			for (Cookie cookie : cookies) {
			
				if (cookie.getName().equals("aname")) {
				out.println("<h1> Name:  " + cookie.getValue());
				}

				if (cookie.getName().equals("dddr")) {
				out.println("<h1> Addr:  " + cookie.getValue());
				}

			}
			
			out.println("<h1>City : "+request.getAttribute("city"));

	}

}
