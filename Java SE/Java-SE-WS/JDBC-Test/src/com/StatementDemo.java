package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.194.128:1521:orcl", "scott",
					"tiger");
			Statement stmt = con.createStatement();

			String q1 = null;

			long st = System.currentTimeMillis();

			for (int i = 1; i <= 8000; i++) {
				q1 = "insert into t1 values(" + i + ")";
				stmt.executeUpdate(q1);
			}

			long et = System.currentTimeMillis();

			System.out.println("Stmt: Total Time: " + (et - st));

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}
	}

}
