package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    private List<PersonType> peeples;

    public People(PersonType ...peeps){
        this.peeples= Arrays.asList(peeps);
    }

    public void add(PersonType peep){peeples.add(peep);}
    public void remove(PersonType peep){peeples.remove(peep);}
    public int size(){
        return peeples.size();
    }
    public void clear(){peeples.clear();}

    public void addAll(Iterable<PersonType> thingy){
        thingy.forEach(p -> peeples.add(p));
    }

    public PersonType findById(long id){
        for (PersonType p: peeples){
            if(p.getId()==id){return p;}
        }
        return null;}

    public List<PersonType> findAll(){return peeples;}

    public Iterator<PersonType> iterator() {
        return peeples.listIterator();
    }

    @Override
    public String toString(){
        Iterator<PersonType> group= iterator();
        String rollCall="";
        while(group.hasNext()){rollCall+=group.next().toString();}
        return rollCall;
    }
}
/*

The class should define a method named addAll which adds an Iterable of PersonType
objects to the composite personList.
This method will NOT take an argument of Collection<PersonType>

The class should define a method named findById which makes use of a long id parameter to return a PersonType object with the respective id field.
The class should define a method named findAll which returns the composite personList.*/