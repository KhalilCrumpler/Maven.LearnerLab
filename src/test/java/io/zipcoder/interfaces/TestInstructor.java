package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor khalil = new Instructor();
        boolean actual = khalil instanceof Teacher;
        Assert.assertTrue(actual);
    }
    @Test
    public void testInheritance(){
        Instructor khalil = new Instructor();
        boolean actual = khalil instanceof Person;
        Assert.assertTrue(actual);
    }
    @Test
    public void testTeach(){
        //given
        Instructor khalil = new Instructor();
        Student khaliah = new Student();
        double expected = 25;

        //when
        khalil.teach(khaliah, 25);

        //then
        Assert.assertEquals(expected, khaliah.getTotalStudyTime(), 0.01d);
    }
    @Test
    public void testLecture(){
        //given
        Instructor khalil = new Instructor();
        Student khaliah = new Student();
        Student john = new Student();
        Student[] newArray = {khaliah, john};
        double numberOfHours = 10;
        //when
        khalil.lecture(newArray, numberOfHours);
        double expected = 5;
        double khaliahActual = khaliah.getTotalStudyTime();
        double johnActual = john.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, khaliahActual, 0.01d);
        Assert.assertEquals(expected, johnActual, 0.01d);
    }
}
