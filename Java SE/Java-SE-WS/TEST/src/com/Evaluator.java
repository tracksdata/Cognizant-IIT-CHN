package com;

public class Evaluator {

	public static Evaluator getEvaluator() {
		return new Evaluator();
	}

	public String evaluate(Paper paper) {
		return "Pass";
	}

}
