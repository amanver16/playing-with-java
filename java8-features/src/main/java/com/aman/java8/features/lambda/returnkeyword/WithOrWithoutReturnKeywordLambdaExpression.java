package com.aman.java8.features.lambda.returnkeyword;

public class WithOrWithoutReturnKeywordLambdaExpression {

    public static void main(String[] args) {

        // Lambda expression without return keyword
        Number number = (int a, int b) -> (a + b);
        System.out.println("Sum = " + number.add(50, 50));

        // Lambda expression without return keyword
        Number num = (a, b) -> {
            return a + b;
        };
        System.out.println("Sum = " + num.add(50, 50));

    }

}