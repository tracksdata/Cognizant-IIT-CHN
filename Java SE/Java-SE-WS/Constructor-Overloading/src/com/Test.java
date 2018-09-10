package com;

public class Test {
	
	public static void main(String[] args) {
		
		A a=(A) C.getObject(new C());
		B b=(B) C.getObject(new Use());
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
	}

	
	

}
