package com.stackroute.unittest.pe2;
import java.util.Scanner;
import java.lang.*;
public class StringRev {
    public String reverseString(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}