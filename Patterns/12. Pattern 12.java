package com.shalom;

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
public class Program195_pattern12 {
    public static void main(String[] args) {
        int n = 5;
        pattern12(n);
    }

    static void pattern12(int n){
        for (int row = 1; row <= 2 * n ; row++) {
            int totalColumn;
            int totalSpaces;
            if (row > n){
                totalColumn = row - n;
                totalSpaces = 2 * n - row;
            }
            else {
                totalColumn = n - (row - 1);
                totalSpaces = row - 1;
            }

            for (int spaces = 1; spaces <= totalSpaces; spaces++){
                System.out.print(" ");
            }
            for (int cols = 1 ;cols <= totalColumn; cols++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
