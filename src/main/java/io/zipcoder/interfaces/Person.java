package io.zipcoder.interfaces;

public class Person {
    private final long id;
    private String name;
    private static int counter = 0;

    public Person(long id, String name) {
        this.id = id;
        this.name = name;
    }

   public Person(){
        counter +=1;
        this.id = counter;
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
