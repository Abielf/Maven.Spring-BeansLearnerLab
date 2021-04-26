package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {
    Classroom alums;

    @Autowired
    public Alumni(@Qualifier("previousCohort") Classroom c){alums=c;}

    @PostConstruct
    public void executeBootcamp(){alums.hostLectureById(22,1200);}

    public Instructors getTeachers(){return alums.getZipsters();}
    public Students getStudents(){return alums.getCohort();}
}

/*
Create an executeBootcamp method which teaches each Student in the
composite Students a totalNumberOfHours of 1200.
.*/