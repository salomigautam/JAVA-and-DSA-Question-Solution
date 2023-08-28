package com.shalom;

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
public class Program194_pattern11 {
    public static void main(String[] args) {
        int n = 5;
        pattern11(n);
    }

    static void pattern11(int n){
        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for(int cols = 1; cols <= n - (row-1); cols++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
