package com.shalom;

//        *********
//         *******
//          *****
//           ***
//            *
public class Program192_pattern9 {
    public static void main(String[] args) {
        int n=5;
        pattern9(n);
    }

    static void pattern9(int n){
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < row; spaces++){
                System.out.print(" ");
            }
            for(int cols = 1; cols <= 9-(2*row); cols++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
