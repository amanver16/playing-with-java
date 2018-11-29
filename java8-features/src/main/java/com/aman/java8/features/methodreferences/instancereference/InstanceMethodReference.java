package com.aman.java8.features.methodreferences.instancereference;

/**
 * Instance method reference is used to refer a non-static method using
 * simplified version of lambda expression. In the below example the hello
 * object is calling sayHello() which is refrenced to hello() using the instance
 * method refrence. To refer a static method the class object name followed by
 * :: delimeter and method name is used
 */
public class InstanceMethodReference {

    private void hello(String name) {
        System.out.println("Hello " + name);
    }

    private void startThread() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {

        // Create instance
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();

        // Instance method reference
        // Uses Hello functional interface
        Hello hello = instanceMethodReference::hello;
        hello.sayHello("Aman");

        // Uses predefined functional interface Runnable
        Thread thread = new Thread(instanceMethodReference::startThread);
        thread.start();

    }

}