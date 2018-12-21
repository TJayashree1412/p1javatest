package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TargetGuessTest {
    private TargetGuess targetGuess;
    @Before
    public void setUp() throws Exception {
        targetGuess=new TargetGuess();
    }

    @After
    public void tearDown() throws Exception {
        targetGuess=null;
    }

    @Test
    public void guessMatch1() {
//        int target=targetGuess.target;
        assertEquals("Number guessed is matches the original number",targetGuess.guessMatch(34));
    }

    @Test
    public void guessMatch2() {
//        int target=targetGuess.target;
        assertEquals("Number guessed is less than original number",targetGuess.guessMatch(23));
    }

    @Test
    public void guessMatch3() {
//        int target=targetGuess.target;
        assertEquals("Number guessed is more than original number",targetGuess.guessMatch(43));
    }


}