package com.shalom;
import java.util.Scanner;
public class Program34_FibonacciSeries {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n to print the fibonacci till n : ");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count=1;
        while(count<=n){
            System.out.print(+a+" ");
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
        System.out.print(".");
    }
}
