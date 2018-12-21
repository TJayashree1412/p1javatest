package com.stackroute.unittest.pe1;

public class Member {
    private String name;
    private int age;
    private double salary;
    Member(String name,int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public boolean display(){
        System.out.println(name+" "+age+" "+salary);
        return true;
    }
}
