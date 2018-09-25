package com.jessitron.fp4j.original;

abstract class PolynomialQuantity implements QuantityOfInterest {

    private final double[] coefficients;

    protected PolynomialQuantity(final double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public double valueAt(final int time) {
        double value = 0.0;
        for(int i = 0; i < coefficients.length; i++) {
            value += coefficients[i] * Math.pow(time, i);
        }
        return value;
    }
}
