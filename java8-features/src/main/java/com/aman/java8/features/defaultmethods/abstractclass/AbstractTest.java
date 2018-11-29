package com.aman.java8.features.defaultmethods.abstractclass;

public class AbstractTest extends AbstractClassExample {

    @Override
    public void sayHello(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        AbstractTest abstractTest = new AbstractTest();

        // Calling abstract method
        abstractTest.sayHello("Hello. This is abstract method.");

        // Calling non-abstract method
        abstractTest.hello();

        // Calling static method
        AbstractClassExample.helloAgain();

    }

}