package com.stackroute.unittest.pe2;
import java.util.Scanner;
public class Member {
    private String name;
    private int age;
    private double salary;
    public void setData(String name,int age, double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
        System.out.println(name+" "+age+" "+salary);
    }
    public StringBuilder getData(){
        StringBuilder data= new StringBuilder(name);
        data.append(" ");
        data.append(age);
        data.append(" ");
        data.append(salary);
        System.out.println(data);
        return data;
    }
    public static void main(String[] args) {
    }
}