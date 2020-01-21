package com.demo;

public class Person {

    private String last_name;
    private String First_Name;


    public Person(String last_name, String First_Name) {
        this.last_name = last_name;
        this.First_Name = First_Name;

    }

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_name() {
        return last_name;
    }

}
