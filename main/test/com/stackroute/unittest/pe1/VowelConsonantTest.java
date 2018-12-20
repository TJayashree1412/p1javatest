package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    private VowelConsonant vowelConsonant;
    @Before
    public void setUp() throws Exception {
        vowelConsonant=new VowelConsonant();
    }

    @After
    public void tearDown() throws Exception {
        vowelConsonant=null;
    }

    @Test
    public void vowelconsonant1() {
        String result[]={"Vowel" ,"Consonant" ,"Vowel" ,"Vowel"};
        assertArrayEquals(result,vowelConsonant.vowelconsonant("apei"));
    }
    @Test
    public void vowelconsonant2() {
        String result[]={"error!"};
        assertArrayEquals(result,vowelConsonant.vowelconsonant("ap$i"));
    }
    @Test
    public void vowelconsonant3() {
        String result[]={"Vowel" ,"Vowel" ,"Vowel" ,"Consonant"};
        assertArrayEquals(result,vowelConsonant.vowelconsonant("eeet"));
    }
}