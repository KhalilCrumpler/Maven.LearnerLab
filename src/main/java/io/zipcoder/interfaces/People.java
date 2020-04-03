package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {
    public List<E> personList;



    public void add(E person){
        this.personList.add(person);
    }

    public E findById(long id){
        for(E a : this.personList){
            if(a.getId() == id){
                return a;
            }
        }
        return null;
    }

    public boolean contains(E person){
        return personList.contains(person);
    }

    public void removePerson(Person person){
        this.personList.remove(person);
    }

    public void removeById(long id){
       E personToRemove = findById(id);
       personList.remove(personToRemove);
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] listToArray();


    public Iterator<E> iterator() {
        return personList.iterator();
    }

    public List<E> getPersonList(){
        return personList;
    }
}
