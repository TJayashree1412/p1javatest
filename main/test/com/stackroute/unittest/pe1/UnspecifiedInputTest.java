package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnspecifiedInputTest {
    UnspecifiedInput unspecifiedInput;

    @Before
    public void setUp() throws Exception {
        unspecifiedInput=new UnspecifiedInput();
    }

    @After
    public void tearDown() throws Exception {
        unspecifiedInput=null;
    }

    @Test
    public void addUnspecifiedInput1() {
        int arr[]={33,32,4,45,8};
        assertEquals(122,unspecifiedInput.addUnspecifiedInput(5,arr));
    }

    @Test
    public void addUnspecifiedInput2() {
        int arr[]={0};
        assertEquals(0,unspecifiedInput.addUnspecifiedInput(0,arr));
    }

    @Test
    public void addUnspecifiedInput3() {
        int arr[]={33,32,4,45,8,1,1};
        assertEquals(124,unspecifiedInput.addUnspecifiedInput(7,arr));
    }
}