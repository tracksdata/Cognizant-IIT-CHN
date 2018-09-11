package com;

class Bank {
	int i = 100;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("-- Bank Object is Garbage Collected " + this.hashCode());
	}

}

public class GarbageCollection {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		Bank b2 = new Bank();
		Bank b3 = new Bank();
	
		// b1 = null; // eligible for GC
		// b2 = null;

		System.out.println("hashcode of b1: " + System.identityHashCode(b1));
		System.out.println("hashcode of b2: " + System.identityHashCode(b2));
		System.out.println("hashcode of b3: " + System.identityHashCode(b3));

		// b3=b2=b1;

		System.out.println("---------------------------");
		// b3 = null;

		b2=b1;
		
		//b1 = null;
		//b2 = null;

		System.out.println("hashcode of b1: " + System.identityHashCode(b1));
		System.out.println("hashcode of b2: " + System.identityHashCode(b2));
		System.out.println("hashcode of b3: " + System.identityHashCode(b3));

		// System.out.println("---> " + b3.i);

		System.gc();

		System.out.println("--- Done ---");

	}

}
