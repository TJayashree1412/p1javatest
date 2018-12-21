package com.stackroute.unittest.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {
    private MemberVariable memberVariable;
    @Before
    public void setUp() throws Exception {
        memberVariable=new MemberVariable();

    }

    @After
    public void tearDown() throws Exception {
        memberVariable=null;
    }

    @Test
    public void testForRandomValue() {
        //arrange
        String expected="Stringjava 45 45342.0";
        //act
        String actual=memberVariable.returnValue("Stringjava",45,45342);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testForNegativeValue() {
        //arrange
        String expected="Taimur Khan -45 43.5";
        //act
        String actual=memberVariable.returnValue("Taimur Khan",-45,43.5);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testForExtremeValue() {
        //arrange
        String expected="Alia Bhatt 25 45389.0";
        //act
        String actual=memberVariable.returnValue("Alia Bhatt",25,45389);
        //assert
        assertEquals(expected,actual);
    }

    @Test
    public void testForStringExtremeValue() {
        //arrange
        String expected="54Jahnavi malhotra 100 2.0987654323212332";
        //act
        String actual=memberVariable.returnValue("54Jahnavi malhotra",100,2.098765432321233243545657678798765432);
        //assert
        assertEquals(expected,actual);
    }
}