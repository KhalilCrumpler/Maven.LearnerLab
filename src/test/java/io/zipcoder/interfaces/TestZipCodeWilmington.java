package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestZipCodeWilmington {
    ZipCodeWilmington cohort = ZipCodeWilmington.getInstance();
    Instructors instructor = Instructors.getInstance();
    Students students = Students.getInstance();
    @Test
    public void testHostLecture(){
        Instructor mike = new Instructor(1l, "mike");
        Double expected = 10.0 / students.count();
        cohort.hostLecture(mike, 10);
        LinkedHashMap<Student, Double> map = cohort.getStudyMap();
        for(Map.Entry<Student, Double> a : map.entrySet()){
            Double actual = a.getKey().getTotalStudyTime();
            Assert.assertEquals(expected, actual);
        }

    }


}
