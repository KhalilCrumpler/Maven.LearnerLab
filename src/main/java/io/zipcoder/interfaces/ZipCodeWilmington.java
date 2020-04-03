package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE;
    private static Students students;
    private static Instructors instructors;

    static{
        try{
            INSTANCE = new ZipCodeWilmington();
            students = Students.getInstance();
            instructors = Instructors.getInstance();
        } catch(Exception e){
            throw new RuntimeException("error");
        }
    }
    private ZipCodeWilmington(){

    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.listToArray(), numberOfHours);


    }



    public LinkedHashMap<Student, Double> getStudyMap(){
       LinkedHashMap<Student, Double> mapStudyTime = new LinkedHashMap<>();
       for(Person a : students){
           mapStudyTime.put((Student)a, (((Student) a).getTotalStudyTime()));
       }
       return mapStudyTime;
    }


}


