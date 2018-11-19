package com.aman.java8.features.typeannotations;

public class RepeatingAnnotationsTest {

    public static void main(String[] args) {

        Person[] persons = RepeatedPerson.class.getAnnotationsByType(Person.class);
        for (Person person : persons) {
            System.out.print(person.name() + " | ");
            System.out.println(person.age());
        }

    }

}