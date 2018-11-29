package com.aman.java8.features.lambda.scope;

/**
 * We can refer any final variable using lambda expression. The compiler throws
 * error, if final variable used in lambda expression assigned second time.
 */
public class FinalKeywordLambdaExpression {

    private static final String greetingMessage = "Hello";

    public static void main(String[] args) {

        Hello hello = name -> {
            System.out.println(greetingMessage + " " + name);
        };

        hello.sayHello("Aman");
    }

}