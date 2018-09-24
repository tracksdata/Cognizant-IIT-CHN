package com;

class A {

}

class B extends A {

}

class C extends B {

}

class F extends E {

}

class G extends F {
}

class E extends D {
	void f1() {
		System.out.println("--- E f1");
	}
}

public class D extends C {

	void f1() {
		System.out.println("--- D f1");
	}

	public static void main(String[] args) {

		A a1 = new B();
		A a2 = new C();
		A a3 = new D();
		A a4 = new E();
		A a5 = new D();
		A a6 = new F();

		B b = new C();

		E e2 = (E) (D) a6;

		System.out.println(e2.getClass().getSuperclass().getSuperclass().getSuperclass().getName());

		C c1 = (C) b;

		// C c2 = (C) a3;

		E e1 = (E) a6;
		// B c2 = (B) a6;
		D dd = new E();
		E e = (E) dd;

		e.f1();

		((E) (dd)).f1();
		// e.f1();

		// ((E) new D()).f1();

		System.out.println("--- DOne ");

	}
}
