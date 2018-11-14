package com.aman.java8.features.lambda.noparameter;

public class NoParameterLambdaExpression {

    public static void main(String[] args) {

        // Lambda expression with no parameters
        Hello hello = () -> {
            System.out.println("Hello world !!!");
        };

        hello.sayHello();

    }

}