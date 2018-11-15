package com.aman.java8.features.fucntionalinterface.fourthexample;

public interface NonFuctionalHello {

    default void hello(String message) {
        System.out.println(message);
    }

}