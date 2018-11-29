package com.aman.java8.features.defaultmethods.defaultmethod;

/**
 * A functional interface with default method. Default methods have default implementation
 * and tagged with default keyword. We can override default methods and give
 * more precise implementation
 */
@FunctionalInterface
public interface DefualtMethodExample {

    // Abstract method
    public void hello(String message);

    // Default method
    default void sayHello() {
        System.out.println("Hello. This is default method.");
    }

}