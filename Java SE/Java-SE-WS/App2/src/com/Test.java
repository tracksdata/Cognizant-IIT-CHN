package com;

public class Test {
	
	final static int MAX_VALUE=8777;
	static int y;

	public static Test getObject() {
		return new Test();
	}

	void f1() {
		final int x=90;
		int i=10;
		
		
		
		System.out.println("--- f1 non static method ");
	}

	static void f2() {
		System.out.println("--- f2 static method");
	}

}
