package com.jessitron.fp4j.functionsAsValues;

public class ExampleFP {

    private static final double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                    58.0, 57.3, 62.0, 60.3, 71.2, 88.8} ;

    public static void main(final String[] args) {

        final FunctionOverTime sales =
                (time) -> EXPECTED_SALES_JAN_TO_DEC[time - 1];

        final FunctionOverTime fixedCosts =
                (time) -> 15.0;

        final FunctionOverTime incrementalCosts =
                (time) -> 5.1 + 0.15 * time;

        final FunctionOverTime profit =
                (time) -> sales.valueAt(time) -
                (fixedCosts.valueAt(time) +
                        incrementalCosts.valueAt(time));

        Double totalProfit = 0.0;
        for(int time = 1; time <= 12; time ++) {
            totalProfit += profit.valueAt(time);
        }

        System.out.println("Projected profit for the year: " + totalProfit);

    }
}
