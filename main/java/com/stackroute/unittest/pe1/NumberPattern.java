package com.stackroute.unittest.pe1;
public class NumberPattern {
    public int[] settingNumberPattern(int n) {
        int j, k = 0;
        int number[] = new int[(n* (n+1))/2];
        for (int i = 1; i <= n; i++) {
            j = 1;
            while (j <= i) {
                number[k] = i;
                j++;
                k++;
            }
        }
        return number;
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int j;
//        for(int i=1;i<=n;i++)
//        {
//            j=1;
//            while(j<=i)
//            {
//              System.out.print(i+" ");
//              j++;
//            }
//        }
//        }
//    }