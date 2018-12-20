import java.util.Scanner;
public class Assign10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n = sc.nextInt();
        char c[]=s.toCharArray();
        int i=0;
        System.out.print(s);
        for(int j=0;j<n;j++) {
            i = s.length()- n;
            while(i < s.length()) {
                System.out.print(c[i]);
                i++;
            }
        }


    }
}
