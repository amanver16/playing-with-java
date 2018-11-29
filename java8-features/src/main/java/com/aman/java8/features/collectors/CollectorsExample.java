package com.aman.java8.features.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Collectors is a final class that extends Object class. It provides reduction
 * operations, such as accumulating elements into collections, summarizing
 * elements according to various criteria, etc.
 */
public class CollectorsExample {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Upendra", 22, "Chennai"));
        personList.add(new Person("Aman", 23, "Chennai"));
        personList.add(new Person("Pradeep", 22, "Chennai"));
        personList.add(new Person("Vishal", 24, "Chennai"));
        personList.add(new Person("Deepak", 24, "Chennai"));

        // Fetching and collecting filetered data as list
        List<String> nameList = personList.stream().map(person -> person.getName()).collect(Collectors.toList());
        nameList.forEach(System.out::println);

        // Converting to set
        // A set has no duplicate values
        Set<Integer> ageSet = personList.stream().map(person -> person.getAge()).collect(Collectors.toSet());
        ageSet.forEach(System.out::println);

        // Summing ages
        int totalAge = personList.stream().collect(Collectors.summingInt(person -> person.getAge()));
        System.out.println("Total Age : " + totalAge);

        // Averaging age
        double averageAge = personList.stream().collect(Collectors.averagingInt(person -> person.getAge()));
        System.out.println("Average Age : " + averageAge);

        // Counting elements
        long personCount = personList.stream().collect(Collectors.counting());
        System.out.println("Total Count : " + personCount);

    }

}