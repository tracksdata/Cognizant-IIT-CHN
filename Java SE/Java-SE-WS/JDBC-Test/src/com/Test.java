package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		try {
			// Class.forName("oracle.jdbc.driver.OracleDriver");
			// System.out.println("--- Driver Class Loaded");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.194.128:1521:orcl", "scott",
					"tiger");
			// System.out.println("Connected with
			// "+con.getMetaData().getDatabaseProductName());

			String q1 = "insert into product values(2,'Soap',34.54)";
			Statement stmt = con.createStatement();
			int x = stmt.executeUpdate(q1);
			if (x != 0) {
				System.out.println(x + " statement(s) executed");
			} else {
				System.out.println("Some issue");
			}

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}
	}

}
