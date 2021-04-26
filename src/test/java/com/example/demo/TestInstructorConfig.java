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
@ContextConfiguration(classes=InstructorsConfig.class)
public class TestInstructorConfig {


    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors usaTeachers;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors ukTeachers;

    @Autowired
    @Qualifier("instructors")
    private Instructors teachers;

    @Test
    public void testUsaTeachers(){
        String expected = usaTeachers.toString();
        System.out.println(expected);
        String actual="My name is Captain america and my ID is 21\n" +
                "My name is Steve Rogers and my ID is 22\n" +
                "My name is Bucky and my ID is 23\n" +
                "My name is Falcon and my ID is 24\n" +
                "My name is Another American superhero and my ID is 25\n";
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testUkTeachers(){
        String expected = ukTeachers.toString();
        String actual="My name is James Bond and my ID is 21\n" +
                "My name is Austin Powers and my ID is 22\n" +
                "My name is The Kingsmen and my ID is 23\n" +
                "My name is You get it, british things and my ID is 24\n" +
                "My name is God save the queen and my ID is 25\n";
        System.out.println(expected);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testCurrentTeachers(){
        String expected = teachers.toString();
        String actual="My name is Chris Nobles and my ID is 21\n" +
                "My name is Kris Younger and my ID is 22\n" +
                "My name is Dan Stabb and my ID is 23\n" +
                "My name is Dolio Durant and my ID is 24\n" +
                "My name is Desa Burton and my ID is 25\n";
        System.out.println(expected);
        Assert.assertEquals(expected,actual);
    }



}
/*Create a TestInstructorConfig class in the test package.
The class should ensure that each Bean in the TestInstructorConfig
class is configured as expected.*/