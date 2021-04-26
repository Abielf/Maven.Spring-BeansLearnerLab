package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=StudentConfig.class)

public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentCohort;

    @Autowired
    @Qualifier("previousStudents")
    private Students lastCohort;

    @Test
    public void testCurrentBean(){
    String expected = currentCohort.toString();
    String actual ="My name is Abiel Figueroa and my ID is 1\n" +
            "My name is Ryan Hufford and my ID is 2\n" +
            "My name is Jorge Tapia and my ID is 3\n" +
            "My name is Justin Banks and my ID is 4\n" +
            "My name is Xiong Yuan and my ID is 5\n" +
            "My name is Ashley Smart and my ID is 6\n" +
            "My name is Monali Khandelwal and my ID is 7\n" +
            "My name is Kelly Porter and my ID is 8\n" +
            "My name is Gerg Donnelly and my ID is 9\n" +
            "My name is Theresa Mashura and my ID is 10\n" +
            "My name is Chris Allen and my ID is 11\n" +
            "My name is Mike Ninh and my ID is 12\n" +
            "My name is Hazel Becker and my ID is 13\n" +
            "My name is Lena Litouka and my ID is 14\n";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPreviousBean(){
        String expected = lastCohort.toString();
        System.out.println(expected);
        String actual ="My name is Evan Hitchings and my ID is 1\n" +
                "My name is Jim Coats and my ID is 2\n" +
                "My name is Brian Patterson and my ID is 3\n" +
                "My name is Some guy and my ID is 4\n" +
                "My name is Dan Hibiki and my ID is 5\n" +
                "My name is King Crimson and my ID is 6\n" +
                "My name is Bruce Wayne and my ID is 7\n" +
                "My name is Clark Kent and my ID is 8\n" +
                "My name is Phoenix Wright and my ID is 9\n" +
                "My name is Frank West and my ID is 10\n" +
                "My name is Barry Allen and my ID is 11\n" +
                "My name is Tomothy Tidwell and my ID is 12\n";
        Assert.assertEquals(expected,actual);
    }

}
/*
Each of the following Test classes should be annotated with
@RunWith(SpringRunner.class)
enforces which strategy junit should use to run tests
@SpringBootTest
indicates that this class is a Spring Boot test class
provides support to scan for a ContextConfiguration that tells the test class
how to load the ApplicationContext.
If no ContextConfiguration classes are specified as a parameter to the
@SpringBootTest annotation, the default behavior is to load the ApplicationContext
by scanning for a @SpringBootConfiguration annotation on a class in the package root.
Each bean can be injected into the class scope using @Autowired along with @Qualifier
(name = "beanname")

Create a TestStudentConfig class in the test package.
The class should ensure that each Bean in the StudentConfig class is configured as expected.

Tip: You can use the toString method to get a representation of the aggregate
state of any People object.
*/