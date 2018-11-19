package com.aman.java8.features.typeinference;

public class GenericTypeInference<Name> {

    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String genericMethod(GenericTypeInference<String> genericTypeInference, String name) {
        genericTypeInference.setName(name);
        return genericTypeInference.name;
    }

}