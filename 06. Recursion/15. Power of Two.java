package com.RecursionAssignment;

public class Question14_Power_Of_two {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(power(n));
    }
    static boolean power(int n) {
        if(n == 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        if(n % 2 == 0){
            return power(n / 2);
        }
        return false;
    }
}
