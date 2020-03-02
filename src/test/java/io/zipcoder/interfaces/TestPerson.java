package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        //given
        Person khalil = new Person(1,"Khalil");
        String expected = "Khalil";

        //when
        String actual = khalil.getName();

        //then
        Assert.assertEquals(expected, actual);
    }
}
