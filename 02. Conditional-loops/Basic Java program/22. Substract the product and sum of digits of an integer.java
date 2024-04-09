package com.shalom;
import java.util.Scanner;
public class Program35_SubtractTheProAndSum {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        long n=in.nextInt();
        long temp=n;
        long pro=1;
        long sum=0;
        if(n<=1000000) {
            while (1 <= n && n <= 1000000) {
                long rem = n % 10;
                pro *= rem;
                sum += rem;
                n /= 10;
            }
            System.out.println("product of digits of " + temp + "=" + pro);
            System.out.println("sum of digits of " + temp + "=" + sum);

            long result = pro - sum;
            System.out.println(pro + "-" + sum + "=" + result);


        }
    }

}

