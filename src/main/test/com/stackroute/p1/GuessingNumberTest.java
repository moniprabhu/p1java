package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessingNumberTest {
    GuessingNumber guess=new GuessingNumber();
    String str;

    @Before
    public void setUp() throws Exception {
        guess=new GuessingNumber();

    }

    @Test
    public void guessing() throws Exception {
        str= guess .numberTOGuess(46);
        assertEquals("Number guessed matches the original number",str);
    }

    @Test
    public void guessingLess() throws Exception{
        str= guess .numberTOGuess(0);
        assertEquals("Number guessed is less than the original number",str);

    }

    @Test
    public void guessingLarge() throws Exception {
        str=guess.numberTOGuess(78);
        assertEquals("Number guessed is more than the original number",str);

    }

    @After
    public void tearDown() throws Exception {
        guess=null;
    }
}