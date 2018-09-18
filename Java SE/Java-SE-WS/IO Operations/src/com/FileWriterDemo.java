package com;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {

		try {

			FileWriter fw = new FileWriter("src/xyz.txt");
			String msg = "Hello How are you";
			fw.write(msg);
			fw.close();
			System.out.println("-- Done --");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
