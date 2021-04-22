package com.example.demo;

public class Person {
    private final long id;
    private String name;


    public Person(long i, String n){
        this.id=i;
        this.name=n;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}