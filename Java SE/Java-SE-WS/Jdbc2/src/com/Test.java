package com;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {

		Connection con = DBUtils.getConnection();
		try {

			System.out.println("Connected to " + con.getMetaData().getDatabaseProductName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

	}

}
