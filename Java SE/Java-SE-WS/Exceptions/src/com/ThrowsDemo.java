package com;

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {

		Class.forName("com.Student");
		File file = new File("d:/test.txt");

		file.createNewFile();

		System.out.println("--- DOne --");

	}

}
