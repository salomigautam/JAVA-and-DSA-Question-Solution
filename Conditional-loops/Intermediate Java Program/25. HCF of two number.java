package com.shalom;
import java.util.Scanner;
public class Program70_HCF_OfTwoNumber {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int n1 = in.nextInt();
        System.out.println("enter the second number : ");
        int n2 = in.nextInt();
        int i = 1;
        int hcf = 0;
        while (i <= n1 || i <= n2) {
            int rem1 = n1 % i;
            int rem2 = n2 % i;
            if (rem1 == 0 && rem2 == 0) {
                hcf = i;
            }
            i++;
        }
        System.out.println("hcf = "+hcf);

    }
}
