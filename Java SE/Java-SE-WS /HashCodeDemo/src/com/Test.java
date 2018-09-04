package com;

class Employee{
	int id;
	String name;
	float avg;
	double sal;
	
	
}

public class Test {
	
	public static void main(String[] args) {
		
		String s1=new String("Test"); // Simple
		String s2=new String("Test");
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();// Complex
		System.out.println(s1);
		
		if(s1=="bla") {  // assert
			
		}
		
		System.out.println("hashcode of S1: "+s1.hashCode());
		System.out.println("hashcode of S2: "+s2.hashCode());
		
		System.out.println("V1: S1: "+System.identityHashCode(s1));
		System.out.println("V2: S2: "+System.identityHashCode(s2));
		
		
		System.out.println("hahscoe of Emp1: "+emp1.hashCode());
		System.out.println("hahscoe of Emp2: "+emp2.hashCode());
		System.out.println("V1: EMp1: "+System.identityHashCode(emp1));
		System.out.println("V2: EMp2: "+System.identityHashCode(emp2));
		
		System.out.println(emp2.toString());
		
		
		
		
	}

}
