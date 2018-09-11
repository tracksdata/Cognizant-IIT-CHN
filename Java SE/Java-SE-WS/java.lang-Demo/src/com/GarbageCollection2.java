package com;

class Emp {
	static int count = 1;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("-- Bank Object is Garbage Collected " + (count++) + " times with " + this.hashCode());
	}

}

public class GarbageCollection2 {

	public static void main(String[] args) {

		Runtime rt = Runtime.getRuntime();
		System.out.println("Total: " + rt.totalMemory());

		for (int i = 1; i <= 400000; i++) {
			new Emp();
		}

		System.out.println("Memory used: "+(rt.totalMemory()- rt.freeMemory()));
		System.out.println("Free Memory: " + rt.freeMemory());

		 System.gc();

		System.out.println("---- Done ---");
	}

}
