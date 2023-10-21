package com.shalom;
import java.util.Scanner;
public class Program52_Factorial {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number to print the factorial of that : ");
        int n=in.nextInt();
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        System.out.println(fact);
    }
}
