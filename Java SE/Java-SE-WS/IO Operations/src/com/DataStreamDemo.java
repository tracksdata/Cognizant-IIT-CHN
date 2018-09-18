package com;

import java.io.DataOutputStream;

public class DataStreamDemo {

	public static void main(String[] args) {

		try {

			DataOutputStream ofs = new DataOutputStream(System.out);

			String msg = "Hello";
			ofs.write(msg.getBytes());

			System.out.println(" --- DOne ");

		} catch (Exception e) {
			System.out.println("--- Fauled due to " + e);
		}

	}

}
