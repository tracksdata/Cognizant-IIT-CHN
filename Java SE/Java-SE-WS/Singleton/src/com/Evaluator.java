package com;

public class Evaluator {

	private static Evaluator evaluator = null;

	private Evaluator() {
		System.out.println("--- Object Created");
	}

	public static Evaluator getEvaluator() {

		if (evaluator == null) {
			evaluator = new Evaluator();
		}

		return evaluator;
	}

}
