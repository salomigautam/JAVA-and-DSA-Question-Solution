package com.RecursionAssignment;

public class Question2_Maximum_and_Minimum_value_in_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        int n = arr.length;
        System.out.println(Min(arr, n));
        System.out.println(Max(arr, n));
    }

    static int Min(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return Math.min(arr[n - 1], Min(arr, n - 1));
    }

    static int Max(int[] arr, int n){
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n - 1], Max(arr, n - 1));
    }
}
