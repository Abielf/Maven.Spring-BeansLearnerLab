package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=StudentConfig.class)
public class TestStudentConfig {


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