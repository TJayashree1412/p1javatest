package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromecheckerTest {
    private Palindromechecker palindromechecker;
    @Before
    public void setUp() throws Exception {
        palindromechecker=new Palindromechecker();
    }

    @After
    public void tearDown() throws Exception {
        palindromechecker=null;
    }

    @Test
    public void isPalindrome1() {
        assertFalse(palindromechecker.isPalindrome(1231));
    }
    @Test
    public void isPalindrome2() {
        assertTrue(palindromechecker.isPalindrome(12321));
    }
    @Test
    public void isPalindrome3() {
        assertTrue(palindromechecker.isPalindrome(788887));
    }

    @Test
    public void isevenNoSumGreaterThan251() {
        assertFalse(palindromechecker.isevenNoSumGreaterThan25(1231));
    }

    @Test
    public void isevenNoSumGreaterThan252() {
        assertFalse(palindromechecker.isevenNoSumGreaterThan25(12321));
    }

    @Test
    public void isevenNoSumGreaterThan253() {
        assertTrue(palindromechecker.isevenNoSumGreaterThan25(788887));
    }
}