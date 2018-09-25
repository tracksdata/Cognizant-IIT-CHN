package com.jessitron.fp4j.typeSafe;

public class FixedCosts implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public FixedCosts(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "Fixed Costs";
    }

    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
