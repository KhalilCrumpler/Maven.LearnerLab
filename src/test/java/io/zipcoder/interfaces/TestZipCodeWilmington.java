package io.zipcoder.interfaces;

import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testHostLecture(){
        //given
        Student khalil = new Student();
        Student khaliah = new Student();
        Student kevin = new Student();
        Student tom = new Student();
        Instructor john = new Instructor();
        Students students = Students.getInstance();
        ZipCodeWilmington newCohort = new ZipCodeWilmington();

        //when
        khalil.learn(5);
        khaliah.learn(5);
        kevin.learn(5);
        tom.learn(5);
        newCohort.


    }
}
