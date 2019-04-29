package com.stackroute.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckEvenOrOddTest {
    CheckEvenOrOdd chk = new CheckEvenOrOdd();
    String strCheck;
    @Before
    public void setUp() throws Exception {

    }
        // Arrange
        @Test
        public void checkTom()throws Exception {
            // Act
            strCheck = chk.evenOrOdd(27);
            // Assert
            assertEquals("tom",strCheck);
        }

        @Test
        public void checkJerry() throws Exception {
            // Act
            strCheck = chk.evenOrOdd(26);
            //Assert
            assertEquals("jerry",strCheck);
        }
        @Test
        public void checkOther() throws Exception {
            // Act
            strCheck = chk.evenOrOdd(66);
            // Assert
            assertEquals("neither tom nor jerry",strCheck);
        }
    }



