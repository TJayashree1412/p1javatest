import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Assign7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}