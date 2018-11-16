package com.aman.java8.features.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * ForEach() is used to iterate the elements of a collection. It is defined as a
 * defualt method i Iterable and Stream interfaces. The forEach() takes single
 * parameter i.e. functional interface. So we can pass Lambda Expressions and
 * Method References to forEach()
 */
public class ForEachExample {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Aman");
        nameList.add("Upendra");
        nameList.add("Vishal");
        nameList.add("Pradeep");
        nameList.add("Gaurab");

        // Iterate using for each by passing Lambda
        nameList.forEach(name -> System.out.println(name));

        // Passing method reference
        nameList.forEach(System.out::println);

        // Java Stream forEachOrdered()
        nameList.stream().forEachOrdered(name -> System.out.println(name));

        // Passing method reference
        nameList.stream().forEachOrdered(System.out::println);

    }

}