package com.aman.java8.features.lambda.withlambda;

/**
 * Java provides @FunctionalInterface keyword to denote an interface as
 * Functional Interface. A functional interface is an interface which has
 * exactly one abstract method. This annotation is optional. That means java
 * automatically detects an interface as fuctional interface if it has only one
 * method. So that we can create lambda expression.
 */
@FunctionalInterface
public interface Hello {

    public void sayHello();

}