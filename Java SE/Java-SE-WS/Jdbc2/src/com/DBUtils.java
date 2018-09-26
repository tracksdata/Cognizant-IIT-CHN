package com;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

	private static Connection con = null;

	public static Connection getConnection() {

		if (con == null) {
			try {
				FileInputStream fis = new FileInputStream("src/db.properties");
				Properties props = new Properties();
				props.load(fis);

				Class.forName(props.getProperty("oracle.driver"));
				con = DriverManager.getConnection(props.getProperty("url"), props.getProperty("user"),
						props.getProperty("pwd"));

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
