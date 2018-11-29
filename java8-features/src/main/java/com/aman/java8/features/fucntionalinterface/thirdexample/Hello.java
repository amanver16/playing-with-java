package com.aman.java8.features.fucntionalinterface.thirdexample;

/**
 * A functional interface can extend another interface if and only if it does
 * not have any method. If it has any method and extends interface with at least
 * one method, then it is invalid functional interface. If it does not has any
 * method then it must extend another interface with only one abstract method in
 * order to be a fucntional interface
 */
@FunctionalInterface
public interface Hello extends HelloTwo {

    // Compile time error: Hello is not a functional interface
    // public void sayHello(String name);


}