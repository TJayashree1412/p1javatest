/* 6.     Write a program, which reads number of students and n grades as input (of int between 0 and 100, inclusive)
and displays the average, minimum and maximum.Your program shall check for valid input. You should keep all the grades
in an int[] and use a method for each of the computations.
 Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77
The average is 81.50
The minimum is 65
The maximum is 98
*/
import java.util.Scanner;
public class Assign6 {
    int n;
    float average(int g[] )
    {
        int sum=0;
        for(int i=0;i<g.length;i++)
        {
            sum+=g[i];
        }
        float avg=(float)sum/(float)n;
        return avg;
    }
    int minimum(int g[]){
       int min=g[0];
        for(int i=0;i<g.length;i++)
        {
            if(g[i]<min)
            {
                min=g[i];
            }
        }
        return min;
    }
    int maximum(int g[]){
        int max=g[0];
        for(int i=0;i<g.length;i++)
        {
            if(g[i]>max)
            {
                max=g[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Assign6 a=new Assign6();
        Scanner sc = new Scanner(System.in);
        a.n = sc.nextInt();
        int g[]=new int[a.n];
        int i=0;
        while(i<a.n)
        {
            g[i]=sc.nextInt();
            if(g[i]>0 && g[i]<100)
            {
                i++;
            }
            else {
                System.out.println("enter a valid input btwn 0 to 100");
            }
        }
        System.out.println("The average is:"+a.average(g));
        System.out.println("The minimum is:"+a.minimum(g));
        System.out.println("The maximum is:"+a.maximum(g));
    }
}