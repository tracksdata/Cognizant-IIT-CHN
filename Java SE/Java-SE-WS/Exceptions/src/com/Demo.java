package com;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) {

		try {

			File f = new File("");
			f.createNewFile();
			System.out.println("--- First");
			int i[] = new int[2];
			int x = 10;
			int y = x / 10;
			System.out.println("Y= " + y);
			i[0] = 76;

			Class.forName("Student");

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | IOException | ClassNotFoundException ex) {
			System.out.println("Faile due to " + ex);
		}

		System.out.println("-- Last line");

	}

}
