package com.shalom;
import java.util.Scanner;
public class Program105_PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check the whether the number is prime or not  :");
        int n = in.nextInt();

        String result = prime(n);
        System.out.println(result);
    }

    static String prime(int n) {
        int i = 2;
        if (n <= 1)
            return "Not Prime";

//        for (i = 2; i < n; i++) {
//            if (n % i == 0)
//                return "not prime";
//        }
//        return "prime";
//

        while (i < n) {
            if (n % i == 0) {
                return "not prime";
            }
            if (n % i != 0) {
                boolean ans = true;
            }
            i++;
        }
        return "prime";
    }
}