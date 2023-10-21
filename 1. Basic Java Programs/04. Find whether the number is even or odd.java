package com.shalom;
import java.util.Scanner;
public class Program5_EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("entered number is even");
        } else {
            System.out.println("given number is odd");
        }
    }
}
