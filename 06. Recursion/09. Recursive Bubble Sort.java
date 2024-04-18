package com.shalom;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        sortRec(arr, arr.length, 0);
    }
    static void sortRec(int[] arr, int n, int num){
        if(n == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int count = 0;
        for(int i = 0; i < arr.length - 1 - num; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count += 1;
            }
        }
        if(count == 0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        sortRec(arr, n- 1, num + 1);
    }
}
