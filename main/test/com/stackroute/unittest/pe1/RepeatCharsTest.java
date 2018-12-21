package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharsTest {
    private RepeatChars repeatChars;
    @Before
    public void setUp() throws Exception {
        repeatChars=new RepeatChars();
    }

    @After
    public void tearDown() throws Exception {
        repeatChars=null;
    }

    @Test
    public void repeatNcharsNtimes1() {
        assertEquals("stackroutetete",repeatChars.repeatNcharsNtimes("stackroute",2));
    }

    @Test
    public void repeatNcharsNtimes2() {
        assertEquals("jayashreejayashreejayashreejayashreejayashreejayashreejayashreejayashreejayashreejayashree",repeatChars.repeatNcharsNtimes("jayashree",9));
    }

    @Test
    public void repeatNcharsNtimes3() {
        assertEquals("IBMLoveLoveLoveLoveLove",repeatChars.repeatNcharsNtimes("IBMLove",4));
    }
}