package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    private StringReverse stringReverse;
    @Before
    public void setUp() throws Exception {
        stringReverse=new StringReverse();
    }

    @After
    public void tearDown() throws Exception {
        stringReverse=null;
    }

    @Test
    public void reverseString1() {
        assertEquals("eerhsayaj",stringReverse.reverseString("jayashree"));
    }

    @Test
    public void reverseString2() {
        assertEquals("321@olleh",stringReverse.reverseString("hello@123"));
    }

    @Test
    public void reverseString3() {
        assertEquals("EERHSayaJ",stringReverse.reverseString("JayaSHREE"));
    }

    @Test
    public void reverseString4() {
        assertEquals("kS54432",stringReverse.reverseString("23445Sk"));
    }
}