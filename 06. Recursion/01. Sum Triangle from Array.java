package com.RecursionAssignment;

import java.util.Arrays;

public class Question1_Sum_Triangle_from_Array {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        printTriangle(A);
    }
    static void printTriangle(int[] A){
        if(A.length < 1){
            return;
        }

        int[] newArr = new int[A.length - 1];
        for(int i = 0; i < A.length - 1; i++){
            int sum = A[i] + A[i + 1];
            newArr[i] = sum;
        }
        printTriangle(newArr);
        System.out.println(Arrays.toString(A));

    }
}



//        // Function to generate Special Triangle.
//        public static void printTriangle(int[] A)
//        {
//            // Base case
//            if (A.length < 1)
//                return;
//
//            // Creating new array which contains the
//            // Sum of consecutive elements in
//            // the array passes as parameter.
//            int[] temp = new int[A.length - 1];
//            for (int i = 0; i < A.length - 1; i++)
//            {
//                int x = A[i] + A[i + 1];
//                temp[i] = x;
//            }
//
//            // Make a recursive call and pass
//            // the newly created array
//            printTriangle(temp);
//
//            // Print current array in the end so
//            // that smaller arrays are printed first
//            System.out.println(Arrays.toString(A));
//        }
//
//        // Driver function
//        public static void main(String[] args)
//        {
//            int[] A = { 1, 2, 3, 4, 5 };
//            printTriangle(A);
//        }
//    }