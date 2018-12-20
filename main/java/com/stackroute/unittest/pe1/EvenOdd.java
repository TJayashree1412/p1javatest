package com.stackroute.unittest.pe1;
import java.util.Scanner;
public class EvenOdd {
    public String evenodd(int n){
        if((n>20) && (n<30)) {
            if (n % 2 == 0)
                return "Tom";
            else
                return "Jerry";
        }
        else
        {
            return " ";
        }
    }
}

