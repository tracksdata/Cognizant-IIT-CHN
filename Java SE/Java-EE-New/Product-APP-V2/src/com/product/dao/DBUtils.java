package com.product.dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if(con==null) {
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root1234");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	

}
