package com.aman.java8.features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Upendra", 22, "Chennai"));
        personList.add(new Person("Aman", 23, "Chennai"));
        personList.add(new Person("Pradeep", 22, "Chennai"));
        personList.add(new Person("Vishal", 24, "Chennai"));
        personList.add(new Person("Deepak", 24, "Chennai"));

        // Filter collection without stream
        List<Person> filteredWithoutStream = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() == 24) {
                filteredWithoutStream.add(person);
            }
        }

        // Displaying filtered persons of age 24
        for (Person person : filteredWithoutStream) {
            System.out.println(person.getName() + " is of age " + person.getAge());
        }

        // Filter persons of age 24 using stream
        // filter() : Filters data based on given Predicate
        // map() : Fetches filtered date data
        // collect() : Collects fetched data and transfers to a collection
        // We can collect data into any collection
        List<String> filteredWithStream = personList.stream().filter(person -> person.getAge() == 22)
                .map(person -> (person.getName())).collect(Collectors.toList());

        // Displaying filetered data
        filteredWithStream.forEach(person -> System.out.println(person));

        // Iterate stream
        Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(10)
                .forEach(System.out::println);

        // Iterate and filter
        personList.stream().filter(person -> person.getAge() == 22)
                .forEach(person -> System.out.println(person.getName() + " is of age " + person.getAge()));

        // reduce() takes sequence of input elements and combines them in single summary
        // result by repeated operation
        int totalAge = personList.stream().map(person -> person.getAge()).reduce(0, (sum, age) -> (sum + age));
        System.out.println("Total Age: " + totalAge);

        // Using predefined method reference in above code
        totalAge = personList.stream().map(person -> person.getAge()).reduce(0, Integer::sum);
        System.out.println("Total Age: " + totalAge);

        // Sum using Collectors class method
        // summingInt() takes mapper and sums up the fetched values
        totalAge = personList.stream().collect(Collectors.summingInt(person -> person.getAge()));
        System.out.println("Total Age: " + totalAge);

        // Get person with maximum age
        // Max() take comparator object and returns the maximum value according to
        // comparator
        Person maxAgedPerson = personList.stream()
                .max((Person personOne, Person personTwo) -> personOne.getAge() > personTwo.getAge() ? 1 : -1).get();
        System.out.println(maxAgedPerson.getName() + " has maximum age " + maxAgedPerson.getAge());

        // Get person with minimum age
        // Max() take comparator object and returns the maximum value according to
        // comparator
        Person minAgedPerson = personList.stream()
                .min((Person personOne, Person personTwo) -> personOne.getAge() < personTwo.getAge() ? -1 : 1).get();
        System.out.println(minAgedPerson.getName() + " has minimum age " + minAgedPerson.getAge());

        // Count number of persons
        long count = personList.stream().count();
        System.out.println("Total number of person : " + count);

        // We can use metho reference also
        personList.stream().map(Person::getAge).forEach(personAge -> System.out.println("Age : " + personAge));

    }

}