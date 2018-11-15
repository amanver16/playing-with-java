package com.aman.java8.features.fucntionalinterface.secondexample;

/**
 * A functional interface can have object class methods.
 */
@FunctionalInterface
public interface Hello {

    // Abstract method
    public void sayHello(String name);

    // Object class methods

    int hashCode();

    String toString();

    boolean equals(Object object);

}