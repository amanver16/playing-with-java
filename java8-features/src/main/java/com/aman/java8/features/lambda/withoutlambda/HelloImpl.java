package com.aman.java8.features.lambda.withoutlambda;

// Implementing hello interface without using lambda expression using anonymous class.
public class HelloImpl {

    public static void main(String[] args) {
        
        // Compiler detects a class so it makes another .class file
        Hello hello = new Hello(){
        
            @Override
            public void sayHello() {
                System.out.println("Hello world.");
            }
        };

        hello.sayHello();

    }

}