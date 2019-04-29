package com.stackroute.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString r1=new ReverseString();
    String str;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void reverstring()throws Exception  {

        str=r1.reverse("monisha");
        assertEquals("ahsinom",str);

    }
}