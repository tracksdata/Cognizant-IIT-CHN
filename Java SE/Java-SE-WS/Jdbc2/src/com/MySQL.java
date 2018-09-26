package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL {

	public static void main(String[] args) {

		Connection con = DBUtils.getConnection("mysql");
		try {

			
			Statement stmt = con.createStatement();
			String qry = "select id,name from product where id=11";

			ResultSet rs = stmt.executeQuery(qry);

			while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
				// System.out.println("Price: " + rs.getFloat("price"));
				System.out.println("---------------------------");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

	}

}
