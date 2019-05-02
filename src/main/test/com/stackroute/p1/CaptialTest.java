package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptialTest {
Captial c1;
String s1;

    @Before
    public void setUp() throws Exception {
        c1=new Captial();

    }

    @Test
    public void checkUpper() throws Exception {

        s1 = c1.capsOrSmall('A');
        assertEquals(" it is uppercase alphabet", s1);
    }

    @Test
    public void checkLower() throws Exception {
        s1=c1.capsOrSmall('j');
        assertEquals(" it is lowercase alphabet.",s1);

    }

    @Test
    public void checkDigit() throws Exception {
        s1=c1.capsOrSmall('9');
        assertEquals("it is a digit",s1);

    }

    @Test
    public void checkSymbol() throws Exception {
        s1=c1.capsOrSmall('&');
        assertEquals("special symbol",s1);
    }

    @After
    public void tearDown() throws Exception {
        c1=null;
    }
}
