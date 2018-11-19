package com.aman.java8.features.typeinference;

import java.util.ArrayList;
import java.util.List;

/**
 * After Java 7 the type declarartion in diamond operator is optional. Java
 * automatically infers the type from the reference variable
 */
public class TypeInference {

    public static void showList(List<String> list) {

        if (!list.isEmpty()) {
            list.forEach(System.out::println);
        } else {
            System.out.println("List is empty !!!");
        }

    }

    public static void main(String[] args) {

        // Prior to Java 7
        List<String> nameList = new ArrayList<String>();
        nameList.add("Aman");
        nameList.add("Upendra");
        showList(nameList);
        System.out.println();

        // After Java 7
        List<String> lastNameList = new ArrayList<>();
        lastNameList.add("Verma");
        lastNameList.add("Kumar");
        showList(lastNameList);
        System.out.println();

        // Genereic Type Inference
        GenericTypeInference<String> genericTypeInference = new GenericTypeInference<>();
        genericTypeInference.setName("Vishal");
        System.out.println("Name : " + genericTypeInference.getName());
        String name = genericTypeInference.genericMethod(new GenericTypeInference<>(), "Aman");
        System.out.println("Name: " + name);

    }

}