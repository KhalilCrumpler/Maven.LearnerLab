package io.zipcoder.interfaces;

import java.util.concurrent.atomic.AtomicInteger;

public class Person {
    private final long id;
    private String name;
    private static int counter = 0;
    private static final AtomicInteger count = new AtomicInteger(0);

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

   public Person(){
        this.id = counter++ - 2;
        this.name = "";
   }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
