package com.aman.java8.features.lambda.multiparameter;

public class MultipleParameterWithDatatypeLambdaExpression {

    public static void main(String[] args) {

        // Multiple parameter lambda expression with datatype
        Number number = (int a, int b) -> (a + b);
        System.out.println("Sum = " + number.add(50, 50));

    }

}