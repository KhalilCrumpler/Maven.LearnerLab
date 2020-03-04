package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //given
        Person khalil = new Person();
        Person khaliah = new Person();
        Person tom = new Person();
        People newList = new People();

        //when
        newList.personList.add(khalil);
        newList.personList.add(khaliah);
        newList.personList.add(tom);
        Integer expected = 3;
        Integer actual = newList.personList.size();
        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testRemove(){
        //given
        Person khalil = new Person();
        Person khaliah = new Person();
        Person tom = new Person();
        People newList = new People();

        //when
        newList.personList.add(khalil);
        newList.personList.add(khaliah);
        newList.personList.add(tom);
        newList.personList.remove(khaliah);

        //then
        Assert.assertFalse(newList.personList.contains(khaliah));
        Assert.assertTrue(newList.personList.contains(khalil));
    }

    @Test
    public void testFindById(){
        //given
        Person khalil = new Person();
        Person khaliah = new Person();
        Person tom = new Person();
        People newList = new People();
        //when
        newList.personList.add(khalil);
        newList.personList.add(khaliah);
        newList.personList.add(tom);
        //then

        long khalilExpected = 1;
        long khaliahExpected = 2;
        long tomExpected = 3;
        long khalilActual = khalil.getId();
        long khaliahActual = khaliah.getId();
        long tomActual = tom.getId();

        Assert.assertEquals(khalilExpected, khalilActual);
        Assert.assertEquals(khaliahExpected, khaliahActual);
        Assert.assertEquals(tomExpected, tomActual);
    }
}
