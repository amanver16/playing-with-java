package com.aman.java8.features.lambda.multistatement;

public class MultipleStatementLambdaExpression {

    public static void main(String[] args) {

        // Lambda expression with multiple statements
        Area area = (length, breadth) -> {
            int rectangleArea = length * breadth;
            return rectangleArea;
        };

        System.out.println("Area of rectangle : " + area.calculateArea(5, 4) + " meter/square.");

    }

}