package com;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("ENter Number");
		int n = sc.nextInt();

		System.out.println("ENter String :");
		sc.nextLine();
		String s1 = sc.nextLine();

		System.out.println("S1: " + s1);
		System.out.println("No: " + n);

	}
}
