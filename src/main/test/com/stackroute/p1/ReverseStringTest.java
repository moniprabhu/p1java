package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;
    String str;

    @Before
    public void setUp() throws Exception {
        rev=new ReverseString();

    }

    @Test
    public void reverstring()throws Exception  {

        str=rev.reverse("monisha");
        assertEquals("ahsinom",str);

    }

    @After
    public void tearDown() throws Exception {
        rev=null;

    }
}