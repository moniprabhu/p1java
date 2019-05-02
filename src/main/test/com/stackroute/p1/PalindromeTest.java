package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome pal;
    String str;

    @Before
    public void setUp() throws Exception {
        pal=new Palindrome();

    }

    @Test
    public void checkingGreater() throws Exception {
        str = pal.checking(2468642);
        assertEquals("it is palindrome and the sum of even numbers is greater than 25", str);
    }
        @Test
        public void CheckingNotEqual() throws Exception{
            str =pal.checking(12345);
            assertEquals(" it is not a palindrome",str);

        }
        @Test
        public void checkingLess() throws Exception {

            str = pal.checking(123454321);
            assertEquals("it is a palindrome and the sum of even number is less than 25", str);
        }

    @After
    public void tearDown() throws Exception {
        pal=null;
    }
}
