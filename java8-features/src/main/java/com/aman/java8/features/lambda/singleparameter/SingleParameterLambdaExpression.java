package com.aman.java8.features.lambda.singleparameter;

public class SingleParameterLambdaExpression {

    public static void main(String[] args) {

        // Single parameter lambda expression
        // Paranthesis around function parameter is optional
        Hello hello = (name) -> {
            System.out.println("Hello " + name);
        };

        hello.sayHello("Aman");

    }

}