package com.shalom;
//                   *
//                  * *
//                 * * *
//                * * * *
//               * * * * *
//                * * * *
//                 * * *
//                  * *
//                   *
public class Program211_pattern28 {
    public static void main(String[] args) {
        int n = 5;
        pattern28(n);
    }
    static void pattern28(int n) {
        for (int row = 1; row < 2 * n; row++) {

            if(row <= n) {
                // for spaces
                for(int spaces = 1; spaces <= n - row; spaces++){
                    System.out.print(" ");
                }
                // for columns
                for (int cols = 1; cols <= row; cols++) {
                    System.out.print("* ");
                }
            }
            else{
                // for spaces
                for(int spaces = 1; spaces <= row - n; spaces++){
                    System.out.print(" ");
                }
                //for columns
                 for(int cols = 1; cols <= (2 * n) - row; cols++){
                     System.out.print("* ");
                 }
            }
            System.out.println();
        }
    }
}
