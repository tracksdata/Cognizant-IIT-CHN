package com;

public class C implements A, B {
	
	

	public static Object getObject(Object obj) {

		if (obj instanceof A) {
			A a = new C();
			return a;

		} else if (obj instanceof B) {
			B b = new C();
			return b;
		} else {
			 throw new ClassCastException();
		}
		// return obj;
	}

}
