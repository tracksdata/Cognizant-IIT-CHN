package com.jessitron.fp4j6;

public class ExampleJava6 {

    final static double[] EXPECTED_SALES_JAN_TO_DEC =
            new double[] { 42.0, 45.6, 43.6, 50.2, 55.6, 54.7,
                           58.0, 57.3, 62.0, 60.3, 71.2, 88.8} ;

    public static void main(final String[] args) {

        final Sales sales = new Sales(
                FunctionOverTimeUtil.monthByMonth(EXPECTED_SALES_JAN_TO_DEC));

        final FixedCosts fixedCosts = new FixedCosts(
                FunctionOverTimeUtil.constant(15.0));

        final IncrementalCosts incrementalCosts =
                new IncrementalCosts(
                FunctionOverTimeUtil.line(5.1, 0.15));

        final Profit profit =
                new Profit(
                        sales,
                        fixedCosts,
                        incrementalCosts);

        double totalProfit = 0.0;
        for(int time = 1; time <= 12; time ++) {
            totalProfit += profit.valueAt(time);
        }

        System.out.println("Projected profit for the year: " + totalProfit);

    }
}
