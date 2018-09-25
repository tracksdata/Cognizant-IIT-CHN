package com.jessitron.fp4j.original;

abstract class MonthByMonthQuantity implements QuantityOfInterest {

    private final double[] values;

    protected MonthByMonthQuantity(final double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(final int time) {
        return values[time - 1];
    }
}
