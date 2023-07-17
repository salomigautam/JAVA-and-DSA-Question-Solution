package com.shalom;
import java.util.Scanner;
public class Program11_FibonacciSeries{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a value of n to print fibonacci series till n:");
        int n=in.nextInt();
        System.out.println("print the fibonacci series till "+n);
        int a=0;
        int b=1;
        int count=0;
        while(count<=n){
            System.out.print(+a+" ");
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
    }
}
