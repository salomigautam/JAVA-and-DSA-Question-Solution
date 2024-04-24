package com.RecursionAssignment;

public class Question17_FactorialOfNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * (factorial(n - 1));
    }
}
