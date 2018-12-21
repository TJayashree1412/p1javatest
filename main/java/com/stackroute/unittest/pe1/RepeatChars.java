package com.stackroute.unittest.pe1;
public class RepeatChars{
    public String repeatNcharsNtimes(String s,int n){
        char c[]=s.toCharArray();
        int i=0;
        StringBuilder rev=new StringBuilder(s);
        for(int j=0;j<n;j++) {
            i = s.length()- n;
            while(i < s.length()) {
                rev.append(c[i]);
                i++;
            }
        }

        return rev.toString();
    }
}
