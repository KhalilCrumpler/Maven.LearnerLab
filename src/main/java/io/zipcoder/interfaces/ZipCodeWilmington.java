package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ZipCodeWilmington {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    public ZipCodeWilmington(){
        this.students = Students.getInstance();
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        ArrayList<Person> newList = new ArrayList();
        for(Person a : students.personList){
            if(a instanceof Student){
                newList.add(a);
            }
        }
        Learner[] learnerArray = new Learner[newList.size()];
        System.arraycopy(newList, 0 , learnerArray, 0, newList.size());
        teacher.lecture(learnerArray, numberOfHours);
    }
}
