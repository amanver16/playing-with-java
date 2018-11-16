package com.aman.java8.features.stringjoiner;

import java.util.StringJoiner;

/**
 * StringJoiner is used to construct a sequence of characters separated by a
 * delimiter. Now, you can create string by passing delimiters like comma(,),
 * hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
 */
public class StringJoinerExample {

    public static void main(String[] args) {

        // Separates strings with comma
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Aman");
        stringJoiner.add("Upendra");
        System.out.println(stringJoiner);

        System.out.println();

        // Joins string and separate them with comma
        // Applies square brackets as suffix and prefix
        StringJoiner stringJoinerWithSuffixPrefix = new StringJoiner(",", "[", "]");
        stringJoinerWithSuffixPrefix.add("Aman");
        stringJoinerWithSuffixPrefix.add("Upendra");
        System.out.println(stringJoinerWithSuffixPrefix);

        System.out.println();

        StringJoiner stringJoinForMerge = new StringJoiner(":", "[", "]");
        stringJoinForMerge.add("Vishal");
        stringJoinForMerge.add("Pradeep");
        // Merges two string joiner using the delimeter of first string joiner
        stringJoinForMerge.merge(stringJoinerWithSuffixPrefix);
        System.out.println(stringJoinForMerge);

        System.out.println();

        StringJoiner emptyStringJoiner = new StringJoiner(",");
        // Prints nothing beacuse it is empty
        System.out.println(emptyStringJoiner);
        // Sets default empty value
        emptyStringJoiner.setEmptyValue("Default Empty Value");
        // Prints default empty value
        System.out.println(emptyStringJoiner);

        System.out.println();

        // Gets length of the string
        int stringLength = stringJoinForMerge.length();
        System.out.println("Length : " + stringLength);

        System.out.println();

        // Converts String Joiner to String
        String str = stringJoinForMerge.toString();
        System.out.println(str.charAt(10));

    }

}