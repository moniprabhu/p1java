package com.stackroute.p1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsontantTest {
    VowelOrConsontant vow1;
    String w1;

    @Before
    public void setUp() throws Exception {
        vow1=new VowelOrConsontant();

    }


    @Test
    public void findVowel()throws Exception {
        w1 =vow1.findVowelConst("a");
        assertEquals("vowels",w1);
    }
        @Test
        public void findConst()throws Exception {
            w1=vow1.findVowelConst("c");
            assertEquals("consontants",w1);

        }

    @After
    public void tearDown() throws Exception {
        vow1=null;

    }
}


