package com;

class T2 {
	public  void f2() {
		System.out.println("-- Test");
	}
}

class T1 {

	static T2 f1() {
		return new T2();

	}
}

public class Sample {
	
	void test() {}
	public static void main(String[] args) {
		
		T1.f1().f2();

	}
}
