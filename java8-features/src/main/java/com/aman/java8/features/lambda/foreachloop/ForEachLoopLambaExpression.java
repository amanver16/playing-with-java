package com.aman.java8.features.lambda.foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopLambaExpression {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>();

        nameList.add("Aman");
        nameList.add("Vertigo");
        nameList.add("Mintu");
        nameList.add("Upendra");
        nameList.add("Bittu");

        // Lambda expression using for each loop
        nameList.forEach(name -> System.out.println(name));

    }

}