package com.jessitron.fp4j6;

public class Sales implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public Sales(final FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "sales";
    }

    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
