package com.RecursionAssignment;

public class Question13_SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }
}
