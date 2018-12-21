// Write a Java method to check if a given number is power of 4
package com.stackroute.unittest.pe2;
public class PowerOf4{

    public boolean isPowerOf4(int n) {
        int num=n,flag=1;
        if(n==0)
            flag=0;
        else {
            while (n != 1) {
                if (n % 4 != 0) {
                    flag = 0;
                    break;
                }
                n = n / 4;
            }
        }
        if(flag==1)
        {
            System.out.println(num+" is a power of 4");
            return true;
        }
        else
        {
            System.out.println(num+" is not a power of 4");
            return false;
        }
    }
}