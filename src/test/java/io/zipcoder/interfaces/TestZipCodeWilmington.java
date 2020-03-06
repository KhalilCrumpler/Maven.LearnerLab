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
        ZipCodeWilmington newCohort = new ZipCodeWilmington();
        Students newStudents = Students.getInstance();

        //when
        khalil.learn(4);
        khaliah.learn(6);
        kevin.learn(7);
        tom.learn(8);
        newStudents.add(khalil);
        newStudents.add(khaliah);
        newStudents.add(kevin);
        newStudents.add(tom);
        newCohort.hostLecture(john, 20);
        double khalilExpected = 9;
        double khaliahExpected = 11;
        double kevinExpected = 12;
        double tomExpected = 13;

        double khalilActual = khalil.getTotalStudyTime();
        double khaliahActual = khaliah.getTotalStudyTime();
        double kevinActual = kevin.getTotalStudyTime();
        double tomActual = tom.getTotalStudyTime();
        //then
        Assert.assertEquals(khalilExpected, khalilActual, 0.01d);
        Assert.assertEquals(khaliahExpected, khaliahActual, 0.01d);
        Assert.assertEquals(kevinExpected, kevinActual, 0.01d);
        Assert.assertEquals(tomExpected, tomActual, 0.01d);

    }

    @Test
    public void TestGetHashMap(){
        //given
        Student khalil = new Student();
        Student khaliah = new Student();
        Student kevin = new Student();
        Student tom = new Student();
        Instructor john = new Instructor();
        ZipCodeWilmington newCohort = new ZipCodeWilmington();
        Students newStudents = Students.getInstance();
        //when
        khalil.setName("Khalil");
        khaliah.setName("Khaliah");
        tom.setName("Tom");
        kevin.setName("Kevin");
        khalil.learn(4);
        khaliah.learn(6);
        kevin.learn(7);
        tom.learn(8);
        newStudents.add(khalil);
        newStudents.add(khaliah);
        newStudents.add(kevin);
        newStudents.add(tom);
        newCohort.hostLecture(john, 20);
        double khalilExpected = 9;
        double khaliahExpected = 11;
        double kevinExpected = 12;
        double tomExpected = 13;
        newCohort.getStudyMap();
        System.out.println(newCohort.getStudyMap().keySet());

    }
}
