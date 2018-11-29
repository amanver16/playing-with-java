package com.aman.java8.features.defaultmethods.defaultmethod;

public class Test implements DefualtMethodExample {

    @Override
    public void hello(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        Test test = new Test();

        // Calling default method
        test.sayHello();

        // Calling abstract method
        test.hello("Hello. This is abstract method.");

    }

}