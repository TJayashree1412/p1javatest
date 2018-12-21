package com.stackroute.unittest.pe1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {

    Member member = null;

    @Before
    public void setUp(){

        member = new Member("Harry Potter",30,2500.3);
        member2 = new Member()
    }

    @Test
    public void testDisplay1(){

        //act
        boolean expected = true;

        //arrange
        boolean result = member.display();

        //assert
        assertTrue(expected,result);
    }

    @Test
    public void testDisplay2(){



        //act
        boolean expected = true;

        //arrange
        boolean result = member.display();

        //assert
        assertTrue(expected,result);
    }

}