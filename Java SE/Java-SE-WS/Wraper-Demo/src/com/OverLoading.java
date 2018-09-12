package com;

class Test {

	void f1(Integer i) {
		System.out.println("Integer: " + i);
	}

	void f1(int i) {
		System.out.println("int: " + i);
	}

	void f1(Byte i) {
		System.out.println("Byte: " + i);
	}

	void f1(Short i) {
		System.out.println("Short: " + i);
	}

	void f1(Long i) {
		System.out.println("Long: " + i);
	}

	void f1(long i) {
		System.out.println("long: " + i);
	}

	void f1(Float i) {
		System.out.println("Float: " + i);
	}

	void f1(Double i) {
		System.out.println("Double: " + i);
	}

}

public class OverLoading {

	public static void main(String[] args) {

		Test t = new Test();
		t.f1(98);

	}

}
