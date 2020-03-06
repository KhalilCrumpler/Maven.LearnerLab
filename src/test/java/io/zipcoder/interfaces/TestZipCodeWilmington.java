package io.zipcoder.interfaces;

import org.junit.Assert;
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
        ZipCodeWilmington newCohort2 = new ZipCodeWilmington();
        Students newStudents2 = newCohort2.getStudents();
        newStudents2.removeAll();

        //when
        khalil.learn(5);
        khaliah.learn(5);
        kevin.learn(5);
        tom.learn(5);
        newStudents2.add(khalil);
        newStudents2.add(khaliah);
        newStudents2.add(kevin);
        newStudents2.add(tom);
        newCohort2.hostLecture(john, 20);
        double khalilExpected = 10;
        double khaliahExpected = 10;
        double kevinExpected = 10;
        double tomExpected = 10;
        double khalilActual = khalil.getTotalStudyTime();
        //then
        System.out.println(newStudents2.count());
        Assert.assertEquals(khalilExpected, khalilActual, .01d);
    }

    @Test
    public void TestGetHashMap(){
        //given
        Student khalil1 = new Student();
        Student khaliah1 = new Student();
        Student kevin1 = new Student();
        Student tom1 = new Student();
        Instructor john = new Instructor();
        ZipCodeWilmington newCohort = new ZipCodeWilmington();
        Students newStudents = Students.getInstance();
        //when
        khalil1.setName("Khalil");
        khaliah1.setName("Khaliah");
        tom1.setName("Tom");
        kevin1.setName("Kevin");
        khalil1.learn(4);
        khaliah1.learn(6);
        kevin1.learn(7);
        tom1.learn(8);
        newStudents.add(khalil1);
        newStudents.add(khaliah1);
        newStudents.add(kevin1);
        newStudents.add(tom1);
        newCohort.hostLecture(john, 40);
        double khalilExpected = 9;
        double khaliahExpected = 11;
        double kevinExpected = 12;
        double tomExpected = 13;
        newCohort.getStudyMap();
        System.out.println(newCohort.getStudyMap().keySet());
    }
}
