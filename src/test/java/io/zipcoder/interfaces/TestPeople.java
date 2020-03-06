package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {
    @Before
    public void init(){
        //persist your data
    }

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
    @After
    public void clear(){
        //remove your data
        People newList = new People();
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
        People newList2 = new People();
        newList2.removeAll();

        //when
        newList2.personList.add(khalil);
        newList2.personList.add(khaliah);
        newList2.personList.add(tom);
        //then

        long khalilExpected = 1;
        long khaliahExpected = 2;
        long tomExpected = 3;
        long khalilActual = khalil.getId();
        long khaliahActual = khaliah.getId();
        long tomActual = tom.getId();

        Person expected = newList2.findById(khalil.getId());
        Person expected2 = newList2.findById(khaliah.getId());
        Assert.assertEquals(expected, khalil);
        Assert.assertEquals(expected2, khaliah);

    }
}
