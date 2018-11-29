package com.aman.java8.features.lambda.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterCollectionLambdaExpression {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Upendra", 22, "Chennai"));
        personList.add(new Person("Aman", 23, "Chennai"));
        personList.add(new Person("Pradeep", 22, "Chennai"));
        personList.add(new Person("Vishal", 24, "Chennai"));
        personList.add(new Person("Deepak", 24, "Chennai"));

        // Lambda expression to filter collection person list
        // Filter person whose age is 22
        Stream<Person> filteredPersonStream = personList.stream().filter(person -> person.getAge() == 22);
        filteredPersonStream.forEach(filteredPerson -> System.out.println(filteredPerson.getName()));

    }

}