package com.demo;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterTest;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void test() {

        Person personne = new Person("sadji", "brahim");

        assertEquals("brahim", personne.getFirstName());

    }

}