package com;

import java.io.File;
import java.util.Scanner;

public class Test {

	final static int x;
	int i;

	void f1() {
		System.out.println("static method: X is " + x);
	}

	Test() {
		System.out.println("--- constructors");
		// x=1000;
		// x=23;
	}

	{
		System.out.println("-- instance block");
		// x=7777;
	}

	static {
		System.out.println("-- sttaic block");
		int yy = 0;
		Scanner sc = null;
		try {
			File f = new File("src/test123.txt");
			sc = new Scanner(f);

		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(sc!=null)
			x = sc.nextInt();
			else {
				x=0;
			}
		}
	

		// code to load data from any input source

	}

	public static void main(String[] args) {
		System.out.println("-- main  X=  " + x);

		int xx;
		{
			int ii;
			System.out.println("--- block 1");
		}

		{
			// System.out.println(ii);
			System.out.println("--- block 2");
		}

		Test t = new Test();
		System.out.println("-- After obj");

	}

}
