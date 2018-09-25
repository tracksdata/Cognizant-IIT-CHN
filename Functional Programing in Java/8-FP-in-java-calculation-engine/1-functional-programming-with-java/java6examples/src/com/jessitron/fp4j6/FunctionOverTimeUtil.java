package com.jessitron.fp4j6;

public class FunctionOverTimeUtil {

    public static FunctionOverTime monthByMonth(final double[] array) {
       return new FunctionOverTime() {
           @Override
           public Double valueAt(final Integer time) {
               return array[time - 1];
           }
       };
    }

    public static FunctionOverTime constant(final double value) {
        return polynomial(new double[] { value });
    }

    public static FunctionOverTime line(final double intercept, final double slope) {
        return polynomial(new double[] { intercept, slope });
    }

    public static FunctionOverTime polynomial(final double[] coefficients) {
        return new FunctionOverTime() {
            @Override
            public Double valueAt(final Integer time) {
               double sum = 0.0;
               for(int i = 0; i < coefficients.length; i++) {
                   sum += coefficients[i] * Math.pow(time, i);
               }
               return sum;
            }
        };
    }

    public static interface FunctionOf3 {
        public double apply(Double a, Double b, Double c);
    }

    static FunctionOverTime of3(final QuantityOfInterest a, final QuantityOfInterest b, final QuantityOfInterest c, final FunctionOf3 combination) {
        return new FunctionOverTime() {
            @Override
            public Double valueAt(Integer time) {
                return combination.apply(a.valueAt(time), b.valueAt(time), c.valueAt(time));
            }
        };
    }
}
