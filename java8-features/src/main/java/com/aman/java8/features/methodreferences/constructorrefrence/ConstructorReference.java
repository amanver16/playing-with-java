package com.aman.java8.features.methodreferences.constructorrefrence;

/**
 * Constructor reference is used to refer a constructor using simplified version
 * of lambda expression. In the below example the hello object is calling
 * sayHello() which is refrenced to constructor using the constructor refrence.
 * To refer a constructor the class name followed by :: delimeter and new
 * keyword is used
 */
public class ConstructorReference {

    public ConstructorReference(String name) {
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {

        // Constructor reference
        Hello hello = ConstructorReference::new;
        hello.sayHello("Aman");

    }

}