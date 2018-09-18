package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src/ser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Employee e = (Employee) ois.readObject();

			System.out.println("Employee Id: " + e.getEmpId());
			System.out.println("Name: " + e.getEmpName());
			System.out.println("Info: " + e.getInfo());

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
