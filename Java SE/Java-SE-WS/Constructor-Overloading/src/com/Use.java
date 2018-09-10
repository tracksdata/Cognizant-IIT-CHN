package com;

class C1 {
	public C1() {
		// TODO Auto-generated constructor stub
	}

	public C1(int x) {
		System.out.println("--- C1 X= " + x);
	}

}

class C2 extends C1 {

	public C2() {
	
	}

	public C2(int x) {
		super(111);
		System.out.println("--- C2 X= " + x);
	}

}

public class Use {

	public static void main(String[] args) {

		C2 c2 = new C2(100);

	}

}
