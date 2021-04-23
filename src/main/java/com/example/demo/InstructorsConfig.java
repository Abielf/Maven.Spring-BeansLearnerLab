package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){return new Instructors(
            new Instructor(21,"Captain america"),
            new Instructor(22,"Steve Rogers"),
            new Instructor(23, "Bucky"),
            new Instructor(24,"Falcon"),
            new Instructor(25,"Another American superhero")
    );}

    @Bean
    public Instructors tcUkInstructors(){return new Instructors(
            new Instructor(21,"James Bond"),
            new Instructor(22,"Austin Powers"),
            new Instructor(23, "The Kingsmen"),
            new Instructor(24,"You get it, british things"),
            new Instructor(25,"God save the queen")
    );}

    @Bean(name ="instructors")
    @Primary
    public Instructors ZipCodeWilmington(){
        return new Instructors(
                new Instructor(21,"Chris Nobles"),
                new Instructor(22,"Kris Younger"),
                new Instructor(23, "Dan Stabb"),
                new Instructor(24,"Dolio Durant"),
                new Instructor(25,"Desa Burton")
        );
    }
}