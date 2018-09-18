package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class DataInputStreamDemo {

	public static void main(String[] args) {

		try {

			// DataInputStream dis = new DataInputStream(System.in);
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			System.out.println("Enter a No: ");
			int x = Integer.parseInt(br.readLine());
			System.out.println("No: " + x);

			System.out.println("Enter a Strig");
			String msg = br.readLine();
			System.out.println("Message: " + msg);

			System.out.println("ENter a character: ");
			char ch = (char) br.read();
			System.out.println("Char: " + ch);

			// int x = dis.readInt();
			// System.out.println("--- X: " + x);
			// int x = isr.read();
			// System.out.println("--- data: " + (char) x);

		} catch (Exception e) {
			System.out.println("--- Failed due to " + e);
		}

	}

}
