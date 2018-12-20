package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPatternTest {
    NumberPattern numberPattern;

    @Before
    public void setUp() throws Exception {
        numberPattern=new NumberPattern();
    }

    @After
    public void tearDown() throws Exception {
        numberPattern=null;
    }

    @Test
    public void settingNumberPattern1() {
        int result[]={1,2,2,3,3,3,4,4,4,4};
        assertArrayEquals(result,numberPattern.settingNumberPattern(4));
    }
    @Test
    public void settingNumberPattern2() {
        int result[]={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6};
        assertArrayEquals(result,numberPattern.settingNumberPattern(6));
    }@Test
    public void settingNumberPattern3() {
        int result[]={1};
        assertArrayEquals(result,numberPattern.settingNumberPattern(1));
    }
//    @Test
//    public void settingNumberPattern4() {
//        int result[]={1,2,2,3,3,3,4,4,4,4};
//        assertArrayEquals(result,numberPattern.settingNumberPattern(4));
//    }
//    @Test
//    public void settingNumberPattern5() {
//        int result[]={1,2,2,3,3,3,4,4,4,4};
//        assertArrayEquals(result,numberPattern.settingNumberPattern(4));
//    }
//    @Test
//    public void settingNumberPattern6() {
//        int result[]={1,2,2,3,3,3,4,4,4,4};
//        assertArrayEquals(result,numberPattern.settingNumberPattern(4));
//    }

}