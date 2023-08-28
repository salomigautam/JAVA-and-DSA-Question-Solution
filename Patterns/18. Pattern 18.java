package com.shalom;

//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********


public class Program201_pattern18 {
    public static void main(String[] args) {
        int n = 5;
        pattern18(n);
    }
    static void pattern18(int n ) {
        for (int row = 0; row < 2 * n; row++) {
                // for left upper hand pattern
                if (row < n) {
                    for (int cols = 1; cols <= n - row; cols++) {
                        System.out.print("*");
                    }
                }
                // for left below hand pattern
                else {
                    for (int cols = 1; cols <= (row - n) + 1; cols++) {
                        System.out.print("*");
                    }
                }

                // for spaces
                // for upper spaces
                if( row < n){
                    for (int spaces = 1; spaces <= row; spaces++){
                        System.out.print("  ");
                    }
                }
                // for below spaces
                else{
                    for (int spaces = 1; spaces <= (2 * n) - row -1; spaces++){
                        System.out.print("  ");
                    }
                }

                // for right upper hand pattern
                if (row < n){

                    for (int cols = 1; cols <= n - row; cols++) {
                        System.out.print("*");
                    }
                }
                // for right below hand pattern
                else {
                    for (int cols = 1; cols <= (row - n) + 1 ; cols++){
                        System.out.print("*");
                    }
                }

                System.out.println();

        }
    }
}
