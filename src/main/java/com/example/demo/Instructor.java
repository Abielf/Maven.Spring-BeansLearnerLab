package com.example.demo;

public class Instructor extends Person implements Teacher {

    public Instructor(long i, String n){
        super(i, n);
    }
    public void teach(Learner learner, double numberOfHours){learner.learn(numberOfHours);}

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours){
        int count =0;
        for (Object i: learners){count++;}
        double numberOfHoursPerLearner = numberOfHours/count;
        learners.forEach(p -> p.learn(numberOfHoursPerLearner));
    }
}