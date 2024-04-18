package com.RecursionAssignment;

public class Question16_Power_Of_four {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(power(n));
    }
    static boolean power(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 4 == 0){
            return power(n / 4);
        }
        return false;
    }
}
