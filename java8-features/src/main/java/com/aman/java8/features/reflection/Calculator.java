package com.aman.java8.features.reflection;

/**
 * We will use reflection to know the details about this class such as class
 * name, methods name, method parameters etc at run time. For getting the
 * parameters information, this class must be compiled with -parameters compiler
 * option.
 */
public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

}