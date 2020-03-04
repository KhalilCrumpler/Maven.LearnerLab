package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testInstance() {
        //given
        Student khalil = new Student();
        Student khaliah = new Student();
        Students allStudents = Students.getInstance();

        //when
        allStudents.add(khalil);
        allStudents.add(khaliah);

        //then
        Assert.assertTrue(allStudents.contains(khalil));
        Assert.assertTrue(allStudents.contains(khaliah));
    }
}
