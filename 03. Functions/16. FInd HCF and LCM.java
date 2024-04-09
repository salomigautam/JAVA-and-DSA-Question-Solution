package com.shalom;
import java.util.Scanner;
public class Program116_HCFandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        LCM(n1, n2);
    }

    static void LCM(int n1, int n2) {
        int i=1;
        while(i<=n1 || i<=n2) {
            int rem = n1 % i;
            int rem2 = n2 % i;
            if (rem == rem2) {
                System.out.println(i);
            }
        }
    }
}
