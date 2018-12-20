package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Assign2Test {
    private EvenOdd assign2;

    @Before
    public void setUp() throws Exception {
        assign2=new EvenOdd();
    }

    @After
    public void tearDown() throws Exception {
        assign2=null;
    }

    @Test
    public void evenodd1() {

        assertEquals("Tom",assign2.evenodd(22));
    }
    @Test
    public void evenodd2() {
        assertEquals("Jerry",assign2.evenodd(25));
    }
    @Test
    public void evenodd3() {
        assertEquals(" ",assign2.evenodd(2));
    }
}