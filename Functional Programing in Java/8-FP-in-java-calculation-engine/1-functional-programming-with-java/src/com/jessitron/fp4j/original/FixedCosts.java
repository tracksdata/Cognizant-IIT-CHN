package com.jessitron.fp4j.original;

public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant) {
        super(new double[] {constant} );
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }
}
