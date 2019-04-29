package com.stackroute.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptialTest {
Captial c1=new  Captial();
String s1;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void capsAndSmalll() throws Exception {

        s1= c1.capsOrSmall('A');
        assertEquals(" it is uppercase alphabet", s1);
        s1=c1.capsOrSmall('j');
        assertEquals(" it is lowercase alphabet.",s1);
        s1=c1.capsOrSmall('9');
        assertEquals("it is a digit",s1);
        s1=c1.capsOrSmall('&');
        assertEquals("special symbol",s1);

    }
}