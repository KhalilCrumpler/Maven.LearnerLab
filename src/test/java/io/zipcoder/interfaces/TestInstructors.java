package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {
    @Test
    public void testInstruct(){
        //given
        Instructor khalil = new Instructor();
        Instructor khaliah = new Instructor();
        Instructors instructors = Instructors.getInstance();

        //when
        instructors.add(khalil);
        instructors.add(khaliah);

        //then
        Assert.assertTrue(instructors.contains(khalil));
        Assert.assertTrue(instructors.contains(khaliah));
    }
}
