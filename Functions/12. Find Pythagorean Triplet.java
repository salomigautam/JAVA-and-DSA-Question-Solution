package com.shalom;
import java.util.Scanner;
public class Program111_PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the first number : ");
        int n1=in.nextInt();
        System.out.println("Enter the second number : ");
        int n2=in.nextInt();
        System.out.println("Enter the third number : ");
        int n3=in.nextInt();

        pythagoreanTriplet(n1,n2,n3);
    }
    static void pythagoreanTriplet(int n1,int n2,int n3) {
        int RHS = n1 * n1 + n2 * n2;
        int LHS = n3 * n3;
        if (RHS == LHS) {
            System.out.println("pythagorean Triplet");
        }
        else{
            System.out.println("Not Pythagorean Triplet");

        }
    }
}

