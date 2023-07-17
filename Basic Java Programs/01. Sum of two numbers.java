package com.shalom;
import java.util.Scanner;
public class Program1_Sum {
    public static void main(String []args){
        Scanner in= new Scanner(System.in);
        System.out.print("enter a first number: ");
        int num1=in.nextInt();
        System.out.print("enter a second number: ");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.print("sum is = " +sum);
    }
}
