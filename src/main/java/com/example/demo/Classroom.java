package com.example.demo;

public class Classroom {
    Students cohort;
    Instructors zipsters;

    public Classroom(Students s, Instructors i){
        this.cohort=s;
        this.zipsters=i;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(cohort, numberOfHours);
    }

    public void hostLectureById(long id, double numberOfHours){
        zipsters.findById(id).lecture(cohort,numberOfHours);
    }

    public Instructors getZipsters() {
        return zipsters;
    }

    public Students getCohort() {
        return cohort;
    }
}
