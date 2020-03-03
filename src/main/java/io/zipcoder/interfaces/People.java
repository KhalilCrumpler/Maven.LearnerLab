package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<E> {
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

    public void remove(Person person){
        this.personList.remove(person);
    }

    public void remove(long id){
        for(Person a : this.personList){
            if(a.getId() == id){
                this.personList.remove(a);
            }
        }
    }

    public void removeAll(){
        this.personList.clear();
    }

    public Integer count(){
        return this.personList.size();
    }

    public Object[] toArray(){
        return this.personList.toArray();
    }


    public Iterator<E> iterator() {
        return null;
    }
}
