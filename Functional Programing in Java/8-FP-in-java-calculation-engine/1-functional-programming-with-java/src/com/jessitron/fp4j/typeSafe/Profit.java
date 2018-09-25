package com.jessitron.fp4j.typeSafe;

public class Profit implements QuantityOfInterest {
    private final Sales sales;
    private final IncrementalCosts incrementalCosts;
    private final FixedCosts fixedCosts;

    public Profit(Sales s, IncrementalCosts ic, FixedCosts fc) {
        this.sales = s;
        this.incrementalCosts = ic;
        this.fixedCosts = fc;
    }

    public String getName() {
        return "Profit!!";
    }

    public double valueAt(int time) {
        return sales.valueAt(time) -
                (incrementalCosts.valueAt(time) +
                fixedCosts.valueAt(time));
    }

}
