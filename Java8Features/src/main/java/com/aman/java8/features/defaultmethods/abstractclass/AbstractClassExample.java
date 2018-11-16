package com.aman.java8.features.defaultmethods.abstractclass;

/**
 * An abstract class is same as Java interface. The difference is abstract class
 * can have constructor and interfaces cannot.
 */
public abstract class AbstractClassExample {

    // Constructor
    public AbstractClassExample() {
        System.out.println("Hello. This is abstract class.");
    }

    // Abstract method
    public abstract void sayHello(String message);

    // Non-abstract method without default keyword
    public void hello() {
        System.out.println("Hello. This is non abstract method without default keyword.");
    }

    // Static non-abstract method
    public static void helloAgain() {
        System.out.println("Hello. This is static non-abstract method.");
    }

}