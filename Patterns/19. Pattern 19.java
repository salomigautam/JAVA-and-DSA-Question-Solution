package com.shalom;

//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
public class Program202_pattern19 {
    public static void main(String[] args) {
        int n = 5;
        pattern19(n);

    }
    static void pattern19(int n){
        for(int row = 1; row <= 2 * n; row++){
            // for left hand pattern
            if(row <= n) {
                for (int cols = 1; cols <= row; cols++) {
                    System.out.print("*");
                }
            }
            else{
                for (int cols = 1; cols <= (2 * n) - row; cols++){
                    System.out.print("*");
                }
            }

            // for spaces
            if(row <= n) {
                for (int spaces = 1; spaces <= n - row; spaces++) {
                    System.out.print("  ");
                }
            }
            else{
                for(int spaces = 1; spaces <= row - n; spaces++){
                    System.out.print("  ");
                }
            }

            // for right hand pattern
            if(row <= n) {
                for (int cols = 1; cols <= row; cols++) {
                    System.out.print("*");
                }
            }
            else{
                for (int cols = 1; cols <= (2 * n) - row; cols++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
