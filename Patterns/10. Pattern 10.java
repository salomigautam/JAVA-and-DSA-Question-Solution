package com.shalom;

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
public class Program193_pattern10 {
    public static void main(String[] args) {
        int n=5;
        pattern10(n);
    }

    static void pattern10(int n){
        for(int row = 1; row <= n; row++){
            for(int spaces = 1; spaces <= n-row;spaces++){
                System.out.print(" ");
            }
            for(int cols = 1; cols <=row; cols++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}
