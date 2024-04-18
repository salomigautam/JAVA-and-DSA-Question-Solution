package com.RecursionAssignment;

public class Question6_specialFibonacci {
    public static void main(String[] args) {
        int a = 55;
        int b = 66;
        int n = 5;

        System.out.println(fibo(a, b, n));
    }

    static int fibo(int a, int b, int n){
        if(n == 0){
            return a;
        }
        if(n == 1){
            return b;
        }
        if(n == 2){
            return (a ^ b);
        }
        return fibo(a, b, n % 3);
    }
}


