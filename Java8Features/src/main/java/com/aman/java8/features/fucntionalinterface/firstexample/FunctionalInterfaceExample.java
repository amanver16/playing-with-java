package com.aman.java8.features.fucntionalinterface.firstexample;

public class FunctionalInterfaceExample implements Hello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample();
        functionalInterfaceExample.sayHello("Aman");
    }

}