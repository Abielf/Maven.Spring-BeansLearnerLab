package com.example.demo;

public class Student extends Person implements Learner{
    private double totalStudyTime=0;

    public Student(long i, String n, double h){
        super(i, n);
    }

    public void learn(double hours){totalStudyTime+=hours;}
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
