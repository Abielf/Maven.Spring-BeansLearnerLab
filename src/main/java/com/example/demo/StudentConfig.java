package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        return new Students(
                new Student(1,"Abiel Figueroa"),
                new Student(2, "Ryan Hufford"),
                new Student(3, "Jorge Tapia"),
                new Student(4, "Justin Banks"),
                new Student(5, "Xiong Yuan"),
                new Student(6, "Ashley Smart"),
                new Student(7,"Monali Khandelwal"),
                new Student(8,"Kelly Porter"),
                new Student(9,"Gerg Donnelly"),
                new Student(10,"Theresa Mashura"),
                new Student(11,"Chris Allen"),
                new Student(12, "Mike Ninh"),
                new Student(13,"Hazel Becker"),
                new Student(14,"Lena Litouka")
        );
    }

    @Bean
    public Students previousStudents(){
        return new Students(
                new Student(1,"Evan hitchings"),
                new Student(2, "Jim Coats"),
                new Student(3, "Brian Patterson"),
                new Student(4, "Some guy"),
                new Student(5, "Dan Hibiki"),
                new Student(6, "King Crimson"),
                new Student(7,"Bruce Wayne"),
                new Student(8,"Clark Kent"),
                new Student(9,"Phoenix Wright"),
                new Student(10,"Frank West"),
                new Student(11,"Barry Allen"),
                new Student(12, "Tomothy Tidwell")
        );
    }
}