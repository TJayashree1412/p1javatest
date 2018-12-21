package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOf4Test {
    private PowerOf4 powerOf4;
    @Before
    public void setUp() throws Exception {
        powerOf4=new PowerOf4();
    }

    @After
    public void tearDown() throws Exception {
        powerOf4=null;
    }

    @Test
    public void isPowerOf4() {
        //Assert
        assertTrue(powerOf4.isPowerOf4(64));
    }
}