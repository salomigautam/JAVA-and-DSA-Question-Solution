package com.shalom;
import java.util.Scanner;
public class Program103_ProductOfTwoNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n1=in.nextInt();
        System.out.println("Enter the second number : ");
        int n2=in.nextInt();

        int total=product(n1,n2);
        System.out.println("Product of two number = "+total);

         int total1=product(n1,n2);
        System.out.println("Product of two number = "+total1);

    }

    static int product(int one,int second){
        return one*second;
    }
}
