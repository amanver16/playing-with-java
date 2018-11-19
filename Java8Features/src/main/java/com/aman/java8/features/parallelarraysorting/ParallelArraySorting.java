package com.aman.java8.features.parallelarraysorting;

import java.util.Arrays;

public class ParallelArraySorting {

    public static void main(String[] args) {

        int[] array = { 10, 5, 1, 4, 2, 9, 7, 6, 8, 3 };

        System.out.println("Array Before Sorting : ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Sort using parallel sorting
        Arrays.parallelSort(array);

        System.out.println("Array After Sorting :");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

}