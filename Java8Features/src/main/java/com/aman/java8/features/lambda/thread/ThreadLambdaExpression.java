package com.aman.java8.features.lambda.thread;

public class ThreadLambdaExpression {

    public static void main(String[] args) {

        // Creating thread without lambda expression
        Runnable noLambdaRunnable = new Runnable() {

            @Override
            public void run() {
                System.out.println("No Lambda Thread is running.");
            }
        };

        Thread noLambdaThread = new Thread(noLambdaRunnable);
        noLambdaThread.start();

        // Creating thread using lambda expression
        Runnable lambdaRunnable = () -> {
            System.out.println("Lambda Thread is running.");
        };

        Thread lambdaThread = new Thread(lambdaRunnable);
        lambdaThread.start();

    }

}