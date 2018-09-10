package com;

class Test {

	public static Object getObj() {
		Object obj = new C2();
		return obj;

	}

}

class MyClass extends C1 {

}

class C1 {

	public static C1 test() {
		

		C1 c = new C2();
		return c;

	}

}

public class C2 extends C1 {

	public static void main(String[] args) {

		C2 c2 = (C2) Test.getObj();
		System.out.println("----- DOne");

		// MyClass obj = (MyClass) C1.test(); // Wrong
		C2 obj = (C2) C1.test();
		System.out.println("----- Last line");

	}

}
