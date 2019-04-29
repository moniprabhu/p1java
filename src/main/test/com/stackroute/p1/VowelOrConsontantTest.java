package com.stackroute.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsontantTest {
    VowelOrConsontant v1 =new VowelOrConsontant();
    String w1;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void findVowel()throws Exception {
        w1 =v1.findVowelConst("a");
        assertEquals("vowels",w1);
        w1=v1.findVowelConst("c");
        assertEquals("consontants",w1);


    }


}