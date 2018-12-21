import java.util.Scanner;

/* 7. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1
The factorial of 2 is 2
     ..........
The factorial of 12 is 479001600
he factorial of 13 is out of range
Modify your program and add a method called longFactorial to list all the factorial that can be expressed as a long (64-bit signed integer).The maximum value for long is kept in a constant called Long.MAX_VALUE.
your output shall look like:
Long Factorials:
    The factorial of 1 is is 1.
    The factorial of 2 is is 2.
            ..........
    The factorial of 20 is is 2432902008176640000.
    The factorial of 21 is out of range.
*/
import java.util.Scanner;
public class Assign7 {

    public static void main(String[] args) {
        Assign7 a=new Assign7();
        System.out.println();
        int max = Integer.MAX_VALUE; //max integer 32-bit value
        System.out.println(max);
        int  fact=1,i=1;
        while(fact<=max){
            fact = fact*i;
            System.out.println("The factorial of "+i+" is "+fact);
            i++;
        }
    }
}

