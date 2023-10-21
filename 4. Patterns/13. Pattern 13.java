package com.shalom;

//            *
//           * *
//          *   *
//         *     *
//        *********
public class Program196_pattern13 {
    public static void main(String[] args) {
        int n = 5;
        pattern13(n);
    }

    static void pattern13(int n) {
        for (int row = 1; row <= n; row++){
            for (int spaces = 1; spaces <= n - row; spaces++){
                System.out.print(" ");
            }
            for (int cols = 1; cols <= (2 * row - 1); cols++) {
                if (cols == 1 || cols == (2 * row - 1) || row == n ) {
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
