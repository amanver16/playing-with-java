package com.aman.java8.features.lambda.multiparameter;

public class MultipleParameterLambdaExpression {

    public static void main(String[] args) {

        // Multiple parameter lambda expression
        Hello hello = (firstName, lastName) -> {
            System.out.println("Hello " + firstName + " " + lastName);
        };

        hello.sayHello("Aman", "Verma");

     

    }

}