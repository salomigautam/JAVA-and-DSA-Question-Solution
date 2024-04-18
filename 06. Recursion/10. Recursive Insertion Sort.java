package com.shalom;

import java.util.Arrays;

public class practi {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8 , -3 , 17};
        InsertionRec(arr, 1);
    }

    static void swap(int[] arr, int second, int first){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void InsertionRec(int[] arr, int i){
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int j = i; j > 0; j--){
            if(arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
            }
            else{
                break;
            }
        }
        InsertionRec(arr, i + 1);
    }
}
