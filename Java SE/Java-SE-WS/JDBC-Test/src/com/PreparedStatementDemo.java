package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class PreparedStatementDemo {

	public static void main(String[] args) {

		try {

			// 1
			OracleDriver od = new OracleDriver();
			// 2
			DriverManager.registerDriver(od);

			// Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.194.128:1521:orcl", "scott",
					"tiger");

			int id = 10;
			String name = "Laptop";
			float price = 15676;

			String qry = "insert into product values(?,?,?)";

			PreparedStatement ps = con.prepareStatement(qry);

			ps.setFloat(3, price);
			ps.setInt(1, id);
			ps.setString(2, name);

			int x = ps.executeUpdate();

			if (x != 0) {
				System.out.println(x + " statements executed ");
			}

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}
	}

}
