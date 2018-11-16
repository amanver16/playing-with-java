package com.aman.java8.features.defaultmethods.staticmethod;

/**
 * A functional interface with static method. Static methods have static implementation
 * and tagged with static keyword. These methods are usually used in utility
 * implementation.
 */
@FunctionalInterface
public interface StaticMethodExample {

    // Abstract method
    public void hello(String message);

    // Default method
    default void sayHello() {
        System.out.println("Hello. This is default method.");
    }

    // Static method
    public static void helloThere(String message) {
        System.out.println(message);
    }

}