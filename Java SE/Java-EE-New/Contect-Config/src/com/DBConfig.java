package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBConfig extends HttpServlet {
	public DBConfig() {
		System.out.println("---- DbConfig Object is created");
	}

	public void init() throws ServletException {
		System.out.println("--- DbConfig init method is called");
	}

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("--- DbConfig server method is called");
	}

}
