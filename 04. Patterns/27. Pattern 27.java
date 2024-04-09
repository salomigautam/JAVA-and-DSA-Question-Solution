package com.shalom;

//                        1
//                      2 1 2
//                    3 2 1 2 3
//                  4 3 2 1 2 3 4
//                5 4 3 2 1 2 3 4 5
public class Program212_pattern30 {
    public static void main(String[] args) {
        int n = 5;
        pattern30(n);
    }
    static void pattern30(int n) {
        for(int row = 1; row <= n; row++) {
            for(int spaces = 1; spaces <= n - row; spaces++){
                System.out.print("  ");
            }
            for(int cols = row; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }

            for(int cols = 2; cols <= row; cols++){
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
