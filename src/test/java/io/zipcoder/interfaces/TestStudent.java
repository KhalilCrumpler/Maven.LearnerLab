package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    @Test
    public void testImplementation(){
        //given
        Student khalil = new Student();
        boolean expected = khalil instanceof Learner;
        Assert.assertTrue(expected);
    }
    @Test
    public void testInheritance(){
        //given
        Student khalil = new Student();
        boolean expected = khalil instanceof Person;
        Assert.assertTrue(expected);
    }
    @Test
    public void testLearn(){
        //given
        Student khalil = new Student();
        double expectedTime = 8;

        //when
        khalil.learn(8);
        double actual = khalil.getTotalStudyTime();
        //then
        Assert.assertEquals(expectedTime, actual, 0.01d);
    }
}
