package com;

class A {

	static void m1() {

	}

	static {
		System.out.println(" A static ");
		B.m2();
	}

	public static void main(String[] args) {
		System.out.println("A Main method");
	}

}

class B {
	static void m2() {

	}

	static {
		System.out.println(" B static ");
	}
}

class C {
	static {
		System.out.println(" C static ");
	}

	public static void main(String[] args) {
		System.out.println("C Main method");
		A.m1();
		//A.main(args);

	}

}
