import java.util.Scanner;
public class Assign6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c>=65 && c<=90)
        {
            System.out.println("Capital letter");
        }
        else if(c>=97 && c<=122)
        {
            System.out.println("Small case letter");
        }
        else if(c>=48 && c<=57)
        {
            System.out.println("Digit");
        }
        else
        {
            System.out.println("Symbol");
        }
    }
}
