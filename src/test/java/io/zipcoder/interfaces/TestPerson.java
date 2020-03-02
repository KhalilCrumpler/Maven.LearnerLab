package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        Person khalil = new Person(1,"Khalil");
        String expected = "Khalil";
        long intExpected = 1;
        //when
        String actual = khalil.getName();
        long actual2 = khalil.getId();
        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(intExpected, actual2);
    }
    @Test
}
