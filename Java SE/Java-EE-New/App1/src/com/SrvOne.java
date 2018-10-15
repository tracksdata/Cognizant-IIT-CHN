package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SrvOne
 */
public class SrvOne extends HttpServlet {
	public SrvOne() {
		System.out.println("--- SrvOne Object is Created");
	}

	private static final long serialVersionUID = 1L;


	
		public void init() throws ServletException {
			System.out.println("---- SrvOne init method got called");
		}
		
		
			public void destroy() {
				System.out.println("--- SrvOne Destroy method got called");
			}
	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("--- SrvgOne service method got called");
		
		
		PrintWriter out = response.getWriter();
		String s1=request.getParameter("empName");
		int age=Integer.parseInt(request.getParameter("age"));
		
		out.println("<h1>Welcome Dear "+s1+" and you are "+age+" years old</h1>");

	}

}
