package com.shalom;

//        *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *
public class Program207_pattern24 {
    public static void main(String[] args) {
        int n = 5;
        pattern24(n);
    }
    static void pattern24(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            if (row <= n) {
                for (int cols = 1; cols <= row; cols++) {
                    if (cols == 1 || cols == row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                int range = (2 * n) - row + 1;
                for (int cols = 1; cols <= range; cols++) {
                    if (cols == 1 || cols == range) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            // for spaces
            if (row <= n) {
                for (int spaces = 1; spaces <= n - row; spaces++) {
                    System.out.print("  ");
                }
            } else {
                for (int spaces = 1; spaces <= (row - n) - 1; spaces++) {
                    System.out.print("  ");
                }
            }

            // for right pattern
            if (row <= n) {
                for (int cols = 1; cols <= row; cols++) {
                    if (cols == 1 || cols == row) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            if (row > n) {
                int range2 = (2 * n) - row + 1;
                for (int cols = 1; cols <= range2; cols++) {
                    if (cols == 1 || cols == range2) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
