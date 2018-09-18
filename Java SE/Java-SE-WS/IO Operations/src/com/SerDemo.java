package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("src/ser.txt");
			Employee emp = new Employee();
			emp.setEmpId(100);
			emp.setEmpName("Praveen");
			emp.setInfo("Info about " + emp.getEmpName() + " employee");

			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("--- Writig is done");

		} catch (Exception e) {
			System.out.println("Failed due to  " + e);
		}

	}

}
