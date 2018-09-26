package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedDemo {

	public static void main(String[] args) {

		try {

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.194.128:1521:orcl", "scott",
					"tiger");

			String q1 = null;
			q1 = "insert into t1 values(?)";

			PreparedStatement ps = con.prepareStatement(q1);

			long st = System.currentTimeMillis();

			for (int i = 1; i <= 8000; i++) {
				ps.setInt(1, i);
				ps.executeUpdate();
			}

			long et = System.currentTimeMillis();

			System.out.println("PS: Total Time: " + (et - st));

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}
	}

}
