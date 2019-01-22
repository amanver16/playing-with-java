package com.aman.java.convertor;

import com.google.gson.Gson;

public class ConvertToJson {

    public static void main(String[] args) {

        Gson gson = new Gson();
        String json = gson.toJson(new Employee("Aman", "Male", "aman@gmail.com", "4646464646"));
        System.out.println(json);

    }
}
