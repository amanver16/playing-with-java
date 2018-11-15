package com.aman.java8.features.lambda.listsort;

import java.util.ArrayList;
import java.util.List;

/**
 * In Java 8, the list interface directly supports sort() method. So no need to
 * use Collections.sort(). The sort method used here is an example of Higher
 * Order function, which takes the lambda expression of type comparator as an
 * argument
 */
public class ListSortLambdaExpression {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Upendra", 22, "Chennai"));
        personList.add(new Person("Aman", 23, "Chennai"));
        personList.add(new Person("Pradeep", 22, "Chennai"));
        personList.add(new Person("Vishal", 24, "Chennai"));
        personList.add(new Person("Deepak", 24, "Chennai"));

        // Lambda expression to sort the array list
        personList.sort((Person personOne, Person personTwo) -> personOne.getName().compareTo(personTwo.getName()));

        // Print sorted list
        personList.forEach(person -> System.out.println(person.getName()));

    }

}