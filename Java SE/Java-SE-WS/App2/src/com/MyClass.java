package com;

public class MyClass {
	public static void main(String[] args) {
		
		int x=10;
		//x=x+10;
		x+=10;
		System.out.println(Long.MAX_VALUE);
		
	//	byte i=1;
	//	i=i+10;
	//	i+=129;
		//System.out.println(i);
		
		
		long a=9223372036854775807L;
		
		float f=76.34f;
		
		char ch='A'; // UNICODE --> ASCII  i18N
		System.out.println("Char: "+Character.SIZE);
		System.out.println("---> "+ch);
		System.out.println("---> "+(int)ch);
		int ii=97;
		System.out.println("---> "+ii);
		System.out.println("---> "+(char)ii);
		
		for(int i=65;i<=90;i++) {
			System.out.println(i+" -> "+(char)i+" ");
		}
		

	}
}
