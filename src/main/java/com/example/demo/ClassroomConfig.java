package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort( @Qualifier("instructors")Instructors t, @Qualifier("students")Students s){
        return new Classroom(s,t);
    }

    @Bean
    public Classroom previousCohort(@Qualifier("instructors") Instructors t, @Qualifier("previousStudents") Students s){
        return new Classroom(s,t);
    }

}