package com.aman.java8.features.closures;

import java.util.function.Function;

/**
 * This class shows closures example in Java. A closure remembers the variable
 * and the environment, in which it was created. In Java, closures are
 * implemented using Lambdas.
 */
public class ClosureExample {

    public static Function<Integer, Integer> closure() {

        int a = 10;

        Function<Integer, Integer> function = (t) -> {
            return t * a;
        };

        return function;

    }
}