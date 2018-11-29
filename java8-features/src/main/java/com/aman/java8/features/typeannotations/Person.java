package com.aman.java8.features.typeannotations;

import java.lang.annotation.Repeatable;

/**
 * Person is a Repeatable annotation type. It must have a container annotation
 * type with value() element. @Person annotation can be applied multiple times at desired
 * location. @Repeatable is a Meta-Annotation, means it annotates an annotation (@Person)
 */
@Repeatable(Persons.class)
public @interface Person {

    public String name();

    public int age();

}