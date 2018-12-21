package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortReverseTest {
    private SortReverse sortReverse;
    @Before
    public void setUp() throws Exception {
        sortReverse=new SortReverse();
    }

    @After
    public void tearDown() throws Exception {
        sortReverse=null;
    }

    @Test
    public void testForLargestNumber() {
        //Arrange

        //Act

        //Assert

        assertTrue(sortReverse.sortReverse(988684345));
    }

    @Test
    public void testForNegativeNumber() {
        assertFalse(sortReverse.sortReverse(-976565));
    }

    @Test
    public void testforMinimumnumber() {
        assertFalse(sortReverse.sortReverse(010));
    }

    @Test
    public void testforRandomnumber() {
        assertTrue(sortReverse.sortReverse(655453));
    }
}