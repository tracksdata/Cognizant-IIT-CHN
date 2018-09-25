package com.jessitron.fp4j6;

public class IncrementalCosts implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public IncrementalCosts(final FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "incremental costs";
    }

    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
