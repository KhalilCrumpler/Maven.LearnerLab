package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    public List<Person> personList;

    public People(){
        this.personList = new ArrayList<Person>();
    }

    public void add(Person person){
        this.personList.add(person);
    }

    public Person findById(long id){
        for(Person a : this.personList){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        for(Person a : this.personList){
            if(a.equals(person)){
                return true;
            }
        }
        return false;
    }
}
