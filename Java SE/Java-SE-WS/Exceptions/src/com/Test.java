package com;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		boolean status = true;
		while (status == true) {
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("Enter a Number: ");
				int num = sc.nextInt();
				System.out.println("Number is " + num);
				status = false;
			} catch (Exception e) {
				System.out.println("Invalid Input. try again");
			} finally {


			}

		} // end of while loop

		System.out.println("--- Last Line");
	}// end of main

}
