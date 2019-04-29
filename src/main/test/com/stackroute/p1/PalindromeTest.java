package com.stackroute.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p=new Palindrome();
    String str;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void checking() throws Exception {
        str =p.checking(2468642);
        assertEquals("it is palindrome and the sum of even numbers is greater than 25",str);
        str =p.checking(12345);
        assertEquals(" it is not a palindrome",str);
        str =p.checking(123454321);
        assertEquals("it is a palindrome and the sum of even number is less than 25",str);
    }
}