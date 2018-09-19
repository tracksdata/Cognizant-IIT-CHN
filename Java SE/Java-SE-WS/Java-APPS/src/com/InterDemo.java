package com;

public class InterDemo {
	public static void main(String[] args) {
		
		MyInter obj=new C1();
		obj.f1();
		
		MyInter mi=new MyInter() {
			
			@Override
			public void f1() {
				System.out.println("--- f1");
				
			}
		};
		
		mi.f1();
		
		
	}

}
