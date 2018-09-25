package com.jessitron.fp4j.typeSafe;

public class Example {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8};

    public static void main(final String[] args) {

        final Sales sales = new Sales(
                FunctionOverTime.monthByMonth(EXPECTED_SALES_JAN_TO_DEC));

        final FixedCosts fixedCosts = new FixedCosts(
                FunctionOverTime.constant(15.0));

        final IncrementalCosts incrementalCosts =
                new IncrementalCosts(
                FunctionOverTime.line(5.1, 0.15));

        final Profit profit =
                new Profit(
                        sales,
                        incrementalCosts,
                        fixedCosts);

        Double totalProfit = 0.0;
        for(int time = 1; time <= 12; time ++) {
            totalProfit += profit.valueAt(time);
        }
    }
}
