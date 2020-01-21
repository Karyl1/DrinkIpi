package com.demo;

public class Person {

    private String lastName;
    private String FirstName;


    public Person(String lastName, String FirstName) {
        this.lastName = lastName;
        this.FirstName = FirstName;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return lastName;
    }

}
