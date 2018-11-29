package com.aman.java8.features.fucntionalinterface.secondexample;

public class ObjectClassFunctionalInterface implements Hello {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        ObjectClassFunctionalInterface objectClassFunctionalInterface = new ObjectClassFunctionalInterface();
        objectClassFunctionalInterface.sayHello("Aman");
    }

}