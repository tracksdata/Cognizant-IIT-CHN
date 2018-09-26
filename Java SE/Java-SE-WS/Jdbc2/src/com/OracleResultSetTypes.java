package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleResultSetTypes {

	public static void main(String[] args) {

		Connection con = DBUtils.getConnection("oracle");
		try {

			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			String qry = "select * from product";

			ResultSet rs = stmt.executeQuery(qry);
			rs.absolute(3);
			//rs.updateString(2, "Apple Laptop");
			

		//	while (rs.next()) {
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Name: " + rs.getString("name"));
				System.out.println("Price: " + rs.getFloat("price"));
				System.out.println("---------------------------");

	//	}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

	}

}
