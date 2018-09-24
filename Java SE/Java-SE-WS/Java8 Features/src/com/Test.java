package com;

public class Test {

	public static void main(String[] args) {

		MyInter mi = new MyInter() {

			void myF1() {

			}

			@Override
			public void f1() {
				System.out.println("My class f1");
				myF1();

			}

			public void f2() {
				System.out.println("-- Myclass f2");
			}

			@Override
			public void f3() {
				// TODO Auto-generated method stub

			}
		};

		mi.f1();
		mi.f2();
		
		
	}

}
