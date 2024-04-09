package com.shalom;
import java.util.Scanner;
public class Program108_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean ans = palindrome(5335);
        System.out.println(ans);
    }
    static boolean palindrome(int n) {
        String num=String.valueOf(n);
        String R = "";
        while(n>0) {
            int rem = n % 10;
            String result = String.valueOf(rem);
            R += result;
            n = n / 10;
        }
        System.out.println(R);
        return num.equals(R);
    }

}


