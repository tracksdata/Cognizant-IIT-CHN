package com;

/*
 * Generics
 * -----------
 * 	-> Type safty
 * 
 */
public class GenDemo<E> {

	static int size = 0;
	Object[] objects = new Object[10];

	void add(E element) {
		objects[size] = element;

		size++;
	}

	public void display() {
		for (Object obj : objects) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {

		GenDemo<Object> g = new GenDemo<>();

		g.add(1000);
		g.add("Praveen");
		g.add('A');
		g.add(new Object());

		g.display();
	}

}
