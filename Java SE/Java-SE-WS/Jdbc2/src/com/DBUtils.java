package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

	private static Connection con = null;

	public static Connection getConnection(String name) {
		String token = null;
		if (name.equals("mysql"))
			token = "1";
		else
			token = "";

		if (con == null) {
			try {
				FileInputStream fis = new FileInputStream("src/db.properties");
				Properties props = new Properties();
				props.load(fis);

				Class.forName(props.getProperty("driver" + token));
				con = DriverManager.getConnection(props.getProperty("url" + token), props.getProperty("user" + token),
						props.getProperty("pwd" + token));

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return con;
	}

	public static void closeConnection() {

		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
