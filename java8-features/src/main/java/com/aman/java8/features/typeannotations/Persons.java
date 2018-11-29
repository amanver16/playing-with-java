package com.aman.java8.features.typeannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * This is the container annotation which contains the array of the repeated
 * annotation (@Person). @Retention tells how long the repeated annotation can
 * be retained
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Persons {
    Person[] value();
}