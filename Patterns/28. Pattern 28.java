package com.shalom;

//        1      1
//        12    21
//        123  321
//        12344321
public class Program213_pattern35 {
    public static void main(String[] args) {
        int n = 4;
        pattern35(n);
    }
    static void pattern35(int n) {
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= row; cols++){
                System.out.print(cols);
            }

            for(int spaces = 1; spaces <= 2 * (n - row); spaces++) {
                System.out.print(" ");
            }

            for (int cols = row; cols >= 1; cols--){
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
