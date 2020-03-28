package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    Students student = Students.getInstance();
    Instructors instructor = Instructors.getInstance();


    @Test
    public void testAdd(){
        //given
        student.add(new Student(1L, "Khalil"));
        student.add(new Student(2L, "Khaliah"));
        Assert.assertTrue(student.contains(student.findById(1L)));
    }


    @Test
    public void testRemove(){
        //given

    }

    @Test
    public void testFindById(){
        //given

    }
}
