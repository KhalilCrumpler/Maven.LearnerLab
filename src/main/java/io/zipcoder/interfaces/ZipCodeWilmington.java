package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors = Instructors.getInstance();
    private HashMap<Student, Double> studyMap = new HashMap();
    public ZipCodeWilmington(){
        this.students = Students.getInstance();
        this.studyMap = new HashMap<Student, Double>();
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        ArrayList<Person> newList = new ArrayList();
        for(Person a : students.personList){
            if(a instanceof Student){
                newList.add(a);
            }
        }
        Learner[] learnerArray = new Learner[newList.size()];
        System.arraycopy(newList.toArray(), 0 , learnerArray, 0, newList.size());
        teacher.lecture(learnerArray, numberOfHours);
    }

    public void hostLecture(int id, double numberOfHours){

    }

    public HashMap<Student, Double> getStudyMap(){
        ArrayList<Person> newList = new ArrayList();
        for(Person a : students.personList) {
            if (a instanceof Student) {
                newList.add(a);
                this.studyMap.put((Student) a, ((Student) a).getTotalStudyTime());
            }
        }
        return this.studyMap;
    }
}


