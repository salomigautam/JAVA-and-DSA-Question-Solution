package com.shalom;

//                  *****
//                 *   *
//                *   *
//               *   *
//              *****
public class Program208_pattern25 {
    public static void main(String[] args) {
        int n = 5;
        pattern25(n);
    }
    static void pattern25(int n){
        for (int row = 1; row <= n; row++){
            for(int spaces = 1; spaces <= n - row; spaces++){
                System.out.print(" ");
            }
            for (int cols = 1; cols <= 4 ; cols++) {
                if (row == 1 || row == n){
                    System.out.print("*");
                } else if (cols == 1 || cols == 4) {
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
