package com;

public class Test {
	public static void main(String[] args) {

		Evaluator obj1 = Evaluator.getEvaluator();
		Evaluator obj2 = Evaluator.getEvaluator();

		System.out.println("Obj1 Hashcode: " + obj1.hashCode());
		System.out.println("Obj2 Hashcode: " + obj2.hashCode());

	}

}
