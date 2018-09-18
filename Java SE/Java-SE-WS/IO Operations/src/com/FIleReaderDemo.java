package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FIleReaderDemo {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			File file = new File("src/xyz.txt");
			fr = new FileReader(file);

			for (int i = 0; i < file.length(); i++) {
				System.out.print((char) fr.read());
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
