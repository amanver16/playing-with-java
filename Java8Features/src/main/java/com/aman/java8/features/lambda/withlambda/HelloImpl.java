package com.aman.java8.features.lambda.withlambda;

/**
 * Implementing hello interface using lambda expression. A lambda expression
 * provides implementation for functional interface. Which results in less code
 */
public class HelloImpl {

    public static void main(String[] args) {

        // Compiler detects a lambda expression, so it does not create another .class
        // file
        Hello hello = () -> {
            System.out.println("Hello world !!!");
        };

        hello.sayHello();

    }

}