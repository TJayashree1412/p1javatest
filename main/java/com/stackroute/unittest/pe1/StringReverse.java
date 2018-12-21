package com.stackroute.unittest.pe1;

public class StringReverse {
    public String reverseString(String s){
        String rev="";
        char c[]=((String) s).toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + c[i];
        }
        return rev;
    }
}
