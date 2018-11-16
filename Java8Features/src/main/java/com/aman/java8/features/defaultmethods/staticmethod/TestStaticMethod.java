package com.aman.java8.features.defaultmethods.staticmethod;

public class TestStaticMethod implements StaticMethodExample {

    @Override
    public void hello(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {

        TestStaticMethod testStaticMethod = new TestStaticMethod();

        // Calling abstract method
        testStaticMethod.hello("Hello. This is abstract method.");

        // Calling default method
        testStaticMethod.sayHello();

        // Calling static method
        StaticMethodExample.helloThere("Hello. This is static method.");

    }

}