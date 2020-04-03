package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    Student khalil = new Student(1l, "Khalil");
    @Test
    public void testImplementation(){
        //given
        Assert.assertTrue(khalil instanceof Student);
    }
    @Test
    public void testInheritance(){
        //given
        boolean expected = khalil instanceof Person;
        Assert.assertTrue(expected);
    }
    @Test
    public void testLearn(){
        //given
        double expectedTime = 8;

        //when
        khalil.learn(8);
        double actual = khalil.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedTime, actual, 0.01d);
    }
}
