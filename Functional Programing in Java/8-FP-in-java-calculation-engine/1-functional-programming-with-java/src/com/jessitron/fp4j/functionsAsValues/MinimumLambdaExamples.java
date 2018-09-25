package com.jessitron.fp4j.functionsAsValues;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class MinimumLambdaExamples {

    public static void main(final String[] args) {

        IntToDoubleFunction incrementalCosts = time -> 5.1 + 0.15 * time;

        Function<String, Integer> wordCount = (String s) -> s.split(" ").length;

        BiFunction<String, Integer, Boolean> exceedsMaxLength = (s, maxLength) -> {
            int actualLength = s.length();
            return actualLength > maxLength;
        };
    }

}
