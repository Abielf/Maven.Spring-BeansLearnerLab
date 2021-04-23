package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class TestStudentConfig {

    @Test
    public void testBean1(){
        StudentConfig j=new StudentConfig();
        Iterator<Student> test=j.currentStudents().iterator();
        while(test.hasNext()){
            System.out.println(test.next().getName());
        }
    }

    @Test
    public void testBean2(){
        StudentConfig j=new StudentConfig();
        Iterator<Student> test=j.previousStudents().iterator();
        while(test.hasNext()){
            System.out.println(test.next().getName());
        }
    }
}
/*
Create a TestStudentConfig class in the test package.
The class should ensure that each Bean in the StudentConfig class is configured as expected.

Tip: You can use the toString method to get a representation of the aggregate
state of any People object.
*/