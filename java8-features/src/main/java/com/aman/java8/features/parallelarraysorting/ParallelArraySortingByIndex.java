package com.aman.java8.features.parallelarraysorting;

import java.util.Arrays;

/**
 * We can pass start and end index to the parallelSort() method. The array is
 * sorted from start index to end index only. The method throws
 * IllegalArgumentException if startIndex > endIndex. It throws
 * ArrayIndexOutOfBoundException if startIndex < 0 and endIndex > Array.length
 */
public class ParallelArraySortingByIndex {

    public static void main(String[] args) {

        int[] array = { 10, 5, 1, 4, 2, 9, 7, 6, 8, 3 };

        System.out.println("Array Before Sorting : ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Sort using parallel sorting by start and end index
        Arrays.parallelSort(array, 0, 11);

        System.out.println("Array After Sorting :");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}