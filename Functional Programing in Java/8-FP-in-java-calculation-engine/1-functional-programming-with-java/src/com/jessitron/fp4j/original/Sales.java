package com.jessitron.fp4j.original;

public class Sales extends MonthByMonthQuantity {

    public Sales(final double[] values) {
        super(values);
    }

    @Override
    public String getName() {
        return "Expected Sales";
    }
}
