// Write a boolean method called isEven() in a class called EvenNumTest, which takes an int as input and returns true if
// the input is even. The signature of the method is as follows: public static boolean isEven(int number)
import java.util.Scanner;
public class Assign5 {
    public static boolean isEven(int number){
        if(number%2==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Assign5 a=new Assign5();
        System.out.println(a.isEven(n));
    }
}