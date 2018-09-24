package com;

public class NumTest {

	public static void main(String[] args) {

		NumberTest n1 = new NumberTest() {

			@Override
			public boolean testNumber(int x, int y) {
				// TODO Auto-generated method stub
				return x > y;
			}

		};
		NumberTest n2 = new NumberTest() {

			@Override
			public boolean testNumber(int x, int y) {
				// TODO Auto-generated method stub
				return x == y;
			}

		};

		NumberTest nt = (x, y) -> x > y ? true : false;
		NumberTest ne = (x, y) -> x == y ? true : false;

		System.out.println(nt.testNumber(200, 20000));
		System.out.println(ne.testNumber(1000, 100));

	}

}
