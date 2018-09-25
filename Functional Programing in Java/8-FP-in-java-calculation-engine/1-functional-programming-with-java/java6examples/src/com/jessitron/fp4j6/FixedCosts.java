package com.jessitron.fp4j6;

public class FixedCosts implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public FixedCosts(final FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "fixed costs";
    }

    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
