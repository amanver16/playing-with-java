package com.aman.java8.features.methodreferences.staticreference;

/**
 * Static method reference is used to refer a static method using simplified
 * version of lambda expression. In the below example the hello object is
 * calling sayHello() which is refrenced to hello() using the static method
 * refrence. To refer a static method the class name followed by :: delimeter
 * and method name is used
 */
public class StaticMethodReference {

    private static void hello(String name) {
        System.out.println("Hello " + name);
    }

    private static void startThread() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {

        // Static method reference
        // Uses Hello functional interface
        Hello hello = StaticMethodReference::hello;
        hello.sayHello("Aman");

        // Uses predefined functional interface Runnable
        Thread thread = new Thread(StaticMethodReference::startThread);
        thread.start();
    }

}