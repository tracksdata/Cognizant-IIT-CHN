package com;

public class SBDemo {

	public static void main(String[] args) {

		// String s1="Abc";

		StringBuffer sb = new StringBuffer("Abc");
		System.out.println("SB: " + sb);
		System.out.println("Hashcode of SB: " + sb.hashCode());
		System.out.println("Identity Hash code of SB: " + System.identityHashCode(sb));

		System.out.println("--------------------");
		
		sb.append("Xyz");
		System.out.println("SB: " + sb);
		System.out.println("Hashcode of SB: " + sb.hashCode());
		System.out.println("Identity Hash code of SB: " + System.identityHashCode(sb));
		
		System.out.println("--------------------");
		
		sb.reverse();
		
		System.out.println("SB: " + sb);
		System.out.println("Hashcode of SB: " + sb.hashCode());
		System.out.println("Identity Hash code of SB: " + System.identityHashCode(sb));
		
	}

}
