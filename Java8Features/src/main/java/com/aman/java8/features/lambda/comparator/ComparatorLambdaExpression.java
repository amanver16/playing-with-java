package com.aman.java8.features.lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExpression {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Upendra", 22, "Chennai"));
        personList.add(new Person("Aman", 23, "Chennai"));
        personList.add(new Person("Pradeep", 22, "Chennai"));
        personList.add(new Person("Vishal", 24, "Chennai"));
        personList.add(new Person("Deepak", 24, "Chennai"));

        // Creating comparator using lambda expression
        // Sorting personList using name
        Comparator<Person> personComparator = (personOne, personTwo) -> {
            return personOne.getName().compareTo(personTwo.getName());
        };

        Collections.sort(personList, personComparator);

        // Displayinjg sorted list
        personList.forEach(person -> System.out.println(person.getName()));

    }

}