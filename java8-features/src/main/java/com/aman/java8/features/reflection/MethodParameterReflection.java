package com.aman.java8.features.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * This class uses reflection to get the information about Calculator class at
 * run time
 */
@SuppressWarnings("rawtypes")
public class MethodParameterReflection {

    public static void main(String[] args) {

        // Create calculator class object
        Calculator calculator = new Calculator();

        // Get class name
        Class className = calculator.getClass();
        System.out.println("Class : " + className.getCanonicalName());

        // Get methods of calculator class
        Method[] methods = className.getDeclaredMethods();

        // Displaying each method and parameters details
        for (Method method : methods) {
            // Returns method name
            System.out.print("Method : " + method.getName() + " |");
            // Get parameters of each method
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                // Datatype of parameter
                System.out.print(" " + parameter.getParameterizedType() + " ");
                // Parameter name
                System.out.print(parameter.getName());
            }
            System.out.println();
        }

    }

}