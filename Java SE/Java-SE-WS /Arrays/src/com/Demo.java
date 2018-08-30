package com;

class Emp{
	
}
public class Demo {

	public static void main(String[] args) {
	
		int x[]= {100,20,10,12};
		int[] x1= {10,20,30,40};
		int []x2= {10,20,30,40};
		
		int[] y=new int[10];
		Emp[] emps=new Emp[10];
		emps[0]=new Emp();
		int[] iii=new int[] {1,2};
		
		
		
		
		
		// iterating 1 d arrays
		
		// 1. for loop
		// 2. for each loop 
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		System.out.println("------------------");
		for(int i=x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
		
		System.out.println("------------------");
		
		// for each
		
		for(int num:x) {
			System.out.println(num);
		}
		
		
		
		
		

		
		
		
	
		
	}

}
