package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleBatchUpdates {

	public static void main(String[] args) {

		Connection con = DBUtils.getConnection("oracle");

		try {
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();

			String q1 = "insert into product values(50,'Mobile',6655)";
			String q2 = "delete from product where id=1";
			String q3 = "update product set name='wirelrss mouse' where id=4";

			stmt.addBatch(q1);
			stmt.addBatch(q2);
			stmt.addBatch(q3);

			int[] res = stmt.executeBatch();
			boolean flag = true;
			int count = 0;
			for (int x : res) {
				if (x != 0) {
					count++;
				} else {
					flag = false;
				}
			} // end of loop
			if (flag) {
				con.commit();
			} else {
				con.rollback();
			}

			System.out.println(count + " Statements Executed");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtils.closeConnection();
		}

	}

}
