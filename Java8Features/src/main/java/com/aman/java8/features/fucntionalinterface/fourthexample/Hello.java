package com.aman.java8.features.fucntionalinterface.fourthexample;

/**
 * A functional interface can extend non functional interface. A non fuctional
 * interface should not have any abstract methods
 */
@FunctionalInterface
public interface Hello extends NonFuctionalHello {

    // Abstract method
    public void sayHello(String name);

}