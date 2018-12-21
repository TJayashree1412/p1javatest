package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRevTest {
    private StringRev stringRev;

    @Before
    public void setUp() throws Exception {
        stringRev=new StringRev();
    }

    @After
    public void tearDown() throws Exception {
        stringRev=null;
    }

    @Test
    public void reverseString1() {
        assertEquals("eerhsayaj",stringRev.reverseString("jayashree"));
    }

    @Test
    public void reverseString2() {
        assertEquals("amm@GatehTagemO",stringRev.reverseString("OmegaThetaG@mma"));
    }

    @Test
    public void reverseString3() {
        assertEquals("t uu nn ",stringRev.reverseString(" nn uu t"));
    }
}