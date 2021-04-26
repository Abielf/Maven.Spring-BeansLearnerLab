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
@ContextConfiguration
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom current;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom past;

    @Test
    public void testCurrent() {
        String expected = current.toString();
        String actual = "My name is Chris Nobles and my ID is 21\n" +
                "My name is Kris Younger and my ID is 22\n" +
                "My name is Dan Stabb and my ID is 23\n" +
                "My name is Dolio Durant and my ID is 24\n" +
                "My name is Desa Burton and my ID is 25\n" +
                "My name is Abiel Figueroa and my ID is 1\n" +
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
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPast() {
        String expected = past.toString();
        String actual = "My name is Chris Nobles and my ID is 21\n" +
                "My name is Kris Younger and my ID is 22\n" +
                "My name is Dan Stabb and my ID is 23\n" +
                "My name is Dolio Durant and my ID is 24\n" +
                "My name is Desa Burton and my ID is 25\n" +
                "My name is Evan Hitchings and my ID is 1\n" +
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
        Assert.assertEquals(expected, actual);
    }
}