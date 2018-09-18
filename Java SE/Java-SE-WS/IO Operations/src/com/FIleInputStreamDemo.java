package com;

import java.io.File;
import java.io.FileInputStream;

public class FIleInputStreamDemo {

	public static void main(String[] args) {
		try {

			File fileLoc = new File("src/abc.txt");

			FileInputStream fis = null;
			if (fileLoc.exists()) {
				fis = new FileInputStream(fileLoc);

			//	for (int i = 0; i < fileLoc.length(); i++) {
				//	System.out.print((char)fis.read());
				//}
				
				int data;
				while(((data=fis.read())!=-1)) {
					System.out.print((char)data);
				}

			} else {
				System.out.println("-- Error");
			}

			//System.out.println("-- Done");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
