package com.RecursionAssignment;

public class Question8_Greek_OnacciNumber {
    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 2;
        int N = 6;
        System.out.println(nNum(A, B, C, N));
    }

    static int nNum(int A, int B, int C, int N){
        if(N == 1){
            return A;
        }
        if(N == 2){
            return B;
        }
        if(N == 3){
            return C;
        }
        return nNum(A, B, C,N - 1) + nNum(A, B, C, N - 2) + nNum(A, B, C, N - 3);
    }
}
