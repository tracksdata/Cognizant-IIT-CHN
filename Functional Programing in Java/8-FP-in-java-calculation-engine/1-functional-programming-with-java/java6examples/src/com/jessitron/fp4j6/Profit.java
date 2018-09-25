package com.jessitron.fp4j6;

public class Profit implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public Profit(final Sales sales, final FixedCosts fixedCosts, final IncrementalCosts incrementalCosts) {
        this.valueFunction = QuantityCombination.of3(sales, fixedCosts, incrementalCosts, new QuantityCombination.FunctionOf3() {
            @Override
            public double apply(Double s, Double fc, Double ic) {
                return s - fc - ic;
            }
        });
    }

    public String getName() {
        return "profit!!";
    }

    public double valueAt(final int time) {
        return valueFunction.valueAt(time);
    }
}
