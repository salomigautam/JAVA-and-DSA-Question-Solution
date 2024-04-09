package com.shalom;

//         *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *

public class Program198_pattern15 {
    public static void main(String[] args) {
        int n = 5;
        pattern15(n);
    }
    static void pattern15(int n) {
        // for upper part
        for (int row = 1; row <=n ; row++){

            for(int spaces = 1; spaces <= n - row ; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 2 * row - 1; cols++ ) {
                if(cols == 1 || cols ==2 * row - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // for lower part

        for (int row = n-1; row >= 1; row--) {
            for (int spaces = n; spaces > row; spaces--){
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 2 * row -1; cols++ ) {
                if (cols == 1 || cols == 2 * row - 1 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
