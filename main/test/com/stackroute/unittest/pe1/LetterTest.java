package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LetterTest {
    private Letter letter;
    @Before
    public void setUp() throws Exception {
        letter=new Letter();
    }

    @After
    public void tearDown() throws Exception {
        letter=null;
    }

    @Test
    public void isLetter1() {
        assertEquals("Capital letter",letter.isLetter('D'));
    }

    @Test
    public void isLetter2() {
        assertEquals("Small case letter",letter.isLetter('a'));
    }

    @Test
    public void isLetter3() {
        assertEquals("Digit",letter.isLetter('8'));
    }

    @Test
    public void isLetter4() {
        assertEquals("Symbol",letter.isLetter('#'));
    }

    @Test
    public void isLetter5() {
        assertEquals("Digit",letter.isLetter('0'));
    }

    @Test
    public void isLetter6() {
        assertEquals("Capital letter",letter.isLetter('Z'));
    }
}