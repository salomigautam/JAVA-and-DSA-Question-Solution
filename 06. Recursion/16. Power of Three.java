package com.RecursionAssignment;

public class Question15_Power_Of_three {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(power(n));
    }
    static boolean power(int n) {
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 3 == 0){
            return power(n / 3);
        }
        return false;
    }
}
