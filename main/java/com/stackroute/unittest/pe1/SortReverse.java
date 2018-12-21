package com.stackroute.unittest.pe1;

import java.util.Arrays;

public class SortReverse {
    public boolean sortReverse(int n) {
        int num=n,i=0,even=0;
        int[] rem=new int[20];
        while(n>0) {
            rem[i] = n % 10;
            if (rem[i] % 2 == 0) {
                even += rem[i];
            }
            n=n/10;
        }
        while(i>0)
        {
            System.out.print(rem[i]);
            i--;
        }
        System.out.println("Sum of even numbers: "+even);
        if(even>15)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}