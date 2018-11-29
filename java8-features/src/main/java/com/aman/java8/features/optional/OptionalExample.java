package com.aman.java8.features.optional;

import java.util.Optional;

/**
 * Optional is a public final class and used to deal with NullPointerException
 * in Java application. It provides methods which are used to check the presence
 * of value for particular variable.
 */
public class OptionalExample {

    public static void main(String[] args) {

        String str = null;

        // Without optional
        // The application will throw null pointer exception
        // System.out.println("Lower case string " + str.toLowerCase());

        // With Optional
        Optional<String> nullableString = Optional.ofNullable(str);
        // Check value is present or not
        if (nullableString.isPresent()) {
            System.out.println("Lower case string " + str.toLowerCase());
        } else {
            System.out.println("String is null.");
        }

        str = "AMAN";
        Optional<String> nullableStr = Optional.ofNullable(str);
        if (nullableStr.isPresent()) {
            System.out.println("Lower case string : " + str.toLowerCase());
        } else {
            System.out.println("String is null.");
        }

        // Print value using method reference
        nullableStr.ifPresent(System.out::println);
        // Gets the value from nullable string
        System.out.println("Value : " + nullableStr.get());
        // Returns hashcode of the optional
        System.out.println("Hash Code: " + nullableStr.hashCode());
        // Returns true if present, otherwise false
        System.out.println("Is Present : " + nullableStr.isPresent());
        // Returns empty optional if null, otherwise non-empty optional
        System.out.println("Optional Value : " + Optional.ofNullable(str));

        // Return empty instance of Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional Instance : " + emptyOptional);
        // Returns non empty instance of optional
        Optional<String> nonEmptyOptional = Optional.of(str);
        System.out.println("Non-Empty Optional Instance : " + nonEmptyOptional);
        // Filter value from non-empty optional
        // Returns empty optional if empty
        System.out.println("Filtered Value : " + nonEmptyOptional.filter(filterString -> filterString.equals("AMAN")));

    }

}