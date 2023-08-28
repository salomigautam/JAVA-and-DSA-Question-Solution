package com.shalom;

//        *
//       ***
//      *****
//     *******
//    *********


public class Program191_pattern8 {
    public static void main(String[] args) {
        int n=5;
        pattern8(n);
    }

    static void pattern8(int n){
        for(int row = 1; row <= n; row++){
            for(int spaces = 1; spaces <= n-row; spaces++){
                System.out.print(" ");
            }

            for(int cols = 1; cols <= row + (row-1); cols++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
