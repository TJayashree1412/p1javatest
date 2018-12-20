package com.stackroute.unittest.pe1;

public class UnspecifiedInput {
    public int addUnspecifiedInput(int n, int arr[]){
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(n<1)
            {
                System.out.println("Error! enter a valid input");
            }
            sum+=arr[i];
        }
        return sum;

    }
}