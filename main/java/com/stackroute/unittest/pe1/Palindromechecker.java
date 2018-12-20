package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Palindromechecker {
    public int even=0;
    public int rem=0;
    public boolean isPalindrome(int n){
        int rev=0,num=n;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev)
        {
            return true;
        }else{
            return false;
        }
    }

    public boolean isevenNoSumGreaterThan25(int n){
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            if(rem%2==0)
            {
                even=even+rem;
            }
        }
        if(even>25){
            return true;
        }else{
            return false;
        }
    }
}

