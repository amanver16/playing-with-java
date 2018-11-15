package com.aman.java8.features.fucntionalinterface.fourthexample;

public class NonFunctionalInterfaceExample implements Hello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        NonFunctionalInterfaceExample nonFunctionalInterface = new NonFunctionalInterfaceExample();
        nonFunctionalInterface.sayHello("Aman");
        nonFunctionalInterface.hello("Hello World.");
    }

}