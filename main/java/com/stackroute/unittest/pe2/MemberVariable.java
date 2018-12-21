package com.stackroute.unittest.pe2;

import java.util.List;

public class MemberVariable {

    public String returnValue(String s, int age, double salary) {
        Member m=new Member();
        m.setData(s,age,salary);
        StringBuilder data=m.getData();
        System.out.println(data);
        return data.toString();
    }
}
