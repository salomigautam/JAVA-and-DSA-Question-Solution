package com.shalom;

//        *********
//         *     *
//          *   *
//           * *
//            *
public class Program197_pattern14 {
    public static void main(String[] args) {
        int n = 5;
        pattern14(n);
    }

    static void pattern14(int n) {
        for (int row = n; row >= 1; row--) {
            for (int spaces = n; spaces > row; spaces--) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= (2 * row - 1); cols++ ){
                if (cols == 1 || row == n || cols == (2 * row -1)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
