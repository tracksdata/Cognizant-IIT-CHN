package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		try {
			File fileLoc = new File("src/abc.txt");

			FileOutputStream fos = new FileOutputStream(fileLoc, true);

			String msg = "65";
			//int x=1000;
			char ch[] = msg.toCharArray();

			// byte data[] = msg.getBytes();
			for (int i = 0; i < ch.length; i++) {
				int data = ch[i];
				fos.write(data);
			}

			//fos.write(x);
			// fos.write(data);
			fos.close();

			System.out.println("-- Done ---");

		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
