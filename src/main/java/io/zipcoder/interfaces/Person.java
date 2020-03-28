package io.zipcoder.interfaces;

public class Person {
    private Long id = 0L;
    private String name;



    public Person(Long newId, String name) {
        this.id = newId;
        this.name = name;
    }

   public Person(){
        this.id = 0L;
        this.name = "";
   }
   public Person(String name){
        this.name = name;
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

