package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("instructors") Instructors t, @Qualifier("students")Students s){
        return new Classroom(s,t);
    }

    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(@Qualifier("instructors")Instructors t, @Qualifier("previousStudents") Students s){
        return new Classroom(s,t);
    }
}
/*The class should define a bean named currentCohort() which returns a Classroom object
whose dependencies are instructors and students
The class should define a bean named previousCohort() which returns an Classroom object
whose dependencies are instructors and previousStudents
Note: it is sometimes useful (although not always necessary) to use the @DependsOn
annotation to help the Spring framework and other readers of the code to understand what order beans should be executed.
@DependsOn({"instructors", "students"})*/