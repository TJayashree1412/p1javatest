import java.util.Scanner;
public class Assign8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target=34,n;
        System.out.println("Enter a number between 0-50");
        do{
            n = sc.nextInt();
            if(n<target)
            {
                System.out.println("Number guessed is less than original number");
            }
            else if(n==target)
            {
                System.out.println("Number guessed is matches the original number");
            }
            else
            {
                System.out.println("Number guessed is more than original number");
            }
        }while(n!=target);

    }
}
