package com.shalom;
import java.util.Scanner;
public class Program8_LargestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b;
        System.out.println("enter a first number: ");
        a=in.nextInt();
        System.out.println("enter a second number");
        b=in.nextInt();
        if(a>b) {
            System.out.println("largest number is " + a);
        }
        else{
            System.out.println("largest number is "+b);
        }
    }
}
